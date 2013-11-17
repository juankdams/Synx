import org.apache.log4j.Logger;

public class cHZ extends dfN
{
  private static bOO bf = new bOO(new brQ());

  public cMb av()
  {
    rb localrb;
    try
    {
      localrb = (rb)bf.Mm();
      rb.a(localrb, bf);
    } catch (Exception localException) {
      rb.an().error("Erreur lors de l'extraction d'un " + rb.class.getName() + " du pool", localException);
      localrb = new rb();
    }
    return localrb;
  }
}