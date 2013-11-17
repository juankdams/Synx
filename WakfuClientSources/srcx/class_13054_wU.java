import org.apache.log4j.Logger;

public class wU extends dfN
{
  private static bOO bf = new bOO(new ro());

  public cMb av()
  {
    lL locallL;
    try
    {
      locallL = (lL)bf.Mm();
      lL.a(locallL, bf);
    } catch (Exception localException) {
      lL.i().error("Erreur lors de l'extraction d'un StreetLight du pool", localException);
      locallL = new lL();
    }
    return locallL;
  }
}