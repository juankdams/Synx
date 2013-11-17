class GR
  implements dUd
{
  int bPg;
  int bPh;
  int kr;
  int kO;
  int kP;

  public GR(biy parambiy, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.bPg = paramInt1;
    this.bPh = paramInt2;
    this.kr = paramInt3;
    this.kO = paramInt4;
    this.kP = paramInt5;
  }

  public boolean a(cWG paramcWG)
  {
    if (this.bPi.isUnloading()) {
      return false;
    }
    this.bPi.getAppearance().dgV();
    dMr localdMr = dMr.dpk();
    localdMr.nS(this.bPg);
    localdMr.CW(this.bPh);
    localdMr.setModifiers(this.kr);
    localdMr.setScreenX(this.kO);
    localdMr.setScreenY(this.kP);
    localdMr.q(this.bPi);
    localdMr.b(CH.bGw);
    this.bPi.g(localdMr);
    return false;
  }

  public long getId()
  {
    return 1L;
  }

  public void a(long paramLong)
  {
  }
}