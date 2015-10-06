package ca.mcgill.ecse429.conformancetest.statemodel;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

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


	//constructor:
	//getting the tree, the state machine and the list of paths
	public ConformanceTestGenerator(Tree tree) {
		this.tree = tree;
		this.st = tree.getSm();
		this.paths = tree.getAllPathTestCases();

	}

	
	//method to generate the file
	//it creates or modifies the file to generate
	//it also writes the package, imports, class and test methods
	//for each paths, it generates a new test method
	public void makeTheFile() {

		try {
			st.delete();
			className ="GeneratedTest"+ st.getClassName().replace(".java","");
			String csvOutputFolder = "src/ca/mcgill/ecse429/conformancetest/statemodel";
			OutputStreamWriter rapport_dataWriter = getOutputStream(
					csvOutputFolder, className + ".java");

			writeToFile(rapport_dataWriter, makeImport(), false);
			writeToFile(rapport_dataWriter, makeClass(), false);
			for (; testnumber < paths.size(); testnumber++) {
				vars.clear();
				writeToFile(rapport_dataWriter, makeMethod(), false);
			}
			writeToFile(rapport_dataWriter, "\n}", false);
			closeFile(rapport_dataWriter);


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//function to generate string for the imports
	public String makeImport(){
		String newLine = "package ca.mcgill.ecse429.conformancetest.statemodel;\nimport static org.junit.Assert.assertEquals;\nimport org.junit.Test;\nimport ca.mcgill.ecse429.conformancetest."
				+ st.getClassName().replace(".java", "").toLowerCase()
				+ "."
				+ st.getClassName().replace(".java", "")
				+ ";\n\n";
		return newLine;
	}
	
	//function to generate the method in function of the current path.
	//it generates the method name and calls the function to fill it.
	//fills the method for each state and the transition also depending on the condition
	public String makeMethod() {
		String methodtext = "    @Test\n    public void " + className
				+testnumber+ "method() {    	";

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

	
	//function to fill the assertions in function of the state and transition
	//asserts the state and the values of each value depending on the actions of the transition
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
	
	//if transition had condition add the condition
	public String makeInMethodWithCond(Node curNode, String cond) {
		String methodtext = "";
		if(cond.contains("()")){
			cond="_ctrl."+cond;
			if(cond.contains("!")){
				cond="!"+cond.replace("!","");
			}
		}
		methodtext += "        if(" + cond + "){\n";
		methodtext+= makeInMethodNoCond(curNode);
		methodtext += "\n        }\n";
		return methodtext;
	}
	
	
	//function that makes new object
	public String makeCtrl() {
		String ctrl = "        _ctrl = new "
				+ st.getClassName().replace(".java", "") + "();\n\n";
		return ctrl;
	}
	
	//function that generates the class
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

	
	// method to get the output stream writer from the foldername and filename
	//checking if they exist
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
	
	
	//from the outputstream writer, write a content to the file
	public void writeToFile(OutputStreamWriter output_writer, String content,
			boolean withFlush) throws IOException {
		System.out.println(content);
		output_writer.append(content + '\n');
		if (withFlush) {
			output_writer.flush();
		}
	}
	//finish by closing the file
	public void closeFile(OutputStreamWriter output_writer) throws IOException {
		output_writer.close();
	}

}
