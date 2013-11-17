public class ff
  implements cvW
{
  private static ff aCc = new ff();

  public static ff me()
  {
    return aCc;
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId())
    {
    case 16821:
      if (byv.bFN().bFO().aeQ() != null) {
        return false;
      }

      if (cBQ.cxL().mZ("splitStackDialog")) {
        cBQ.cxL().mW("splitStackDialog");
      }
      czW localczW = (czW)paramcWG;
      int i = localczW.nx();
      int j = localczW.ny();

      i = (short)(int)Math.max(0.0F, Math.min(i, cBQ.cxL().cxS().MH() - 100.0F));
      j = (short)(int)Math.max(0.0F, Math.min(j, cBQ.cxL().cxS().MI() - 50.0F));

      cBQ.cxL().a("splitStackDialog", VV.dJ("splitStackDialog"), null, false, i, j, 257L, (short)20000);

      dLE.doY().t("itemToSplit", Short.valueOf((short)(localczW.getItem() != null ? localczW.getItem().nP() : 0)));

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
      cBQ.cxL().j("wakfu.split", aTs.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      cBQ.cxL().mN("wakfu.split");
      cBQ.cxL().mW("splitStackDialog");
      dLE.doY().removeProperty("itemToSplit");
    }
  }
}