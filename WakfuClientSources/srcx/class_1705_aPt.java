import java.lang.reflect.Method;

public class aPt extends ddc
{
  private Method method;

  aPt(cvp paramcvp, Object[] paramArrayOfObject, int paramInt, Method paramMethod)
  {
    super(paramcvp, paramArrayOfObject, paramInt);
    this.method = paramMethod;
  }
  public Method getMethod() {
    return this.method;
  }
}