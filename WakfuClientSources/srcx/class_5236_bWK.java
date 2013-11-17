import org.apache.log4j.Logger;

public class bWK extends dfN
{
  public static bOO bf = new bOO(new WE());

  public cWw ajb()
  {
    cWw localcWw;
    try
    {
      localcWw = (cWw)bf.Mm();
      cWw.a(localcWw, bf);
    } catch (Exception localException) {
      cWw.i().error("Erreur lors de l'extraction d'une Collector du pool", localException);
      localcWw = new cWw();
    }
    return localcWw;
  }
}