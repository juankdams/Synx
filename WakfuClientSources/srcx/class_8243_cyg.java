import org.apache.log4j.Logger;

public class cyg extends dfN
{
  private static bOO bf = new bOO(new rf());

  public cMb av()
  {
    aRL localaRL;
    try
    {
      localaRL = (aRL)bf.Mm();
      aRL.a(localaRL, bf);
    } catch (Exception localException) {
      aRL.i().error("Erreur lors de l'extraction d'un Door du pool", localException);
      localaRL = new aRL();
    }
    return localaRL;
  }
}