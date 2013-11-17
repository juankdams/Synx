package Misc;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;


public class StringUtils {
	 private static Map<String, SoftReference<Pattern>> patterns = new HashMap<String, SoftReference<Pattern>>(20);
	    
	    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		public static final String EXTENDED_ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_";
		
		public static final char[] alphaNumericUnderscore = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".toCharArray();
		public static final char[] alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		public static final char[] numeric = "0123456789".toCharArray();
	    
	    
	    
	    public static void main(String[] args) {
	        long time = System.nanoTime();
	        for (int i = 0; i < 10000000; i++) {
	            StringUtils.splitWithPattern("lol", "o", 2);
	        }

	        System.out.println(System.nanoTime() - time);
	    }
	    
	    private StringUtils() {}
	    
	    public static String toString(Object object) {
	        return object == null ? "null" : object.toString();
	    }
	    
	    public static String join(char separator, String... array) {
	        int length = array.length;
	        for (String string : array) {
	            length += string.length();
	        }
	        StringBuilder builder = new StringBuilder(length);
	        boolean first = true;
	        for (String string : array) {
	            if (!first) {
	                builder.append(separator);
	            }
	            builder.append(string);
	            first = false;
	        }
	        return builder.toString();
	    }
	    
	    //If you know the final string length, use this to get better speed
	    public static String join(int buffer, char separator, String... array) {
	        StringBuilder builder = new StringBuilder(buffer);
	        boolean first = true;
	        for (String string : array) {
	            if (!first) {
	                builder.append(separator);
	            }
	            builder.append(string);
	            first = false;
	        }
	        return builder.toString();
	    }
	    
	    public static String join(String separator, String... array) {
	        int length = array.length * separator.length();
	        for (String string : array) {
	            length += string.length();
	        }
	        StringBuilder builder = new StringBuilder(length);
	        boolean first = true;
	        for (String string : array) {
	            if (!first) {
	                builder.append(separator);
	            }
	            builder.append(string);
	            first = false;
	        }
	        return builder.toString();
	    }
	    
	    //If you know the final string length, use this to get better speed
	    public static String join(int buffer, String separator, String... array) {
	        StringBuilder builder = new StringBuilder(buffer);
	        boolean first = true;
	        for (String string : array) {
	            if (!first) {
	                builder.append(separator);
	            }
	            builder.append(string);
	            first = false;
	        }
	        return builder.toString();
	    }
	    
	    public static String join(String separator, Iterable<String> array) {
	        int length = separator.length() * 10;
	        for (String string : array) {
	            length += string.length();
	        }
	        StringBuilder builder = new StringBuilder(length);
	        boolean first = true;
	        for (String string : array) {
	            if (!first) {
	                builder.append(separator);
	            }
	            builder.append(string);
	            first = false;
	        }
	        return builder.toString();
	    }
	    
	    //If you know the final string length, use this to get better speed
	    public static String join(int buffer, String separator, Iterable<String> array) {
	        StringBuilder builder = new StringBuilder(buffer);
	        boolean first = true;
	        for (String string : array) {
	            if (!first) {
	                builder.append(separator);
	            }
	            builder.append(string);
	            first = false;
	        }
	        return builder.toString();
	    }
	    
	    public static String join(char separator, Iterable<String> array) {
	        int length = 10;
	        for (String string : array) {
	            length += string.length();
	        }
	        StringBuilder builder = new StringBuilder(length);
	        boolean first = true;
	        for (String string : array) {
	            if (!first) {
	                builder.append(separator);
	            }
	            builder.append(string);
	            first = false;
	        }
	        return builder.toString();
	    }
	    
	    //If you know the final string length, use this to get better speed
	    public static String join(int buffer, char separator, Iterable<String> array) {
	        StringBuilder builder = new StringBuilder(buffer);
	        boolean first = true;
	        for (String string : array) {
	            if (!first) {
	                builder.append(separator);
	            }
	            builder.append(string);
	            first = false;
	        }
	        return builder.toString();
	    }
	    
	    
	    public static String[] split(String string, char separator) {
	        List<String> list = new ArrayList<String>(20);
	        int pos = 0, end;
	        String s;
	        while ((end = string.indexOf(separator, pos)) >= 0) {
	            s = string.substring(pos, end);
	            if (!s.isEmpty()) {
	                list.add(s);
	            }
	            pos = end + 1;
	        }
	        s = string.substring(pos);
	        if (!s.isEmpty()) {
	            list.add(s);
	        }
	        return list.toArray(new String[list.size()]);
	    }
	    
