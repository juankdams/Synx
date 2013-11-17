import org.apache.log4j.Logger;

public class bFO extends dfN
{
  private static bOO bf = new bOO(new bSG());

  public cMb av()
  {
    Uh localUh;
    try
    {
      localUh = (Uh)bf.Mm();
      Uh.a(localUh, bf);
    } catch (Exception localException) {
      Uh.i().error("Erreur lors de l'extraction d'un DimensionalBagExitTrigger du pool", localException);
      localUh = new Uh();
    }
    return localUh;
  }
}