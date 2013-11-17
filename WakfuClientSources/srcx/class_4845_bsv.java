import org.apache.log4j.Logger;

public class bsv extends dfN
{
  private static bOO bf = new bOO(new wd());

  public cMb av()
  {
    aAG localaAG;
    try
    {
      localaAG = (aAG)bf.Mm();
      aAG.a(localaAG, bf);
    } catch (Exception localException) {
      aAG.i().error("Erreur lors de l'extraction d'un " + aAG.class.getName() + " du pool", localException);
      localaAG = new aAG();
    }
    return localaAG;
  }
}