public class dvh
{
  private FF lAm;
  public static final String lAn = "java.net.useSystemProxies";
  public static final String lAo = "http.proxyHost";
  public static final String lAp = "http.proxyPort";
  public static final String lAq = "https.proxyHost";
  public static final String lAr = "https.proxyPort";
  public static final String lAs = "ftp.proxyHost";
  public static final String lAt = "ftp.proxyPort";
  public static final String lAu = "http.nonProxyHosts";
  public static final String lAv = "https.nonProxyHosts";
  public static final String lAw = "ftp.nonProxyHosts";
  public static final String lAx = "http.proxyUser";
  public static final String lAy = "http.proxyPassword";
  public static final String lAz = "socksProxyHost";
  public static final String lAA = "socksProxyPort";
  public static final String lAB = "java.net.socks.username";
  public static final String lAC = "java.net.socks.password";

  public dvh(FF paramFF)
  {
    this.lAm = paramFF;
  }

  public static String daR()
  {
    try
    {
      return System.getProperty("java.net.useSystemProxies");
    } catch (SecurityException localSecurityException) {
    }
    return null;
  }

  public void daS()
  {
    if (daR() == null) {
      String str1 = this.lAm.getProperty("java.net.useSystemProxies");
      if ((str1 == null) || (FF.bP(str1))) {
        str1 = "true";
      }
      String str2 = "setting java.net.useSystemProxies to " + str1;
      try {
        this.lAm.d(str2, 4);
        System.setProperty("java.net.useSystemProxies", str1);
      }
      catch (SecurityException localSecurityException)
      {
        this.lAm.log("Security Exception when " + str2);
      }
    }
  }
}