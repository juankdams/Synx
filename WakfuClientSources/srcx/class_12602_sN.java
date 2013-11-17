import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Properties;
import java.util.TimeZone;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import org.xml.sax.XMLReader;

public final class sN
{
  private static final int bbS = 15;
  private static final int bbT = 10000;
  private static final int bbU = 32;
  private static final int bbV = 1024;
  private static final int bbW = 1000;
  private static final int bbX = 60;
  private static final int bbY = 60;
  protected static final String bbZ = "Access to this property blocked by a security manager";

  public static boolean Aa()
  {
    return true;
  }

  public static void Ab()
  {
  }

  public static File[] Ac()
  {
    String str = System.getProperty("ant.home");
    if (str == null) {
      return null;
    }
    File localFile = new File(str, "lib");
    return j(localFile);
  }

  private static File[] j(File paramFile)
  {
    uO localuO = new uO();

    File[] arrayOfFile = paramFile.listFiles(localuO);
    return arrayOfFile;
  }

  public static void main(String[] paramArrayOfString)
  {
    a(System.out);
  }

  private static String b(Class paramClass)
  {
    return paramClass.getPackage().getImplementationVersion();
  }

  private static URL c(Class paramClass)
  {
    if (paramClass.getProtectionDomain().getCodeSource() == null) {
      return null;
    }
    return paramClass.getProtectionDomain().getCodeSource().getLocation();
  }

  private static String Ad()
  {
    SAXParser localSAXParser = Af();
    if (localSAXParser == null) {
      return "Could not create an XML Parser";
    }

    String str = localSAXParser.getClass().getName();
    return str;
  }

  private static String Ae()
  {
    Transformer localTransformer = Ag();
    if (localTransformer == null) {
      return "Could not create an XSLT Processor";
    }

    String str = localTransformer.getClass().getName();
    return str;
  }

  private static SAXParser Af()
  {
    SAXParserFactory localSAXParserFactory = SAXParserFactory.newInstance();
    if (localSAXParserFactory == null) {
      return null;
    }
    SAXParser localSAXParser = null;
    try {
      localSAXParser = localSAXParserFactory.newSAXParser();
    }
    catch (Exception localException) {
      a(localException);
    }
    return localSAXParser;
  }

  private static Transformer Ag()
  {
    TransformerFactory localTransformerFactory = TransformerFactory.newInstance();
    if (localTransformerFactory == null) {
      return null;
    }
    Transformer localTransformer = null;
    try {
      localTransformer = localTransformerFactory.newTransformer();
    }
    catch (Exception localException) {
      a(localException);
    }
    return localTransformer;
  }

  private static String Ah()
  {
    SAXParser localSAXParser = Af();
    if (localSAXParser == null) {
      return null;
    }
    URL localURL = c(localSAXParser.getClass());
    return localURL != null ? localURL.toString() : null;
  }

  private static String Ai() {
    try {
      XMLReader localXMLReader = cAQ.cxu();
      return localXMLReader.getClass().getName();
    }
    catch (cJ localcJ) {
      a(localcJ);
    }return null;
  }

  private static String Aj()
  {
    try {
      XMLReader localXMLReader = cAQ.cxu();
      URL localURL = c(localXMLReader.getClass());
      return localURL != null ? localURL.toString() : null;
    }
    catch (cJ localcJ) {
      a(localcJ);
    }return null;
  }

  private static String Ak()
  {
    Transformer localTransformer = Ag();
    if (localTransformer == null) {
      return null;
    }
    URL localURL = c(localTransformer.getClass());
    return localURL != null ? localURL.toString() : null;
  }

  private static void a(Throwable paramThrowable)
  {
  }

  public static void a(PrintStream paramPrintStream)
  {
    a(paramPrintStream, 2);
  }

