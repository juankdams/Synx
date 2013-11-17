import org.apache.log4j.Logger;

public class cco
{
  protected static final Logger K = Logger.getLogger(cco.class);
  public static final String PACKAGE = "wakfu.timeline";

  public static void displayNextFighterInTimeline(cSx paramcSx, ccG paramccG)
  {
    paramccG.setOffset(paramccG.getOffset() + 1.0F);
  }

  public static void displayPreviousFighterInTimeline(cSx paramcSx, ccG paramccG)
  {
    paramccG.setOffset(paramccG.getOffset() - 1.0F);
  }

  public static void openCloseSecondTimeline(cSx paramcSx)
  {
    bzu.cf((short)18100);
  }

  public static void openCloseStateBar(cSx paramcSx)
  {
    bzu.cf((short)18101);
  }

  public static void selectFighterInTimeline(dMr paramdMr, Su paramSu) {
    if (paramdMr.mp() == CH.bGu)
      if (paramdMr.getButton() == 1) {
        if (!byv.bFN().c(cmI.cnw())) {
          return;
        }
        cMt localcMt = cmI.cnw().cny();
        if (!byv.bFN().c(localcMt)) {
          return;
        }
        if (paramSu.afp()) {
          cYk localcYk = aO(paramSu);
          axB.aIZ(); axB.t(localcYk != null ? localcYk : paramSu.ML());
          localcMt.cFv();
        }
      } else if (paramdMr.getButton() == 3) {
        aKj.bbx().ah(paramSu);
      }
  }

  private static cYk aO(Su paramSu)
  {
    int i = paramSu.afD();
    Object localObject = null;
    if (i > 0) {
      Su localSu = cmI.cnw().boc();
      if ((localSu != null) && (localSu.adL().aeI())) {
        cYk localcYk1 = localSu.ML();
        for (int j = -i; j < i + 1; j++) {
          for (int k = -i; k < i + 1; k++) {
            cYk localcYk2 = new cYk(paramSu.fa() + j, paramSu.fb() + k);
            if ((localObject == null) || (localObject.ac(localcYk1) >= localcYk2.ac(localcYk1)))
              localObject = localcYk2;
          }
        }
      }
    }
    return localObject;
  }

  public static void highlightFighterInTimeline(cSx paramcSx, Su paramSu) {
    if ((paramSu != null) && (paramSu.adI() != null)) {
      dLE.doY().t("fight.describedFighter", paramSu);
      if (byv.bFN().c(axB.aIZ())) {
        cYk localcYk = aO(paramSu);
        axB.aIZ().cX(true);
        paramSu.aeQ().aDp().b(paramSu, true);
        if (paramSu.afp()) {
          axB.aIZ(); axB.t(localcYk != null ? localcYk : paramSu.ML());
        }
      }
    }
  }

  public static void unhighlightFighterInTimeline(cSx paramcSx, Su paramSu) {
    if ((paramSu != null) && (paramSu.adI() != null)) {
      dLE.doY().t("fight.describedFighter", null);
      paramSu.aeQ().aDp().b(paramSu, false);
      axB.aIZ().cX(false);
    }
  }

  public static void onFighterClick(cEv paramcEv) {
    aKj.bbx().ah((Su)paramcEv.getItemValue());
  }
}