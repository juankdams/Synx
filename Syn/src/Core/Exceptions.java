package Core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Misc.Utils;
import XML.Config;

public class Exceptions {
	public static Logger log = LoggerFactory.getLogger(Exceptions.class);
	private static long logID = 0;
	private static Element rootNode = null;
	private static Element normalExceptionNode = null;
	private static Document document = null;
	private static XMLOutputter xmlOutput = null;
	private static FileWriter writer = null;
	
	/**
	 * Ca trow une nullPointerException, mais c'passque j'ai pas le choix, le throw Exception m'oblige à mettre un try autour, c'est con.
	 * @param msg
	 */
	public static void throwException(String msg){
		write("Exception", msg);
		//try{ 
			throw new NullPointerException("[Exception]"+msg);  
			//} catch (Exception e) {}
	}
	public static void throwNullPointerException(String msg){
		write("NullPointerException", msg);
		throw new NullPointerException(msg);
	}
	public static void throwNumberFormatException(String msg){
		write("NumberFormatException", msg);
		throw new NumberFormatException(msg);
	}
	public static void throwArrayIndexOutOfBoundsException(String msg){
		write("ArrayIndexOutOfBoundsException", msg);
		throw new ArrayIndexOutOfBoundsException(msg);
	}
	public static void throwStringIndexOutOfBoundsException(String msg){
		write("StringIndexOutOfBoundsException", msg);
		throw new StringIndexOutOfBoundsException(msg);
	}
	public static void throwIndexOutOfBoundsException(String msg){
		write("IndexOutOfBoundsException", msg);
		throw new IndexOutOfBoundsException(msg);
	}
	public static void throwIllegalArgumentException(String msg){
		write("IllegalArgumentException", msg);
		throw new IllegalArgumentException(msg);
	}
	public static void throwDataFormatException(String msg){
		write("DataFormatException", msg);
		throw new NullPointerException("[DataFormatException]"+msg);// WTF? pourquoi faut un try sur mon throwDataFormatException?
	}
	/**
	 * Ca trow une NullPointerException, mais c'passque j'ai pas le choix, le throw InterruptedException m'oblige à mettre un try autour, c'est con.
	 */
	public static void throwInterruptedException(String msg){
		write("InterruptedException", msg);
		//try {
			throw new NullPointerException("[InterruptedException]"+msg);
			// WTF? pourquoi faut un try sur mon throwInterruptedException?
		//} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	
	
	/**
	 * Pour aller écrire un nouveau message dans les logs
	 * sous le bon élément d'exception.
	 */
	public static void write(String exceptionName, String msg){
		log.warn(exceptionName+" : "+msg);
		if(writer == null){
			return;
		}
		try {
			//Set l'attribut
			Element child = rootNode.getChild(exceptionName);
			if(child != null){
				child.setAttribute("ID"+(++logID)+"-"+Utils.getDateString().replace("~", "."),msg);
			}else{
				normalExceptionNode.setAttribute("ID"+(++logID)+"-"+Utils.getDateString().replace("~", "."),msg);
			}
			//Écrit dans le xml
			xmlOutput.output(document, writer);
		 } catch (IOException io) {
			io.printStackTrace();
		 }
	}
	
	/**
	 * Pour aller chercher le dernier ID de log 
	 * <p>et instancier notre variable rootElement
	 * <p>et instancier notre variable document
	 * <p>et instancier notre variable xmlOutput
	 */
	public static void read(){
		//http://www.mkyong.com/java/how-to-read-xml-file-in-java-jdom-example/
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File(Config.exceptionsLogFileName);
		try {
			document = (Document) builder.build(xmlFile);
			rootNode = document.getRootElement();
			normalExceptionNode = rootNode.getChild("Exception");
			logID = Long.parseLong(rootNode.getAttributeValue("logID"));

			// display nice nice
			xmlOutput = new XMLOutputter();
			xmlOutput.setFormat(Format.getPrettyFormat());
			writer = new FileWriter(Config.exceptionsLogFileName);
		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}
	}
	
	/**
	 * Pour aller modifier le dernier ID de log
	 */
	/*private static void updateID(){
		try {
			;//Update l'attribut de l'ID
			rootNode.setAttribute("logID", logID+"");
			//Écrit dans le xml
			xmlOutput.output(document, new FileWriter(Config.exceptionsLogFileName));
		 } catch (IOException io) {
			io.printStackTrace();
		 }
	}*/
	
	
}
