package pack;

import java.util.Arrays;

import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;

	@Aspect
	public class ExceptionReporterAspect {

	    ///** The name of the used logger. */
	    //public final static String LOGGER_NAME = "AspectJExceptionLogger";

	    ///** Logger used to log messages. */
	   // private static final Log LOGGER = LogFactory.getLog(LOGGER_NAME);

	    pointcut stringRequestHandler() : 
	        execution (@RequestMapping Object the.package..*(..));

	    Object around(): stringRequestHandler(){
	        try {
	            return proceed();
	        } catch (Exception ex){
	            Signature sig = thisJoinPointStaticPart.getSignature();
	            Object[] args = thisJoinPoint.getArgs();

	            String location = sig.getDeclaringTypeName() + '.' + sig.getName() + ", args=" + Arrays.toString(args);
	            //LOGGER.warn("(AOP detected) exception within " + location, ex);
	            //throw(ex);
	        }
			return null;
	    }   
	}
	
	