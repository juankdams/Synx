public final class cKG
{
  public static final String iJp = "SOFTWARE\\VideoLAN\\VLC";
  public static final String iJq = "InstallDir";

  public static String cEe()
  {
    aHA.debug("getVlcInstallDir()", new Object[0]);
    try {
      return beW.b(cpe.hYm, "SOFTWARE\\VideoLAN\\VLC", "InstallDir");
    }
    catch (Exception localException) {
      aHA.d("Failed to get VLC installation directory from the registry", localException, new Object[0]);
    }return null;
  }
}