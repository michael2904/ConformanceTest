package ca.mcgill.ecse429.conformancetest.tree;

import java.util.ArrayList;

import ca.mcgill.ecse429.conformancetest.statemodel.State;
import ca.mcgill.ecse429.conformancetest.statemodel.Transition;

public class Node {
	private Node parent;
	ArrayList<Node> childNodes = new ArrayList<Node>();
	private State state;
	private Transition tranParent;
	
	public Transition getTranParent() {
		return tranParent;
	}

	public void setTransFromParent(Transition tranParent) {
		this.tranParent = tranParent;
	}

	public Node(State st)
	{
		state = st; 
		parent = null;
	}
	
	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public ArrayList<Node> getChildNodes() {
		return childNodes;
	}

	public void addChildNode(Node child) {
		this.childNodes.add(child);
	}
	
	public State getState(){
		return this.state;
	}
	
	public void setState(State st)
	{
		this.state = st;
	}

}
