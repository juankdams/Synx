package Misc;

public class Maths {

	/**
	 * Converts an array of booleans into a binary sequence of the same order.
	 * <b>Exemples:</b><br>
		Maths.booleanToBinary(true, false);<br>
		--<br>
		boolean arr[] = {true, false};<br>
		Maths.booleanToBinary(arr);
	 * @param bools
	 * @return g sdf
	 */
	public static long booleanToBinary(boolean... bools){
		if(bools.length > 63){
			throw new IllegalArgumentException("Boolean array must contain no more than 63 values");
		}
		long r = 0;
		for(int i = 0; i < bools.length; i++){
			if(bools[i]) r += Math.pow(10, i); // ( == 1 * 10^x )
		}
		return r;
	}
	
}
