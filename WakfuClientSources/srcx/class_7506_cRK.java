import org.apache.log4j.Logger;

public class cRK extends dfN
{
  public static bOO bf = new bOO(new btj());

  public cMb av()
  {
    dCe localdCe;
    try
    {
      localdCe = (dCe)bf.Mm();
      dCe.a(localdCe, bf);
    } catch (Exception localException) {
      dCe.an().error("Erreur lors de l'extraction d'une CraftTable du pool", localException);
      localdCe = new dCe(null);
    }
    return localdCe;
  }
}