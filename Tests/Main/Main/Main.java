package Main;

import java.io.IOException;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.ehcache.config.CacheConfiguration;
import net.sf.ehcache.config.Configuration;
import net.sf.ehcache.config.TerracottaClientConfiguration;
import net.sf.ehcache.config.TerracottaConfiguration;

public class Main {


	public static void main(String[] args) throws InterruptedException, IOException
	{ 
		
		Configuration configuration = new Configuration()
		.terracotta(new TerracottaClientConfiguration().url("localhost:9510"))
		.defaultCache(new CacheConfiguration("defaultCache", 100))
		.cache(new CacheConfiguration("example", 100)
		.timeToIdleSeconds(5)
		.timeToLiveSeconds(120)
		.terracotta(new TerracottaConfiguration()));
		CacheManager manager = new CacheManager(configuration);
		manager.getCache("example").put(new Element("aKey", "theKeysValue"));
		Element elt = manager.getCache("example").get("aKey");
		Object o = (elt == null ? null : elt.getObjectValue());
		w(o+"");
		/*
		CacheManager.getInstance().addCache("test");
		CacheManager.getInstance().getCache("test").put(new Element("aKey", "theKeysValue"));
		Element elt = CacheManager.getInstance().getCache("test").get("aKey");
		Object o = (elt == null ? null : elt.getObjectValue());
		w(o+"");
		
		//tgamConvert.Main();
		/*
		for(int n = 0; n <= 23-1; n++){
			w("n="+n+".");
		}
		
		/*
		ArrayList list = new ArrayList<Object>(100);
		w(list.size()+"");
		
		/*
		
		String s = "a$b$c$d";
		String[] ss = s.split("\\$");
		for(String sss : ss){
			w(sss);
		}
		
		/*
		int i = 0;
		try{
			w("1111");
			assert(i > 9087);
			//assert assertBigger(i, 3456);
			w("222");
		}catch(Exception e){
			w("333"); //neverCalled
			e.printStackTrace();
		}
		
		/*
		w(""+(true & true));
		w(""+(false & true));
		w(""+(true & false));
		w(""+(false & false));

		w("");
		
		w(""+(true ^ true));
		w(""+(false ^ true));
		w(""+(true ^ false));
		w(""+(false ^ false));
		
		w("");

		w(""+(!(false ^ false)));
		
		/*
		
		byte emotes[] = {2,3,4,10,21};
		for(int i = emotes.length; i > 0; i--){
			w("i="+i);
		}
		
		/*
		byte emotes[] = {2,3,4,10,21};
		int _loc4 = 0;
        int _loc7 = 0;
		
		for(byte e : emotes){
			_loc4 += (2 << (e-2));
		}
		w("loc4 = "+_loc4);
        
        while (++_loc7 < 32)
        {
        	//++_loc7;
        	//w("loc7 = "+_loc7);
        	if(_loc4 >> _loc7 != 0){
        		w("_loc4 >> _loc7 ="+(_loc4 >> _loc7));
        	}
            if ((_loc4 >> _loc7 & 1) == 1)
            {
            	w("EmoteID = "+(_loc7 + 1));
                //if (this.api.lang.getEmoteText(_loc7 + 1) != undefined)
                //{
                //    _loc6.addEmote(_loc7 + 1);
                //} // end if
            } // end if
        } // end while
		
		/*
		
		Dog myDog = new Dog("Pluto");
		w(myDog.getName());
		foo(myDog);
		w(myDog.getName());
		/*
		String strs[] = {"",null,"1","3","4"};
		String str[] = strs;
		for(int i = str.length-1; i>=0; i--){
			System.out.println("index["+i+"] :"+str[i]);
			if(str[i] == null){
				str[i] = "étaitnull";
			}
			System.out.println("index["+i+"] :"+str[i]);
		}
		//strs = str;
		System.out.println("SECOND SHOT");
		for(int i = strs.length-1; i>=0; i--){
			System.out.println("index["+i+"] :"+strs[i]);
		}
		
		/*
		PersonDetails.setUP();
		/*long time = System.currentTimeMillis();
		PersonDetails.insertPerson(
				new Person(
						7,
						"mytestname"
				)
		);
		PersonDetails.insertPerson(
				new Person(
						8,
						"asdf"
				)
		);
		System.out.println("temps pour 2 insert:"+(System.currentTimeMillis()-time)+"ms");
		
		
		PersonDetails.loadPersons();
		PersonDetails.loadAccounts();
		//*/
	}
	
	public static boolean assertBigger(int toTest, int comparative){
		return toTest > comparative;
	}
	
	
	/**
	 * OMFG ! POINTERS ! http://javadude.com/articles/passbyvalue.htm
	 * @param someDog
	 */
	public static void foo(Dog someDog) {
	    someDog.setName("Max");     // AAA
	    w(someDog.getName());
	    someDog = new Dog("Fifi");  // BBB
	    w(someDog.getName());
	    someDog.setName("Rowlf");   // CCC
	    w(someDog.getName());
	}
	
	public static void w(String s){
		System.out.println(s);
	}
	
	
	
}
