import java.lang.reflect.Method;

public class bRr extends czA
{
  private final Method method;

  bRr(Class paramClass, cvp paramcvp, Object[] paramArrayOfObject, Method paramMethod)
  {
    super(paramClass, paramcvp, paramArrayOfObject);
    this.method = paramMethod;
  }
  public Method getMethod() {
    return this.method;
  }
}