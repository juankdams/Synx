import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

class dJs
  implements InvocationHandler
{
  private final djj lUX;

  dJs(djj paramdjj)
  {
    this.lUX = paramdjj;
  }

  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    Object localObject;
    try {
      b(paramMethod, paramArrayOfObject);
      localObject = paramMethod.invoke(this.lUX, paramArrayOfObject);
      b(paramMethod, localObject);
    }
    catch (InvocationTargetException localInvocationTargetException) {
      a(paramMethod, localInvocationTargetException.getCause());
      throw localInvocationTargetException;
    }
    return localObject;
  }

  private void b(Method paramMethod, Object[] paramArrayOfObject)
  {
    aHA.trace("call {}: {}", new Object[] { paramMethod.getName(), Arrays.toString(paramArrayOfObject) });
  }

  private void b(Method paramMethod, Object paramObject)
  {
    if (!paramMethod.getReturnType().equals(Void.TYPE)) {
      aHA.trace("return {}: {}", new Object[] { paramMethod.getName(), paramObject });
    }
    else
      aHA.trace("return {}: void", new Object[] { paramMethod.getName() });
  }

  private void a(Method paramMethod, Throwable paramThrowable)
  {
    aHA.trace("exception {}: {}", new Object[] { paramMethod.getName(), paramThrowable });
  }
}