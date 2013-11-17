class ahv
  implements cfI, Runnable
{
  private gA ddg;
  private aCu ddh;

  private ahv(aCg paramaCg, gA paramgA)
  {
    this.ddg = paramgA;
    cUb localcUb = this.ddg.nJ();
    this.ddh = new aCu(this.ddg);

    localcUb.c(this);
    cYq localcYq = new cYq(localcUb.cJm());
    dxL localdxL = dDE.dft().VN();
    kb localkb1 = localcYq.V(localdxL);
    kb localkb2 = new kb(localcUb.cJh().MD());
    int i = localkb1.d(localkb2);
    localkb2.bi(i + 1);
    localcYq.n(localkb2);
    long l = localdxL.V(localcYq).rO();
    dka.cSF().a(this, l * 1000L, 1);
  }

  public void run() {
    this.ddh.lS(Math.max(0, this.ddg.nJ().aGa() - 1));
    this.ddi.E(this.ddg);
    aum();
  }

  private void aum() {
    dka.cSF().j(this);
    dka.cSF().a(this, this.ddg.nJ().cJh().MD().rO() * 1000L, 1);
  }

  public void eu(String paramString) {
  }

  public void ih(int paramInt) {
  }

  public void ii(int paramInt) {
  }

  public void ij(int paramInt) {
    if (paramInt == 0) {
      this.ddi.D(this.ddg);
    }
    dLE.doY().a(this.ddg, this.ddg.getFields());
    aun();
  }

  public void ik(int paramInt) {
  }

  public void aT(byte paramByte) {
  }

  public void n(dxL paramdxL) {
  }

  public void o(dxL paramdxL) {
    aum();
  }

  public void p(dxL paramdxL) {
    cUb localcUb = this.ddg.nJ();
    if (localcUb.aGa() == 0) {
      return;
    }
    if (aCg.a(this.ddi, localcUb) > 0)
      aCg.aOq().E(this.ddg);
  }

  public void q(dxL paramdxL)
  {
  }

  public void il(int paramInt) {
    aun();
  }

  public void aun() {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return;
    }
    gA localgA = (gA)localbyz.ayJ().dB((short)azO.dRT.hV);
    if ((localgA != null) && (localgA == this.ddg)) {
      localbyz.ayD();
      localbyz.bGB();
    }
  }

  public void ahZ() {
    dka.cSF().j(this);
  }
}