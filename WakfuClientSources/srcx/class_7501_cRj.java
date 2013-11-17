import java.io.File;

public class cRj
{
  private static final wh aIk = wh.Fo();

  public static void setContextClassLoader(ClassLoader paramClassLoader)
  {
    Thread localThread = Thread.currentThread();
    localThread.setContextClassLoader(paramClassLoader);
  }

  public static ClassLoader getContextClassLoader()
  {
    Thread localThread = Thread.currentThread();
    return localThread.getContextClassLoader();
  }

  public static boolean cHL()
  {
    return true;
  }

  private static File U(File paramFile)
  {
    if (paramFile != null) {
      try {
        paramFile = aIk.aS(paramFile.getAbsolutePath());
      }
      catch (cJ localcJ)
      {
      }
    }
    return paramFile;
  }

  public static File ak(Class paramClass)
  {
    return U(djy.ak(paramClass));
  }

  public static File b(ClassLoader paramClassLoader, String paramString)
  {
    if (paramClassLoader == null) {
      paramClassLoader = cRj.class.getClassLoader();
    }
    return U(djy.b(paramClassLoader, paramString));
  }

  public static String ov(String paramString)
  {
    return paramString.replace('.', '/') + ".class";
  }

  public static boolean c(ClassLoader paramClassLoader, String paramString)
  {
    return paramClassLoader.getResource(ov(paramString)) != null;
  }
}