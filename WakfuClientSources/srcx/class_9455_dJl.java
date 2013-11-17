import org.apache.log4j.Logger;

public class dJl extends acS
  implements ZF
{
  private static final Logger K = Logger.getLogger(dJl.class);
  private static final String fwJ = "ItemZoneEffect";
  private static final String fwK = "ItemRange";
  private static final String fwL = "ItemRangeWithConstraint";
  private static final String fwM = "ItemRangeWithoutLOS";
  private static final String fwN = "ItemEmptyCellsNeeded";
  private gA lUO;
  private static final String fwO = "forbidden.tga";
  private static final String fwP = "notinLOS.tga";
  private static final dJl lUP = new dJl();

  public static dJl diE() {
    return lUP;
  }

  private dJl() {
    super("ItemRange", clP.hOX, "ItemZoneEffect", clP.hOV, "ItemRangeWithConstraint", clP.hOY, "ItemRangeWithoutLOS", clP.hOZ, "ItemEmptyCellsNeeded", clP.hOW);
  }

  public void a(gA paramgA, Su paramSu) {
    this.lUO = paramgA;

    E(paramSu);

    this.lUO = null;
  }

  protected dif a(cYk paramcYk, Su paramSu)
  {
    switch (et.ayL[paramSu.aeQ().a(paramSu, this.lUO, paramcYk, true).ordinal()])
    {
    case 1:
      return dif.ldK;
    case 2:
      return dif.ldL;
    case 3:
      return dif.ldM;
    case 4:
      return dif.ldN;
    }

    return dif.ldO;
  }

  public void update()
  {
    try
    {
      String str = ay.bd().getString("highLightGfxPath") + "forbidden.tga";
      this.cTh.a(str, dn.Tp);

      str = ay.bd().getString("highLightGfxPath") + "notinLOS.tga";
      this.cTg.a(str, dn.Tq);
    } catch (Exception localException) {
      K.error(localException);
    }
  }
}