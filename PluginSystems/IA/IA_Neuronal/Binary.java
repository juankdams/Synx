package IA;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Binary {

	
	/**
	 * Charge un network externalisé en binaire.
	 * @param path
	 * @throws IOException
	 */
	public static void load(String path) throws IOException{
		File file = new File(path);
		FileInputStream  fr = new FileInputStream (file);
		//BufferedReader buffText = new BufferedReader(fr);
		byte[] contents = new byte[(int) file.length()];
		fr.read(contents);
		//buffText.close();
		fr.close();

		ArrayList<Byte> header = new ArrayList<Byte>();
		for(byte b : contents){
			if(b != '!'){
				header.add(b);
			}else{
				break;
			}
		}

		Network n = IAFactory.createIANetwork(header);
		
	}
	
	
	public static void write(){
		
	}
	
	
}
