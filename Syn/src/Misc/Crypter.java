package Misc;

public class Crypter {

	public static String CryptPassword(String Key, String Password)
    {
		char[] HASH = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 
			'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 
			'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
			'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
			'-', '_'};
        String _Crypted = "#1";
        for (int i = 0; i < Password.length(); i++)
        {
            char PassChar = Password.charAt(i);
            char KeyChar = Key.charAt(i);

            int APass = (int)PassChar / 16;
            int AKey = (int)PassChar % 16;
            
            int ANB = (APass + (int)KeyChar) % 64;
            int ANB2 = (AKey + (int)KeyChar) % 64;

            _Crypted += HASH[ANB];
            _Crypted += HASH[ANB2];
        }
        return _Crypted;
    }
	
	
}
