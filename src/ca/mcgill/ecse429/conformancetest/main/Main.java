package ca.mcgill.ecse429.conformancetest.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import ca.mcgill.ecse429.conformancetest.tree.Node;
import ca.mcgill.ecse429.conformancetest.tree.PathTestCase;
import ca.mcgill.ecse429.conformancetest.tree.Tree;

public class Main {

	public static void main(String[] args) {

		Tree tree = new Tree("ccoinbox.xml");
		ArrayList<PathTestCase> paths = tree.getAllPathTestCases();

		for (PathTestCase path : paths) {

			ArrayList<Node> arr = path.getPathTestCase();
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i).getState() );
				if(arr.get(i).getTranParent() != null)
					System.out.println(arr.get(i).getTranParent().getEvent());
			}
			System.out.println("\n\n");
		}
	}
}
