import java.lang.reflect.Method;

public class Us extends qd
{
  private Method method;

  Us(Method paramMethod)
  {
    this.method = paramMethod;
  }
  public Method getMethod() { return this.method; }

}