import org.apache.log4j.Logger;

public class bHS extends dfN
{
  private static bOO bf = new bOO(new aJN());

  public cMb av()
  {
    cFW localcFW;
    try
    {
      localcFW = (cFW)bf.Mm();
      cFW.a(localcFW, bf);
    } catch (Exception localException) {
      cFW.i().error("Erreur lors de l'extraction d'un " + cFW.class.getName() + " du pool", localException);
      localcFW = new cFW();
    }
    return localcFW;
  }
}