package pack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import Core.Syn;

@Aspect
public class aspectTest {
	//Ouaip, on peut faire des aspect pis des jointpoint/pointcut juste comme �a :P (http://denis-zhdanov.blogspot.ca/2009/08/weaving-with-aspectj.html)
	
	@Before("execution (* HelloWorld.sayHello(..))")
    public void advice(JoinPoint joinPoint) {
        System.out.printf("TestAspect.advice() called on '%s'%n", joinPoint);
    }
	
	@After("execution (* Parsers.ObjectsParser.*(GameObjects.GPersonnage, GameObjects.GItem, String[]))")
    public void afterObjectsParsing(JoinPoint joinPoint) {
		Syn.d("AOP afterObjectsParsing !!!!!!");
		String params = "";
		for(Object o : joinPoint.getArgs()){
			params += (o.getClass().getName()+", ");
		}
		System.out.printf("TestAspect.afterObjectParse() called on '%s'%n  avec les params :"+params+"..", joinPoint);
    }

	//ActionsManager.notifyListeners("ON_ITEM_USE", p, item);
	
}
