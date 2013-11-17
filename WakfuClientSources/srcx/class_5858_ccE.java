import org.apache.log4j.Logger;

public class ccE extends dfN
{
  public static bOO bf = new bOO(new aGn());

  public cMb av()
  {
    cVB localcVB;
    try
    {
      localcVB = (cVB)bf.Mm();
      cVB.a(localcVB, bf);
    } catch (Exception localException) {
      cVB.i().error("Erreur lors de l'extraction d'une CharacterStatue du pool", localException);
      localcVB = new cVB();
    }
    return localcVB;
  }
}