	    public static String[] split2(String string, String separator) {
	        List<String> list = new ArrayList<String>(20);
	        int end;
	        while ((end = string.indexOf(separator)) >= 0) {
	            list.add(string.substring(0, end));
	            if(end + 1 <= string.length()){
	            	string = string.substring(end + 1);
	            }
	        }
	        list.add(string);
	        return list.toArray(new String[list.size()]);
	    }
	    
	    public static String[] split(String string, char separator, int limit) {
	        String[] array = new String[limit];
	        int pos = 0, end;
	        int current = 0;
	        int size = limit;
	        String s;
	        while ((end = string.indexOf(separator, pos)) >= 0 && current < size) {
	            s = string.substring(pos, end);
	            if (!s.isEmpty()) {
	                array[current] = s;
	                ++current;
	            }
	            pos = end + 1;
	        }
	        s = string.substring(pos);
	        if (!s.isEmpty()) {
	            if (current >= size) {
	                array[current - 1] += s;
	            } else {
	                array[current] = s;
	            }
	            
	        }
	        return array;
	    }
	    
	    public static String[] split(String string, char separator, String[] array) {
	        int pos = 0, end;
	        int current = 0;
	        int size = array.length;
	        String s;
	        while ((end = string.indexOf(separator, pos)) >= 0 && current < size) {
	            s = string.substring(pos, end);
	            if (!s.isEmpty()) {
	                array[current] = s;
	                ++current;
	            }
	            pos = end + 1;
	        }
	        s = string.substring(pos);
	        if (!s.isEmpty()) {
	            if (current >= size) {
	                array[current - 1] += s;
	            } else {
	                array[current] = s;
	            }
	        }
	        return array;
	    }
	    
	    public static String[] split(String string, String separator) {
	        List<String> list = new ArrayList<String>(20);
	        int pos = 0, end;
	        String s;
	        while ((end = string.indexOf(separator, pos)) >= 0) {
	            s = string.substring(pos, end);
	            if (!s.isEmpty()) {
	                list.add(s);
	            }
	            pos = end + 1;
	        }
	        s = string.substring(pos);
	        if (!s.isEmpty()) {
	            list.add(s);
	        }
	        return list.toArray(new String[list.size()]);
	    }
	    
	    public static String[] split(String string, String separator, int limit) {
	        String[] array = new String[limit];
	        int pos = 0, end;
	        int current = 0;
	        int size = limit;
	        String s;
	        while ((end = string.indexOf(separator, pos)) >= 0 && current < size) {
	            s = string.substring(pos, end);
	            if (!s.isEmpty()) {
	                array[current] = s;
	                ++current;
	            }
	            pos = end + 1;
	        }
	        s = string.substring(pos);
	        if (!s.isEmpty()) {
	            if (current >= size) {
	                array[current - 1] += s;
	            } else {
	                array[current] = s;
	            }
	            
	        }
	        return array;
	    }
	    
	    public static String[] split(String string, String separator, String[] array) {
	        int pos = 0, end;
	        int current = 0;
	        int size = array.length;
	        String s;
	        while ((end = string.indexOf(separator, pos)) >= 0 && current < size) {
	            s = string.substring(pos, end);
	            if (!s.isEmpty()) {
	                array[current] = s;
	                ++current;
	            }
	            pos = end + 1;
	        }
	        s = string.substring(pos);
	        if (!s.isEmpty()) {
	            if (current >= size) {
	                array[current - 1] += s;
	            } else {
	                array[current] = s;
	            }
	        }
	        return array;
	    }
	    
	    public static String[] splitWithPattern(String string, String reglex) {
	        if (patterns.containsKey(reglex)) {
	            SoftReference<Pattern> ref = patterns.get(reglex);
	            Pattern p = ref.get();
	            if (p != null) {
	                return p.split(string);
	            }
	        }
	        Pattern p = Pattern.compile(reglex);
	        patterns.put(reglex, new SoftReference<Pattern>(p));
	        return p.split(string);
	    }
	    
