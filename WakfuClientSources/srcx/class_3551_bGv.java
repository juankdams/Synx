public final class bGv
  implements duc
{
  private final cYk gCX = new cYk();
  private boolean gCY = false;
  private Runnable gCZ;
  private final cMb gDa;

  public bGv(cMb paramcMb)
  {
    this.gDa = paramcMb;
  }

  public boolean bOr() {
    return this.gCY;
  }

  public cYk bOs() {
    return this.gCX;
  }

  public void bOt() {
    this.gCY = true;
    this.gCX.ae(this.gDa.ML());
    sM();
  }

  private void sM() {
    this.gDa.sM();
  }

  public void L(int paramInt1, int paramInt2, short paramShort) {
    this.gCX.ac(paramInt1, paramInt2, paramShort);
    sM();
  }

  public void bOu() {
    caH localcaH = new caH();
    localcaH.b(this.gDa.getId());
    localcaH.N(this.gCX);
    byv.bFN().aJK().d(localcaH);

    this.gCZ = new Rj(this);

    dka.cSF().a(this.gCZ, 1000L, 1);
    sM();
  }

  public void bOv() {
    this.gCX.reset();
    this.gCY = false;
    sM();
  }

  public void bOw() {
    if (this.gCZ != null) {
      dka.cSF().j(this.gCZ);
      this.gCZ = null;
    }
  }

  public void clear() {
    this.gCY = false;
    this.gCZ = null;
  }
}