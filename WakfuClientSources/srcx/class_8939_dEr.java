final class dEr extends Mo
{
  private final cPS lMY;

  private dEr(byz parambyz, cPS paramcPS)
  {
    this.lMY = paramcPS;
    this.lMY.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Pas de modification de part ici.");
  }

  public void aT() {
    aJE localaJE = this.lMY.hHR;
    if (localaJE == null) {
      byz.t(this.iZ).setEnabled(false);
    } else {
      vH localvH1 = dJo.a(byz.t(this.iZ).bfc(), byz.t(this.iZ).bfb(), dDE.dft().VN());
      byz.t(this.iZ).setEnabled(true);
      byz.t(this.iZ).C(cYq.jq(localaJE.ejQ));
      byz.t(this.iZ).g(kb.J(localaJE.ejR));
      vH localvH2 = dJo.a(byz.t(this.iZ).bfc(), byz.t(this.iZ).bfb(), dDE.dft().VN());
      Rf.a(localvH2);
    }
  }
}