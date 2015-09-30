package ca.mcgill.ecse429.conformancetest.tree;

import java.util.ArrayList;

public class PathTestCase {
	
	private ArrayList<Node> pathtestCase = new ArrayList<Node>();
	
	public void addPath(Node node)
	{
		this.pathtestCase.add(node);
	}
	
	public ArrayList<Node> getPathTestCase()
	{
		return this.pathtestCase;
	}

}
