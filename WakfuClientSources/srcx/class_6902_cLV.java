import org.apache.log4j.Logger;

public class cLV extends dfN
{
  private static bOO bf = new bOO(new cxa());

  public cMb av()
  {
    XQ localXQ;
    try
    {
      localXQ = (XQ)bf.Mm();
      XQ.a(localXQ, bf);
    } catch (Exception localException) {
      XQ.i().error("Erreur lors de l'extraction d'un " + XQ.class.getName() + " du pool", localException);
      localXQ = new XQ();
    }
    return localXQ;
  }
}