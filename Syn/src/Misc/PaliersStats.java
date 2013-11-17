package Misc;

import Core.Syn;

public class PaliersStats{
	

	public static int Statistiques(int sortedepalier, int value, int code){
		switch(sortedepalier){
			case 0:
				return 0;
			case 1:
				return Palier1(value,code);					
			case 2:
				return Palier2(value,code);			 
			case 3:
				return Palier3(value,code);			 
			case 4:
				return Palier4(value,code);			 
			case 5:
				return Palier5(value,code);			 
			case 6:
				return Palier6(value,code);		 
			case 7:
				return Palier7(value,code);			 
			case 8:
				return Palier8(value,code);			 
			case 9:
				return Palier9(value,code);		 
			case 10:
				return Palier10(value,code);
		}
		return 0;
	}
	
	
	
	public static int Palier1(int value, int code){
		//coutot
		int z = (int) (50*Math.floor((value + code)/50));
		int b = 0;
		int xx = 0;
		if(z>250){
			z=250;
		}
		if(z<50){
			xx=2;
			b=0;
		}
		if(z < 150 && z>=50){
			z=50;
			xx = 3;
			b=100;
		}
		if(z<250 && z>=150){
			z=150;
			xx = 4;
			b=400;
		}
		if(z>=250){
			xx = 5;
			b=800;
		}
		if(xx>5){
			xx=5;
		}
		//coutbase
		int y = (int) (50*Math.floor(value/50));
		int d = 0;
		int ww = 0;
		if(y>250){
			y=250;
		}
		if(y<50){
			ww=2;
			d=0;
		}
		if(y < 150 && y>=50){
			y=50;
			ww = 3;
			d=100;
		}
		if(y<250 && y>=150){
			y=150;
			ww = 4;
			d=400;
		}
		if(y>=250){
			ww = 5;
			d=800;
		}
		if(ww>5){
			ww=5;
		}
		return (((((value + code)-z)*xx)+b)-(((value-y)*ww)+d));
	}
	
	public static int Palier2(int value, int code){
		//coutot
		int z = (int) (100*Math.floor((value + code)/100));
		if(z>400){
			z=400;
		}
		int xx = z/100 + 1;
		if(xx>5){
			xx=5;
		}
		int a = z;
		int b =0;
		while(a!=0){
			b+=a;
			a -=100;
		}
		//coutbase
		int y = (int) (100*Math.floor(value/100));
		if(y>400){
			y=400;
		}
		int ww = y/100 + 1;
		if(ww>5){
			ww=5;
		}
		int www = (value-y)*ww;
		int c = y;
		int d = 0;
		while(c!=0){
			d+=c;
			c -=100;
		}	
		return (((((value + code)-z)*xx)+b)-(www+d));
	}
	
	public static int Palier3(int value, int code){ //paliers panda
		//coutot
		int z = (int) (50*Math.floor((value + code)/50));
		int b = 0;
		if(z>200){
			z=200;
		}
		int xx = 0;

		if(z<50){
			xx=1;
			b=0;
		}
		if(z < 200 && z>=50){
			z=50;
			xx = 2;
			b=50;
		}
		if(z>=200){
			xx = 3;
			b=350;
		}
		if(xx>5){
			xx=5;
		}
		//coutbase
		int y = (int) (50*Math.floor(value/50));
		int d = 0;
		if(y>200){
			y=200;
		}
		int ww = 0;
		if(y<50){
			ww=1;
			d=0;
		}
		if(y < 200 && y>=50){
			y=50;
			ww = 2;
			d=50;
		}
		if(y>=200){
			ww = 3;
			d=350;
		}
		if(ww>5){
			ww=5;
		}
		return (((((value + code)-z)*xx)+b)-(((value-y)*ww)+d));
	}
	
