import org.apache.log4j.Logger;

public class cMQ extends dfN
{
  private static bOO bf = new bOO(new aDn());

  public cMb av()
  {
    aTU localaTU;
    try
    {
      localaTU = (aTU)bf.Mm();
      aTU.a(localaTU, bf);
    } catch (Exception localException) {
      aTU.bjf().error("Erreur lors de l'extraction d'un Chest du pool", localException);
      localaTU = new aTU();
    }
    return localaTU;
  }
}