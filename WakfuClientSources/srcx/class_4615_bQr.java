import org.apache.log4j.Logger;

public class bQr extends dfN
{
  private static bOO bf = new bOO(new aze());

  public cMb av()
  {
    dCm localdCm;
    try
    {
      localdCm = (dCm)bf.Mm();
      dCm.a(localdCm, bf);
    } catch (Exception localException) {
      dCm.K.error("Erreur lors de l'extraction d'un " + dCm.class + " du pool", localException);
      localdCm = new dCm();
    }
    return localdCm;
  }
}