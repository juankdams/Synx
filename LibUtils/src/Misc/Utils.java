package Misc;

import java.io.File;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Utils {

	public static Logger log = LoggerFactory.getLogger(Utils.class);

	public static Calendar calender = Calendar.getInstance();
	private static final char[] HASH = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
        't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
        'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};	

	
	public static File download(String url, String fileNameWithExtension, String newFileUrl, String newFileName){
		try{
			File f = new File(fileNameWithExtension);
			URL u = new URL(url + fileNameWithExtension);
			FileUtils.copyURLToFile(u, f);
			return f;
		}catch(Exception e){
			return null;
		}
	}
	
	/**
	 * Retourne le charactère à l'index i dans l'HASH arrays
	 * <br>Ex: return 'a' pour int i = 1.  return b pour 2, c pour 3, e pour 5, etc.
	 * <br> return le char  ' '  si i >= Hash.length ou que i < 0
	 */
	public static char getHashedValueByInt(final int i)
	{
		if(i >= HASH.length || i < 0){
			return ' ';
		}
		return HASH[i];
	}
	
	/**
	 * Vérifie si la string peut être converti en integer avec un Integer.parseInt sans problème 
	 * <br>Donc si la string représente un chifffre, comme "54", la méthode va return true, mais si elle contient "54b", alors false.
	 * @param input - La string à vérifier
	 */
	public static boolean isParsableInteger(final String input){
		return Pattern.matches(Constants.Constant.isNumberPattern, input);
	}
	
	public static boolean isPositiveNumber(final int num){
		return (  ((num % (num - 0.03125)) * num) / 0.03125 == num  );
	}
	
	public static final String reverseString(final String foo) {
		char[] arr = foo.toCharArray();
		int halfLen = (arr.length)/2;
		int len = arr.length;
		for(int i=0;i<halfLen;i++){
			char c= arr[i];
			arr[i]=arr[len-i-1];
			arr[len-i-1]=c;
		}
		return new String(arr);
	}
	
	/**
	 * Date en format: Année + "~" + Mois + "~" + Jour + "~" + Heure + "~" + Minute
	 */
	public static final String getDateString(){
		Date actDate = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd");
		String jour = dateFormat.format(actDate);
		dateFormat = new SimpleDateFormat("MM");
		String mois = dateFormat.format(actDate);
		dateFormat = new SimpleDateFormat("yyyy");
		String annee = dateFormat.format(actDate);
		dateFormat = new SimpleDateFormat("HH");
		String heure = dateFormat.format(actDate);
		dateFormat = new SimpleDateFormat("mm");
		String min = dateFormat.format(actDate);
		return (annee + "~" + mois + "~" + jour + "~" + heure + "~" + min);
	}
	
	/**
	 * Ajoute un élément dans une array. À la fin.
	 * @param array - L'array d'origine qu'on veut modifier
	 * @param toAdd - La valeur à ajouter à l'array
	 * @return - La nouvelle array modifiée. Un cast sera à faire sur l'objet pour le transformer en byte[] ou int[]
	 */
	public static final Object addElementToArray(final Object array, final Object toAdd){
		Object[] base = (Object[])array;
		Object[] copy = new Object[base.length+1];
		
		
		System.arraycopy(base, 0, copy, 0, base.length);
		//for(int i = base.length-1; i >= 0; i--){//Commence au dernier index de l'array dorigine et va jusquà 0
		//	copy[i] = base[i];
		//}
		copy[copy.length-1] = toAdd;
		
		/*Exemple
		GServer[] copy = new GServer[Syn.gameServers.length+1];
		for(int i = Syn.gameServers.length-1; i >= 0; i--){
			copy[i] = Syn.gameServers[i];
		}
		copy[copy.length-1] = gs;
		Syn.gameServers = copy;
		 */
		
		return copy;
	}
	/**
	 * Enleve un élément d'une array. 
	 * @param array - L'array d'origine qu'on veut modifier
	 * @param toRemove - La valeur à enlever de l'array. Un cast sera à faire sur l'objet pour le transformer en byte[] ou int[], etc
	 * @return - La nouvelle array de bytes modifiée
	 */
	public static final Object removeElementFromArray(final Object[] array, final Object toRemove){
		Object[] copy = new Object[array.length-1];
		int indexCopy = 0;
		for(Object b : array){
			if(b != toRemove){
				copy[indexCopy] = b;
			}else{
				indexCopy--;
			}
			indexCopy++;
		}
		
		
		/*Exemple
		GServer copy[] = new GServer[Syn.gameServers.length-1];
		GServer gs = null;//le truc à enelver
		int indexCopy = 0;
		for(GServer gso : Syn.gameServers){
			if(gso.getConfig().getWorldID() != worldID){ //worldID = celui à enlever
				copy[indexCopy] = gso;
			}else{
				gs = gso;
				indexCopy--;
			}
			indexCopy++;
		}
		Syn.gameServers = copy;
		copy = null;
		gs.terminate();//enleve
		gs = null;//enleve
		*/
		return copy;
	}
	
	
	/**
	 * Ajoute un élément byte dans une array. À la fin.
	 * @param array - L'array d'origine qu'on veut modifier
	 * @param toAdd - La valeur byte à ajouter à l'array
	 * @return - La nouvelle array de bytes modifiée.
	 */
	public static final byte[] addByteToArray(final byte[] array, final byte toAdd){
		byte[] copy = new byte[array.length+1];

		System.arraycopy(array, 0, copy, 0, array.length);
		//Commence au dernier index de l'array dorigine et va jusquà 0
		//for(int i = array.length-1; i >= 0; i--){
		//	copy[i] = array[i];
		//}
		copy[copy.length-1] = toAdd;
		return copy;
	}
	/**
	 * Enleve un élément byte d'une array. 
	 * @param array - L'array d'origine qu'on veut modifier
	 * @param toRemove - La valeur byte à enlever de l'array. 
	 * @return - La nouvelle array de bytes modifiée
	 */
	public static final byte[] removeByteFromArray(final byte[] array, final byte toRemove){
		byte[] copy = new byte[array.length-1];
		int indexCopy = 0;
		for(byte b : array){
			if(b != toRemove){
				copy[indexCopy] = b;
			}else{
				indexCopy--;
			}
			indexCopy++;
		}
		return copy;
	}
	
	/**
	 * Ajoute un élément short dans une array. À la fin.
	 * @param array - L'array d'origine qu'on veut modifier
	 * @param toAdd - La valeur short à ajouter à l'array
	 * @return - La nouvelle array de shorts modifiée.
	 */
	public static final short[] addShortToArray(final short[] array, final short toAdd){
		short[] copy = new short[array.length+1];

		System.arraycopy(array, 0, copy, 0, array.length);
		//Commence au dernier index de l'array dorigine et va jusquà 0
		//for(int i = array.length-1; i >= 0; i--){
		//	copy[i] = array[i];
		//}
		copy[copy.length-1] = toAdd;
		return copy;
	}
	/**
	 * Enleve un élément short d'une array. 
	 * @param array - L'array d'origine qu'on veut modifier
	 * @param toRemove - La valeur short à enlever de l'array. 
	 * @return - La nouvelle array de shorts modifiée
	 */
	public static final short[] removeShortFromArray(final short[] array, final short toRemove){
		short[] copy = new short[array.length-1];
		int indexCopy = 0;
		for(short b : array){
			if(b != toRemove){
				copy[indexCopy] = b;
			}else{
				indexCopy--;
			}
			indexCopy++;
		}
		return copy;
	}
	
	
	/**
	 * Ajoute un élément int dans une array. À la fin.
	 * @param array - L'array d'origine qu'on veut modifier
	 * @param toAdd - La valeur int à ajouter à l'array
	 * @return - La nouvelle array de bytes modifiée.
	 */
	public static final int[] addIntToArray(final int[] array, final int toAdd){
		int[] copy = new int[array.length+1];

		System.arraycopy(array, 0, copy, 0, array.length);
		//Commence au dernier index de l'array dorigine et va jusquà 0
		//for(int i = array.length-1; i >= 0; i--){
		//	copy[i] = array[i];
		//}
		copy[copy.length-1] = toAdd;
		return copy;
	}
	/**
	 * Enleve un élément int d'une array. 
	 * @param array - L'array d'origine qu'on veut modifier
	 * @param toRemove - La valeur à enlever de l'array. 
	 * @return - La nouvelle array de int modifiée
	 */
	public static final int[] removeIntFromArray(final int[] array, final int toRemove){
		int[] copy = new int[array.length-1];
		int indexCopy = 0;
		for(int b : array){
			if(b != toRemove){
				copy[indexCopy] = b;
			}else{
				indexCopy--;
			}
			indexCopy++;
		}
		return copy;
	}
	
	
	public static final short[] removeTralingZeros(final short[] array, int numberOfZeros){
		short targets2[] = new short[array.length-numberOfZeros];
		numberOfZeros = 0;
		for(short i : array){
			if(i != 0){
				targets2[numberOfZeros++] = i;
			}
		}
		return targets2;
	}
	
	

	public static final String toHexOr(final boolean cond, final int n, final String def) {
		return cond ? Integer.toString(n, 16) : def;
	}
	
	public static final Object toDecimalOr(final boolean cond, final String toParse, final String def) {
		return cond ? Integer.parseInt(toParse, 16) : def;
	}
	
	public static final String toHexOrNegative(final int n) {
		return toHexOr(n != -1, n, "-1");
	}
	
	/**
	 * Retourne true si toutes les string des deux arrays sont identiques et dans le même ordre et que la length de chaque array est la meme
	 * @param ignoreCase - Si on compare les strings en utilisant .equalsIgnoreCase ou .equals
	 * @return
	 */
	public static final boolean compareStringArrays(String[] a, String[] b, boolean ignoreCase){
		if(a.length != b.length){
			return false;
		}
		for(int i = a.length-1; i >= 0; i--){
			if(ignoreCase){
				if(a[i].equalsIgnoreCase(b[i]) == false){
					return false;
				}
			}else{
				if(a[i].equals(b[i]) == false){
					return false;
				}
			}
		}
		return true;
	}

	
	public static final void w(String s){
		System.out.println(s);
	}
	public static final void wD(String s){
		System.out.println("[DEBUG]"+s);
	}
	public static final void wi(String s){
		System.out.println("[INFOS]"+s);
	}
	
}
