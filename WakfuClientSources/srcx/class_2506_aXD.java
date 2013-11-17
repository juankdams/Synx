import org.apache.log4j.Logger;

public class aXD extends dfN
{
  private static bOO bf = new bOO(new aHF());

  public cMb av()
  {
    bNT localbNT;
    try
    {
      localbNT = (bNT)bf.Mm();
      bNT.a(localbNT, bf);
    } catch (Exception localException) {
      bNT.i().error("Erreur lors de l'extraction d'un DimensionalBagAdminConsole du pool", localException);
      localbNT = new bNT();
    }
    return localbNT;
  }
}