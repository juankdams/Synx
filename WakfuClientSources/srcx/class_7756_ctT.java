import java.lang.reflect.Method;

class ctT extends bKj
{
  ctT(wE paramwE, Method paramMethod1, Class paramClass, Method paramMethod2)
  {
    super(paramMethod1, paramClass);
  }
  public void e(FF paramFF, Object paramObject, String paramString) {
    this.idX.invoke(paramObject, new Object[] { paramFF.bO(paramString) });
  }
}