import org.apache.log4j.Logger;

public class Ix extends dfN
{
  private static bOO bf = new bOO(new dlx());

  public cMb av()
  {
    bab localbab;
    try
    {
      localbab = (bab)bf.Mm();
      bab.a(localbab, bf);
    } catch (Exception localException) {
      bab.i().error("Erreur lors de l'extraction d'un HavenWorldResourcesCollector du pool", localException);
      localbab = new bab();
    }
    return localbab;
  }
}