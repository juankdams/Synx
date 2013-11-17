import java.util.BitSet;
import org.apache.log4j.Logger;

public class cCG extends cJc
{
  private static final aee bx = new bOO(new cni());

  private static final qM by = new dzQ(new ec[] { new dLx("Vol de Charac", new dmb[] { new dmb("valeur (par defaut aucune resistance a la perte n'est prise en compte)", dnN.lnR) }), new dLx("Vol de Charac et prise en compte des resist", new dmb[] { new dmb("valeur", dnN.lnR), new dmb("Proba d'application en % (-1 = application forcée)", dnN.lnS) }), new dLx("Vol de charac paramétré", new dmb[] { new dmb("Valeur", dnN.lnR), new dmb("Proba d'application en % (-1 = application forcée)", dnN.lnS), new dmb("Augmente la valeur courante à la désapplication (0 non / 1 oui default", dnN.lnS) }), new dLx("Vol de charac buff ou gain", new dmb[] { new dmb("Valeur", dnN.lnR), new dmb("Proba d'application en % (-1 = application forcée)", dnN.lnS), new dmb("Augmente la valeur courante à la désapplication (0 non / 1 oui default", dnN.lnS), new dmb("Gain pour le caster au lieu d'un buff (0 non / 1 oui default", dnN.lnS) }) });
  private boolean aOC;
  public cCH aAR = new cnh(this);

  public qM aF()
  {
    return by;
  }

  private cCG()
  {
  }

  public cCG(eu parameu)
  {
    super(parameu);
    aH();
  }

  public cCG cyM()
  {
    cCG localcCG;
    try
    {
      localcCG = (cCG)bx.Mm();
      localcCG.aOr = bx;
    } catch (Exception localException) {
      localcCG = new cCG();
      localcCG.aOr = null;
      localcCG.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacLeech : " + localException.getMessage());
    }
    localcCG.aOF = this.aOF;
    return localcCG;
  }

  public bTI Cz()
  {
    if (this.aOF.ln() == 0) {
      bTI localbTI = ((eu)this.aOF).lB();
      if (localbTI != null)
        return localbTI;
    }
    return bTI.heW;
  }

  public void aH()
  {
    super.aH();
    if (this.aOF == null)
      return;
    switch (this.aOF.ln())
    {
    case 0:
      switch (cnl.aCX[((eu)this.aOF).ordinal()]) {
      case 1:
        this.eWR.set(56);
      }
      break;
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp == null) || (!this.evp.b(this.aOF))) {
      jJ(true);
      return;
    }
    cqm localcqm1;
    cqm localcqm2;
    if (this.aOC) {
      localcqm1 = this.evp.a(this.aOF).value();
      if (this.cxl > localcqm1)
        this.cxl = localcqm1;
      this.evp.a(this.aOF).gv(-this.cxl);
      super.a(paramaVc, paramBoolean);

      if ((this.evo != null) && (this.evo.b(this.aOF))) {
        localcqm2 = this.evo.a(this.aOF);
        localcqm2.gx(this.cxl);
        localcqm2.gv(this.cxl);
      }
    } else {
      localcqm1 = this.evp.a(this.aOF).value();
      localcqm2 = this.cxl < localcqm1 ? this.cxl : localcqm1;
      super.a(paramaVc, paramBoolean);
      if ((this.evo != null) && (this.evo.b(this.aOF)))
        this.evo.a(this.aOF).gv(localcqm2);
    }
  }

  public void a(aVc paramaVc)
  {
    super.a(paramaVc);
    if ((this.evp != null) && (this.evp.b(this.aOF))) {
      i = this.evp.a(this.aOF).value();
      this.cxl = (i * this.cxl / 100);
    }
    int i = cVC();
    if (((dpI)this.eWL).bep() == 4)
      this.aOC = (((dpI)this.eWL).a(3, i, dNF.mei) == 0);
    else
      this.aOC = false;
  }

  public void aK()
  {
    if ((this.aOC) && 
      (this.ksH) && (this.evo != null) && (this.evo.b(this.aOF))) {
      cqm localcqm = this.evo.a(this.aOF);
      localcqm.gv(-this.cxl);
      localcqm.gx(-this.cxl);
    }
    super.aK();
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

  public cCH lJ()
  {
    return this.aAR;
  }
}