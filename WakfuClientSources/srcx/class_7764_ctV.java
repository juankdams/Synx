import java.lang.reflect.Method;

class ctV extends bKj
{
  ctV(wE paramwE, Method paramMethod1, Class paramClass, Method paramMethod2)
  {
    super(paramMethod1, paramClass);
  }
  void e(FF paramFF, Object paramObject, String paramString) {
    this.idX.invoke(paramObject, new Object[] { new WO(paramFF, paramFF.bO(paramString)) });
  }
}