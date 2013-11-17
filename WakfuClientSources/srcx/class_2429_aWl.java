import java.util.BitSet;
import org.apache.log4j.Logger;

public class aWl extends doA
{
  private static final cdq fbs = new cdq(0.0D, 0.0D, new cwS());
  private static final BitSet edb = new BitSet();

  private static final aee bx = new bOO(new cdh());

  private static final qM by = new dzQ(new ec[] { new dLx("gain de PdV", new dmb[] { new dmb("valeur (-1=valeur de l'effet déclencheur)", dnN.lnR) }), new dLx("gain de PdV, fixe ou non ", new dmb[] { new dmb("valeur", dnN.lnR), new dmb("fixe (0=non, 1=oui, defaut = non)", dnN.lnS) }), new dLx("gain de PdV xdx+x", new dmb[] { new dmb("", dnN.lnR), new dmb("D", dnN.lnR), new dmb("+", dnN.lnR) }), new dLx("gain de PdV xdx +x, fixe ou non", new dmb[] { new dmb("", dnN.lnR), new dmb("D", dnN.lnR), new dmb("+", dnN.lnR), new dmb("fixe (0=non, 1=oui, defaut = non)", dnN.lnS) }), new dLx("Gain de Pdv - Distibution Normale", new dmb[] { new dmb("mean", dnN.lnR), new dmb("variance", dnN.lnS), new dmb("min", dnN.lnS), new dmb("max", dnN.lnS), new dmb("param qui sert a rien ", dnN.lnS) }), new dLx("Gain de Pdv - Choix des modificateurs", new dmb[] { new dmb("valeur (-1=valeur de l'effet déclencheur)", dnN.lnR), new dmb("Bonus aux dégâts (0=non, 1=oui)", dnN.lnR), new dmb("Bonus aux soins (0=non, 1=oui)", dnN.lnR), new dmb("Résistances aux soins (0=non, 1=oui)", dnN.lnR), new dmb("param qui sert a rien 1", dnN.lnR), new dmb("param qui sert a rien 2", dnN.lnR) }) });
  private boolean edc;
  private boolean fbt;
  private boolean fbu = true;
  private boolean fbv = true;
  protected bTI cpW;

  public qM aF()
  {
    return by;
  }

  protected aWl()
  {
  }

  public aWl(bTI parambTI)
  {
    this.cpW = parambTI;
    aH();
  }

  public bTI Cz()
  {
    return this.cpW;
  }

  public static aWl c(cOE paramcOE, bTI parambTI) {
    aWl localaWl;
    try {
      localaWl = (aWl)bx.Mm();
      localaWl.aOr = bx;
    } catch (Exception localException) {
      localaWl = new aWl();
      localaWl.aOr = null;
      localaWl.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HPGain : " + localException.getMessage());
    }

    localaWl.cpW = parambTI;
    localaWl.aw = bsj.fOS.getId();
    localaWl.eWQ = ((doA)bsj.fOS.getObject()).DU();
    localaWl.eWS = -1;
    localaWl.ejP = paramcOE;
    localaWl.aH();
    return localaWl;
  }

  public aWl hu()
  {
    aWl localaWl;
    try {
      localaWl = (aWl)bx.Mm();
      localaWl.aOr = bx;
    } catch (Exception localException) {
      localaWl = new aWl();
      localaWl.aOr = null;
      localaWl.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HPGain : " + localException.getMessage());
    }

    localaWl.cpW = this.cpW;
    return localaWl;
  }

  public void release() {
    super.release();
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(1);
  }

  public void b(int paramInt, float paramFloat, boolean paramBoolean)
  {
    super.b(paramInt, paramFloat, paramBoolean);
    switch (paramInt)
    {
    case 0:
      if (!paramBoolean)
        this.cxl = ((int)(this.cxl + this.cxl * paramFloat / 100.0F));
      else {
        this.cxl = bMr.ax(this.cxl * paramFloat / 100.0F);
      }
      break;
    case 1:
      if (!paramBoolean)
        this.cxl = ((int)(this.cxl + paramFloat));
      else {
        this.cxl = bMr.ax(paramFloat);
      }
      break;
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bmc()) {
      cVD();
      return;
    }
    ht();
  }

  protected void ht() {
    if ((this.evp == null) || (!this.evp.b(eu.ayM))) {
      jJ(true);
      return;
    }
    if (!this.evp.c(cfY.hBs)) {
      bmb();
    } else {
      int i = this.cxl;
      bFw localbFw = bFw.a(this.ejP, Cz(), dnO.lnU, i, this.evp);
      localbFw.a(dji.a(true, true, (doA)bkn()));
      b(localbFw);
      localbFw.u(this);
      localbFw.i(this.evo);
      localbFw.bkz();

      jJ(true);
    }
  }

