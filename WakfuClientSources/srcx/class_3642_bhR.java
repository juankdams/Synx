import org.apache.log4j.Logger;

public class bhR extends acS
  implements ZF
{
  private static final Logger K = Logger.getLogger(bhR.class);
  private static final String fwJ = "SpellZoneEffect";
  private static final String fwK = "SpellRange";
  private static final String fwL = "SpellRangeWithConstraint";
  private static final String fwM = "SpellRangeWithoutLOS";
  private static final String fwN = "SpellEmptyCellsNeeded";
  private apX dpp;
  private static final String fwO = "forbidden.tga";
  private static final String fwP = "notinLOS.tga";
  private static final bhR fwQ = new bhR();

  public static bhR btU() {
    return fwQ;
  }

  private bhR() {
    super("SpellRange", clP.hOX, "SpellZoneEffect", clP.hOV, "SpellRangeWithConstraint", clP.hOY, "SpellRangeWithoutLOS", clP.hOZ, "SpellEmptyCellsNeeded", clP.hOW);
  }

  public void a(apX paramapX, Su paramSu)
  {
    this.dpp = paramapX;

    E(paramSu);

    this.dpp = null;
  }

  public void a(Ce paramCe, Su paramSu, cYk paramcYk) {
    if (((paramCe instanceof apX)) && 
      (((dSR)((apX)paramCe).bsL()).vz())) {
      p(paramcYk);
      return;
    }

    super.a(paramCe, paramSu, paramcYk);
  }

  protected dif a(cYk paramcYk, Su paramSu)
  {
    switch (cjB.ayL[paramSu.aeQ().a(paramSu, this.dpp, paramcYk, true).ordinal()])
    {
    case 1:
    case 2:
      return dif.ldK;
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
      if (this.cTh != null) {
        this.cTh.a(str, dn.Tq);
      }
      str = ay.bd().getString("highLightGfxPath") + "notinLOS.tga";
      if (this.cTg != null)
        this.cTg.a(str, dn.Tq);
    }
    catch (Exception localException) {
      K.error(localException);
    }
  }
}