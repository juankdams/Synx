import org.apache.log4j.Logger;

public class bcv extends dfN
{
  private static bOO bf = new bOO(new biC());

  public cMb av()
  {
    dgm localdgm;
    try
    {
      localdgm = (dgm)bf.Mm();
      dgm.a(localdgm, bf);
    } catch (Exception localException) {
      dgm.i().error("Erreur lors de l'extraction d'un Lever du pool", localException);
      localdgm = new dgm();
    }
    return localdgm;
  }
}