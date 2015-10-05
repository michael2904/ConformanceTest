package ca.mcgill.ecse429.conformancetest.main;

import java.util.ArrayList;

import ca.mcgill.ecse429.conformancetest.statemodel.ConformanceTestGenerator;
import ca.mcgill.ecse429.conformancetest.statemodel.StateMachine;
import ca.mcgill.ecse429.conformancetest.tree.Node;
import ca.mcgill.ecse429.conformancetest.tree.PathTestCase;
import ca.mcgill.ecse429.conformancetest.tree.Tree;

public class Main {

	public static void main(String[] args) {

		Tree tree = new Tree("ccoinbox.xml");
		ConformanceTestGenerator ctg = new ConformanceTestGenerator(tree);
		ctg.makeTheFile();
		
		Tree tree1 = new Tree("legislation.xml");
		ConformanceTestGenerator ctg1 = new ConformanceTestGenerator(tree1);
		ctg1.makeTheFile();
		
		ArrayList<PathTestCase> paths = tree.getAllPathTestCases();

		for (PathTestCase path : paths) {

			ArrayList<Node> arr = path.getPathTestCase();
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i).getState() );
				if(arr.get(i).getTranParent() != null)
					System.out.println(arr.get(i).getTranParent().getEvent()+"  //  "+arr.get(i).getTranParent().getCondition()+"  //  "+arr.get(i).getTranParent().getAction());
			}
			System.out.println("\n\n");
		}
		
		ArrayList<PathTestCase> paths1 = tree1.getAllPathTestCases();

		for (PathTestCase path : paths1) {

			ArrayList<Node> arr = path.getPathTestCase();
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i).getState() );
				if(arr.get(i).getTranParent() != null)
					System.out.println(arr.get(i).getTranParent().getEvent()+"  //  "+arr.get(i).getTranParent().getCondition()+"  //  "+arr.get(i).getTranParent().getAction());
			}
			System.out.println("\n\n");
		}
		
	}
}