	    public static String[] splitWithPattern(String string, String reglex, int limit) {
	        if (patterns.containsKey(reglex)) {
	            SoftReference<Pattern> ref = patterns.get(reglex);
	            Pattern p = ref.get();
	            if (p != null) {
	                return p.split(string, limit);
	            }
	        }
	        Pattern p = Pattern.compile(reglex);
	        patterns.put(reglex, new SoftReference<Pattern>(p));
	        return p.split(string,limit);
	    }
	    
	    public static int count(String string, char c) {
	        int count = 0;
	        int lastIndex = 0;
	        while(lastIndex != -1){
	            lastIndex = string.indexOf(c, lastIndex);
	            if(lastIndex != -1){
	                ++count;
	                ++lastIndex;
	            }
	        }
	        return count;
	    }
	    
	    public static int count(String string, String s) {
	        int count = 0;
	        int lastIndex = 0;
	        while(lastIndex != -1){
	            lastIndex = string.indexOf(s, lastIndex);
	            if(lastIndex != -1){
	                ++count;
	                ++lastIndex;
	            }
	        }
	        return count;
	    }
	    
	    public static int countFromTwoSides(String string, String s) {
	        int count = 0;
	        int lastIndex = 0;
	        int lastIndex2 = string.length()-1;
	        while(lastIndex != -1){
	            lastIndex = string.indexOf(s, lastIndex);
	            if(lastIndex != -1){
	                ++count;
	                ++lastIndex;
	            }else{ 	break; }
	            lastIndex2 = string.lastIndexOf(s, lastIndex2);
	            if(lastIndex < lastIndex2){
	                ++count;
	                --lastIndex2;
	            }else{ 	break; }
	        }
	        return count;
	    }

		public static int countUntilIndex(String string, String s, int maxIndex) {
			int count = 0;
	        int lastIndex = 0;
	        while(lastIndex != -1){
	            lastIndex = string.indexOf(s, lastIndex);
	            if(lastIndex != -1 && lastIndex <= maxIndex){
	            	//Syn.d("count="+count+",  lastIndex="+lastIndex);
	                ++count;
	                ++lastIndex;
	            }else{ 	break; }
	        }
	    //	Syn.d("final count="+count+",  lastIndex="+lastIndex);
	        return count;
		}
		public static int countUntilIndexFromTwoSides(String string, String s, int maxIndex) {
			int count = 0;
	        int lastIndex = 0;
	        int lastIndex2 = maxIndex;
	        while(lastIndex != -1){
	            lastIndex = string.indexOf(s, lastIndex);
	            if(lastIndex != -1 && lastIndex <= maxIndex){
	            	//Syn.d("count="+count+",  lastIndex1="+lastIndex);
	                ++count;
	                ++lastIndex;
	            }else{ 	break; }
	            lastIndex2 = string.lastIndexOf(s, lastIndex2);
	            if(lastIndex2 != -1 && lastIndex < lastIndex2){
	            	//Syn.d("count="+count+",  lastIndex2="+lastIndex2);
	                ++count;
	                --lastIndex2;
	            }else{ 	break; }
	        }
	    	//Syn.d("final count="+count+",  lastIndex="+lastIndex+", lastIndex2="+lastIndex2);
	        return count;
		}
		
