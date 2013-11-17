import org.apache.log4j.Logger;

public class nu extends dfN
{
  private static bOO bf = new bOO(new bIO());

  public cMb av()
  {
    aed localaed;
    try
    {
      localaed = (aed)bf.Mm();
      aed.a(localaed, bf);
    } catch (Exception localException) {
      aed.i().error("Erreur lors de l'extraction d'un Lever du pool", localException);
      localaed = new aed();
    }
    return localaed;
  }
}