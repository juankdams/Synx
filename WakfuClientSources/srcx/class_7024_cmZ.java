import java.util.Collection;
import java.util.Iterator;

public class cmZ
  implements cvW
{
  private static cmZ hSU = new cmZ();

  public static cmZ cnK()
  {
    return hSU;
  }

  public boolean a(cWG paramcWG)
  {
    dCZ localdCZ;
    dHb localdHb;
    switch (paramcWG.getId())
    {
    case 16500:
      localdCZ = (dCZ)paramcWG;

      localdHb = localdCZ.dff();
      cBQ.cxL().coO().czu().t("worldChoice.selectedWorldReference", localdHb);
      cBQ.cxL().coO().czu().t("worldChoice.overWorldReference", null);

      return false;
    case 16501:
      localdCZ = (dCZ)paramcWG;

      localdHb = localdCZ.dff();
      if (localdHb != null) {
        if (!localdHb.isFull()) {
          a(localdHb, "loadingCharacterList.progress");
        }
        else {
          cKX localcKX = cBQ.cxL().a(bU.fH().getString("question.enterInQueue"), Cn.et(0), 2073L, 102, 1);

          localcKX.a(new baq(this, localdHb));
        }

      }

      return false;
    }

    return true;
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      bQK.bXG().bXI();

      if (!bbf.bpt().cnp().isEmpty()) {
        dLE.doY().t("worldChoice.selectedWorldReference", bbf.bpt().cnp().iterator().next());
        dLE.doY().t("worldChoice.overWorldReference", null);
      }

      cBQ.cxL().a("worldChoiceDialog", VV.dJ("worldChoiceDialog"), 8192L, (short)10000);

      cBQ.cxL().j("wakfu.worldChoice", aQu.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      dLE.doY().removeProperty("worldChoice.selectedWorldReference");

      cBQ.cxL().mW("worldChoiceDialog");

      cBQ.cxL().mN("wakfu.worldChoice");
    }
  }

  private void a(dHb paramdHb, String paramString)
  {
    ckU.cmE().ak(true).g(bU.fH().getString(paramString), 0);

    bKt localbKt = new bKt();
    localbKt.sH(paramdHb.getId());
    byv.bFN().aJK().d(localbKt);

    cAo.cxf().a(aVQ.blh(), 10000L, 1, 1);
  }
}