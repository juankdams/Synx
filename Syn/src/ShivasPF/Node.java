package ShivasPF;

import java.util.regex.Pattern;

import Core.Exceptions;
import Enums.Orientation;

public class Node {
	public static Node parseNode(String string) {
		if(Pattern.matches(Constants.Constants.isAlphanumericUnderscore, string) == false){
			return null;
			//Exceptions.throwArrayIndexOutOfBoundsException("Node.parseNode() : Impossible de parser la string en cellID + orientation. La string ne respecte pas le regex.");
		}
		return new Node(
				Cells.decode(string.charAt(0)),
				Cells.decode(string.substring(1))
		);
	}
	
	
	
	//PARTIE OBJECT ------------------------------------------------------------------------
	
	private byte orientation;
	private short cell;
	
	public Node() {
	}

	public Node(Orientation orientation, short cell) {
		this.orientation = (byte) orientation.ordinal();
		this.cell = cell;
	}
	public Node(byte orientation, short cell) {
		this.orientation = orientation;
		this.cell = cell;
	}

	public byte orientation() {
		return orientation;
	}

	public Node setOrientation(Orientation orientation) {
		this.orientation = (byte) orientation.ordinal();
		return this;
	}
	public Node setOrientation(byte orientation) {
		this.orientation = orientation;
		return this;
	}

	public short cell() {
		return cell;
	}

	public Node setCell(short cell) {
		this.cell = cell;
		return this;
	}
	
	public String toString() {
		return Cells.encode(orientation) +
			   Cells.encode(cell);
	}
}
