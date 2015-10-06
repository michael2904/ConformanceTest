package ca.mcgill.ecse429.conformancetest.main;

import java.util.ArrayList;

import ca.mcgill.ecse429.conformancetest.statemodel.ConformanceTestGenerator;
import ca.mcgill.ecse429.conformancetest.statemodel.StateMachine;
import ca.mcgill.ecse429.conformancetest.tree.Node;
import ca.mcgill.ecse429.conformancetest.tree.PathTestCase;
import ca.mcgill.ecse429.conformancetest.tree.Tree;

public class Main {

	public static void main(String[] args) {

		String[] filenames = { "ccoinbox.xml", "legislation.xml" };

		for (int i = 0; i < filenames.length; i++) {

			Tree tree = new Tree(filenames[i]);
			ConformanceTestGenerator ctg = new ConformanceTestGenerator(tree);
			ctg.makeTheFile();

		}

	}
}
