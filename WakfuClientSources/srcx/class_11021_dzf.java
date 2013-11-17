import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class dzf
  implements InvocationHandler
{
  private final bLd lFF;
  private final cST lFG;

  public dzf(bLd parambLd, cST paramcST)
  {
  }

  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    synchronized (this.lFF.bTi()) {
      return this.lFF.invoke(this.lFG, paramMethod, paramArrayOfObject);
    }
  }
}