  public static void a(PrintStream paramPrintStream, int paramInt)
  {
    paramPrintStream.println("------- Ant diagnostics report -------");
    paramPrintStream.println(bze.bHL());
    a(paramPrintStream, "Implementation Version");

    paramPrintStream.println("core tasks     : " + b(bze.class) + " in " + c(bze.class));

    a(paramPrintStream, "ANT PROPERTIES");
    c(paramPrintStream);

    a(paramPrintStream, "ANT_HOME/lib jar listing");
    d(paramPrintStream);

    a(paramPrintStream, "USER_HOME/.ant/lib jar listing");
    e(paramPrintStream);

    a(paramPrintStream, "Tasks availability");
    g(paramPrintStream);

    a(paramPrintStream, "org.apache.env.Which diagnostics");
    f(paramPrintStream);

    a(paramPrintStream, "XML Parser information");
    h(paramPrintStream);

    a(paramPrintStream, "XSLT Processor information");
    i(paramPrintStream);

    a(paramPrintStream, "System properties");
    b(paramPrintStream);

    a(paramPrintStream, "Temp dir");
    j(paramPrintStream);

    a(paramPrintStream, "Locale information");
    k(paramPrintStream);

    a(paramPrintStream, "Proxy information");
    l(paramPrintStream);

    paramPrintStream.println();
  }

  private static void a(PrintStream paramPrintStream, String paramString) {
    paramPrintStream.println();
    paramPrintStream.println("-------------------------------------------");
    paramPrintStream.print(" ");
    paramPrintStream.println(paramString);
    paramPrintStream.println("-------------------------------------------");
  }

  private static void b(PrintStream paramPrintStream)
  {
    Properties localProperties = null;
    try {
      localProperties = System.getProperties();
    } catch (SecurityException localSecurityException) {
      a(localSecurityException);
      paramPrintStream.println("Access to System.getProperties() blocked by a security manager");
      return;
    }
    Enumeration localEnumeration = localProperties.propertyNames();
    while (localEnumeration.hasMoreElements()) {
      String str1 = (String)localEnumeration.nextElement();
      String str2 = getProperty(str1);
      paramPrintStream.println(str1 + " : " + str2);
    }
  }

  private static String getProperty(String paramString)
  {
    String str;
    try
    {
      str = System.getProperty(paramString);
    } catch (SecurityException localSecurityException) {
      str = "Access to this property blocked by a security manager";
    }
    return str;
  }

  private static void c(PrintStream paramPrintStream)
  {
    FF localFF = new FF();
    localFF.Pu();
    paramPrintStream.println("ant.version: " + localFF.getProperty("ant.version"));
    paramPrintStream.println("ant.java.version: " + localFF.getProperty("ant.java.version"));

    paramPrintStream.println("Is this the Apache Harmony VM? " + (cpW.cpn() ? "yes" : "no"));

    paramPrintStream.println("Is this the Kaffe VM? " + (cpW.cpk() ? "yes" : "no"));

    paramPrintStream.println("Is this gij/gcj? " + (cpW.cpm() ? "yes" : "no"));

    paramPrintStream.println("ant.core.lib: " + localFF.getProperty("ant.core.lib"));
    paramPrintStream.println("ant.home: " + localFF.getProperty("ant.home"));
  }

  private static void d(PrintStream paramPrintStream)
  {
    paramPrintStream.println("ant.home: " + System.getProperty("ant.home"));
    File[] arrayOfFile = Ac();
    a(arrayOfFile, paramPrintStream);
  }

  private static void e(PrintStream paramPrintStream)
  {
    String str = System.getProperty("user.home");
    paramPrintStream.println("user.home: " + str);
    File localFile = new File(str, aKB.enZ);
    File[] arrayOfFile = j(localFile);
    a(arrayOfFile, paramPrintStream);
  }

  private static void a(File[] paramArrayOfFile, PrintStream paramPrintStream)
  {
    if (paramArrayOfFile == null) {
      paramPrintStream.println("No such directory.");
      return;
    }
    for (int i = 0; i < paramArrayOfFile.length; i++)
      paramPrintStream.println(paramArrayOfFile[i].getName() + " (" + paramArrayOfFile[i].length() + " bytes)");
  }

