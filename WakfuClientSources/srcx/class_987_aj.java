import org.apache.log4j.Logger;

final class aj extends Mo
{
  private final Fo bN;

  private aj(dhJ paramdhJ, Fo paramFo)
  {
    this.bN = paramFo;
    this.bN.ao().a(this);
  }

  public void aS() {
    aPH localaPH = this.bO.afv();
    this.bN.bto = (localaPH != null ? localaPH.getId() : -1);
    this.bN.btp = this.bO.hJp;
    this.bN.btq = this.bO.lcZ;
    this.bN.btr = dhJ.aX(this.bO);
    this.bN.bts = this.bO.ldq;
    this.bN.btt = dhJ.aY(this.bO);
    if (dhJ.aZ(this.bO) != null) {
      this.bN.btu = new dKK();
      dhJ.aZ(this.bO).a(this.bN.btu.egq);
    }
  }

  public void aT() {
    int i = this.bN.bto;
    this.bO.gD(i);
    if (i > 0) {
      this.bO.jk(true);
    }
    this.bO.fz(this.bN.btq);
    this.bO.hJp = this.bN.btp;
    dhJ.a(this.bO, this.bN.btr);
    this.bO.ldq = this.bN.bts;
    dhJ.d(this.bO, this.bN.btt);
    if (this.bN.btu != null) {
      if (this.bN.btu.egq.dsK != null)
      {
        Object localObject;
        if (this.bN.btu.egq.dsK.grR.cHf == 1) {
          localObject = bIS.bQr();
        } else if (this.bN.btu.egq.dsK.grR.cHf == 2) {
          localObject = aHv.aTp();
        } else if (this.bN.btu.egq.dsK.grR.cHf == 3) {
          localObject = dTC.dtz();
        } else {
          dhJ.K.error("Type d'invoc de double inconnue " + this.bN.btu.egq.dsK.grR.cHf);
          localObject = bIS.bQr();
        }
        if (this.bO.auK() != null)
          dhJ.a(this.bO, ((bIS)localObject).b((short)22, this.bO.auK().ajw(), this.bO.auK().ajz(), false, false, false));
        else
          dhJ.a(this.bO, ((bIS)localObject).age());
      }
      else if (this.bN.btu.egq.dsL != null) {
        dhJ.a(this.bO, Pg.abf().Sm());
      } else {
        dhJ.a(this.bO, new csi());
      }
      dhJ.aZ(this.bO).b(this.bN.btu.egq);
    }
    this.bO.afa();
  }
}