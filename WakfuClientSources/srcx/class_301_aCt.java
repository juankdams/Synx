import java.util.Locale;

public class aCt
  implements cjq
{
  private static final String dDQ = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);

  private static final String dDP = System.getProperty("os.arch").toLowerCase(Locale.ENGLISH);

  private static final String dDR = System.getProperty("os.version").toLowerCase(Locale.ENGLISH);

  private static final String dWP = System.getProperty("path.separator");
  private String dWQ;
  private String name;
  private String version;
  private String dWR;
  public static final String dWS = "windows";
  public static final String dWT = "win9x";
  public static final String dWU = "winnt";
  public static final String dWV = "os/2";
  public static final String dWW = "netware";
  public static final String dWX = "dos";
  public static final String dWY = "mac";
  public static final String dWZ = "tandem";
  public static final String dXa = "unix";
  public static final String dXb = "openvms";
  public static final String dXc = "z/os";
  public static final String dXd = "os/400";
  private static final String dXe = "darwin";

  public aCt()
  {
  }

  public aCt(String paramString)
  {
    setFamily(paramString);
  }

  public void setFamily(String paramString)
  {
    this.dWQ = paramString.toLowerCase(Locale.ENGLISH);
  }

  public void setName(String paramString)
  {
    this.name = paramString.toLowerCase(Locale.ENGLISH);
  }

  public void gc(String paramString)
  {
    this.dWR = paramString.toLowerCase(Locale.ENGLISH);
  }

  public void setVersion(String paramString)
  {
    this.version = paramString.toLowerCase(Locale.ENGLISH);
  }

  public boolean gh()
  {
    return d(this.dWQ, this.name, this.dWR, this.version);
  }

  public static boolean gd(String paramString)
  {
    return d(paramString, null, null, null);
  }

  public static boolean isName(String paramString)
  {
    return d(null, paramString, null, null);
  }

  public static boolean ge(String paramString)
  {
    return d(null, null, paramString, null);
  }

  public static boolean gf(String paramString)
  {
    return d(null, null, null, paramString);
  }

  public static boolean d(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    boolean bool1 = false;

    if ((paramString1 != null) || (paramString2 != null) || (paramString3 != null) || (paramString4 != null))
    {
      int i = 1;
      boolean bool2 = true;
      boolean bool3 = true;
      boolean bool4 = true;

      if (paramString1 != null)
      {
        int j = dDQ.indexOf("windows") > -1 ? 1 : 0;
        int k = 0;
        int m = 0;
        if (j != 0)
        {
          k = (dDQ.indexOf("95") >= 0) || (dDQ.indexOf("98") >= 0) || (dDQ.indexOf("me") >= 0) || (dDQ.indexOf("ce") >= 0) ? 1 : 0;

          m = k == 0 ? 1 : 0;
        }
        if (paramString1.equals("windows"))
          i = j;
        else if (paramString1.equals("win9x"))
          i = (j != 0) && (k != 0) ? 1 : 0;
        else if (paramString1.equals("winnt"))
          i = (j != 0) && (m != 0) ? 1 : 0;
        else if (paramString1.equals("os/2"))
          i = dDQ.indexOf("os/2") > -1 ? 1 : 0;
        else if (paramString1.equals("netware"))
          i = dDQ.indexOf("netware") > -1 ? 1 : 0;
        else if (paramString1.equals("dos"))
          i = (dWP.equals(";")) && (!gd("netware")) ? 1 : 0;
        else if (paramString1.equals("mac")) {
          i = (dDQ.indexOf("mac") > -1) || (dDQ.indexOf("darwin") > -1) ? 1 : 0;
        }
        else if (paramString1.equals("tandem"))
          i = dDQ.indexOf("nonstop_kernel") > -1 ? 1 : 0;
        else if (paramString1.equals("unix")) {
          i = (dWP.equals(":")) && (!gd("openvms")) && ((!gd("mac")) || (dDQ.endsWith("x")) || (dDQ.indexOf("darwin") > -1)) ? 1 : 0;
        }
        else if (paramString1.equals("z/os")) {
          i = (dDQ.indexOf("z/os") > -1) || (dDQ.indexOf("os/390") > -1) ? 1 : 0;
        }
        else if (paramString1.equals("os/400"))
          i = dDQ.indexOf("os/400") > -1 ? 1 : 0;
        else if (paramString1.equals("openvms"))
          i = dDQ.indexOf("openvms") > -1 ? 1 : 0;
        else {
          throw new cJ("Don't know how to detect os family \"" + paramString1 + "\"");
        }

      }

      if (paramString2 != null) {
        bool2 = paramString2.equals(dDQ);
      }
      if (paramString3 != null) {
        bool3 = paramString3.equals(dDP);
      }
      if (paramString4 != null) {
        bool4 = paramString4.equals(dDR);
      }
      bool1 = (i != 0) && (bool2) && (bool3) && (bool4);
    }
    return bool1;
  }
}