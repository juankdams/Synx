package ShivasPF;

import Enums.Orientation;
import Misc.StringUtils;


public class Cells {
	private Cells() {}
	
	public static String encode(short cellid) {
        return Character.toString(StringUtils.alphaNumericUnderscore[cellid / 64]) +
                Character.toString(StringUtils.alphaNumericUnderscore[cellid % 64]);
	}
	
	//public static String encode(GameCell cell) {
	//	return encode(cell.getId());
	//}
	
	public static short decode(String string) {
        return (short) (StringUtils.EXTENDED_ALPHABET.indexOf(string.charAt(0)) * 64 +
                StringUtils.EXTENDED_ALPHABET.indexOf(string.charAt(1)));
	}
	
	
	public static String encode(Orientation orientation) {
		return String.valueOf(StringUtils.alphaNumericUnderscore[orientation.ordinal()]);
	}
	public static String encode(byte orientation) {
		return String.valueOf(StringUtils.alphaNumericUnderscore[orientation]);
	}

    public static Orientation decode(char orientationCode){
        return Orientation.values()[StringUtils.EXTENDED_ALPHABET.indexOf(orientationCode)];
    }
}
