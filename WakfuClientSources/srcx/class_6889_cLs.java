import org.apache.log4j.Logger;

public class cLs extends bNz
{
  private static final aee bx = new bOO(new cpg());

  public static cLs a(dno paramdno)
  {
    cLs localcLs;
    try
    {
      localcLs = (cLs)bx.Mm();
      localcLs.aOr = bx;
    } catch (Exception localException) {
      K.error("Erreur lors d'un checkOut sur un message de type InventoryClearedEvent : " + localException.getMessage());
      localcLs = new cLs();
    }
    localcLs.a(paramdno, dzF.lGz);
    return localcLs;
  }

  public String ov()
  {
    dno localdno = bVh();
    if (!(localdno instanceof bXd)) {
      K.error("Log de type  " + getClass().getName() + " sur un inventaire non-loggable de type " + localdno.getClass().getName());
      return null;
    }
    String str = ((bXd)localdno).ov();
    return "clearedInventory=" + str;
  }
}