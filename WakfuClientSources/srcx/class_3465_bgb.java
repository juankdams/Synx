import org.apache.log4j.Logger;

public class bgb extends dfN
{
  private static final bOO bf = new bOO(new alH());

  public cMb av()
  {
    aEq localaEq;
    try
    {
      localaEq = (aEq)bf.Mm();
      aEq.a(localaEq, bf);
    } catch (Exception localException) {
      aEq.an().error("Erreur lors de l'extraction d'un " + aEq.class.getName() + " du pool", localException);
      localaEq = new aEq();
    }
    return localaEq;
  }
}