  private static void f(PrintStream paramPrintStream)
  {
    Object localObject = null;
    try {
      Class localClass = Class.forName("org.apache.env.Which");
      Method localMethod = localClass.getMethod("main", new Class[] { [Ljava.lang.String.class });

      localMethod.invoke(null, new Object[] { new String[0] });
    } catch (ClassNotFoundException localClassNotFoundException) {
      paramPrintStream.println("Not available.");
      paramPrintStream.println("Download it at http://xml.apache.org/commons/");
    } catch (InvocationTargetException localInvocationTargetException) {
      localObject = localInvocationTargetException.getTargetException() == null ? localInvocationTargetException : localInvocationTargetException.getTargetException();
    } catch (Throwable localThrowable) {
      localObject = localThrowable;
    }

    if (localObject != null) {
      paramPrintStream.println("Error while running org.apache.env.Which");
      ((Throwable)localObject).printStackTrace();
    }
  }

  private static void g(PrintStream paramPrintStream)
  {
    InputStream localInputStream = bze.class.getResourceAsStream("/org/apache/tools/ant/taskdefs/defaults.properties");

    if (localInputStream == null) {
      paramPrintStream.println("None available");
    } else {
      Properties localProperties = new Properties();
      try {
        localProperties.load(localInputStream);
        for (Enumeration localEnumeration = localProperties.keys(); localEnumeration.hasMoreElements(); ) {
          String str1 = (String)localEnumeration.nextElement();
          String str2 = localProperties.getProperty(str1);
          try {
            Class.forName(str2);
            localProperties.remove(str1);
          } catch (ClassNotFoundException localClassNotFoundException) {
            paramPrintStream.println(str1 + " : Not Available " + "(the implementation class is not present)");
          }
          catch (NoClassDefFoundError localNoClassDefFoundError) {
            String str3 = localNoClassDefFoundError.getMessage().replace('/', '.');
            paramPrintStream.println(str1 + " : Missing dependency " + str3);
          } catch (LinkageError localLinkageError) {
            paramPrintStream.println(str1 + " : Initialization error");
          }
        }
        if (localProperties.size() == 0)
          paramPrintStream.println("All defined tasks are available");
        else
          paramPrintStream.println("A task being missing/unavailable should only matter if you are trying to use it");
      }
      catch (IOException localIOException)
      {
        paramPrintStream.println(localIOException.getMessage());
      }
    }
  }

  private static void h(PrintStream paramPrintStream)
  {
    String str1 = Ad();
    String str2 = Ah();
    a(paramPrintStream, "XML Parser", str1, str2);
    a(paramPrintStream, "Namespace-aware parser", Ai(), Aj());
  }

  private static void i(PrintStream paramPrintStream)
  {
    String str1 = Ae();
    String str2 = Ak();
    a(paramPrintStream, "XSLT Processor", str1, str2);
  }

  private static void a(PrintStream paramPrintStream, String paramString1, String paramString2, String paramString3)
  {
    if (paramString2 == null) {
      paramString2 = "unknown";
    }
    if (paramString3 == null) {
      paramString3 = "unknown";
    }
    paramPrintStream.println(paramString1 + " : " + paramString2);
    paramPrintStream.println(paramString1 + " Location: " + paramString3);
  }

  private static void j(PrintStream paramPrintStream)
  {
    String str = System.getProperty("java.io.tmpdir");
    if (str == null) {
      paramPrintStream.println("Warning: java.io.tmpdir is undefined");
      return;
    }
    paramPrintStream.println("Temp dir is " + str);
    File localFile1 = new File(str);
    if (!localFile1.exists()) {
      paramPrintStream.println("Warning, java.io.tmpdir directory does not exist: " + str);
      return;
    }

    long l1 = System.currentTimeMillis();
    File localFile2 = null;
    FileOutputStream localFileOutputStream = null;
    FileInputStream localFileInputStream = null;
    try {
      localFile2 = File.createTempFile("diag", "txt", localFile1);

      localFileOutputStream = new FileOutputStream(localFile2);
      byte[] arrayOfByte = new byte[1024];
      for (int i = 0; i < 32; i++) {
        localFileOutputStream.write(arrayOfByte);
      }
      localFileOutputStream.close();
      localFileOutputStream = null;

      Thread.sleep(1000L);
      localFileInputStream = new FileInputStream(localFile2);
      i = 0;
      int j = 0;
      while ((j = localFileInputStream.read(arrayOfByte, 0, 1024)) > 0) {
        i += j;
      }
      localFileInputStream.close();
      localFileInputStream = null;

      long l2 = localFile2.lastModified();
      long l3 = l2 - l1;
      localFile2.delete();

      paramPrintStream.print("Temp dir is writeable");
      if (i != 32768) {
        paramPrintStream.println(", but seems to be full.  Wrote 32768but could only read " + i + " bytes.");
      }
      else
      {
        paramPrintStream.println();
      }

      paramPrintStream.println("Temp dir alignment with system clock is " + l3 + " ms");
      if (Math.abs(l3) > 10000L)
        paramPrintStream.println("Warning: big clock drift -maybe a network filesystem");
    }
    catch (IOException localIOException) {
      a(localIOException);
      paramPrintStream.println("Failed to create a temporary file in the temp dir " + str);
      paramPrintStream.println("File  " + localFile2 + " could not be created/written to");
    } catch (InterruptedException localInterruptedException) {
      a(localInterruptedException);
      paramPrintStream.println("Failed to check whether tempdir is writable");
    } finally {
      wh.b(localFileOutputStream);
      wh.c(localFileInputStream);
      if ((localFile2 != null) && (localFile2.exists()))
        localFile2.delete();
    }
  }

  private static void k(PrintStream paramPrintStream)
  {
    Calendar localCalendar = Calendar.getInstance();
    TimeZone localTimeZone = localCalendar.getTimeZone();
    paramPrintStream.println("Timezone " + localTimeZone.getDisplayName() + " offset=" + localTimeZone.getOffset(localCalendar.get(0), localCalendar.get(1), localCalendar.get(2), localCalendar.get(5), localCalendar.get(7), ((localCalendar.get(11) * 60 + localCalendar.get(12)) * 60 + localCalendar.get(13)) * 1000 + localCalendar.get(14)));
  }

  private static void b(PrintStream paramPrintStream, String paramString)
  {
    String str = getProperty(paramString);
    if (str != null) {
      paramPrintStream.print(paramString);
      paramPrintStream.print(" = ");
      paramPrintStream.print('"');
      paramPrintStream.print(str);
      paramPrintStream.println('"');
    }
  }

  private static void l(PrintStream paramPrintStream)
  {
    b(paramPrintStream, "http.proxyHost");
    b(paramPrintStream, "http.proxyPort");
    b(paramPrintStream, "http.proxyUser");
    b(paramPrintStream, "http.proxyPassword");
    b(paramPrintStream, "http.nonProxyHosts");
    b(paramPrintStream, "https.proxyHost");
    b(paramPrintStream, "https.proxyPort");
    b(paramPrintStream, "https.nonProxyHosts");
    b(paramPrintStream, "ftp.proxyHost");
    b(paramPrintStream, "ftp.proxyPort");
    b(paramPrintStream, "ftp.nonProxyHosts");
    b(paramPrintStream, "socksProxyHost");
    b(paramPrintStream, "socksProxyPort");
    b(paramPrintStream, "java.net.socks.username");
    b(paramPrintStream, "java.net.socks.password");

    if (cpW.cpj() < 15) {
      return;
    }
    b(paramPrintStream, "java.net.useSystemProxies");
    String str = "org.apache.tools.ant.util.java15.ProxyDiagnostics";
    try {
      Class localClass = Class.forName("org.apache.tools.ant.util.java15.ProxyDiagnostics");
      Object localObject = localClass.newInstance();
      paramPrintStream.println("Java1.5+ proxy settings:");
      paramPrintStream.println(localObject.toString());
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    catch (InstantiationException localInstantiationException)
    {
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
    }
  }
}