	public static int Palier4(int value, int code){
		//coutot
		int z = (int) (50*Math.floor((value + code)/50));
		int b = 0;
		if(z>350){
			z=350;
		}
		int xx = 0;
		if(z<50){
			xx=1;
			b=0;
		}
		if(z < 150 && z>=50){
			z=50;
			xx = 2;
			b=50;
		}
		if(z<250 && z>=150){
			z=150;
			xx = 3;
			b=250;
		}
		if(z<350 && z>=250){
			z=350;
			xx = 4;
			b=550;
		}
		if(z>=350){
			xx = 5;
			b=950;
		}
		if(xx>5){
			xx=5;
		}
		//coutbase
		int y = (int) (50*Math.floor(value/50));
		int d = 0;
		if(y>350){
			y=350;
		}
		int ww = 0;
		if(y<50){
			ww=1;
			d=0;
		}
		if(y < 150 && y>=50){
			y=50;
			ww = 2;
			d=50;
		}
		if(y<250 && y>=150){
			y=150;
			ww = 3;
			d=250;
		}
		if(y<350 && y>=250){
			y=350;
			ww = 4;
			d=550;
		}
		if(y>=350){
			ww = 5;
			d=950;
		}
		
		if(ww>5){
			ww=5;
		}
		return (((((value + code)-z)*xx)+b)-(((value-y)*ww)+d));

	
	}

	public static int Palier5(int value, int code){
		//coutot
		int z = (int) (20*Math.floor((value + code)/20));
		if(z>80){
			z=80;
		}
		int xx = z/20 + 1;
		if(xx>5){
			xx=5;
		}
		int a = z;
		int b = 0;
		while(a!=0){
			b+=a;
			a -=20;
		}
		//coutbase
		int y = (int) (20*Math.floor(value/20));
		if(y>80){
			y=80;
		}
		int ww = y/20 + 1;
		if(ww>5){
			ww=5;
		}
		int c = y;
		int d = 0;
		while(c!=0){
			d+=c;
			c -=20;
		}	
		return (((((value + code)-z)*xx)+b)-(((value-y)*ww)+d));
	}
	
	public static int Palier6(int value, int code){
		//coutot
		int z = (int) (50*Math.floor((value + code)/50));
		if(z>200){
			z=200;
		}
		int xx = z/50 + 1;
		if(xx>5){
			xx=5;
		}
		int a = z;
		int b = 0;
		while(a!=0){
			b+=a;
			a -=50;
		}
		//coutbase
		int y = (int) (50*Math.floor(value/50));
		if(y>200){
			y=200;
		}
		int ww = y/50 + 1;
		if(ww>5){
			ww=5;
		}
		int c = y;
		int d = 0;
		while(c!=0){
			d+=c;
			c -=50;
		}	
		return (((((value + code)-z)*xx)+b) - ((( value-y)*ww)+d));
	}
	
	
	
	public static int Palier7(int value, int code){ //paliers sagesse et de sacri
			return code*3;
	}
	
	public static int Palier8(int value, int code){ //paliers vie
		return code;
	}
	
	public static int Palier9(int value, int code){
		//coutot
		int z = (int) (25*Math.floor((value + code)/25));
		if(z>100){
			z=100;
		}
		int xx = z/25 + 1;
		if(xx>5){
			xx=5;
		}
		int a = z;
		int b = 0;
		while(a!=0){
			b+=a;
			a -=25;
		}
		//coutbase
		int y = (int) (25*Math.floor(value/25));
		if(y>100){
			y=100;
		}
		int ww = y/25 + 1;
		if(ww>5){
			ww=5;
		}
		int c = y;
		int d = 0;
		while(c!=0){
			d+=c;
			c -=25;
		}	
		return (((((value + code)-z)*xx)+b) - (((value-y)*ww)+d));
	}
	
