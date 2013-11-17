import org.apache.log4j.Logger;

public class bPY extends dfN
{
  private static final bOO bf = new bOO(new aKx());

  public cMb av()
  {
    aSu localaSu;
    try
    {
      localaSu = (aSu)bf.Mm();
      aSu.a(localaSu, bf);
    } catch (Exception localException) {
      aSu.i().error("Erreur lors de l'extraction d'un Lever du pool", localException);
      localaSu = new aSu();
    }
    return localaSu;
  }
}