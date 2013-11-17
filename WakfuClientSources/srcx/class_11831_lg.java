import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

class lg
  implements InvocationHandler
{
  private final cvp aPc;
  private final Map aPd;

  public lg(axA paramaxA, int paramInt, Map paramMap)
  {
    this.aPc = new cvp(paramaxA, paramInt);
    this.aPd = paramMap;
  }

  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    Object localObject;
    if (bLd.gOM.equals(paramMethod)) {
      localObject = "Proxy interface to " + this.aPc;
      Method localMethod = (Method)this.aPd.get("invoking-method");
      Class localClass = dLb.au(localMethod.getDeclaringClass());
      localObject = (String)localObject + " (" + localClass.getName() + ")";

      return localObject;
    }
    if (bLd.gON.equals(paramMethod)) {
      return new Integer(hashCode());
    }
    if (bLd.gOO.equals(paramMethod)) {
      localObject = paramArrayOfObject[0];
      if ((localObject != null) && (Proxy.isProxyClass(localObject.getClass()))) {
        return cvp.valueOf(Proxy.getInvocationHandler(localObject) == this);
      }
      return Boolean.FALSE;
    }
    if (cvp.b(paramMethod)) {
      paramArrayOfObject = cvp.A(paramArrayOfObject);
    }
    return this.aPc.a(paramMethod.getReturnType(), paramArrayOfObject, this.aPd);
  }

  public axA sF() {
    return this.aPc;
  }
}