package Tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tgamConvert {

	
	public static void Main() throws IOException
	{
		BufferedReader swfText = new BufferedReader(new FileReader(new File("11.tgam")));
		String line = "";
		String content = "";
		while ((line=swfText.readLine())!=null){
			content += line;
		}
		int i = content.indexOf("AGT");
		W.w("i="+i);
		content = content.substring(i, "AGT".length()+i-1);
		i = -1;
		i = content.indexOf("AGT");
		W.w("i="+i);
		try{
			  // Create file 
			  FileWriter fstream = new FileWriter("new11.tga");
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write(content);
			  //Close the output stream
			  out.close();
		}catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
			
	//	File f = new File("new11.tga");
//		BufferedWriter bw = new BufferedWriter(w);
	      /*
	            string str2 = File.ReadAllText(str, Encoding.Default);
	            int index = str2.IndexOf("AGT");
	            if (index != -1)
	            {
	                string contents = str2.Substring(index);
	                FileInfo info = new FileInfo(str);
	                string path = "data2/" + info.Name.Replace(".tgam", ".tga");
	                File.WriteAllText(path, contents, Encoding.Default);
	                Console.WriteLine(str + " -> " + path);
	            }
	            */
	}

	
}
