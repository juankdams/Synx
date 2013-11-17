final class qN extends Mo
{
  private final bvL aYc;

  qN(bKm parambKm, bvL parambvL)
  {
    this.aYc = parambvL;
    this.aYc.ao().a(this);
  }

  public void aS() {
    this.aYc.bUn = bKm.l(this.aHq);
    this.aYc.ggk = this.aHq.fCH;
    this.aYc.ggn = this.aHq.fCK;
    this.aYc.ggl = this.aHq.fCI;
    this.aYc.ggo = this.aHq.fCL;
    this.aYc.ggm = this.aHq.fCJ;
    this.aYc.cHd = this.aHq.afn();
    this.aYc.cHe = this.aHq.afo();
    this.aYc.ggp = this.aHq.bSl();
  }

  public void aT() {
    for (azg localazg : bKm.m(this.aHq)) {
      localazg.G(this.aHq);
    }

    this.aHq.cO(this.aYc.bUn);
    this.aHq.a(this.aYc.ggk, this.aYc.ggn, true);
    this.aHq.b(this.aYc.ggl, this.aYc.ggo, true);
    this.aHq.m(this.aYc.ggm, true);
    this.aHq.aei();
    this.aHq.e(this.aYc.cHd, false);
    this.aHq.f(this.aYc.cHe, false);
    this.aHq.aej();
    this.aHq.bA(this.aYc.ggp);
  }
}