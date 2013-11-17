import org.apache.log4j.Logger;

public class aAO extends cMb
{
  private static final Logger K = Logger.getLogger(aAO.class);
  private static final short dTM = 1;
  private static final short dTN = 2;
  private static final short dTO = 3;
  private mg dTP;
  private aIJ aDa;
  private fO dTQ;
  private bpu cAp;
  private cYq dTR;

  protected cCH ak()
  {
    return new cQ(this);
  }

  private void aMD()
  {
    cN localcN = new cN(this);

    cfb localcfb1 = (cfb)ayg.aJQ().bjs();
    for (cfb localcfb2 : (cfb[])localcfb1.brP())
    {
      localcfb2.U(localcN);
    }
  }

  private void aME() {
    if (this.aDa == null) {
      return;
    }
    if (this.dTQ != null) {
      this.dTQ.a(btb.bBd());
    }
    this.dTQ = new fO(this.aDa, 4, 4);
    this.dTQ.a(btb.bBd(), this.dTP.tV(), this.dTP.tW(), this.dTP.tX());
  }

  protected void b(abc paramabc)
  {
    super.b(paramabc);
    aME();
  }

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    d(paramdJO);
    if ((paramdJO == dJO.lVX) || (paramdJO == dJO.lVT)) {
      byv.bFN().a(new cOe(this));
    }
    a(paramdJO);
    return true;
  }

  public dJO eR()
  {
    return dJO.lVX;
  }

  public dJO[] eS()
  {
    if (getState() == 1) {
      return new dJO[] { dJO.lVX, dJO.lVT };
    }
    if (getState() == 2) {
      return new dJO[] { dJO.lVX, dJO.lVG };
    }

    K.error("Etat inconnu sur le HavenWorldBoard " + getId() + " state=" + getState());
    return new dJO[] { dJO.lVX };
  }

  public void al()
  {
    try {
      this.dTP = ((mg)aKY.epr.a(cdc.hwi, Integer.parseInt(this.fgH)));
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Erreur de paramétrage d'IE " + this);
    } finally {
      if (this.dTP == null)
        this.dTP = mg.aQh;
    }
  }

  public csx[] am()
  {
    aXi localaXi = (aXi)aiI.dfP.avt();
    localaXi.iT(coH.hWi.aw);
    localaXi.setName("informations");
    localaXi.b(dJO.lVX);

    int i = this.dTP.tU();
    Object localObject;
    csx[] arrayOfcsx;
    if (getState() == 1) {
      localObject = new agm("buy", coH.hXp.aw, i, this.dTR);
      ((aXi)localObject).b(dJO.lVT);
      arrayOfcsx = new csx[] { localaXi, localObject };
    } else if (getState() == 2) {
      localObject = (aXi)aiI.dfP.avt();
      ((aXi)localObject).iT(coH.hWL.aw);
      ((aXi)localObject).setName("havenWorldEnter");
      ((aXi)localObject).b(dJO.lVG);
      arrayOfcsx = new csx[] { localaXi, localObject };
    } else if (getState() == 3) {
      arrayOfcsx = new csx[] { localaXi };
    } else {
      K.error("État inconnu sur le HavenWorldBoard " + getId() + " state=" + getState());
      arrayOfcsx = new csx[] { localaXi };
    }
    return arrayOfcsx;
  }

  public String getName()
  {
    int i = this.dTP.tU();
    lZ locallZ = new lZ();
    locallZ.a(bU.fH().getString("havenWorldBoard")).tH();
    brW localbrW = ars.dzL.jG(i);
    if (localbrW != null)
      locallZ.a(bU.fH().b(77, localbrW.arI(), new Object[0]));
    bcD localbcD = dJD.lVl.CL(i);
    dxL localdxL = dDE.dft().VN();
    int j = (localbcD != null) && (localbcD.EQ().Q(localdxL)) && (localbcD.ES().S(localdxL)) ? 1 : 0;
    if ((getState() == 1) && (j != 0)) {
      locallZ.tH().a(bU.fH().getString("havenWorldBoardForSale"));
    }
    if (getState() == 3) {
      locallZ.tH().a(bU.fH().getString("havenWorldLocked"));
    }
    return locallZ.tP();
  }

  public mg aMF() {
    return this.dTP;
  }

  public void aJ()
  {
    super.aJ();
    this.dTP = null;
    D(true);
  }

  public void bc()
  {
    super.bc();
    this.dTP = null;
  }

  public void tk()
  {
    super.tk();
    if (this.dTQ != null) {
      this.dTQ.a(btb.bBd());
    }
    this.dTQ = null;
  }

  public String toString()
  {
    return "HavenWorldBoard{m_param=" + this.dTP + ", m_havenWorld=" + this.aDa + ", m_worldMini=" + this.dTQ + '}';
  }

  public bpu aiJ()
  {
    return this.cAp;
  }
}