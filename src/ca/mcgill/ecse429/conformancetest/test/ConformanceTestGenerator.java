package ca.mcgill.ecse429.conformancetest.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import ca.mcgill.ecse429.conformancetest.statemodel.State;
import ca.mcgill.ecse429.conformancetest.statemodel.StateMachine;
import ca.mcgill.ecse429.conformancetest.statemodel.Transition;
import ca.mcgill.ecse429.conformancetest.tree.Node;
import ca.mcgill.ecse429.conformancetest.tree.PathTestCase;
import ca.mcgill.ecse429.conformancetest.tree.Tree;

public class ConformanceTestGenerator {

	String className = "";
	StateMachine st;
	Tree tree;
	Node curNode;
	Transition curTrans;
	int testnumber = 0;
	ArrayList<PathTestCase> paths;
	ArrayList<String> vars = new ArrayList<String>();

	public ConformanceTestGenerator(Tree tree) {
		this.tree = tree;
		this.st = tree.getSm();
		this.paths = tree.getAllPathTestCases();

	}

	public void makeTheFile() {

		try {
			st.delete();
			for (; testnumber < paths.size(); testnumber++) {
				vars.clear();
				className = st.getClassName().replace(".java",
						"Test" + testnumber);
				String csvOutputFolder = "src/ca/mcgill/ecse429/conformancetest/test";
				OutputStreamWriter rapport_dataWriter = getOutputStream(
						csvOutputFolder, className + ".java");
				String newLine = "package ca.mcgill.ecse429.conformancetest.test;\nimport static org.junit.Assert.assertEquals;\nimport org.junit.Test;\nimport ca.mcgill.ecse429.conformancetest."
						+ st.getClassName().replace(".java", "").toLowerCase()
						+ "."
						+ st.getClassName().replace(".java", "")
						+ ";\n\n";
				writeToFile(rapport_dataWriter, newLine, false);
				writeToFile(rapport_dataWriter, makeClass(), false);
				writeToFile(rapport_dataWriter, makeMethod(), false);
				writeToFile(rapport_dataWriter, "\n}", false);
				closeFile(rapport_dataWriter);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String makeMethod() {
		String methodtext = "    @Test\n    public void " + className
				+ "method() {    	";

		PathTestCase path = paths.get(testnumber);
		ArrayList<Node> arr = path.getPathTestCase();
		for (int i = arr.size() - 1; i >= 0; i--) {
			Node curNode = arr.get(i);
			if (curNode.getTranParent() != null) {

				String cond = curNode.getTranParent().getCondition();
				if (!cond.equals("")) {
					methodtext += makeInMethodWithCond(curNode, cond);
				} else {
					methodtext += makeInMethodNoCond(curNode);
				}
			}

		}
		methodtext = methodtext + "    }\n";
		return methodtext;
	}

	public String makeInMethodNoCond(Node curNode) {
		String methodtext = "";
		// System.out.println(curNode);

		if (curNode.getTranParent().getEvent().equals("@ctor")) {
			methodtext = methodtext + "\n" + makeCtrl();
		} else {
			methodtext = methodtext + "\n         _ctrl."
					+ curNode.getTranParent().getEvent() + "();\n";
		}
		methodtext = methodtext + "        assertEquals(\"Invalid state\",\""
				+ curNode.getState().getName()
				+ "\", _ctrl.getState().name());\n\n";

		if (curNode.getTranParent().getCondition() != null) {
			String[] functions = curNode.getTranParent().getAction()
					.split("; ");
			for (String func : functions) {
				if (func.split(" = ").length >= 2) {
					System.out.println(func.split(" = ")[1].replace(";", "")
							+ " -  "+ "  value");
					if(vars.contains(func.split(" = ")[0])){
						methodtext +="        "+func.split(" = ")[0]
								+ " = " + func.split(" = ")[1].replace(";", "")
								+ ";\n";
					}
					else{
						vars.add(func.split(" = ")[0]);
						if (func.split(" = ")[1].replace(";", "").equals("true")
								|| func.split(" = ")[1].replace(";", "").equals(
										"false")) {
							methodtext += "        boolean " + func.split(" = ")[0]
									+ " = "
									+ func.split(" = ")[1].replace(";", "") + ";\n";
	
						} else {
							methodtext += "        int " + func.split(" = ")[0]
									+ " = " + func.split(" = ")[1].replace(";", "")
									+ ";\n";
	
						}
					}
					methodtext += "        assertEquals(\"Invalid conditions\","
							+ func.split(" = ")[0]
						
							+ ", _ctrl.get"
							+ Character.toUpperCase(func.split(" = ")[0]
									.charAt(0))
							+ func.split(" = ")[0].substring(1) + "());\n";
				}

			}
		}
		return methodtext;
	}

	public String makeInMethodWithCond(Node curNode, String cond) {
		String methodtext = "";
		if(cond.contains("()")){
			cond="_ctrl."+cond;
			if(cond.contains("!")){
				cond="!"+cond.replace("!","");
			}
		}
		methodtext += "        if(" + cond + "){\n";
		// System.out.println(curNode);
		if (curNode.getTranParent().getEvent().equals("@ctor")) {
			methodtext = methodtext + "\n" + makeCtrl();
		} else {
			methodtext = methodtext + "\n         _ctrl."
					+ curNode.getTranParent().getEvent() + "();\n";
		}
		methodtext = methodtext + "        assertEquals(\"Invalid state\",\""
				+ curNode.getState().getName()
				+ "\", _ctrl.getState().name());\n\n";

		if (curNode.getTranParent().getCondition() != null) {
			// System.out.println(curNode.getTranParent().getEvent()+"  //  "+curNode.getTranParent().getCondition()+"  //  "+curNode.getTranParent().getAction());
			String[] functions = curNode.getTranParent().getAction()
					.split("; ");
			for (String func : functions) {
				if (func.split(" = ").length >= 2) {
					System.out.println(func.split(" = ")[1].replace(";", "")
							+ " -  " + "  value");
					if(vars.contains(func.split(" = ")[0])){
						methodtext +="        "+func.split(" = ")[0]
								+ " = " + func.split(" = ")[1].replace(";", "")
								+ ";\n";
					}
					else{
						vars.add(func.split(" = ")[0]);
						if (func.split(" = ")[1].replace(";", "").equals("true")
								|| func.split(" = ")[1].replace(";", "").equals(
										"false")) {
							methodtext += "        boolean " + func.split(" = ")[0]
									+ " = "
									+ func.split(" = ")[1].replace(";", "") + ";\n";
	
						} else {
							methodtext += "        int " + func.split(" = ")[0]
									+ " = " + func.split(" = ")[1].replace(";", "")
									+ ";\n";
	
						}
					}
					methodtext += "        assertEquals(\"Invalid conditions\","
							+ func.split(" = ")[0]
						
							+ ", _ctrl.get"
							+ Character.toUpperCase(func.split(" = ")[0]
									.charAt(0))
							+ func.split(" = ")[0].substring(1) + "());\n";
				}
			}
		}
		methodtext += "\n        }\n";
		return methodtext;
	}

	public String makeCtrl() {
		String ctrl = "        _ctrl = new "
				+ st.getClassName().replace(".java", "") + "();\n\n";
		return ctrl;
	}

	public String makeIntitalAssertions() {
		String asserttext = "        _ctrl = new " + className + "();\n\n";
		return asserttext;
	}

	public String makeClass() {
		String classtext = "public class " + className + "{\n    protected "
				+ st.getClassName().replace(".java", "")
				+ " _ctrl;\n    enum State { ";
		System.out.println(st.getStates());
		for (State state : st.getStates()) {
			classtext = classtext + state.getName() + ", ";
		}
		classtext = classtext + "};\n    private State state;\n\n";
		classtext = classtext.replace(", };", "};");

		return classtext;
	}

	public OutputStreamWriter getOutputStream(String folderName, String fileName)
			throws IOException {
		File directory = new File(folderName);
		if (!directory.exists()) {
			directory.mkdir();
		}
		System.out.println(directory.getAbsolutePath());
		String output_fileName = folderName + "/" + fileName;
		File output = new File(output_fileName);
		if (!output.exists()) {
			output.createNewFile();
		}
		System.out.println(output.getAbsolutePath());
		FileOutputStream output_fileStream = new FileOutputStream(output);
		OutputStreamWriter output_writer = new OutputStreamWriter(
				output_fileStream, "ISO-8859-1");

		return output_writer;
	}

	public void writeToFile(OutputStreamWriter output_writer, String content,
			boolean withFlush) throws IOException {
		System.out.println(content);
		output_writer.append(content + '\n');
		if (withFlush) {
			output_writer.flush();
		}
	}

	public void closeFile(OutputStreamWriter output_writer) throws IOException {
		output_writer.close();
	}

}
