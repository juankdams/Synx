import org.apache.log4j.Logger;

public class biN extends dfN
{
  private static final bOO bf = new bOO(new dGV());

  public aRN buH()
  {
    aRN localaRN;
    try
    {
      localaRN = (aRN)bf.Mm();
      aRN.a(localaRN, bf);
    } catch (Exception localException) {
      aRN.i().error("Erreur lors de l'extraction d'un CharacterStatueViewFactory du pool", localException);
      localaRN = new aRN();
    }
    return localaRN;
  }
}