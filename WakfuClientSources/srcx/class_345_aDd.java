public class aDd
  implements cvW
{
  private static aDd dXO = new aDd();

  public static aDd aPo() {
    return dXO;
  }

  public boolean a(cWG paramcWG) {
    paramcWG.getId();

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    dLE.doY().t("isInFightPlacement", Boolean.valueOf(byv.bFN().c(Ca.Lc())));
    dLE.doY().t("isInFightPlayerTurn", Boolean.valueOf(true));
  }

  private void br(String paramString) {
    cpa localcpa = cBQ.cxL().coO().nf(paramString);
    if (localcpa != null) {
      dOc localdOc = (dOc)localcpa.fi("apsContainer");
      localdOc.setVisible(false);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      br("worldAndFightBarDialog");

      dLE.doY().t("isInFightPlayerTurn", Boolean.valueOf(false));
    }
  }
}