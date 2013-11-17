import java.lang.reflect.Method;

class ctY extends bKj
{
  ctY(wE paramwE, Method paramMethod1, Class paramClass, Method paramMethod2)
  {
    super(paramMethod1, paramClass);
  }
  public void e(FF paramFF, Object paramObject, String paramString) {
    try {
      this.idX.invoke(paramObject, new Object[] { Class.forName(paramString) });
    } catch (ClassNotFoundException localClassNotFoundException) {
      throw new cJ(localClassNotFoundException);
    }
  }
}