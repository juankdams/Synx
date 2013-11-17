import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class avO extends doA
{
  private cYk dKD;
  private cYk aFN;
  private int aJv;
  private boolean dKE;
  protected float dKF;
  private int dKG = 0;
  private float dKH = 0.0F;
  private int aJw;
  private cdO aJx;
  private List aJu;
  protected bTI dKI = bTI.heZ;
  protected boolean dKJ = false;

  public cCH aAR = new pu(this, 10);

  public void aH()
  {
    super.aH();
    this.eWR.set(185);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    agl localagl = aAx();
    if (localagl == null) {
      jJ(true);
      return;
    }

    if (bkt()) {
      aHL();
    }
    if (this.dKD == null) {
      if (bkt())
        aHQ();
      jJ(true);
      return;
    }

    if (((this.ejP instanceof dMC)) && (bkt())) {
      aHD();
    }
    cYk localcYk = new cYk(localagl.fa(), localagl.fb(), localagl.fc());

    if (!localcYk.equals(this.dKD)) {
      aHK();
    }
    this.cxl = this.aJu.size();
    b(paramaVc, paramBoolean);

    if (!bkt()) {
      return;
    }
    aHQ();
    s(localcYk);

    if (((localagl instanceof awr)) && (bkt()))
      j((awr)localagl);
  }

  private void j(awr paramawr) {
    cOE localcOE = paramawr.aIq();
    if (localcOE == null)
      return;
    aJD localaJD = localcOE.LC();
    if (localaJD == null)
      return;
    cYk localcYk = paramawr.ML();
    Collection localCollection = localaJD.bbj();
    ArrayList localArrayList = new ArrayList(localCollection);
    for (cjK localcjK : localArrayList)
      if ((localcjK.ML().equals(localcYk)) && (localcjK != paramawr) && (localcjK.getType() == xj.bps.xj()))
        localcjK.a(this, null);
  }

  private void aHD()
  {
    dbE localdbE = ((dMC)this.ejP).dps();

    if (this.aJu.isEmpty()) {
      return;
    }
    if (!(aAx() instanceof dhJ)) {
      return;
    }
    cLo localcLo = new cLo(localdbE, (dhJ)aAx(), (cYk)this.aJu.get(0));
    localcLo.cEv();
    int i = 0; for (int j = this.aJu.size(); i < j; i++) {
      cYk localcYk = (cYk)this.aJu.get(i);
      localcLo.T(localcYk);
      localcLo.cEx();
      if ((localcLo.cEy()) && (localcLo.cEz())) {
        this.aJu = this.aJu.subList(0, i + 1);
        this.dKD = ((cYk)this.aJu.get(this.aJu.size() - 1));
        break;
      }
      localcLo.U(localcYk);
    }
  }

  private void s(cYk paramcYk) {
    if (this.aJu == null)
      return;
    dbE localdbE = ((dMC)this.ejP).dps();
    cLo localcLo = new cLo(localdbE, aAx(), (cYk)this.aJu.get(0));
    localcLo.U(paramcYk);
    CG localCG = new La(paramcYk.getX(), paramcYk.getY(), paramcYk.IB(), aAx().fa(), aAx().fb(), aAx().fc()).Vy();

    int i = 0; for (int j = this.aJu.size(); i < j; i++) {
      cYk localcYk = (cYk)this.aJu.get(i);
      localcLo.T(localcYk);
      localcLo.cEx();
      if (localcLo.cEy()) {
        aAx().g(localCG);
        try {
          localcLo.cED();
        } catch (Exception localException) {
          K.error("Exception levee", localException);
        } finally {
          aAx().g(null);
        }
      }
      localcLo.U(localcYk);
    }
  }

  boolean aHE() {
    return aAx().Vj();
  }

  boolean aHF() {
    return aAx().c(cfY.hBd);
  }

  boolean aHG() {
    return aAx().c(cfY.hBk);
  }

  boolean aHH() {
    return aAx().c(cfY.hCc);
  }

  boolean aHI() {
    return aAx().c(cfY.hCD);
  }

  boolean aHJ() {
    return aAx().c(cfY.hCr);
  }

  private void aHK() {
    aAx().q(this.dKD.getX(), this.dKD.getY(), this.dKD.IB());
  }

  public void a(aVc paramaVc)
  {
    if (aAx() == null) {
      return;
    }
    if (!aAv()) {
      this.dKD = null;
      return;
    }
    short s = cVC();

    if (this.eWL != null) {
      if (((dpI)this.eWL).bep() >= 1)
        this.dKG = ((dpI)this.eWL).a(0, s, dNF.mei);
      else
        this.dKG = this.eUw.eC(aAx().fa(), aAx().fb());
      if (((dpI)this.eWL).bep() >= 2)
        this.dKH = ((dpI)this.eWL).o(1, s);
      else
        this.dKH = 0.0F;
    } else {
      this.dKG = this.eUw.eC(aAx().fa(), aAx().fb());
      this.dKH = 0.0F;
    }
  }

  private void aHL() {
    aHP();
    aHO();
    aHM();
    this.cxl = this.aJw;
  }

  private void aHM() {
    this.dKF = 0.0F;
    if (!aAw())
      return;
    if (aHN())
      return;
    int i = this.dKG - this.aJw;
    if (i > 0)
      this.dKF = (i * this.dKH);
  }

  private boolean aHN() {
    if (this.dKD == null)
      return false;
    cYk localcYk = aAy();
    return (localcYk.getX() == this.dKD.getX()) && (localcYk.getY() == this.dKD.getY()) && (localcYk.IB() == this.dKD.IB());
  }

  public void aHO()
  {
    if ((this.ejP == null) || (this.ejP.LB() == null)) {
      K.error("Pas de fightMap pour le context " + this.ejP);
      return;
    }

    aTV localaTV = new aTV(aAx(), aAy(), this.dKG, this.ejP);
    if (!aAu()) {
      localaTV.ec(true);
    }
    this.dKF = 0.0F;

    iU localiU = localaTV.bjj();
    if (localiU == null) {
      return;
    }
    this.aJx = localiU.qU();
    this.dKE = localiU.qQ();

    if (localiU.qR() == null) {
      return;
    }
    this.aJu = localiU.getPath();
    this.aJw = localiU.qT();
    this.aJv = localiU.qS();
    this.aFN = new cYk(aAx().fa(), aAx().fb(), aAx().fc());
    this.dKD = new cYk(localiU.qR());
  }

  public void bc()
  {
    super.bc();
    aHP();
    this.dKH = 0.0F;
    this.dKG = 0;
    this.dKI = bTI.heZ;
    this.dKJ = false;
  }

  private void aHP() {
    this.dKD = null;
    this.aFN = null;
    this.aJv = 0;
    this.dKE = false;
    this.aJx = null;
    this.dKF = 0.0F;
    this.aJw = 0;
  }

  protected boolean CA()
  {
    return cVM();
  }

  public cYk qR()
  {
    return this.dKD;
  }

  public cYk oO() {
    return this.aFN;
  }

  public cCH lJ()
  {
    return this.aAR;
  }

  private void aHQ() {
    if (this.dKF > 0.0F) {
      bFw localbFw1 = bFw.a(this.ejP, this.dKI, dnO.lnU, bMr.ax(this.dKF), aAx());
      localbFw1.i(this.evo);
      if (this.dKJ) {
        localbFw1.bNp();
        this.dKF = localbFw1.getValue();
      }
      localbFw1.bkr();
      localbFw1.b(bdH.brN());
      localbFw1.DV().set(204);
      localbFw1.k(aAx());
      localbFw1.release();

      if ((this.aJx != null) && ((this.aJx instanceof dle)) && (((dle)this.aJx).b(eu.ayM))) {
        int i = bMr.ax(this.dKF / 2.0F);
        bFw localbFw2 = bFw.a(this.ejP, this.dKI, dnO.lnU, i, (dle)this.aJx);
        localbFw2.b(bdH.brN());
        localbFw2.i(this.evo);
        localbFw2.DV().set(204);
        localbFw2.k((dle)this.aJx);
        localbFw2.release();
      }
    }
  }

  abstract boolean aAu();

  abstract boolean aAv();

  abstract boolean aAw();

  public abstract agl aAx();

  abstract cYk aAy();

  boolean aHR() {
    return (this.evp.fa() == this.evo.fa()) && (this.evp.fb() == this.evo.fb());
  }

  protected boolean aHS() {
    return a(PY.coI);
  }
}