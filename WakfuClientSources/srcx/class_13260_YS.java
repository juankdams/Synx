import org.apache.log4j.Logger;

public class YS extends bNz
{
  protected dsj cJX;
  protected short cJY;
  protected short aFe;
  private static final aee bx = new bOO(new bVu());

  public static YS c(dno paramdno, dsj paramdsj)
  {
    return a(paramdno, dzF.lGs, paramdsj, (short)0);
  }

  public static YS b(dno paramdno, dsj paramdsj, short paramShort) {
    return a(paramdno, dzF.lGt, paramdsj, paramShort);
  }

  public static YS c(dno paramdno, dsj paramdsj, short paramShort) {
    return a(paramdno, dzF.lGw, paramdsj, (short)0, paramShort);
  }

  public static YS a(dno paramdno, dsj paramdsj, short paramShort1, short paramShort2) {
    return a(paramdno, dzF.lGw, paramdsj, paramShort1, paramShort2);
  }

  public static YS d(dno paramdno, dsj paramdsj, short paramShort) {
    return a(paramdno, dzF.lGx, paramdsj, paramShort);
  }

  public static YS e(dno paramdno, dsj paramdsj, short paramShort) {
    return a(paramdno, dzF.lGy, paramdsj, paramShort);
  }

  public static YS d(dno paramdno, dsj paramdsj) {
    return a(paramdno, dzF.lGu, paramdsj, (short)0);
  }

  public static YS f(dno paramdno, dsj paramdsj, short paramShort) {
    return a(paramdno, dzF.lGv, paramdsj, paramShort);
  }

  static YS a(dno paramdno, dzF paramdzF, dsj paramdsj, short paramShort) {
    return a(paramdno, paramdzF, paramdsj, paramShort, (short)-1);
  }

  static YS a(dno paramdno, dzF paramdzF, dsj paramdsj, short paramShort1, short paramShort2) {
    YS localYS;
    try {
      localYS = (YS)bx.Mm();
      localYS.aOr = bx;
    } catch (Exception localException) {
      K.error("Erreur lors d'un checkOut sur un message de type InventoryItemModifiedEvent : " + localException.getMessage());
      localYS = new YS();
    }
    localYS.a(paramdno, paramdzF);
    localYS.cJX = paramdsj;
    localYS.cJY = paramShort1;
    localYS.aFe = paramShort2;
    return localYS;
  }

  public dsj akr()
  {
    return this.cJX;
  }

  public short aks()
  {
    return this.cJY;
  }

  public short nP() {
    return this.aFe;
  }

  public String ov()
  {
    dsj localdsj = akr();
    if (!(localdsj instanceof bXd)) {
      K.error("Log de type " + getClass().getName() + " sur un InventoryItemModifiedEvent d'un item de type non-loggable : " + localdsj.getClass().getName());
      return null;
    }
    String str = ((bXd)localdsj).ov();

    switch (bVt.aOs[bVg().ordinal()]) {
    case 1:
    case 2:
      return "itemAcquired=" + str;
    case 3:
      return "itemPriceChange=" + str;
    case 4:
      return "itemPackSizeChange=" + str;
    case 5:
      return "itemQuantityModified=" + str + " quantity=" + nP();
    case 6:
    case 7:
      return "itemLost=" + str;
    }
    K.error("Log de type " + getClass().getName() + " sur un InventoryItemModifiedEvent d'action " + bVg() + " inconnue");
    return null;
  }
}