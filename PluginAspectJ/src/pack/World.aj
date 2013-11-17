package pack;

public aspect World {

	 pointcut greetings():
		 execution(* HelloWorld.sayHello(..));
		 
		 after()returning: greetings(){
			 System.out.println(" World !");
		 }
	
		 
	pointcut goodbye()://Ici c'est comme une method, c'est mon pointcut
		execution(* AspectJListener.writeHello(..));//qui s'ex�cute quand on "writeHello"
		//Et la "method" "pointcut" fait ceci v dans l'ordre 
		//Donc si tu mets le after()throwing avant le after()goobye, 
		//bah il va le faire avant et vice-versa 
		//sauf si évidemment on le change pour un before ou autre patente :P
		after()returning: goodbye(){
			System.out.println("After returning. Bye World !");
			//throw new NumberFormatException("MyException");
		}
		after():goodbye(){//L'emplacement du pointcu
			System.out.println("After GoodBye.");
		}
		after()throwing:goodbye(){
			System.out.println("After throwing GoodBye.");
		}
}
