import org.apache.log4j.Logger;

public final class Lm extends apM
{
  private static final aee bx = new bOO(new uf());
  public static final short bXS = 1550;
  private static final short bXT = 20;
  private static final short bXU = 5;

  public Lm VO()
  {
    Lm localLm;
    try
    {
      localLm = (Lm)bx.Mm();
      localLm.aOr = bx;
    } catch (Exception localException) {
      localLm = new Lm();
      localLm.aOr = null;
      localLm.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SummonSramDouble : " + localException.getMessage());
    }
    return localLm;
  }

  protected EU VP()
  {
    EU localEU = new EU(bIS.bQr(), dGo.gxY);

    localEU.F((short)1550);
    localEU.b((short)20, (short)-1, (short)5);
    localEU.az(true);
    return localEU;
  }
}