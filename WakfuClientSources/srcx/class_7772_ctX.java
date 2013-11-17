import java.lang.reflect.Method;

class ctX extends bKj
{
  ctX(wE paramwE, Method paramMethod1, Class paramClass, Method paramMethod2)
  {
    super(paramMethod1, paramClass);
  }
  public void e(FF paramFF, Object paramObject, String paramString) {
    this.idX.invoke(paramObject, (Object[])new Boolean[] { FF.bP(paramString) ? Boolean.TRUE : Boolean.FALSE });
  }
}