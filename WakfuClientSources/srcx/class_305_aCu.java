public class aCu
{
  private final dNP dXf;

  public aCu(dNP paramdNP)
  {
    this.dXf = paramdNP;
  }

  public final void setName(String paramString)
  {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    if (paramString.equals(localdAg.getName())) {
      throw new bvZ("Le changement de nom demandé est identique à l'ancien");
    }
    int i = !aiN.avC().eA(paramString) ? 1 : 0;
    if (i != 0) {
      throw new bvZ("Nom de familier " + paramString + " invalidé par le " + aiN.class.getSimpleName());
    }
    localdAg.setName(paramString);
  }

  public final void by(byte paramByte) {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    if (paramByte > localdAg.cJh().aGf()) {
      throw new bvZ("Plus de combat disponible aujourd'hui");
    }
    if (paramByte > 0) {
      dxL localdxL = dDE.dft().VN();
      cYq localcYq = localdAg.ddl();
      kb localkb = localcYq.V(localdxL);
      if (localkb.b(localdAg.cJh().cTi())) {
        throw new bvZ("L'Interval de temps maximal est atteint, il faut reset le conteur à 0");
      }
    }
    localdAg.by(paramByte);
  }

  public final void t(dxL paramdxL) {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    localdAg.t(paramdxL);
  }

  public final void hk(int paramInt) {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    localdAg.hk(paramInt);
  }

  public final void u(dxL paramdxL) {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    localdAg.u(paramdxL);
  }

  public final void aOH() {
    v(dDE.dft().VN());
  }

  public final void v(dxL paramdxL)
  {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    localdAg.v(paramdxL);
  }

  public final void lR(int paramInt) {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    if (localdAg.cJk() > 0)
      throw new bvZ("Le familier est déjà équipé de l'item " + localdAg.cJk());
    if (!localdAg.cJh().AA(paramInt)) {
      throw new bvZ("On ne peut pas équiper le familier avec l'item " + paramInt);
    }
    localdAg.Ce(paramInt);
  }

  public final void aOI() {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    if (localdAg.cJk() <= 0) {
      throw new bvZ("Le Familier n'a pas d'équipement");
    }
    localdAg.Ce(0);
  }

  public final void lS(int paramInt) {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    localdAg.lS(paramInt);
  }

  public void lT(int paramInt) {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    if (!localdAg.cJh().AB(paramInt)) {
      throw new bvZ("On ne peut appliquer de couleur sur le familier avec l'item " + paramInt);
    }
    localdAg.Cd(paramInt);
  }

  public final void lU(int paramInt) {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    if (localdAg.cJs())
      throw new bvZ("Le familier est déjà endormi");
    if (localdAg.cJq() > 0)
      throw new bvZ("Le familier est déjà endormi par l'item " + localdAg.cJq());
    if (!localdAg.cJh().Aw(paramInt)) {
      throw new bvZ("On ne peut pas endormir le familier avec l'item " + paramInt);
    }
    localdAg.lU(paramInt);
  }

  public final void w(dxL paramdxL) {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    if (localdAg.cJs())
      throw new bvZ("Le familier est déjà endormi");
    if (!localdAg.cJr().avJ()) {
      throw new bvZ("Le familier est déjà endormi depuis " + localdAg.cJr());
    }
    dxL localdxL = dDE.dft().VN();
    cds localcds = localdAg.cJh().Ax(localdAg.cJq());
    cYq localcYq = new cYq(paramdxL);
    localcYq.n(localcds);
    if (localcYq.Q(localdxL)) {
      throw new bvZ("Impossible de redéfinir une date se terminant dans le passé");
    }
    localdAg.w(paramdxL);
  }

  public final void aOJ() {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    localdAg.lU(0);
  }

  public final void aOK() {
    if (!this.dXf.nI()) {
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    }
    dAg localdAg = (dAg)this.dXf.nJ();
    localdAg.w(cYq.kLU);
  }

  protected void a(cfI paramcfI)
  {
    if (!this.dXf.nI())
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    this.dXf.nJ().c(paramcfI);
  }

  protected void b(cfI paramcfI) {
    if (!this.dXf.nI())
      throw new ml("Il n'y a aucun pet avec lequel interagir");
    this.dXf.nJ().d(paramcfI);
  }

  public dNP aOL() {
    return this.dXf;
  }

  public String toString()
  {
    return "PetController{m_petHolder=" + this.dXf + '}';
  }
}