import com.sun.jna.Native;

public class YB
{
  public static boolean z(Class paramClass)
  {
    return (Native.cvT == null ? (Native.cvT = Native.cd("java.nio.Buffer")) : Native.cvT).isAssignableFrom(paramClass);
  }
}