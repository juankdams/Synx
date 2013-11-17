import org.apache.log4j.Logger;

public class cEp extends dfN
{
  private static final bOO bf = new bOO(new ahh());

  public aLW asN()
  {
    aLW localaLW;
    try
    {
      localaLW = (aLW)bf.Mm();
      aLW.a(localaLW, bf);
    } catch (Exception localException) {
      aLW.i().error("Erreur lors de l'extraction d'un CharacterStatueViewFactory du pool", localException);
      localaLW = new aLW();
    }
    return localaLW;
  }
}