import org.apache.log4j.Logger;

public class aQh extends dfN
{
  private static bOO bf = new bOO(new bCp());

  public cMb av()
  {
    czP localczP;
    try
    {
      localczP = (czP)bf.Mm();
      czP.a(localczP, bf);
    } catch (Exception localException) {
      czP.i().error("Erreur lors de l'extraction d'un Lever du pool", localException);
      localczP = new czP();
    }
    return localczP;
  }
}