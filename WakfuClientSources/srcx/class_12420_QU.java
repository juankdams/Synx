import org.apache.log4j.Logger;

public class QU extends dfN
{
  private static bOO bf = new bOO(new blv());

  public cMb av()
  {
    bC localbC;
    try
    {
      localbC = (bC)bf.Mm();
      bC.a(localbC, bf);
    } catch (Exception localException) {
      bC.K.error("Erreur lors de l'extraction d'un Lever du pool", localException);
      localbC = new bC();
    }
    return localbC;
  }
}