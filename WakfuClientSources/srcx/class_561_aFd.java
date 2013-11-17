import org.apache.log4j.Logger;

public class aFd extends dfN
{
  private static bOO bf = new bOO(new Ky());

  public cMb av()
  {
    cyt localcyt;
    try
    {
      localcyt = (cyt)bf.Mm();
      cyt.a(localcyt, bf);
    } catch (Exception localException) {
      cyt.an().error("Erreur lors de l'extraction d'un Lever du pool", localException);
      localcyt = new cyt(null);
    }
    return localcyt;
  }
}