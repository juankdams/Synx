import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class bIB
{
  private static final String gHI = "ant.argument-processor-repo.debug";
  private static final boolean DEBUG = "true".equals(System.getProperty("ant.argument-processor-repo.debug"));
  private static final String gHJ = "META-INF/services/org.apache.tools.ant.ArgumentProcessor";
  private static bIB gHK = new bIB();

  private List gHL = new ArrayList();

  public static bIB bPH() {
    return gHK;
  }

  private bIB() {
    bPJ();
  }

  public List bPI() {
    return this.gHL;
  }

  private void bPJ() {
    try {
      ClassLoader localClassLoader = cRj.getContextClassLoader();
      Object localObject2;
      if (localClassLoader != null) {
        localObject1 = localClassLoader.getResources("META-INF/services/org.apache.tools.ant.ArgumentProcessor");
        while (((Enumeration)localObject1).hasMoreElements()) {
          localObject2 = (URL)((Enumeration)localObject1).nextElement();
          bLW localbLW = j(((URL)localObject2).openStream());
          a(localbLW);
        }
      }

      Object localObject1 = ClassLoader.getSystemResourceAsStream("META-INF/services/org.apache.tools.ant.ArgumentProcessor");
      if (localObject1 != null) {
        localObject2 = j((InputStream)localObject1);
        a((bLW)localObject2);
      }
    } catch (Exception localException) {
      System.err.println("Unable to load ArgumentProcessor from service META-INF/services/org.apache.tools.ant.ArgumentProcessor (" + localException.getClass().getName() + ": " + localException.getMessage() + ")");

      if (DEBUG)
        localException.printStackTrace(System.err);
    }
  }

  public void jO(String paramString)
  {
    a(jP(paramString));
  }

  public void U(Class paramClass)
  {
    a(V(paramClass));
  }

  private bLW jP(String paramString)
  {
    try {
      Class localClass = Class.forName(paramString);
      return V(localClass);
    } catch (ClassNotFoundException localClassNotFoundException) {
      throw new cJ("Argument processor class " + paramString + " was not found", localClassNotFoundException);
    }
  }

  private bLW V(Class paramClass)
  {
    bLW localbLW;
    try
    {
      localbLW = (bLW)paramClass.getConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception localException) {
      throw new cJ("The argument processor class" + paramClass.getClass().getName() + " could not be instanciated with a default constructor", localException);
    }

    return localbLW;
  }

  public void a(bLW parambLW) {
    if (parambLW == null) {
      return;
    }
    this.gHL.add(parambLW);
    if (DEBUG)
      System.out.println("Argument processor " + parambLW.getClass().getName() + " registered.");
  }

  private bLW j(InputStream paramInputStream)
  {
    InputStreamReader localInputStreamReader = null;
    try {
      try {
        localInputStreamReader = new InputStreamReader(paramInputStream, "UTF-8");
      } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
        localInputStreamReader = new InputStreamReader(paramInputStream);
      }
      BufferedReader localBufferedReader = new BufferedReader(localInputStreamReader);
      String str = localBufferedReader.readLine();
      if ((str != null) && (!"".equals(str)))
        return jP(str);
    }
    finally {
      try {
        localInputStreamReader.close();
      }
      catch (IOException localIOException3) {
      }
    }
    return null;
  }
}