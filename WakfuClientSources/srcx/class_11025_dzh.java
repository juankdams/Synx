import com.sun.jna.Native;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;

public final class dzh
  implements PrivilegedAction
{
  public Object run()
  {
    try
    {
      Method localMethod = (Native.cvE == null ? (Native.cvE = Native.cd("java.lang.ClassLoader")) : Native.cvE).getDeclaredMethod("findLibrary", new Class[] { Native.bRr == null ? (Native.bRr = Native.cd("java.lang.String")) : Native.bRr });
      localMethod.setAccessible(true);
      return localMethod;
    } catch (Exception localException) {
    }
    return null;
  }
}