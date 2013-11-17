import org.apache.log4j.Logger;

public final class dVj extends apM
{
  private static final aee bx = new bOO(new bYS());
  public static final short mub = 2382;
  private static final short bXT = 20;
  private static final short bXU = 5;

  public dVj dvm()
  {
    dVj localdVj;
    try
    {
      localdVj = (dVj)bx.Mm();
      localdVj.aOr = bx;
    } catch (Exception localException) {
      localdVj = new dVj();
      localdVj.aOr = null;
      localdVj.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SummonZobalDouble : " + localException.getMessage());
    }
    return localdVj;
  }

  protected EU VP()
  {
    EU localEU = new EU(bIS.bQr(), dGo.gxY);

    localEU.F((short)2382);
    localEU.b((short)20, (short)-1, (short)5);
    localEU.az(true);
    localEU.aB(false);
    return localEU;
  }
}