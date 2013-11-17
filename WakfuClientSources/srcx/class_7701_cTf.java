import org.apache.log4j.Logger;

public class cTf extends cMb
  implements AQ
{
  private static final Logger K = Logger.getLogger(cTf.class);
  private long iI;
  protected dNH kFP;
  private final cCH kC = new bRT(this, 8);

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] Stool : " + paramabc);
  }

  public void aJ()
  {
    super.aJ();
    a(XV.cIz);
    eu(false);
    ev(false);
    D(false);
    this.iI = 0L;
    if ((!bB) && (this.kFP != null)) throw new AssertionError();
  }

  public void bc()
  {
    super.bc();
    this.kFP = null;
  }

  public void al()
  {
    if (dzp.qF(this.fgH)) {
      this.kFP = null;
      return;
    }
    String[] arrayOfString = this.fgH.split(";");
    if (arrayOfString.length != 1) {
      K.error("[LD] L'IE de Stool " + this.aTz + " doit avoir 0 ou 1 paramètre");
      return;
    }
    dNH localdNH = (dNH)aKY.epr.a(cdc.hvX, Integer.valueOf(arrayOfString[0]).intValue());
    if (localdNH == null) {
      K.error("[LD] L'IE de Stool " + this.aTz + " à un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui ne correspond a rien dans les Admins");
      return;
    }
    this.kFP = localdNH;
  }

  protected cCH ak()
  {
    return this.kC;
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    bKm localbKm = (bKm)parambhL;
    if (!u(localbKm)) {
      return true;
    }

    d(paramdJO);

    switch (bRQ.av[paramdJO.ordinal()]) {
    case 1:
    case 2:
      a(paramdJO);
      return true;
    }

    return false;
  }

  public dJO eR()
  {
    if (cIQ() == 0L)
      return dJO.lVB;
    return dJO.lVD;
  }

  public dJO[] eS()
  {
    if (cIQ() == 0L)
      return new dJO[] { dJO.lVB };
    return dJO.lWj;
  }

  private long cIQ() {
    if (this.iI == 0L) {
      return 0L;
    }
    Su localSu = CA.Lv().bj(this.iI);
    if (localSu == null)
      this.iI = 0L;
    return this.iI;
  }

  public void cIR() {
    this.iI = 0L;
  }

  public csx[] am()
  {
    if (cIQ() != 0L) {
      return csx.icw;
    }

    csl localcsl = (csl)aiI.dfO.avt();
    aCH localaCH = cIT();
    if (localaCH != null) {
      localcsl.iT(localaCH.aOR());
      localcsl.ma("desc.mru." + localaCH.aOS());
    } else {
      localcsl.iT(coH.hXl.aw);
      localcsl.ma("desc.mru.sit");
    }

    return new csx[] { localcsl };
  }

  public boolean cFe()
  {
    return (cIQ() == 0L) && (this.krd);
  }

  public byte bY()
  {
    return 2;
  }

  public boolean isUsable()
  {
    return (super.isUsable()) && (u(byv.bFN().bFO()));
  }

  private boolean u(bKm parambKm) {
    boolean bool1 = Ka().isDestroyed();
    boolean bool2 = v(parambKm);
    if (!bool2) {
      K.error("Le perso doit posséder l'anim " + cIS());
    }
    int i = (this.kFP == null) || (this.kFP.F().i(parambKm, this, null, parambKm.ayL())) ? 1 : 0;
    return (bool1) || ((bool2) && (i != 0));
  }

  private boolean v(bKm parambKm) {
    dR localdR = parambKm.aeL().aty();
    if (localdR == null) {
      return false;
    }
    return localdR.J(cIS());
  }

  private String cIS() {
    return bVf.c(CG.bFG.m_index, bTI(), "-Assis");
  }

  public String bTI() {
    aCH localaCH = cIT();
    if ((localaCH == null) || (dzp.qF(localaCH.aOQ()))) {
      K.error("Visuel sans anim pour le stool " + getId());
      return "";
    }
    return localaCH.aOQ();
  }

  private aCH cIT() {
    if (this.kFP == null) {
      K.error("Pas de visuel pour le stool " + getId());
      return null;
    }
    return clR.cni().vL(this.kFP.gC());
  }

  public diP tj() {
    return this.kFP;
  }

  public boolean cIU() {
    return this.fgF == dAz.lHM.ddU();
  }

  public void c(CG paramCG) {
    if ((cIU()) && (paramCG != CG.bFG) && (paramCG != CG.bFI)) {
      paramCG = CG.bFG;
    }
    super.c(paramCG);
  }

  public EA xN() {
    if (this.krh == null)
      this.krh = new chq(this);
    return this.krh;
  }
}