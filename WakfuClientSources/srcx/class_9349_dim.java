import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class dim extends bKj
{
  dim(wE paramwE, Method paramMethod1, Class paramClass, Method paramMethod2, String paramString)
  {
    super(paramMethod1, paramClass);
  }
  public void e(FF paramFF, Object paramObject, String paramString) {
    try {
      this.idX.invoke(paramObject, new Object[] { new Long(bof.iv(paramString)) });
    }
    catch (NumberFormatException localNumberFormatException) {
      throw new cJ("Can't assign non-numeric value '" + paramString + "' to" + " attribute " + this.ieg);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw localInvocationTargetException;
    } catch (IllegalAccessException localIllegalAccessException) {
      throw localIllegalAccessException;
    } catch (Exception localException) {
      throw new cJ(localException);
    }
  }
}