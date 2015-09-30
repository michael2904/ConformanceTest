package ca.mcgill.ecse429.conformancetest.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import ca.mcgill.ecse429.conformancetest.statemodel.StateMachine;
import ca.mcgill.ecse429.conformancetest.statemodel.Transition;
import ca.mcgill.ecse429.conformancetest.statemodel.persistence.PersistenceStateMachine;

public class Tree {

	Node root;

	public Tree(String filename) {
		buildTree(filename);
	}

	// building the tree
	private Tree buildTree(String filename) {
		// load the stateMachine from the XML file
		PersistenceStateMachine.loadStateMachine(filename);

		// get the stateMachine
		StateMachine sm = StateMachine.getInstance();

		root = new Node(sm.getStartState());
		List<Transition> transList = sm.getTransitions();

		// for each transition add a node to the tree
		for (int i = 0; i < transList.size(); i++) {
			addNodeToTree(transList.get(i));
		}

		return this;

	}

	// add a node to the tree depending on the transition
	private void addNodeToTree(Transition transition) {
		Node iterate = null;
		Stack<Node> stack = new Stack<Node>();
		stack.add(root);

		while (!stack.isEmpty()) {
			iterate = stack.pop();

			// when the root is the parent of the node we want to add
			if (iterate.getState().equals(transition.getFrom())) {
				// declare a new node and add it to be the child of the actual
				// node
				Node newNode = new Node(transition.getTo());
				newNode.setTransFromParent(transition);
				newNode.setParent(iterate);
				iterate.addChildNode(newNode);
			}

			// get all the child nodes and add them to the stack
			// if the current node is nor empty
			else if (!iterate.getChildNodes().isEmpty()) {
				stack.addAll(iterate.getChildNodes());
			}
		}
	}

	public ArrayList<PathTestCase> getAllPathTestCases() {
		ArrayList<PathTestCase> paths = new ArrayList<PathTestCase>();
		Queue<Node> queue = new LinkedList<Node>();
		Node iterate = null;
		queue.add(root);

		while (!queue.isEmpty()) {
		
			iterate = queue.poll();
			// get all the child nodes and add them to the stack
			// if the current node is nor empty
			if (!iterate.getChildNodes().isEmpty()) {
				queue.addAll(iterate.getChildNodes());
			}
			// if iterate has no child, we get to a leaf
			// so we can determine the path from the leaf to the Root
			else
			{
				paths.add(DeterminePathTestCase(iterate));
			}
		}
		return paths;
	}
	
	// determine the path from a leaf to the root
	public PathTestCase DeterminePathTestCase(Node node)
	{
		PathTestCase path = new PathTestCase();
		while (node != null) {
			path.addPath(node);
			node = node.getParent();
		}
		return path;
	}

}
