import java.util.BitSet;
import org.apache.log4j.Logger;

public class cJc extends doA
{
  private static final aee bx = new bOO(new MU());

  private static final qM by = new dzQ(new ec[] { new dLx("Debuff de Charac", new dmb[] { new dmb("valeur (-1 valeur du trigger, -2 vole la totalité)", dnN.lnR) }), new dLx("Debuff de Charac avec proba d'application", new dmb[] { new dmb("valeur (-1 valeur du trigger, -2 vole la totalité) ", dnN.lnR), new dmb("Proba d'application en % (-1 = application forcée)", dnN.lnS) }), new dLx("Debuff de charac paramétré", new dmb[] { new dmb("Valeur (-1 valeur du trigger, -2 vole la totalité) ", dnN.lnR), new dmb("Proba d'application en % (-1 = application forcée)", dnN.lnS), new dmb("Augmente la valeur courante à la désapplication (0 non / 1 oui default", dnN.lnS) }), new dLx("Diminue la valeur lors de l'application", new dmb[] { new dmb("Valeur (-1 valeur du trigger, -2 vole la totalité) ", dnN.lnR), new dmb("Proba d'application en % (-1 = application forcée)", dnN.lnS), new dmb("Augmente la valeur courante à la désapplication (0 non / 1 oui default", dnN.lnS), new dmb("Diminue la valeur courante à l'application (0 non (default) / 1 oui ", dnN.lnS) }) });
  protected dSc aOF;
  protected boolean iHh = true;
  private boolean iHi;
  private final BitSet iHj = new BitSet();

  public cCH aAR = new MO(this);

  public qM aF()
  {
    return by;
  }

  protected cJc()
  {
  }

  public cJc(dSc paramdSc)
  {
    this.aOF = paramdSc;
    aH();
  }

  public cJc cyN()
  {
    cJc localcJc;
    try {
      localcJc = (cJc)bx.Mm();
      localcJc.aOr = bx;
    } catch (Exception localException) {
      localcJc = new cJc();
      localcJc.aOr = null;
      K.error("Erreur lors d'un checkOut sur un CharacDebuff : " + localException.getMessage());
    }
    localcJc.aOF = this.aOF;
    localcJc.iHh = this.iHh;
    localcJc.iHi = this.iHi;

    localcJc.iHj.clear();
    localcJc.iHj.or(super.DV());
    return localcJc;
  }

  public void release()
  {
    super.release();
  }

  public BitSet DV()
  {
    return this.iHj;
  }

  public dSc sw()
  {
    return this.aOF;
  }

  public void aH()
  {
    super.aH();
    if (this.aOF == null)
      return;
    switch (this.aOF.ln()) {
    case 0:
      eu localeu = (eu)this.aOF;
      if (localeu.lx()) {
        this.eWR.set(localeu.lt());
      }

      break;
    case 1:
      switch (MP.bZV[((avB)this.aOF).ordinal()]) {
      case 1:
        this.eWR.set(4);
      }
      break;
    }
  }

  public boolean Cu()
  {
    if (bkt()) {
      int i = st();
      if (i < 100) {
        int j = dpe.AX(100);
        if (i < j) {
          this.cxl = 0;
          return false;
        }
      }
    }

    return super.Cu();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (bou() > 0) {
      return;
    }

    if ((this.evp != null) && (this.evp.b(this.aOF)))
    {
      byte b = this.aOF.bJ();

      if ((this.cxl == -1) && (paramaVc != null)) {
        this.cxl = paramaVc.getValue();
      }
      en(b);
      cDw();

      if ((bkt()) && 
        (ays.q(this))) {
        b(paramaVc, paramBoolean);
        ays.s(this);
      }
    }
    else
    {
      jJ(true);
    }
  }

  private int st()
  {
    int i;
    if ((this.eWL != null) && (((dpI)this.eWL).bep() >= 2))
      i = ((dpI)this.eWL).a(1, cVC(), dNF.mei);
    else {
      i = 100;
    }

    if (i < 0) {
      return 100;
    }

    if (!ays.q(this)) {
      return i;
    }

    int j = i + ays.r(this);
    return bCO.J(j, 0, 100);
  }

  private void en(byte paramByte)
  {
    if ((bkt()) && (paramByte == eu.ayM.bJ()))
    {
      if ((bkc() != null) && (((dpI)bkc()).aMG() != 2)) {
        cqm localcqm = this.evp.a(this.aOF);
        int i = localcqm.max() - this.cxl;
        if (i <= 0)
          this.cxl += i - 1;
      }
    }
  }

  private void cDw() {
    cqm localcqm = this.evp.a(this.aOF);
    int i = localcqm.value();

    if (localcqm.max() != 2147483647) {
      localcqm.gy(-this.cxl);
      localcqm.gx(-this.cxl);
    }

    int j = localcqm.value();

    if (this.iHi) {
      int k = this.cxl - (i - j);
      localcqm.gw(k);
      j = localcqm.value();
    }

    if (this.aOF.ln() == 0) {
      eu localeu = (eu)this.aOF;
      if ((j != i) && 
        (localeu.lz())) {
        this.iHj.set(localeu.lv());
      }
      if (localeu.lx()) {
        if (this.cxl != 0)
          this.iHj.set(localeu.lt());
        else {
          this.eWR.clear(localeu.lt());
        }
      }
    }
    if ((this.aOF == eu.azq) && 
      (this.ejP != null) && (this.ejP.LH() != null))
      this.ejP.LH().AT();
  }

  private void eo(byte paramByte)
  {
    fe((byte)3);
    if (paramByte == eu.ayN.bJ()) {
      this.iHj.set(58);
      this.iHj.clear(54);
    } else if (paramByte == eu.ayO.bJ()) {
      this.iHj.set(75);
      this.iHj.clear(64);
    }
    this.cxl = 0;
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL == null) {
      return;
    }
    this.iHh = true;
    this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);

    if (((dpI)this.eWL).bep() > 2) {
      this.iHh = (((dpI)this.eWL).a(2, s, dNF.mei) == 1);
    }
    if (((dpI)this.eWL).bep() > 3) {
      this.iHi = (((dpI)this.eWL).a(3, cVC(), dNF.meh) == 1);
    }
    if ((this.cxl == -1) && (paramaVc != null))
      this.cxl = paramaVc.getValue();
    else if ((this.cxl == -2) && (this.evp != null) && (this.evp.b(this.aOF)))
      this.cxl = this.evp.e(this.aOF);
  }

  public void b(int paramInt, float paramFloat, boolean paramBoolean)
  {
    switch (paramInt) {
    case 0:
      if (!paramBoolean)
        this.cxl += bMr.ax(this.cxl * paramFloat / 100.0F); break;
    case 1:
      if (paramBoolean)
        this.cxl = bMr.ax(paramFloat);
      else {
        this.cxl = ((int)(this.cxl + paramFloat));
      }
      break;
    }

    if (this.cxl == 0)
      cVD();
  }

  public void aK()
  {
    if ((this.ksH) && (this.evp != null) && (this.evp.b(this.aOF)))
    {
      this.evp.a(this.aOF).gx(this.cxl);
      this.evp.a(this.aOF).gy(this.cxl);
      if (this.iHh) {
        this.evp.a(this.aOF).gv(this.cxl);
      }
      if ((this.aOF == eu.azq) && 
        (this.ejP != null) && (this.ejP.LH() != null))
        this.ejP.LH().AT();
    }
    super.aK();
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public cCH lJ()
  {
    return this.aAR;
  }
}