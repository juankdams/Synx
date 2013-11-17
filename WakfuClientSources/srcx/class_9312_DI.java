public class DI extends aaJ
{
  private static DI bIA = new DI();

  public static DI MJ()
  {
    return bIA;
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId())
    {
    case 16151:
      cjZ localcjZ = (cjZ)paramcWG;
      int i = localcjZ.getIntValue();
      a(localcjZ.cme(), localcjZ.getStringValue(), i == 0 ? -1 : i);
      return false;
    }

    return super.a(paramcWG);
  }

  protected String MK() {
    return "stateDetailDialog";
  }

  public void k(int paramInt1, int paramInt2, short paramShort) {
    cSR localcSR = (cSR)this.cPa.get(paramInt1);
    if (localcSR == null)
      return;
    bXU localbXU = (bXU)localcSR.get(paramInt2);
    if (localbXU == null)
      return;
    localbXU.cb(paramShort);

    dLE.doY().a("describedState", localbXU, am(localbXU.bQW()));
    dLE.doY().a("describedStateLevel", Short.valueOf(localbXU.nU()), am(localbXU.bQW()));
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