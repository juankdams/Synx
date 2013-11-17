class dRP
  implements cvW
{
  private final bKm mnv;
  private Qh mnw;
  private dwo mnx;

  dRP(bKm parambKm)
  {
    this.mnv = parambKm;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    byz localbyz = byv.bFN().bFO();
    this.mnw = new VD(this, localbyz);

    this.mnx = new VC(this);

    this.mnv.aeL().a(this.mnw);
    localbyz.a(this.mnx);
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    this.mnv.aeL().b(this.mnw);
    byv.bFN().bFO().b(this.mnx);
    this.mnw = null;
    this.mnx = null;
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 19992:
    case 19995:
      byv.bFN().b(this);
      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}