package Tests;

import java.util.ArrayList;
import java.util.List;


public class ArrayListRam {
	
	
	public static void go(){
		ArrayList<Object> a = new ArrayList<Object>();
		ArrayList<Object> b = new ArrayList<Object>();
		for(int i = 0; i < 100000; i++){
			a.add(null);//ça prend effectivement de la ram même si cest null
		}
		a.add(new Object());
		b.add(new Object());
		List<Integer>[] aa = new List[10];
		
		//ArrayList<WeakReference<Object>>[] effects = new ArrayList<WeakReference<Object>>[10];
	}

}
