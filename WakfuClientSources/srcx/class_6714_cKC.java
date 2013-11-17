import org.apache.log4j.Logger;

public class cKC extends dfN
{
  private static bOO bf = new bOO(new dyN());

  public cMb av()
  {
    aCf localaCf;
    try
    {
      localaCf = (aCf)bf.Mm();
      aCf.a(localaCf, bf);
    } catch (Exception localException) {
      aCf.i().error("Erreur lors de l'extraction d'un DimensionalBagExitTrigger du pool", localException);
      localaCf = new aCf();
    }
    return localaCf;
  }
}