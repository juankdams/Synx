package Core;

public class Exceptions {
	
	/**
	 * Ca trow une nullPointerException, mais c'passque j'ai pas le choix, le throw Exception m'oblige à mettre un try autour, c'est con.
	 * @param msg
	 */
	public static void throwException(String msg){
		Dofus.w("Exception" + msg);
		//try{ 
			throw new NullPointerException("[Exception]"+msg);  
			//} catch (Exception e) {}
	}
	public static void throwNullPointerException(String msg){
		Dofus.w("NullPointerException" + msg);
		throw new NullPointerException(msg);
	}
	public static void throwNumberFormatException(String msg){
		Dofus.w("NumberFormatException" + msg);
		throw new NumberFormatException(msg);
	}
	public static void throwArrayIndexOutOfBoundsException(String msg){
		Dofus.w("ArrayIndexOutOfBoundsException" + msg);
		throw new ArrayIndexOutOfBoundsException(msg);
	}
	public static void throwStringIndexOutOfBoundsException(String msg){
		Dofus.w("StringIndexOutOfBoundsException" + msg);
		throw new StringIndexOutOfBoundsException(msg);
	}
	public static void throwIndexOutOfBoundsException(String msg){
		Dofus.w("IndexOutOfBoundsException" + msg);
		throw new IndexOutOfBoundsException(msg);
	}
	public static void throwIllegalArgumentException(String msg){
		Dofus.w("IllegalArgumentException" + msg);
		throw new IllegalArgumentException(msg);
	}
	public static void throwDataFormatException(String msg){
		Dofus.w("DataFormatException" + msg);
		throw new NullPointerException("[DataFormatException]"+msg);// WTF? pourquoi faut un try sur mon throwDataFormatException?
	}
	/**
	 * Ca trow une NullPointerException, mais c'passque j'ai pas le choix, le throw InterruptedException m'oblige à mettre un try autour, c'est con.
	 */
	public static void throwInterruptedException(String msg){
		Dofus.w("InterruptedException" + msg);
		//try {
			throw new NullPointerException("[InterruptedException]"+msg);
			// WTF? pourquoi faut un try sur mon throwInterruptedException?
		//} catch (InterruptedException e) {e.printStackTrace();}
	}
	

	
	
}
