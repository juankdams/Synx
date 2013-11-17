import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class din extends bKj
{
  din(wE paramwE, Method paramMethod1, Class paramClass, boolean paramBoolean, Constructor paramConstructor, Method paramMethod2, String paramString)
  {
    super(paramMethod1, paramClass);
  }
  public void e(FF paramFF, Object paramObject, String paramString) {
    try {
      Object[] arrayOfObject = { this.lec ? new Object[] { paramFF, paramString } : paramString };

      localObject = this.led.newInstance(arrayOfObject);
      if (paramFF != null) {
        paramFF.G(localObject);
      }
      this.idX.invoke(paramObject, new Object[] { localObject });
    } catch (InvocationTargetException localInvocationTargetException) {
      Object localObject = localInvocationTargetException.getCause();
      if ((localObject instanceof IllegalArgumentException)) {
        throw new cJ("Can't assign value '" + paramString + "' to attribute " + this.ieg + ", reason: " + localObject.getClass() + " with message '" + ((Throwable)localObject).getMessage() + "'");
      }

      throw localInvocationTargetException;
    } catch (InstantiationException localInstantiationException) {
      throw new cJ(localInstantiationException);
    }
  }
}