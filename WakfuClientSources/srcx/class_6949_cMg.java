final class cMg
  implements btE
{
  private boolean kro = true;
  private boolean krp = false;

  public void J(Su paramSu) {
    dAn.bE(paramSu);
  }

  public void ag(Su paramSu) {
    dAn.bD(paramSu);
  }

  public void a(ckT paramckT, cjK paramcjK) {
  }

  public void b(ckT paramckT, cjK paramcjK) {
  }

  public void c(ckT paramckT, cjK paramcjK) {
  }

  public void iA(boolean paramBoolean) {
    this.kro = paramBoolean;
  }

  public boolean aMI() {
    return this.kro;
  }

  public void setBorderVisible(boolean paramBoolean) {
    this.krp = paramBoolean;
  }

  public boolean aMJ() {
    return false;
  }

  public void d(czN paramczN) {
    c(paramczN);
  }

  public void c(ckT paramckT) {
    dAn.b(paramckT, VO.cAW);
    dAn.t(paramckT);
    dAn.ddD();
    if (this.krp) {
      dAn.x(paramckT);
      dAn.v(paramckT);
    } else {
      dAn.w(paramckT);
      dAn.u(paramckT);
    }
    dAn.s(paramckT);
  }
}