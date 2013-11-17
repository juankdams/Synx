public class dRM
  implements bX, dNP
{
  private final bKm gRm;
  private final cUb aFh;
  private bGy flq;
  private adR mnt;
  private final cfI mnu = new akU(this);

  public dRM(bKm parambKm, cUb paramcUb) {
    this.gRm = parambKm;
    this.aFh = paramcUb;
    initialize();
  }

  private void initialize() {
    if ((!bB) && (!this.gRm.aeF())) throw new AssertionError();
    cew localcew = this.gRm.aeL();
    this.flq = new bGy(localcew);

    this.flq.jz(this.aFh.cJh().asS());
    this.flq.c(localcew.E());
    this.flq.eq("AnimStatique");
    this.flq.a(dFc.dgE());
    this.flq.id(dLw.mbl.asR());
    this.flq.fR((byte)8);
    this.flq.setVisible(true);
    bQK.bXG().d(this.flq);
    this.flq.a(this.aFh.cJj());
    bBn localbBn = Hh.QM().dh(this.aFh.cJk());
    if (localbBn != null) {
      this.flq.rT(localbBn.oc());
    }
    this.flq.asZ();

    this.mnt = new adR(this.flq);
    localcew.a(this.mnt);
    localcew.a(this.mnt);
    cYk localcYk = adR.w(localcew.dpB(), localcew.dpC(), localcew.dpD());
    this.flq.k(localcYk.getX(), localcYk.getY(), localcYk.IB());

    this.aFh.c(this.mnu);
  }

  public void detach() {
    cUo localcUo = this.flq.cJG();
    if (localcUo != null) {
      localcUo.o(this.flq);
    }
    bQK.bXG().gX(this.flq.getId());
    this.flq.dispose();
    this.flq = null;

    if (this.gRm.aeF()) {
      cew localcew = this.gRm.aeL();
      localcew.b(this.mnt);
      localcew.b(this.mnt);
    }
    this.mnt = null;

    this.aFh.d(this.mnu);
  }

  public void b(boolean paramBoolean, dnS paramdnS)
  {
    if ((this.flq == null) || (paramdnS != dnS.log)) {
      return;
    }

    int i = this.aFh.aGa() > 0 ? 1 : 0;
    int j = (this.aFh.cJq() <= 0) && (this.aFh.cJr().avJ()) ? 1 : 0;
    this.flq.setVisible((paramBoolean) && (i != 0) && (j != 0));
  }

  public boolean nI()
  {
    return true;
  }

  public cUb nJ() {
    return this.aFh;
  }

  public long oj() {
    return this.flq.getId();
  }

  public bAF dsz() {
    return this.flq;
  }

  public String toString()
  {
    return "ServerPetHandlerListener{m_player=" + this.gRm + '}';
  }
}