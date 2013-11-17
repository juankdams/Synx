package alphabeta;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	public Node parent = null;
	public List<Node> children = new ArrayList<Node>();
	
	public Node(){
		
	}
	public Node(Node p){
		parent = p;
	}
	public Node(List<Node> p){
		children = p;
	}
	
	public int alpha = Integer.MAX_VALUE;
	public int beta = Integer.MAX_VALUE;
	
	
	public void check(){
		if(beta <= alpha){
			alpha = beta;
			backPropagate();
		}
	}
	
	public void backPropagate(){
		parent.beta = beta;
		parent.check();
	}
	

}
