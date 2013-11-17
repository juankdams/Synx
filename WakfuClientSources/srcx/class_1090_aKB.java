import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class aKB
{
  public static final String enU = "ant.home";
  public static final String enV = "ant.library.dir";
  public static final String enW = ".ant";
  public static final String enX = "lib";
  public static boolean enY = false;

  public static final String enZ = ".ant" + File.separatorChar + "lib";
  public static final String eoa = "org.apache.tools.ant.Main";
  public static final String eob = "user.home";
  private static final String dDs = "java.class.path";
  protected static final int eoc = 2;

  public static void main(String[] paramArrayOfString)
  {
    int i;
    try
    {
      aKB localaKB = new aKB();
      i = localaKB.l(paramArrayOfString);
    } catch (aEM localaEM) {
      i = 2;
      System.err.println(localaEM.getMessage());
    } catch (Throwable localThrowable) {
      i = 2;
      localThrowable.printStackTrace(System.err);
    }
    if (i != 0) {
      if (enY) {
        System.out.println("Exit code: " + i);
      }
      System.exit(i);
    }
  }

  private void a(String paramString, boolean paramBoolean, List paramList)
  {
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, File.pathSeparator);
    while (localStringTokenizer.hasMoreElements()) {
      String str = localStringTokenizer.nextToken();
      File localFile = new File(str);
      if ((str.indexOf('%') == -1) || (localFile.exists()))
      {
        if ((paramBoolean) && (localFile.isDirectory()))
        {
          localObject = djy.Y(localFile);
          for (int i = 0; i < localObject.length; i++) {
            if (enY) System.out.println("adding library JAR: " + localObject[i]);
            paramList.add(localObject[i]);
          }
        }

        Object localObject = djy.X(localFile);
        if (enY) System.out.println("adding library URL: " + localObject);
        paramList.add(localObject);
      }
    }
  }

  private int l(String[] paramArrayOfString)
  {
    String str1 = System.getProperty("ant.home");
    File localFile1 = null;

    File localFile2 = djy.ak(getClass());
    File localFile3 = localFile2.getParentFile();
    String str2 = "org.apache.tools.ant.Main";

    if (str1 != null) {
      localFile1 = new File(str1);
    }

    if ((localFile1 == null) || (!localFile1.exists())) {
      localFile1 = localFile3.getParentFile();
      setProperty("ant.home", localFile1.getAbsolutePath());
    }

    if (!localFile1.exists()) {
      throw new aEM("Ant home is set incorrectly or ant could not be located (estimated value=" + localFile1.getAbsolutePath() + ")");
    }

    ArrayList localArrayList1 = new ArrayList();
    String str3 = null;
    ArrayList localArrayList2 = new ArrayList();

    int i = 0;
    int j = 0;

    for (int k = 0; k < paramArrayOfString.length; k++) {
      if (paramArrayOfString[k].equals("-lib")) {
        if (k == paramArrayOfString.length - 1) {
          throw new aEM("The -lib argument must be followed by a library location");
        }

        localArrayList1.add(paramArrayOfString[(++k)]);
      } else if (paramArrayOfString[k].equals("-cp")) {
        if (k == paramArrayOfString.length - 1) {
          throw new aEM("The -cp argument must be followed by a classpath expression");
        }

        if (str3 != null) {
          throw new aEM("The -cp argument must not be repeated");
        }

        str3 = paramArrayOfString[(++k)];
      } else if ((paramArrayOfString[k].equals("--nouserlib")) || (paramArrayOfString[k].equals("-nouserlib"))) {
        i = 1;
      } else if (paramArrayOfString[k].equals("--launchdiag")) {
        enY = true;
      } else if ((paramArrayOfString[k].equals("--noclasspath")) || (paramArrayOfString[k].equals("-noclasspath"))) {
        j = 1;
      } else if (paramArrayOfString[k].equals("-main")) {
        if (k == paramArrayOfString.length - 1) {
          throw new aEM("The -main argument must be followed by a library location");
        }

        str2 = paramArrayOfString[(++k)];
      } else {
        localArrayList2.add(paramArrayOfString[k]);
      }
    }

    b("Launcher JAR", localFile2);
    b("Launcher JAR directory", localFile2.getParentFile());
    b("java.home", new File(System.getProperty("java.home")));
    String[] arrayOfString;
    if (localArrayList2.size() == paramArrayOfString.length)
      arrayOfString = paramArrayOfString;
    else {
      arrayOfString = (String[])localArrayList2.toArray(new String[localArrayList2.size()]);
    }

    URL[] arrayOfURL1 = a(j != 0 ? null : str3, localArrayList1);

    URL[] arrayOfURL2 = G(localFile3);
    URL[] arrayOfURL3 = i != 0 ? new URL[0] : bck();

    File localFile4 = djy.cSu();
    b("tools.jar", localFile4);
    URL[] arrayOfURL4 = a(arrayOfURL1, arrayOfURL3, arrayOfURL2, localFile4);

    StringBuffer localStringBuffer = new StringBuffer(System.getProperty("java.class.path"));

    if (localStringBuffer.charAt(localStringBuffer.length() - 1) == File.pathSeparatorChar)
    {
      localStringBuffer.setLength(localStringBuffer.length() - 1);
    }

    for (int m = 0; m < arrayOfURL4.length; m++) {
      localStringBuffer.append(File.pathSeparatorChar);
      localStringBuffer.append(djy.aV(arrayOfURL4[m].toString()));
    }

    setProperty("java.class.path", localStringBuffer.toString());

    URLClassLoader localURLClassLoader = new URLClassLoader(arrayOfURL4);
    Thread.currentThread().setContextClassLoader(localURLClassLoader);
    Class localClass = null;
    int n = 0;
    Object localObject = null;
    try {
      localClass = localURLClassLoader.loadClass(str2);
      dRZ localdRZ = (dRZ)localClass.newInstance();
      localdRZ.b(arrayOfString, null, null);
    } catch (InstantiationException localInstantiationException) {
      System.err.println("Incompatible version of " + str2 + " detected");

      File localFile5 = djy.ak(localClass);
      System.err.println("Location of this class " + localFile5);

      localObject = localInstantiationException;
    } catch (ClassNotFoundException localClassNotFoundException) {
      System.err.println("Failed to locate" + str2);

      localObject = localClassNotFoundException;
    } catch (Throwable localThrowable) {
      localThrowable.printStackTrace(System.err);
      localObject = localThrowable;
    }
    if (localObject != null) {
      System.err.println("ant.home: " + localFile1.getAbsolutePath());
      System.err.println("Classpath: " + localStringBuffer.toString());
      System.err.println("Launcher JAR: " + localFile2.getAbsolutePath());
      System.err.println("Launcher Directory: " + localFile3.getAbsolutePath());
      n = 2;
    }
    return n;
  }

  private URL[] a(String paramString, List paramList)
  {
    ArrayList localArrayList = new ArrayList();

    if (paramString != null) {
      a(paramString, false, localArrayList);
    }

    for (Iterator localIterator = paramList.iterator(); localIterator.hasNext(); ) {
      String str = (String)localIterator.next();
      a(str, true, localArrayList);
    }

    return (URL[])localArrayList.toArray(new URL[localArrayList.size()]);
  }

  private URL[] G(File paramFile)
  {
    File localFile = null;
    String str = System.getProperty("ant.library.dir");
    if (str != null) {
      localFile = new File(str);
    }
    if ((localFile == null) || (!localFile.exists())) {
      localFile = paramFile;
      setProperty("ant.library.dir", localFile.getAbsolutePath());
    }
    return djy.Y(localFile);
  }

  private URL[] bck()
  {
    File localFile = new File(System.getProperty("user.home"), enZ);

    return djy.Y(localFile);
  }

  private URL[] a(URL[] paramArrayOfURL1, URL[] paramArrayOfURL2, URL[] paramArrayOfURL3, File paramFile)
  {
    int i = paramArrayOfURL1.length + paramArrayOfURL2.length + paramArrayOfURL3.length;
    if (paramFile != null) {
      i++;
    }
    URL[] arrayOfURL = new URL[i];
    System.arraycopy(paramArrayOfURL1, 0, arrayOfURL, 0, paramArrayOfURL1.length);
    System.arraycopy(paramArrayOfURL2, 0, arrayOfURL, paramArrayOfURL1.length, paramArrayOfURL2.length);
    System.arraycopy(paramArrayOfURL3, 0, arrayOfURL, paramArrayOfURL2.length + paramArrayOfURL1.length, paramArrayOfURL3.length);

    if (paramFile != null) {
      arrayOfURL[(arrayOfURL.length - 1)] = djy.X(paramFile);
    }
    return arrayOfURL;
  }

  private void setProperty(String paramString1, String paramString2)
  {
    if (enY) {
      System.out.println("Setting \"" + paramString1 + "\" to \"" + paramString2 + "\"");
    }
    System.setProperty(paramString1, paramString2);
  }

  private void b(String paramString, File paramFile) {
    if (enY)
      System.out.println(paramString + "= \"" + paramFile + "\"");
  }
}