  private void b(bFw parambFw) {
    if (((dpI)this.eWL).beq()) {
      if (((dpI)this.eWL).aiz())
        parambFw.b(ahV.auP().it(-11));
      else
        parambFw.b(ahV.auP().it(-3));
    }
    else if (((dpI)this.eWL).aiz())
      parambFw.b(ahV.auP().it(-8));
    else
      parambFw.b(ahV.auP().it(-12));
  }

  protected void bmb()
  {
    if (((this.evp instanceof dhJ)) && ((bkt()) || (DV().get(2138)))) {
      this.cxl = ((dhJ)this.evp).Ab(this.cxl);
    }
    cqm localcqm1 = this.evp.a(eu.ayM);
    int i = this.cxl;
    int j = i - localcqm1.gv(i);
    cqm localcqm2 = this.evp.a(eu.aAj);
    if ((localcqm2 != null) && (localcqm2.max() > 0)) {
      int k = localcqm2.gv(j);
      j -= k;
    }
    this.cxl -= j;
    if ((this.evp instanceof dhJ))
      ((dhJ)this.evp).Aa(this.cxl);
  }

  private boolean bmc() {
    if (this.evp == null) {
      return false;
    }
    if (this.evp.aLY() == 2) {
      int i = ((cjK)this.evp).getType();
      if ((i == xj.bps.xj()) || (i == xj.bpz.xj()) || (i == xj.bpA.xj()) || (i == xj.bpl.xj()))
      {
        return false;
      }
    }
    return true;
  }

  protected boolean CA()
  {
    return cVM();
  }

  public void a(aVc paramaVc)
  {
    aEN();
    if (this.cxl == -1)
      if (paramaVc == null) {
        K.error("Value is -1. Unable to copy value of triggeringEffect : triggerRE==null. Effect id : " + ((dpI)this.eWL).yR());
        this.cxl = 0;
      } else {
        this.cxl = paramaVc.getValue();
      }
    bmd();
  }

  protected void bmd() {
    if (!this.edc) {
      int i = aSm();
      this.cxl += this.cxl * i / 100;
    }
    this.cxl = Math.max(0, bMr.ax(this.cxl));
  }

  public void aEN() {
    short s = cVC();

    this.fbt = false;
    this.fbu = true;
    this.fbv = true;

    if (this.eWL != null)
      switch (((dpI)this.eWL).bep())
      {
      case 1:
        this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
        this.edc = false;
        break;
      case 2:
        this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
        this.edc = (((dpI)this.eWL).a(1, s, dNF.mei) == 1);
        break;
      case 3:
        this.cxl = dpe.ae(((dpI)this.eWL).a(0, s, dNF.mei), ((dpI)this.eWL).a(1, s, dNF.mei), ((dpI)this.eWL).a(2, s, dNF.mei));

        this.edc = false;
        break;
      case 4:
        this.cxl = dpe.ae(((dpI)this.eWL).a(0, s, dNF.mei), ((dpI)this.eWL).a(1, s, dNF.mei), ((dpI)this.eWL).a(2, s, dNF.mei));

        this.edc = (((dpI)this.eWL).a(3, s, dNF.mei) == 1);
        break;
      case 5:
        int i = ((dpI)this.eWL).a(0, s, dNF.mei);
        int j = ((dpI)this.eWL).a(1, s, dNF.mei);
        int k = ((dpI)this.eWL).a(2, s, dNF.mei);
        int m = ((dpI)this.eWL).a(3, s, dNF.mei);

        int n = (int)fbs.m(i, j);
        this.cxl = bCO.J(n, k, m);
        break;
      case 6:
        this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
        this.edc = false;
        this.fbt = (((dpI)this.eWL).a(1, s, dNF.mei) == 1);
        this.fbu = (((dpI)this.eWL).a(2, s, dNF.mei) == 1);
        this.fbv = (((dpI)this.eWL).a(3, s, dNF.mei) == 1);
      }
  }

  public boolean bme()
  {
    return this.edc;
  }

  private int aSm() {
    int i = 0;
    if ((this.cpW != null) && (this.evo.b(this.cpW.bZS())))
      i += this.evo.e(this.cpW.bZS());
    if ((this.fbt) && 
      (this.evo.b(eu.azc))) {
      i += this.evo.e(eu.azc);
    }
    if ((this.fbu) && 
      (this.evo.b(eu.aza)))
      i += this.evo.e(eu.aza);
    if ((this.fbv) && 
      (this.evp != null) && (this.evp.b(eu.azo)))
      i -= this.evp.e(eu.azo);
    if (this.evp.c(cfY.hBs)) {
      if (this.evp.b(eu.azj))
        i -= this.evp.e(eu.azj);
      if ((this.cpW != null) && (this.evp.b(this.cpW.bZT()))) {
        i -= this.evp.e(this.cpW.bZT());
      }
    }
    return i;
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

  public BitSet DV()
  {
    if ((this.evp != null) && (this.evp.c(cfY.hBs))) {
      return edb;
    }
    return super.DV();
  }

  public void bc()
  {
    this.edc = false;
    this.fbt = false;
    this.fbu = true;
    this.fbv = true;
    super.bc();
  }
}