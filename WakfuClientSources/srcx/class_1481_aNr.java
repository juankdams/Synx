import org.apache.log4j.Logger;

public class aNr extends dfN
{
  private static bOO bf = new bOO(new dbB());

  public cMb av()
  {
    bvd localbvd;
    try
    {
      localbvd = (bvd)bf.Mm();
      bvd.a(localbvd, bf);
    } catch (Exception localException) {
      bvd.i().error("Erreur lors de l'extraction d'un Board du pool", localException);
      localbvd = new bvd();
    }
    return localbvd;
  }
}