	    /**
	     * Trouve l'Xeme index de la string recherchée.
	     * <p>Ex avec ("troll;pop;cat;jut;riot", ";", 4), 
	     * 	  ca retournerait l'index de la 4eme apparition du ";", qui est donc entre jut et riot 
	     * <p><i>Voir les figures possibles ci-bas.</i>
	     * @return - 
	     * 		<br>  Cas 1 : La string recherchée a été trouvée le bon nombre de fois, l'index est donc retourné parfaitement
	     * 		<br>  Cas 2 : La string recherchée a bien été trouvée, mais le XiemeIndexOf est trop gros (ex: "a;e;i", ";", 67) alors c'est le dernier index valide qui est renvoyé
	     * 		<br>  Cas 3 : La string recherchée n'a pas été trouvée du tout, on retourne -1.
	     * 		<br>  Cas 4 : Le XiemeIndexOf est égal à 0, on retourne -1.
	     */
	    public static int indexOf(String str, String toSearch, int XiemeIndexOf){
	    	/*
	    	 Ex: effectID ; min ; max ; morph ; durée ; probabilité ; dice
	    	 */
	    	int index = 0;
	    	for(int i = 1; i <= XiemeIndexOf; i++){
	    		//Syn.w("A.  i="+i+" index="+index+"  substring=("+str.substring(index)+"),  indexOf="+str.substring(index).indexOf(toSearch));
	    		index += (str.substring(index).indexOf(toSearch)+1);
	    		//Syn.w("B. i="+i+" index="+index+"  substring=("+str.substring(index)+"),  indexOf="+str.substring(index).indexOf(toSearch));
	    		//Syn.w("");
	    	}
	    	return index-1;
	    }

	    
	    /*
	    public static String randomString() {
	        Random random = RandomThreadLocal.getRandom();
	        int length = random.nextInt(256) + 1;
	        StringBuilder builder = new StringBuilder(length);
	        char[] chars = alphaNumericUnderscore;
	        int size = chars.length;
	        for (int i = length - 1; --i>=0; ) {
	            builder.append(chars[random.nextInt(size)]);
	        }
	        return builder.toString();
	    }
	    
	    public static String randomString(int length) {
	        Random random = RandomThreadLocal.getRandom();
	        StringBuilder builder = new StringBuilder(length);
	        char[] chars = alphaNumericUnderscore;
	        int size = chars.length;
	        for (int i = length - 1; --i>=0; ) {
	            builder.append(chars[random.nextInt(size)]);
	        }
	        return builder.toString();
	    }
	    
	    public static String randomString(char[] chars) {
	        Random random = RandomThreadLocal.getRandom();
	        int length = random.nextInt(256) + 1;
	        StringBuilder builder = new StringBuilder(length);
	        int size = chars.length;
	        for (int i = length - 1; --i>=0; ) {
	            builder.append(chars[random.nextInt(size)]);
	        }
	        return builder.toString();
	    }
	    
	    public static String randomString(int length, char[] chars) {
	        Random random = RandomThreadLocal.getRandom();
	        StringBuilder builder = new StringBuilder(length);
	        int size = chars.length;
	        for (int i = length - 1; --i>=0; ) {
	            builder.append(chars[random.nextInt(size)]);
	        }
	        return builder.toString();
	    }
	    
	    public static String randomNumberString() {
	        Random random = RandomThreadLocal.getRandom();
	        int length = random.nextInt(256) + 1;
	        StringBuilder builder = new StringBuilder(length);
	        char[] chars = numeric;
	        int size = chars.length;
	        for (int i = length - 1; --i>=0; ) {
	            builder.append(chars[random.nextInt(size)]);
	        }
	        return builder.toString();
	    }
	    
	    public static String randomNumberString(int length) {
	        Random random = RandomThreadLocal.getRandom();
	        StringBuilder builder = new StringBuilder(length);
	        char[] chars = numeric;
	        int size = chars.length;
	        for (int i = length - 1; --i>=0; ) {
	            builder.append(chars[random.nextInt(size)]);
	        }
	        return builder.toString();
	    }
	    
	    public static String randomAlphaString() {
	        Random random = RandomThreadLocal.getRandom();
	        int length = random.nextInt(256) + 1;
	        StringBuilder builder = new StringBuilder(length);
	        char[] chars = alpha;
	        int size = chars.length;
	        for (int i = length - 1; --i>=0; ) {
	            builder.append(chars[random.nextInt(size)]);
	        }
	        return builder.toString();
	    }
	    
	    public static String randomAlphaString(int length) {
	        Random random = RandomThreadLocal.getRandom();
	        StringBuilder builder = new StringBuilder(length);
	        char[] chars = alpha;
	        int size = chars.length;
	        for (int i = length - 1; --i>=0; ) {
	            builder.append(chars[random.nextInt(size)]);
	        }
	        return builder.toString();
	    }
	    */
}
