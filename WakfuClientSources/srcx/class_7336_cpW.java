import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Vector;

public final class cpW
{
  private static final boolean hZx = aCt.gd("dos");

  private static final boolean hZy = aCt.isName("netware");

  private static final boolean hZz = aCt.isName("aix");

  private static final String JAVA_HOME = System.getProperty("java.home");

  private static final wh aIk = wh.Fo();
  private static String hZA;
  private static int hZB;
  public static final String bNk = "1.0";
  public static final int VERSION_1_0 = 10;
  public static final String bNl = "1.1";
  public static final int VERSION_1_1 = 11;
  public static final String bNm = "1.2";
  public static final int VERSION_1_2 = 12;
  public static final String bNn = "1.3";
  public static final int VERSION_1_3 = 13;
  public static final String bNo = "1.4";
  public static final int VERSION_1_4 = 14;
  public static final String hZC = "1.5";
  public static final int VERSION_1_5 = 15;
  public static final String hZD = "1.6";
  public static final int VERSION_1_6 = 16;
  public static final String hZE = "1.7";
  public static final int hZF = 17;
  public static final String hZG = "1.8";
  public static final int hZH = 18;
  private static boolean hZI;
  private static boolean hZJ;
  private static boolean hZK;
  private static boolean hZL;
  private static Vector hZM;

  public static String PG()
  {
    return hZA;
  }

  public static int cpj()
  {
    return hZB;
  }

  public static boolean lO(String paramString)
  {
    return hZA.equals(paramString);
  }

  public static boolean lP(String paramString)
  {
    return hZA.compareTo(paramString) >= 0;
  }

  public static boolean cpk()
  {
    return hZI;
  }

  public static boolean cpl()
  {
    return hZJ;
  }

  public static boolean cpm()
  {
    return hZK;
  }

  public static boolean cpn()
  {
    return hZL;
  }

  public static String lQ(String paramString)
  {
    if (hZy)
    {
      return paramString;
    }

    File localFile = null;

    if (hZz)
    {
      localFile = ax(JAVA_HOME + "/sh", paramString);
    }

    if (localFile == null) {
      localFile = ax(JAVA_HOME + "/bin", paramString);
    }

    if (localFile != null) {
      return localFile.getAbsolutePath();
    }

    return lS(paramString);
  }

  public static String lR(String paramString)
  {
    if (hZy)
    {
      return paramString;
    }

    File localFile = null;

    if (hZz)
    {
      localFile = ax(JAVA_HOME + "/../sh", paramString);
    }

    if (localFile == null) {
      localFile = ax(JAVA_HOME + "/../bin", paramString);
    }

    if (localFile != null) {
      return localFile.getAbsolutePath();
    }

    return lQ(paramString);
  }

  private static String lS(String paramString)
  {
    return paramString + (hZx ? ".exe" : "");
  }

  private static File ax(String paramString1, String paramString2)
  {
    File localFile1 = aIk.aS(paramString1);
    File localFile2 = null;
    if (localFile1.exists()) {
      localFile2 = new File(localFile1, lS(paramString2));
      if (!localFile2.exists()) {
        localFile2 = null;
      }
    }
    return localFile2;
  }

  private static void cpo()
  {
    hZM = new Vector();
    switch (hZB)
    {
    case 15:
    case 16:
    case 17:
    case 18:
      hZM.addElement("com.sun.org.apache");
    case 14:
      if (hZB == 14) {
        hZM.addElement("org.apache.crimson");
        hZM.addElement("org.apache.xalan");
        hZM.addElement("org.apache.xml");
        hZM.addElement("org.apache.xpath");
      }
      hZM.addElement("org.ietf.jgss");
      hZM.addElement("org.w3c.dom");
      hZM.addElement("org.xml.sax");
    case 13:
      hZM.addElement("org.omg");
      hZM.addElement("com.sun.corba");
      hZM.addElement("com.sun.jndi");
      hZM.addElement("com.sun.media");
      hZM.addElement("com.sun.naming");
      hZM.addElement("com.sun.org.omg");
      hZM.addElement("com.sun.rmi");
      hZM.addElement("sunw.io");
      hZM.addElement("sunw.util");
    case 12:
      hZM.addElement("com.sun.java");
      hZM.addElement("com.sun.image");
    case 11:
    }

    hZM.addElement("sun");
    hZM.addElement("java");
    hZM.addElement("javax");
  }

