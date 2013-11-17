import org.apache.log4j.Logger;

public class dvB extends bNz
{
  private static final aee bx = new bOO(new Ji());

  public static dvB b(dno paramdno)
  {
    dvB localdvB;
    try
    {
      localdvB = (dvB)bx.Mm();
      localdvB.aOr = bx;
    } catch (Exception localException) {
      K.error("Erreur lors d'un checkOut sur un message de type InventoryClearedEvent : " + localException.getMessage());
      localdvB = new dvB();
    }
    localdvB.a(paramdno, dzF.lGA);
    return localdvB;
  }

  public String ov()
  {
    dno localdno = bVh();
    if (!(localdno instanceof bXd)) {
      K.error("Log de type  " + getClass().getName() + " sur un inventaire non-loggable de type " + localdno.getClass().getName());
      return null;
    }
    String str = ((bXd)localdno).ov();
    return "LockedInventory=" + localdno.isLocked() + " : " + str;
  }
}