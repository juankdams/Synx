package Plugins.Interfaces;


import org.aspectj.lang.JoinPoint;

import Enums.ActionListenerType;


public interface IListener{

	
	public ActionListenerType getType();
	public Object fire();
	public void listen(JoinPoint joinPoint);
	
	
	
}
