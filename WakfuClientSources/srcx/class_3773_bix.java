import org.apache.log4j.Logger;

public class bix extends dfN
{
  private static bOO bf = new bOO(new dKr());

  public cMb av()
  {
    cRQ localcRQ;
    try
    {
      localcRQ = (cRQ)bf.Mm();
      cRQ.a(localcRQ, bf);
    } catch (Exception localException) {
      cRQ.i().error("Erreur lors de l'extraction d'un " + cRQ.class.getName() + " du pool", localException);
      localcRQ = new cRQ();
    }
    return localcRQ;
  }
}