  public static Vector cpp()
  {
    Vector localVector = new Vector();
    localVector.addElement("java.lang.Object");
    switch (hZB) {
    case 15:
    case 16:
    case 17:
    case 18:
      localVector.addElement("com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl ");
    case 14:
      localVector.addElement("sun.audio.AudioPlayer");
      if (hZB == 14) {
        localVector.addElement("org.apache.crimson.parser.ContentModel");
        localVector.addElement("org.apache.xalan.processor.ProcessorImport");
        localVector.addElement("org.apache.xml.utils.URI");
        localVector.addElement("org.apache.xpath.XPathFactory");
      }
      localVector.addElement("org.ietf.jgss.Oid");
      localVector.addElement("org.w3c.dom.Attr");
      localVector.addElement("org.xml.sax.XMLReader");
    case 13:
      localVector.addElement("org.omg.CORBA.Any");
      localVector.addElement("com.sun.corba.se.internal.corba.AnyImpl");
      localVector.addElement("com.sun.jndi.ldap.LdapURL");
      localVector.addElement("com.sun.media.sound.Printer");
      localVector.addElement("com.sun.naming.internal.VersionHelper");
      localVector.addElement("com.sun.org.omg.CORBA.Initializer");
      localVector.addElement("sunw.io.Serializable");
      localVector.addElement("sunw.util.EventListener");
    case 12:
      localVector.addElement("javax.accessibility.Accessible");
      localVector.addElement("sun.misc.BASE64Encoder");
      localVector.addElement("com.sun.image.codec.jpeg.JPEGCodec");
    case 11:
    }

    localVector.addElement("sun.reflect.SerializationConstructorAccessorImpl");
    localVector.addElement("sun.net.www.http.HttpClient");
    localVector.addElement("sun.audio.AudioPlayer");

    return localVector;
  }

  public static Vector cpq()
  {
    if (hZM == null) {
      cpo();
    }
    return hZM;
  }

  public static File z(String[] paramArrayOfString)
  {
    File localFile = aIk.a("ANT", ".JAVA_OPTS", null, false, true);
    BufferedWriter localBufferedWriter = null;
    try {
      localBufferedWriter = new BufferedWriter(new FileWriter(localFile));
      for (int i = 0; i < paramArrayOfString.length; i++) {
        localBufferedWriter.write(paramArrayOfString[i]);
        localBufferedWriter.newLine();
      }
    } finally {
      wh.a(localBufferedWriter);
    }
    return localFile;
  }

  public static String cpr()
  {
    return JAVA_HOME;
  }

  static
  {
    try
    {
      hZA = "1.0";
      hZB = 10;
      Class.forName("java.lang.Void");
      hZA = "1.1";
      hZB += 1;
      Class.forName("java.lang.ThreadLocal");
      hZA = "1.2";
      hZB += 1;
      Class.forName("java.lang.StrictMath");
      hZA = "1.3";
      hZB += 1;
      Class.forName("java.lang.CharSequence");
      hZA = "1.4";
      hZB += 1;
      Class.forName("java.net.Proxy");
      hZA = "1.5";
      hZB += 1;
      Class.forName("java.net.CookieStore");
      hZA = "1.6";
      hZB += 1;
      Class.forName("java.nio.file.FileSystem");
      hZA = "1.7";
      hZB += 1;
      Class.forName("java.lang.reflect.Executable");
      hZA = "1.8";
      hZB += 1;
    }
    catch (Throwable localThrowable1)
    {
    }
    hZI = false;
    try {
      Class.forName("kaffe.util.NotImplemented");
      hZI = true;
    }
    catch (Throwable localThrowable2) {
    }
    hZJ = false;
    try {
      Class.forName("gnu.classpath.Configuration");
      hZJ = true;
    }
    catch (Throwable localThrowable3) {
    }
    hZK = false;
    try {
      Class.forName("gnu.gcj.Core");
      hZK = true;
    }
    catch (Throwable localThrowable4) {
    }
    hZL = false;
    try {
      Class.forName("org.apache.harmony.luni.util.Base64");
      hZL = true;
    }
    catch (Throwable localThrowable5)
    {
    }
  }
}