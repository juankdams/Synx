import java.util.Properties;

public final class aiW
{
  private zA dhu;

  public static aiW avG()
  {
    return aPi.eLn;
  }

  private aiW()
  {
    try
    {
      Properties localProperties = new Properties();
      localProperties.load(getClass().getResourceAsStream("/build.properties"));
      this.dhu = new zA(localProperties.getProperty("build.version"));
    }
    catch (Exception localException)
    {
      this.dhu = null;
    }
    aHA.info("vlcj: {}", new Object[] { this.dhu != null ? this.dhu : "<version not available>" });
    aHA.info("java: {} {}", new Object[] { System.getProperty("java.version"), System.getProperty("java.vendor") });
    aHA.info("java home: {}", new Object[] { System.getProperty("java.home") });
    aHA.info("os: {} {} {}", new Object[] { System.getProperty("os.name"), System.getProperty("os.version"), System.getProperty("os.arch") });
  }

  public final zA avH()
  {
    return this.dhu;
  }
}