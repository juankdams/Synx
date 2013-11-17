public class bNx extends aaJ
{
  private static bNx gSs = new bNx();

  public static bNx bVf()
  {
    return gSs;
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId())
    {
    case 16152:
      cJo localcJo = (cJo)paramcWG;
      int i = localcJo.getIntValue();
      a(localcJo.cDz(), localcJo.getStringValue(), i == 0 ? -1 : i);
      return false;
    }

    return super.a(paramcWG);
  }

  protected String MK() {
    return "effectAreaDetailDialog";
  }

  public void k(int paramInt1, int paramInt2, short paramShort) {
    cSR localcSR = (cSR)this.cPa.get(paramInt1);
    if (localcSR == null)
      return;
    bwO localbwO = (bwO)localcSR.get(paramInt2);
    if (localbwO == null)
      return;
    localbwO.cb(paramShort);
    dLE.doY().a("describedState", localbwO, am(localbwO.bEu()));
    dLE.doY().a("describedStateLevel", Short.valueOf(localbwO.nU()), am(localbwO.bEu()));
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
      super.a(paramaqv, paramBoolean);
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
      super.b(paramaqv, paramBoolean);
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}