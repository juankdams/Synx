import org.apache.log4j.Logger;

public final class ceq extends apM
{
  private static final aee bx = new bOO(new buN());
  private static final short hyH = 2349;
  private static final short bXT = 4;

  public ceq cgM()
  {
    ceq localceq;
    try
    {
      localceq = (ceq)bx.Mm();
      localceq.aOr = bx;
    } catch (Exception localException) {
      localceq = new ceq();
      localceq.aOr = null;
      localceq.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SummonDoubleForIceStatue : " + localException.getMessage());
    }
    return localceq;
  }

  protected EU VP()
  {
    EU localEU = new EU(dTC.dtz(), bSs.gxY);
    localEU.F((short)2349);
    localEU.G((short)4);
    localEU.az(false);
    return localEU;
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