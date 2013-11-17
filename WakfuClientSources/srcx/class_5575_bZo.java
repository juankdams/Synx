import org.apache.log4j.Logger;

public class bZo extends dfN
{
  public static bOO bf = new bOO(new bAD());

  public cMb av()
  {
    dMt localdMt;
    try
    {
      localdMt = (dMt)bf.Mm();
      dMt.a(localdMt, bf);
    } catch (Exception localException) {
      dMt.i().error("Erreur lors de l'extraction du pool", localException);
      localdMt = new dMt();
    }
    return localdMt;
  }
}