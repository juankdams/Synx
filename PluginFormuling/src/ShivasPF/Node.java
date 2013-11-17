package ShivasPF;

import java.util.regex.Pattern;

import Enums.Orientation;
import Plugins.Abstractions.AbstractFormulings.AbstractNode;

public class Node extends AbstractNode{
	
	@Override
	public Node parseNode(String s){
		if(Pattern.matches(Constants.Constants.isAlphanumericUnderscore, s) == false){
			return null;
			//Exceptions.throwArrayIndexOutOfBoundsException("Node.parseNode() : Impossible de parser la string en cellID + orientation. La string ne respecte pas le regex.");
		}
		return new Node(
				Cells.decode(s.charAt(0)),
				Cells.decode(s.substring(1))
		);
	}
	
	
	
	
	//PARTIE OBJECT ------------------------------------------------------------------------
	
	
	public Node() {
		super();
	}

	public Node(Orientation orientation, short cell) {
		super(orientation, cell);
		//this.orientation = (byte) orientation.ordinal();
		//this.cell = cell;
	}
	public Node(byte orientation, short cell) {
		super(orientation, cell);
		//this.orientation = orientation;
		//this.cell = cell;
	}
	@Override
	public AbstractNode createNew() {
		return new Node();
	}
	@Override
	public AbstractNode createNew(byte orientation, short cellid) {
		return new Node(orientation, cellid);
	}
	@Override
	public AbstractNode createNew(Orientation orientation, short cellid) {
		return new Node(orientation, cellid);
	}

	@Override
	public byte orientation() {
		return this.orientation;
	}
	@Override
	public Node setOrientation(Orientation orientation) {
		this.orientation = (byte) orientation.ordinal();
		return this;
	}
	@Override
	public Node setOrientation(byte orientation) {
		this.orientation = orientation;
		return this;
	}
	@Override
	public short cell() {
		return cell;
	}
	@Override
	public Node setCell(short cell) {
		this.cell = cell;
		return this;
	}
	@Override
	public String toString() {
		return Cells.encode(orientation) +
			   Cells.encode(cell);
	}





	
}
