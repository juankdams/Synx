import org.apache.log4j.Logger;

public final class aVD extends apM
{
  private static final aee bx = new bOO(new aUH());
  public static final short eXG = 1549;
  private static final short bXT = 3;

  public aVD bld()
  {
    aVD localaVD;
    try
    {
      localaVD = (aVD)bx.Mm();
      localaVD.aOr = bx;
    } catch (Exception localException) {
      localaVD = new aVD();
      localaVD.aOr = null;
      localaVD.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SummonDoubleForBellaphone : " + localException.getMessage());
    }
    return localaVD;
  }

  protected EU VP()
  {
    EU localEU = new EU(aHv.aTp(), bSs.gxY);
    localEU.F((short)1549);
    localEU.G((short)3);
    localEU.az(false);
    localEU.aA(true);
    return localEU;
  }

  protected cYk aBI()
  {
    dhJ localdhJ = aBG();
    if (localdhJ == null) {
      return null;
    }
    return localdhJ.ML();
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }
}