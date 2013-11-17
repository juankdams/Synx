class bBR
  implements aZh
{
  bBR(bMD parambMD)
  {
  }

  public void b(cEG paramcEG)
  {
    gA localgA = Hh.QM().eO(paramcEG.tc());
    dtY.k(localgA, paramcEG.nP());
    dLE.doY().a(this.gwf, new String[] { "currentInventoryView" });
  }

  public void c(cEG paramcEG) {
    gA localgA = Hh.QM().eO(paramcEG.tc());
    dtY.l(localgA, paramcEG.nP());
    dLE.doY().a(this.gwf, new String[] { "currentInventoryView" });
  }

  public void a(cEG paramcEG, int paramInt) {
    gA localgA = Hh.QM().eO(paramcEG.tc());
    if (paramInt > 0)
      dtY.k(localgA, (short)paramInt);
    else {
      dtY.l(localgA, (short)Math.abs(paramInt));
    }
    dLE.doY().a(this.gwf, new String[] { "currentInventoryView" });
  }
}