	public static int Palier10(int value, int code){
		//coutot
		int z = (int) (20*Math.floor((value + code)/20));
		int b = 0;
		if(z>140){
			z=140;
		}
		int xx = 0;
		if(z<20){
			xx=1;
			b=0;
		}
		if(z < 60 && z>=20){
			z=20;
			xx = 2;
			b=20;
		}
		if(z<100 && z>=60){
			z=60;
			xx = 3;
			b=100;
		}
		if(z<140 && z>=100){
			z=100;
			xx = 4;
			b=220;
		}
		if(z>=140){
			xx = 5;
			b=380;
		}
		if(xx>5){
			xx=5;
		}
		//coutbase
		int y = (int) (20*Math.floor(value/20));
		int d = 0;
		if(y>140)
			y=140;
		int ww = 0;
		if(y<20){
			ww=1;
			d=0;
		}
		if(y < 60 && y>=20){
			y=20;
			ww = 2;
			d=20;
		}
		if(y<100 && y>=60){
			y=60;
			ww = 3;
			d=100;
		}
		if(y<140 && y>=100){
			y=100;
			ww = 4;
			d=220;
		}
		if(y>=140){
			ww = 5;
			d=380;
		}
		if(ww>5){
			ww=5;
		}
		return (((((value + code)-z)*xx)+b) - (((value-y)*ww)+d));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//CALCULE PAR LE CAPITAL AU LIEU DES POINTS VOULU
	
	
	
	
	
	//     vv    Vient de mon projet Augmenteur de Stats en Flash dans CS6
	
	/**
	 * Palier de {{0, 2}, {50, 3}, {150, 4}, {250, 5}},//Intelligence sur un sram
	 */
	public static int Palier1c(short pointtot, short capital){//pointtot = value de base a ce moment, mais ca change. a la fin c'est vrm le tot des points
		//Syn.d("\n======== Début Palier1c ==========\n");
	 	short basestat = pointtot;
	 	
		short Ceil = -50;
		pointtot += 50;
		Ceil += (int) (100*Math.floor(pointtot/100))+100;
	    pointtot -=50; 
		int X = Ceil/100+2;
	    int a = (Ceil - pointtot) * X;
	    int xx = 0;
	      
	    while(capital > 0)
	    {
	    	X =  Ceil/100+2;
			if(X > 5) X = 5;
	    	a = (Ceil - pointtot) * X;
	        Syn.d("[Ceil:"+Ceil+"] [pointtot:"+pointtot+ "] [capital:"+capital+"] [X:"+X+ "] [a:"+a  );
	        capital -= a;
	        pointtot = Ceil;
	        Ceil += 100;
	    }
		Syn.d("[Ceil:"+Ceil+"] [pointtot:"+pointtot+ "] [capital:"+capital+"] [X:"+X+ "] [a:"+a);
	    if(capital < 0){
	    	pointtot -=100;
			if(pointtot < basestat){
				pointtot = basestat;
			} 
			Syn.d("if(pointtot < "+basestat+"){"+pointtot+" = basestat;}");
			if(pointtot < 0){
				pointtot = 0;
			}
			Syn.d("if(pointtot < 0){pointtot = 0;}  pointtot="+pointtot);
			capital += a;
	        xx = capital/X;
	        pointtot += xx;
	        capital -= xx*X;
	    }
		int point = pointtot - basestat;
	    Syn.d("\nxx:"+xx+
	                "\nX:"+X+
	                "\nCapital final:" +capital+ 
	                "\nPointtot final:"+pointtot+
					"\nPoint qui seront ajoutés (code):" +point+
					"\nBase:"+basestat);
	       Syn.d("\n======== Fin Palier1c ==========\n");
		   return point;
	}

	public static int Palier2c(short pointtot, short capital){//pointtot = value de base a ce moment, mais ca change. a la fin c'est vrm le tot des points
		Syn.d("\n======== Début Palier2c ==========\n");
		short basestat = pointtot;
	 	short Ceil = (short) ((100*Math.floor(pointtot/100))+100);
	    int X = (Ceil/100);
	    int a = (Ceil - pointtot) * X;
	    int xx = 0;
	        
	        while(capital >0)
	        {
	            X =  Ceil/100;
				if(X > 5){X = 5;}
	            a = (Ceil - pointtot) * X;
	             Syn.d("[Ceil:"+Ceil+
	                            "] [pointtot:"+pointtot+ 
	                            "] [capital:"+capital+
	                            "] [X:"+X+ 
	                            "] [a:"+a
	                           // "] [a:"+a+"]" 
	                                    );
	             
	            capital -= a;
	            pointtot = Ceil;
	            Ceil += 100;
	        }
	        if(capital < 0){
	            pointtot -=100;
	            capital += a;
	            xx = capital/X;
	            pointtot += xx;
	            capital -= xx*X;
	            
	        }
			int point = pointtot - basestat;
	        Syn.d("\nxx:"+xx+
	                "\nX:"+X+
	                "\nCapital final:" +capital+ 
	                "\nPointtot final:"+pointtot+
					"\nPoint qui seront ajoutés (code):" +point+
					"\nBase:"+basestat);
	       Syn.d("\n======== Fin Palier2c ==========\n");
		   return point;
	}

	public static int Palier3c(short pointtot, short capital){
		Syn.d("\n======== Début Palier3c ==========\n");
		short basestat = pointtot;
	 	short Ceil = -100;
			pointtot += 150;
			Ceil += (short) (150*Math.floor(pointtot/150));
	    	pointtot -= 150; 
			int X = Ceil/150+1;
	        int a = (Ceil - pointtot) * X;
	        int xx = 0;
	        
	        while(capital >0)
	        {
	            X =  Ceil/150+1;
				if(X > 3){X = 3;}
	            a = (Ceil - pointtot) * X;
	             Syn.d("[Ceil:"+Ceil+
	                            "] [pointtot:"+pointtot+ 
	                            "] [capital:"+capital+
	                            "] [X:"+X+ 
	                            "] [a:"+a
	                           // "] [a:"+a+"]" 
	                                    );
	             
	            capital -= a;
	            pointtot = Ceil;
	            Ceil += 150;
	        }
			Syn.d("[Ceil:"+Ceil+
	                            "] [pointtot:"+pointtot+ 
	                            "] [capital:"+capital+
	                            "] [X:"+X+ 
	                            "] [a:"+a
	                           // "] [a:"+a+"]" 
	                                    );
	        if(capital < 0){
	            pointtot -=150;
				if(pointtot < basestat){pointtot = basestat;} Syn.d("if(pointtot < "+basestat+"){"+pointtot+" = basestat;}");
				if(pointtot < 0){pointtot = 0;}Syn.d("if(pointtot < 0){pointtot = 0;}  pointtot="+pointtot);
				
	            capital += a;
	            xx = capital/X;
	            pointtot += xx;
	            capital -= xx*X;
	            
	        }
			int point = pointtot - basestat;
	        Syn.d("\nxx:"+xx+
	                "\nX:"+X+
	                "\nCapital final:" +capital+ 
	                "\nPointtot final:"+pointtot+
					"\nPoint qui seront ajoutés (code):" +point+
					"\nBase:"+basestat);
		Syn.d("\n======== Fin Palier3c ==========\n");
		return point;
	}

	public static int Palier4c(short pointtot, short capital){//pointtot = value de base a ce moment, mais ca change. a la fin c'est vrm le tot des points
		Syn.d("\n======== Début Palier4c ==========\n");
		short basestat = pointtot;
	 	short Ceil = -50;
			pointtot += 50;
			Ceil += (short) ((100*Math.floor(pointtot/100))+100);
	    	pointtot -=50; 
			int X = Ceil/100+1;
	        int a = (Ceil - pointtot) * X;
	        int xx = 0;
	        
	        while(capital >0)
	        {
	            X =  Ceil/100+1;
				if(X > 5){X = 5;}
	            a = (Ceil - pointtot) * X;
				//if(Ceil > 350){a = capital/X}
	             Syn.d("[Ceil:"+Ceil+
	                            "] [pointtot:"+pointtot+ 
	                            "] [capital:"+capital+
	                            "] [X:"+X+ 
	                            "] [a:"+a
	                           // "] [a:"+a+"]" 
	                                    );
	             
	            capital -= a;
	            pointtot = Ceil;
	            Ceil += 100;
	        }
			Syn.d("[Ceil:"+Ceil+
	                            "] [pointtot:"+pointtot+ 
	                            "] [capital:"+capital+
	                            "] [X:"+X+ 
	                            "] [a:"+a
	                           // "] [a:"+a+"]" 
	                                    );
	        if(capital < 0){
	            pointtot -=100;
				if(pointtot < basestat){pointtot = basestat;} Syn.d("if(pointtot < "+basestat+"){"+pointtot+" = basestat;}");
				if(pointtot < 0){pointtot = 0;}Syn.d("if(pointtot < 0){pointtot = 0;}  pointtot="+pointtot);
				
	            capital += a;
	            xx = capital/X;
	            pointtot += xx;
	            capital -= xx*X;
	            
	        }
			int point = pointtot - basestat;
	        Syn.d("\nxx:"+xx+
	                "\nX:"+X+
	                "\nCapital final:" +capital+ 
	                "\nPointtot final:"+pointtot+
					"\nPoint qui seront ajoutés (code):" +point+
					"\nBase:"+basestat);
	       Syn.d("\n======== Fin Palier1c ==========\n");
		   return point;
			
	}

	public static int Palier5c(short pointtot, short capital){ //pointtot = value de base a ce moment, mais ca change. a la fin c'est vrm le tot des points
		short basestat = pointtot;
	 	short Ceil = (short) ((20*Math.floor(pointtot/20))+20);
	        int X = (Ceil/20);
	        int a = (Ceil - pointtot) * X;
	        int xx = 0;
	        
	        while(capital >0)
	        {
	            
	            X =  Ceil/20;
	            a = (Ceil - pointtot) * X;
	            
	             Syn.d("[Ceil:"+Ceil+
	                            "] [pointtot:"+pointtot+ 
	                            "] [capital:"+capital+
	                            "] [X:"+X+ 
	                            "] [a:"+a
	                           // "] [a:"+a+"]" 
	                                    );
	             
	            capital -= a;
	            pointtot = Ceil;
	            Ceil += 20;
	        }
	        if(capital < 0){
	            pointtot -=20;
	            capital += a;
	            xx = capital/X;
	            pointtot += xx;
	            capital -= xx*X;
	            
	        }
			int point = pointtot - basestat;
	        Syn.d("\nxx:"+xx+
	                "\nX:"+X+
	                "\nCapital final:" +capital+ 
	                "\nPointtot final:"+pointtot+
					"\nPoint qui seront ajoutés (code):" +point+
					"\nBase:"+basestat);
					
	        return point;
	}

	public static int Palier6c(short pointtot, short capital){//pointtot = value de base a ce moment, mais ca change. a la fin c'est vrm le tot des points
		Syn.d("\n======== Début Palier6c ==========\n");
		short basestat = pointtot;
	 	short Ceil = (short) ((50*Math.floor(pointtot/50))+50);
			int X = Ceil/50;
	        int a = (Ceil - pointtot) * X;
	        int xx = 0;
	        
	        while(capital >0)
	        {
	            X =  Ceil/50;
				if(X > 5){X = 5;}
	            a = (Ceil - pointtot) * X;
				//if(Ceil > 350){a = capital/X}
	             Syn.d("[Ceil:"+Ceil+"] [pointtot:"+pointtot+ "] [capital:"+capital+"] [X:"+X+  "] [a:"+a);
	             
	            capital -= a;
	            pointtot = Ceil;
	            Ceil += 50;
	        }
			Syn.d("[Ceil:"+Ceil+
	                            "] [pointtot:"+pointtot+ 
	                            "] [capital:"+capital+
	                            "] [X:"+X+ 
	                            "] [a:"+a
	                           // "] [a:"+a+"]" 
	                                    );
	        if(capital < 0){
	            pointtot -=50;
				if(pointtot < basestat){pointtot = basestat;} Syn.d("if(pointtot < "+basestat+"){"+pointtot+" = basestat;}");
				if(pointtot < 0){pointtot = 0;}Syn.d("if(pointtot < 0){pointtot = 0;}  pointtot="+pointtot);
				
	            capital += a;
	            xx = capital/X;
	            pointtot += xx;
	            capital -= xx*X;
	            
	        }
			int point = pointtot - basestat;
	        Syn.d("\nxx:"+xx+
	                "\nX:"+X+
	                "\nCapital final:" +capital+ 
	                "\nPointtot final:"+pointtot+
					"\nPoint qui seront ajoutés (code):" +point+
					"\nBase:"+basestat);
	       Syn.d("\n======== Fin Palier6c ==========\n");
		   return point;
	}
			

	         // Calculates the cost of adding X points to a stat
	        // @param pointtot - The base val of the stat
	         // @param capital - The points to be added to that stat
	         //@return The cost 
		public static int Palier7c(short pointtot, short capital){ //paliers sagesse et de sacri
				int point = capital/3;
				return point;
		}
			

	         // Calculates the cost of adding X points to a stat
	         // @param pointtot - The base val of the stat
	         // @param capital - The points to be added to that stat
	         // @return The cost 
		public static int Palier8c(short pointtot, short capital){ //paliers vitalite
			//if(class = sacri){return capital*2;}
			return capital; //pcq le nbr de points à ajouter = capital pcq le cout pour 1 point vita = 1 capital
		}
		
	public static int Palier9c(short pointtot, short capital){//pointtot = value de base a ce moment, mais ca change. a la fin c'est vrm le tot des points
		Syn.d("\n======== Début Palier9c ==========\n");
		short basestat = pointtot;
	 	short Ceil = (short) ((25*Math.floor(pointtot/25))+25);
			int X = Ceil/25;
	        int a = (Ceil - pointtot) * X;
	        int xx = 0;
	        
	        while(capital >0)
	        {
	            X =  Ceil/25;
				if(X > 5){X = 5;}
	            a = (Ceil - pointtot) * X;
				//if(Ceil > 350){a = capital/X}
	             Syn.d("[Ceil:"+Ceil+
	                            "] [pointtot:"+pointtot+ 
	                            "] [capital:"+capital+
	                            "] [X:"+X+ 
	                            "] [a:"+a
	                           // "] [a:"+a+"]" 
	                                    );
	             
	            capital -= a;
	            pointtot = Ceil;
	            Ceil += 25;
	        }
			Syn.d("[Ceil:"+Ceil+
	                            "] [pointtot:"+pointtot+ 
	                            "] [capital:"+capital+
	                            "] [X:"+X+ 
	                            "] [a:"+a
	                           // "] [a:"+a+"]" 
	                                    );
	        if(capital < 0){
	            pointtot -=25;
				if(pointtot < basestat){pointtot = basestat;} Syn.d("if(pointtot < "+basestat+"){"+pointtot+" = basestat;}");
				if(pointtot < 0){pointtot = 0;}Syn.d("if(pointtot < 0){pointtot = 0;}  pointtot="+pointtot);
				
	            capital += a;
	            xx = capital/X;
	            pointtot += xx;
	            capital -= xx*X;
	            
	        }
			int point = pointtot - basestat;
	        Syn.d("\nxx:"+xx+
	                "\nX:"+X+
	                "\nCapital final:" +capital+ 
	                "\nPointtot final:"+pointtot+
					"\nPoint qui seront ajoutés (code):" +point+
					"\nBase:"+basestat);
	       Syn.d("\n======== Fin Palier9c ==========\n");
		   return point;
	}


	public static int Palier10c(short pointtot, short capital){//pointtot = value de base a ce moment, mais ca change. a la fin c'est vrm le tot des points
		Syn.d("\n======== Début Palier10c ==========\n");
		short basestat = pointtot;
	 	short Ceil = -20;
			pointtot += 20;
			Ceil += (int) (40*Math.floor(pointtot/40))+40;
	    	pointtot -=20; 
			int X = Ceil/40+1;
	        int a = (Ceil - pointtot) * X;
	        int xx = 0;
	        
	        while(capital >0)
	        {
	            X =  Ceil/40+1;
				if(X > 5){X = 5;}
	            a = (Ceil - pointtot) * X;
	             Syn.d("[Ceil:"+Ceil+
	                            "] [pointtot:"+pointtot+ 
	                            "] [capital:"+capital+
	                            "] [X:"+X+ 
	                            "] [a:"+a
	                           // "] [a:"+a+"]" 
	                                    );
	             
	            capital -= a;
	            pointtot = Ceil;
	            Ceil += 40;
	        }
			Syn.d("[Ceil:"+Ceil+
	                            "] [pointtot:"+pointtot+ 
	                            "] [capital:"+capital+
	                            "] [X:"+X+ 
	                            "] [a:"+a
	                           // "] [a:"+a+"]" 
	                                    );
	        if(capital < 0){
	            pointtot -=40;
				if(pointtot < basestat){pointtot = basestat;} Syn.d("if(pointtot < "+basestat+"){"+pointtot+" = basestat;}");
				if(pointtot < 0){pointtot = 0;}Syn.d("if(pointtot < 0){pointtot = 0;}  pointtot="+pointtot);
				
	            capital += a;
	            xx = capital/X;
	            pointtot += xx;
	            capital -= xx*X;
	            
	        }
			int point = pointtot - basestat;
	        Syn.d("\nxx:"+xx+
	                "\nX:"+X+
	                "\nCapital final:" +capital+ 
	                "\nPointtot final:"+pointtot+
					"\nPoint qui seront ajoutés (code):" +point+
					"\nBase:"+basestat);
	       Syn.d("\n======== Fin Palier10c ==========\n");
		   return point;
			
	}

	public static int Palier11c(short pointtot, short capital){ //paliers vitalite de sacri
			return capital*2; //pcq le nbr de points à ajouter * 2 = capital pcq le cout pour 2 point vita = 1 capital
	}
	
	
	
	public static int Palier12c(short pointtot, short capital){
		return 0;
	}
	
	
	
	
	
}
