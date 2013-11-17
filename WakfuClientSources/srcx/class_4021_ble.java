import org.apache.log4j.Logger;

public class ble extends dfN
{
  private static bOO bf = new bOO(new bwP());

  public cMb av()
  {
    cTf localcTf;
    try
    {
      localcTf = (cTf)bf.Mm();
      cTf.a(localcTf, bf);
    } catch (Exception localException) {
      cTf.i().error("Erreur lors de l'extraction d'un Lever du pool", localException);
      localcTf = new cTf();
    }
    return localcTf;
  }
}