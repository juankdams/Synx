import org.apache.log4j.Logger;

public class aqI extends dfN
{
  private static final bOO bf = new bOO(new aLx());

  public cMb av()
  {
    cju localcju;
    try
    {
      localcju = (cju)bf.Mm();
      cju.a(localcju, bf);
    } catch (Exception localException) {
      cju.gV().error("Erreur lors de l'extraction d'un Lever du pool", localException);
      localcju = new cju();
    }
    return localcju;
  }
}