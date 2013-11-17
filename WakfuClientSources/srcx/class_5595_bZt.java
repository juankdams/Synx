import org.apache.log4j.Logger;

public class bZt extends dfN
{
  private static bOO bf = new bOO(new dSm());

  public cMb av()
  {
    lF locallF;
    try
    {
      locallF = (lF)bf.Mm();
      lF.a(locallF, bf);
    } catch (Exception localException) {
      lF.i().error("Erreur lors de l'extraction d'un Chest du pool", localException);
      locallF = new lF();
    }
    return locallF;
  }
}