package ShivasPF;

import java.util.ArrayList;


public class Path extends ArrayList<Node> {

	private static final long serialVersionUID = -7753768718718684848L;

	public static Path parsePath(String string) {
		Path path = new Path();
		for (int i = 0; i < string.length(); i += 3) {
			Node n = Node.parseNode(string.substring(i, i + 3));
			if(n == null){
				return null;
			}
			path.add(n);
		}
		return path;
	}
	
	//PARTIE OBJECT -----------------------------------------------------------------
	
	/**
	 * Same as ArrayList.add(Node n).
	 * Return this path.
	 */
	public Path push(Node n){
		this.add(n);
		return this;
	}
	
	public Node first() {
		return get(0);
	}
	
	public Node last() {
		return get(size() - 1);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(size() * 3);
		for (int i = 0; i < size(); ++i) {
			sb.append(get(i).toString());
		}
		return sb.toString();
	}
	
}
