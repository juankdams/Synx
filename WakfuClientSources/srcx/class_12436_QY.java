import org.apache.log4j.Logger;

public class QY extends dfN
{
  private static bOO bf = new bOO(new cfi());

  public cMb av()
  {
    ajO localajO;
    try
    {
      localajO = (ajO)bf.Mm();
      ajO.a(localajO, bf);
    } catch (Exception localException) {
      ajO.an().error("Erreur lors de l'extraction d'un MarketBoard du pool", localException);
      localajO = new ajO();
    }
    return localajO;
  }
}