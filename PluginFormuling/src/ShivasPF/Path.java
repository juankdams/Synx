package ShivasPF;

import Plugins.Abstractions.AbstractFormulings.AbstractNode;
import Plugins.Abstractions.AbstractFormulings.AbstractPath;
import Plugins.Managers.FormulingManager;

public class Path extends AbstractPath {

	private static final long serialVersionUID = -7753768718718684848L;

	@Override
	public Path parsePath(FormulingManager fm, String string) {
		Path path = new Path();
		for (int i = 0; i < string.length(); i += 3) {
			AbstractNode n = fm.parseNode(string.substring(i, i + 3));
			if(n == null){
				return null;
			}
			path.add(n);
		}
		return path;
	}

	
	
	
	//PARTIE OBJECT -----------------------------------------------------------------

	@Override
	public AbstractPath createNew() {
		return new Path();
	}
	/**
	 * Same as ArrayList.add(Node n).
	 * Return this path.
	 */
	@Override
	public AbstractPath push(AbstractNode n){
		this.add(n);
		return this;
	}
	@Override
	public AbstractNode first() {
		return get(0);
	}
	@Override
	public AbstractNode last() {
		return get(size() - 1);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(size() * 3);
		for (int i = 0; i < size(); ++i) {
			sb.append(get(i).toString());
		}
		return sb.toString();
	}





	
}
