import java.io.File;
import java.io.PrintStream;

public class ati
{
  private static final String dDg = "Windows";
  private static final String dDh = "user.home";
  private static final String dDi = "user.dir";
  private static final String dDj = "java.io.tmpdir";
  private static final String dDk = "java.home";
  public static final String dDl = getSystemProperty("awt.toolkit");

  public static final String dDm = getSystemProperty("file.encoding");

  public static final String dDn = getSystemProperty("file.separator");

  public static final String dDo = getSystemProperty("java.awt.fonts");

  public static final String dDp = getSystemProperty("java.awt.graphicsenv");

  public static final String dDq = getSystemProperty("java.awt.headless");

  public static final String dDr = getSystemProperty("java.awt.printerjob");

  public static final String dDs = getSystemProperty("java.class.path");

  public static final String dDt = getSystemProperty("java.class.version");

  public static final String dDu = getSystemProperty("java.compiler");

  public static final String dDv = getSystemProperty("java.endorsed.dirs");

  public static final String dDw = getSystemProperty("java.ext.dirs");

  public static final String JAVA_HOME = getSystemProperty("java.home");

  public static final String dDx = getSystemProperty("java.io.tmpdir");

  public static final String dDy = getSystemProperty("java.library.path");

  public static final String dDz = getSystemProperty("java.runtime.name");

  public static final String dDA = getSystemProperty("java.runtime.version");

  public static final String dDB = getSystemProperty("java.specification.name");

  public static final String dDC = getSystemProperty("java.specification.vendor");

  public static final String dDD = getSystemProperty("java.specification.version");
  private static final dKy dDE = dKy.rn(dDD);

  public static final String dDF = getSystemProperty("java.util.prefs.PreferencesFactory");

  public static final String dDG = getSystemProperty("java.vendor");

  public static final String dDH = getSystemProperty("java.vendor.url");

  public static final String JAVA_VERSION = getSystemProperty("java.version");

  public static final String dDI = getSystemProperty("java.vm.info");

  public static final String dDJ = getSystemProperty("java.vm.name");

  public static final String dDK = getSystemProperty("java.vm.specification.name");

  public static final String dDL = getSystemProperty("java.vm.specification.vendor");

  public static final String dDM = getSystemProperty("java.vm.specification.version");

  public static final String dDN = getSystemProperty("java.vm.vendor");

  public static final String dDO = getSystemProperty("java.vm.version");

  public static final String LINE_SEPARATOR = getSystemProperty("line.separator");

  public static final String dDP = getSystemProperty("os.arch");

  public static final String dDQ = getSystemProperty("os.name");

  public static final String dDR = getSystemProperty("os.version");

  public static final String dDS = getSystemProperty("path.separator");

  public static final String dDT = getSystemProperty("user.country") == null ? getSystemProperty("user.region") : getSystemProperty("user.country");

  public static final String dDU = getSystemProperty("user.dir");

  public static final String USER_HOME = getSystemProperty("user.home");

  public static final String dDV = getSystemProperty("user.language");

  public static final String dDW = getSystemProperty("user.name");

  public static final String dDX = getSystemProperty("user.timezone");

  public static final boolean dDY = fH("1.1");

  public static final boolean dDZ = fH("1.2");

  public static final boolean dEa = fH("1.3");

  public static final boolean dEb = fH("1.4");

  public static final boolean dEc = fH("1.5");

  public static final boolean dEd = fH("1.6");

  public static final boolean dEe = fH("1.7");

  public static final boolean dEf = fI("AIX");

  public static final boolean dEg = fI("HP-UX");

  public static final boolean dEh = fI("Irix");

  public static final boolean dEi = (fI("Linux")) || (fI("LINUX"));

  public static final boolean dEj = fI("Mac");

  public static final boolean dEk = fI("Mac OS X");

  public static final boolean dEl = fI("OS/2");

  public static final boolean dEm = fI("Solaris");

  public static final boolean dEn = fI("SunOS");

  public static final boolean dEo = (dEf) || (dEg) || (dEh) || (dEi) || (dEk) || (dEm) || (dEn);

  public static final boolean dEp = fI("Windows");

  public static final boolean dEq = I("Windows", "5.0");

  public static final boolean dEr = I("Windows 9", "4.0");

  public static final boolean dEs = I("Windows 9", "4.1");

  public static final boolean dEt = I("Windows", "4.9");

  public static final boolean dEu = fI("Windows NT");

  public static final boolean dEv = I("Windows", "5.1");

  public static final boolean dEw = I("Windows", "6.0");

  public static final boolean dEx = I("Windows", "6.1");

  public static File aFd()
  {
    return new File(System.getProperty("java.home"));
  }

  public static File aFe()
  {
    return new File(System.getProperty("java.io.tmpdir"));
  }

  private static boolean fH(String paramString)
  {
    return J(dDD, paramString);
  }

  private static boolean I(String paramString1, String paramString2)
  {
    return c(dDQ, dDR, paramString1, paramString2);
  }

  private static boolean fI(String paramString)
  {
    return K(dDQ, paramString);
  }

  private static String getSystemProperty(String paramString)
  {
    try
    {
      return System.getProperty(paramString);
    }
    catch (SecurityException localSecurityException) {
      System.err.println("Caught a SecurityException reading the system property '" + paramString + "'; the SystemUtils property value will default to null.");
    }
    return null;
  }

  public static File aFf()
  {
    return new File(System.getProperty("user.dir"));
  }

  public static File aFg()
  {
    return new File(System.getProperty("user.home"));
  }

  public static boolean aFh()
  {
    return dDq != null ? dDq.equals(Boolean.TRUE.toString()) : false;
  }

  public static boolean a(dKy paramdKy)
  {
    return dDE.b(paramdKy);
  }

  static boolean J(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return false;
    }
    return paramString1.startsWith(paramString2);
  }

  static boolean c(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if ((paramString1 == null) || (paramString2 == null)) {
      return false;
    }
    return (paramString1.startsWith(paramString3)) && (paramString2.startsWith(paramString4));
  }

  static boolean K(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return false;
    }
    return paramString1.startsWith(paramString2);
  }
}