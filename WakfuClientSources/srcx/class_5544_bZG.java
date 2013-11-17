import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class bZG extends cOt
{
  private static final aee bx = new bOO(new ci());

  private static final qM by = new dzQ(new ec[] { new dLx("apply avec gestion des resistances/boosts", new dmb[] { new dmb("stateId", dnN.lnQ), new dmb("level", dnN.lnS), new dmb("pourcentage d'application (-1 = application forcée)", dnN.lnS) }), new dLx("Level fct d'un autre sort", new dmb[] { new dmb("stateId", dnN.lnQ), new dmb("level (Inutile)", dnN.lnS), new dmb("pourcentage d'application (-1 = application forcée)", dnN.lnS), new dmb("id du sort", dnN.lnS) }), new dLx("Level fct d'un autre sort", new dmb[] { new dmb("stateId", dnN.lnQ), new dmb("level (Inutile)", dnN.lnS), new dmb("pourcentage d'application (-1 = application forcée)", dnN.lnS), new dmb("id du sort", dnN.lnS), new dmb("Multiplicateur", dnN.lnS) }), new dLx("Proba fct du level d'un autre état", new dmb[] { new dmb("stateId", dnN.lnQ), new dmb("level", dnN.lnS), new dmb("pourcentage d'application (-1 = application forcée)", dnN.lnS), new dmb("id de l'état qui va modifier la proba", dnN.lnS), new dmb("appliquer si état pas présent (0=non, 1=oui)", dnN.lnS), new dmb("modification du % par niveau de l'état", dnN.lnS) }), new dLx("Verifier l'etat modificateur sur la cible", new dmb[] { new dmb("stateId", dnN.lnQ), new dmb("level", dnN.lnS), new dmb("pourcentage d'application (-1 = application forcée)", dnN.lnS), new dmb("id de l'état qui va modifier la proba", dnN.lnS), new dmb("appliquer si état pas présent (0=non, 1=oui)", dnN.lnS), new dmb("modification du % par niveau de l'état", dnN.lnS), new dmb("etat modificateur sur la cible (0=non (defaut), 1=oui)", dnN.lnS) }) });

  public static final cSi hqe = new cSi();

  protected int hqf = 0;
  protected short aGz = 0;
  protected short gCj = -1;
  private boolean hqg = false;

  private boolean hqh = false;
  private boolean hqi;
  private boolean hqj;
  public cCH aAR = new ck(this, 4);

  public bZG()
  {
    aH();
  }

  public qM aF() {
    return by;
  }

  public bZG RJ()
  {
    bZG localbZG;
    try
    {
      localbZG = (bZG)bx.Mm();
      localbZG.aOr = bx;
    } catch (Exception localException) {
      localbZG = new bZG();
      localbZG.eXg = false;
      localbZG.aOr = null;
      K.error("Erreur lors d'un newInstance sur un LatentState : " + localException.getMessage());
    }
    a(localbZG);
    return localbZG;
  }

  protected void a(bZG parambZG) {
    parambZG.aGz = this.aGz;
    parambZG.hqf = this.hqf;
    parambZG.gCj = this.gCj;
  }

  public void bc()
  {
    this.hqg = false;
    this.hqf = 0;
    this.hqi = false;
    this.hqh = false;
    this.hqj = false;
    super.bc();
  }

  public static bZG a(cOE paramcOE, dle paramdle, short paramShort1, short paramShort2, boolean paramBoolean) {
    bZG localbZG;
    try {
      localbZG = (bZG)bx.Mm();
      localbZG.aOr = bx;
    } catch (Exception localException) {
      localbZG = new bZG();
      localbZG.aOr = null;
      localbZG.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ApplyState : " + localException.getMessage());
    }

    localbZG.aw = bsj.fSd.getId();
    localbZG.eWQ = ((doA)bsj.fSd.getObject()).DU();
    localbZG.aH();
    localbZG.evp = paramdle;

    localbZG.eXd = true;
    localbZG.aGz = paramShort1;
    localbZG.gCj = paramShort2;
    localbZG.hqf = bJC.I(localbZG.aGz, localbZG.gCj);
    localbZG.hqg = paramBoolean;
    localbZG.eWS = -1;
    localbZG.ejP = paramcOE;
    return localbZG;
  }

  public void aH()
  {
    super.aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp == null) || (this.evp.atO() == null)) {
      jJ(true);
      return;
    }
    if (this.evo == null) {
      jJ(true);
      return;
    }

    fe((byte)5);

    List localList = cei();
    if (this.hqi) {
      return;
    }

    D(localList);

    if (bkt()) {
      b(paramaVc, paramBoolean);
      try {
        O(paramaVc);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
    }
  }

  public void b(int paramInt, float paramFloat, boolean paramBoolean) {
    switch (paramInt) {
    case 4:
      if (paramBoolean)
        this.gCj = ((short)(int)paramFloat);
      else {
        this.gCj = ((short)(int)(this.gCj + paramFloat));
      }
      this.hqf = bJC.I(this.aGz, this.gCj);
    }
  }

  private boolean ceh()
  {
    if (this.evp == null) {
      return true;
    }
    dDN localdDN = this.evp.atO();
    if (localdDN == null) {
      K.warn("On essaie d'appliquer un etat sur un cible qui n' pas de REM " + this.evp + " , effet correspondant : " + yR());
      return false;
    }
    Iterator localIterator = localdDN.iterator();
    while (localIterator.hasNext()) {
      aVc localaVc = (aVc)localIterator.next();
      if ((localaVc.getId() == bsj.fSj.getId()) && (((bPD)localaVc).bWk().bRb().contains(this.aGz)))
      {
        fe((byte)2);
        return true;
      }
    }
    return false;
  }

  private List cei()
  {
    this.aGz = bJC.td(this.hqf);
    this.gCj = bJC.nb(this.hqf);

    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.evp.atO().iterator();
    while (localIterator.hasNext()) {
      aVc localaVc = (aVc)localIterator.next();
      if ((localaVc != null) && 
        (localaVc.getId() == bsj.fSj.getId()) && (((bPD)localaVc).bWk().bQW() == this.aGz))
      {
        bJC localbJC = ((bPD)localaVc).bWk();
        if ((localbJC.bRa()) && (!localbJC.NW())) {
          jJ(true);
          this.hqi = true;
          return Collections.emptyList();
        }

        if ((localbJC.NW()) && ((localbJC.nU() < localbJC.bRe()) || (localbJC.bRj()))) {
          this.gCj = ((short)(this.gCj + localbJC.nU()));
          this.hqf = bJC.I(this.aGz, this.gCj);
          localArrayList.add((bPD)localaVc);
        }
        else if ((localbJC.NS()) && (this.gCj >= localbJC.nU())) {
          localArrayList.add((bPD)localaVc);
        }
        else {
          jJ(true);
          this.hqi = true;
          return Collections.emptyList();
        }
      }
    }
    return localArrayList;
  }

  private void D(List paramList) {
    if (paramList != null)
      for (bPD localbPD : paramList) {
        localbPD.jI(true);
        this.evp.atO().G(localbPD);
      }
  }

  private dpI aI()
  {
    if (bkc() == null) {
      return dzg.dcV();
    }

    if (((dpI)bkc()).on()) {
      if (((dpI)bkc()).om()) {
        return cfw.cip();
      }
      return aVy.blb();
    }
    if (((dpI)bkc()).om()) {
      return bIw.bPE();
    }
    return dzg.dcV();
  }

  private void O(aVc paramaVc)
  {
    this.hqf = bJC.I(this.aGz, this.gCj);
    bPD localbPD = bPD.a(this.ejP, this.evo, (bqk)this.eWM, this.hqf);
    if (this.hqg) {
      localbPD.bWi();
    }

    if (hqe.contains(this.aGz)) {
      localbPD.bWi();
    }

    a(localbPD);
    dji localdji = dji.a(true, false, null);
    if (this.hqj) {
      localdji.ic(true);
    }
    localbPD.a(localdji);
    localbPD.b(this.eWM);
    localbPD.b(aI());
    localbPD.e(auc());
    localbPD.u(paramaVc);
    localbPD.bky();
    if (cVF())
      localbPD.jH(true);
    localbPD.k(this.evp);
    localbPD.release();
  }

  protected void a(bPD parambPD) {
  }

  protected int st() {
    if (this.eWL == null) {
      return 100;
    }

    int i = Wy();
    if (i == -1) {
      return 100;
    }
    if (i == -2) {
      return 0;
    }

    int j = (short)((dpI)this.eWL).a(0, cVC(), dNF.meh);
    bJC localbJC = cNO.cFX().yF(j);
    if (localbJC == null) {
      K.error("UNable to check application probability for state " + j + " : this state is unknown");
      return 0;
    }

    if ((this.evp instanceof dhJ)) {
      i -= ((dhJ)this.evp).aY(this.aGz);
    }
    if ((this.evo instanceof dhJ)) {
      i += ((dhJ)this.evo).ef(this.aGz);
    }

    ZY localZY = localbJC.bRi();
    if (localZY == ZY.cMP) {
      return bCO.J(i, 0, 100);
    }

    float f = 0.0F;
    if ((this.evp != null) && (this.evp.b(eu.azV))) {
      f -= this.evp.e(eu.azV);
    }
    if ((this.evo != null) && (this.evo.b(eu.azU))) {
      f += this.evo.e(eu.azU);
    }

    i += (int)(i * f / 100.0F);

    return bCO.J(i, 0, 100);
  }

  protected int Wy()
  {
    int i = ((dpI)this.eWL).a(2, cVC(), dNF.meh);

    if (((dpI)this.eWL).bep() < 6) {
      return i;
    }

    dDN localdDN = cej();
    if (!(localdDN instanceof bgJ)) {
      return i;
    }

    bgJ localbgJ = (bgJ)localdDN;
    int j = ((dpI)this.eWL).a(3, cVC(), dNF.meh);
    int k = ((dpI)this.eWL).a(4, cVC(), dNF.meh) == 1 ? 1 : 0;
    float f = ((dpI)this.eWL).o(5, cVC());

    bPD localbPD = localbgJ.pz(j);
    if (localbPD != null) {
      if (i != -1) {
        int m = Math.round(f * localbPD.bWk().nU());
        i += m;
      }
    }
    else if (k == 0) {
      return -2;
    }

    return i;
  }

  protected dDN cej() {
    if (((dpI)this.eWL).bep() <= 6) {
      return this.evo.atO();
    }

    int i = ((dpI)this.eWL).a(6, cVC(), dNF.meh) == 1 ? 1 : 0;
    if (i != 0) {
      return this.evp.atO();
    }
    return this.evo.atO();
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }

    short s = cVC();
    this.aGz = ((short)((dpI)this.eWL).a(0, s, dNF.meh));

    P(s);
    this.hqf = bJC.I(this.aGz, this.gCj);
  }

  protected void P(short paramShort) {
    this.gCj = ((short)((dpI)this.eWL).a(1, paramShort, dNF.meh));
    int i = ((dpI)this.eWL).bep();
    if ((i != 4) && (i != 5)) {
      return;
    }

    if ((this.evo == null) || (!(this.evo instanceof dhJ))) {
      K.error("Impossible d'appliquer l'etat au niveau paramétré, le caster n'est pas valide");
      return;
    }

    int j = ((dpI)this.eWL).a(3, paramShort, dNF.meh);
    dCi localdCi = ((dhJ)this.evo).auK();
    if (localdCi == null) {
      K.error("Impossible d'appliquer l'etat au niveau paramétré, le caster n'a pas d'inventaire de sort");
      return;
    }
    bfE localbfE = (bfE)localdCi.hh(j);
    if (localbfE == null) {
      K.error("Impossible d'appliquer l'etat au niveau paramétré, l'inventaire de sort ne contient pas le sort " + j + ", breed caster : " + ((dhJ)this.evo).uO() + " effect id = " + yR());

      return;
    }
    this.gCj = localbfE.nU();

    if (i < 5) {
      return;
    }

    float f = ((dpI)this.eWL).o(4, paramShort);
    this.gCj = ((short)(int)(this.gCj * f));
  }

  protected boolean CA()
  {
    bJC localbJC = cNO.cFX().yF(this.aGz);
    if ((localbJC != null) && (localbJC.bRh() == bGX.gEa)) {
      return false;
    }
    return (this.evp != null) && (this.evp.c(cfY.hCv));
  }

  public boolean Cu()
  {
    if (bkt())
    {
      bJC localbJC = cNO.cFX().yH(this.hqf);
      if ((localbJC != null) && (localbJC.bQT() != null) && (!localbJC.bQT().i(this.evo, this.evp, wa(), aIq())))
      {
        return false;
      }

      if ((this.evp != null) && (this.evp.c(cfY.hCs)) && 
        (localbJC != null) && (localbJC.bRh() != bGX.gEa)) {
        return false;
      }

      if (this.aGz > 0) {
        if (ceh()) {
          return false;
        }

        if (!this.hqh) {
          int i = st();
          if (i < 100) {
            int j = dpe.AX(100);
            if (i < j) {
              this.cxl = 0;
              return false;
            }
          }
        }
      }
    }

    return super.Cu();
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public short pl() {
    return this.aGz;
  }

  public short cek() {
    return this.gCj;
  }

  public void cel() {
    this.hqh = true;
  }

  public void gK(boolean paramBoolean) {
    this.hqj = paramBoolean;
  }

  public cCH lJ()
  {
    return this.aAR;
  }

  static
  {
    hqe.add(bPR.eWj);
  }
}