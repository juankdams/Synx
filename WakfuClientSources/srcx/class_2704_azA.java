import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class azA
{
  private static final String dQX = "ant.project-helper-repo.debug";
  private static final boolean DEBUG = "true".equals(System.getProperty("ant.project-helper-repo.debug"));

  private static azA dQY = new azA();

  private List dQZ = new ArrayList();
  private static Constructor dRa;

  public static azA aLs()
  {
    return dQY;
  }

  private azA() {
    aLt();
  }

  private void aLt()
  {
    Constructor localConstructor = aLu();
    a(localConstructor);
    try
    {
      ClassLoader localClassLoader = cRj.getContextClassLoader();
      if (localClassLoader != null) {
        localObject = localClassLoader.getResources("META-INF/services/org.apache.tools.ant.ProjectHelper");

        while (((Enumeration)localObject).hasMoreElements()) {
          URL localURL = (URL)((Enumeration)localObject).nextElement();
          localConstructor = f(localURL.openStream());

          a(localConstructor);
        }
      }

      Object localObject = ClassLoader.getSystemResourceAsStream("META-INF/services/org.apache.tools.ant.ProjectHelper");

      if (localObject != null) {
        localConstructor = f((InputStream)localObject);
        a(localConstructor);
      }
    } catch (Exception localException) {
      System.err.println("Unable to load ProjectHelper from service META-INF/services/org.apache.tools.ant.ProjectHelper (" + localException.getClass().getName() + ": " + localException.getMessage() + ")");

      if (DEBUG)
        localException.printStackTrace(System.err);
    }
  }

  public void fU(String paramString)
  {
    a(fV(paramString));
  }

  public void E(Class paramClass)
  {
    try
    {
      a(paramClass.getConstructor(new Class[0]));
    } catch (NoSuchMethodException localNoSuchMethodException) {
      throw new cJ("Couldn't find no-arg constructor in " + paramClass.getName());
    }
  }

  private void a(Constructor paramConstructor)
  {
    if (paramConstructor == null) {
      return;
    }
    if (DEBUG) {
      System.out.println("ProjectHelper " + paramConstructor.getClass().getName() + " registered.");
    }

    this.dQZ.add(paramConstructor);
  }

  private Constructor aLu() {
    String str = System.getProperty("org.apache.tools.ant.ProjectHelper");
    try {
      if (str != null)
        return fV(str);
    }
    catch (SecurityException localSecurityException) {
      System.err.println("Unable to load ProjectHelper class \"" + str + " specified in system property " + "org.apache.tools.ant.ProjectHelper" + " (" + localSecurityException.getMessage() + ")");

      if (DEBUG) {
        localSecurityException.printStackTrace(System.err);
      }
    }
    return null;
  }

  private Constructor f(InputStream paramInputStream)
  {
    try
    {
      InputStreamReader localInputStreamReader;
      try {
        localInputStreamReader = new InputStreamReader(paramInputStream, "UTF-8");
      } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
        localInputStreamReader = new InputStreamReader(paramInputStream);
      }
      BufferedReader localBufferedReader = new BufferedReader(localInputStreamReader);

      String str = localBufferedReader.readLine();
      localBufferedReader.close();

      if ((str != null) && (!"".equals(str)))
        return fV(str);
    }
    catch (Exception localException) {
      System.out.println("Unable to load ProjectHelper from service META-INF/services/org.apache.tools.ant.ProjectHelper (" + localException.getMessage() + ")");

      if (DEBUG) {
        localException.printStackTrace(System.err);
      }
    }
    return null;
  }

  private Constructor fV(String paramString)
  {
    ClassLoader localClassLoader = cRj.getContextClassLoader();
    try {
      Class localClass = null;
      if (localClassLoader != null)
        try {
          localClass = localClassLoader.loadClass(paramString);
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
        }
      if (localClass == null) {
        localClass = Class.forName(paramString);
      }
      return localClass.asSubclass(dhB.class).getConstructor(new Class[0]);
    } catch (Exception localException) {
      throw new cJ(localException);
    }
  }

  public dhB c(bFe parambFe)
  {
    for (Iterator localIterator = aLv(); localIterator.hasNext(); ) {
      dhB localdhB = (dhB)localIterator.next();
      if (localdhB.k(parambFe)) {
        if (DEBUG) {
          System.out.println("ProjectHelper " + localdhB.getClass().getName() + " selected for the build file " + parambFe);
        }

        return localdhB;
      }
    }
    throw new RuntimeException("BUG: at least the ProjectHelper2 should have supported the file " + parambFe);
  }

  public dhB d(bFe parambFe)
  {
    for (Iterator localIterator = aLv(); localIterator.hasNext(); ) {
      dhB localdhB = (dhB)localIterator.next();
      if (localdhB.j(parambFe)) {
        if (DEBUG) {
          System.out.println("ProjectHelper " + localdhB.getClass().getName() + " selected for the antlib " + parambFe);
        }

        return localdhB;
      }
    }
    throw new RuntimeException("BUG: at least the ProjectHelper2 should have supported the file " + parambFe);
  }

  public Iterator aLv()
  {
    return new dnl(this.dQZ.iterator());
  }

  static
  {
    try
    {
      dRa = dEL.class.getConstructor(new Class[0]);
    }
    catch (Exception localException) {
      throw new RuntimeException(localException);
    }
  }
}