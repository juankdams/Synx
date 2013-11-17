import org.apache.log4j.Logger;

public class aHZ extends dfN
{
  private static bOO bf = new bOO(new cXM());

  public cMb av()
  {
    cTU localcTU;
    try
    {
      localcTU = (cTU)bf.Mm();
      cTU.a(localcTU, bf);
    } catch (Exception localException) {
      cTU.i().error("Erreur lors de l'extraction d'un Board du pool", localException);
      localcTU = new cTU();
    }
    return localcTU;
  }
}