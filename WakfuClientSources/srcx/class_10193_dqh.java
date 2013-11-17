import java.util.BitSet;
import org.apache.log4j.Logger;

public class dqh extends cJc
{
  private static final aee bx = new bOO(new anM());

  private static final qM by = new dzQ(new ec[] { new dLx("Vol de Charac", new dmb[] { new dmb("valeur", dnN.lnR) }), new dLx("Vol de Charac et prise en compte des resist", new dmb[] { new dmb("valeur", dnN.lnR), new dmb("Proba d'application en % (-1 = application forcée)", dnN.lnS) }), new dLx("Vol de charac paramétré", new dmb[] { new dmb("Valeur", dnN.lnR), new dmb("Proba d'application en % (-1 = application forcée)", dnN.lnS), new dmb("Augmente la valeur courante à la désapplication (0 non / 1 oui default", dnN.lnS) }), new dLx("Choix entre Gain et buff pour le caster", new dmb[] { new dmb("Valeur", dnN.lnR), new dmb("Proba d'application en % (-1 = application forcée)", dnN.lnS), new dmb("Augmente la valeur courante à la désapplication (0 non / 1 oui default", dnN.lnS), new dmb("Gain ou Buff caster (0 buff / 1 gain (default)", dnN.lnS) }) });
  private boolean aOC;
  public cCH aAR = new anO(this);

  public qM aF()
  {
    return by;
  }

  private dqh()
  {
  }

  public dqh(eu parameu)
  {
    super(parameu);
    aH();
  }

  public dqh cXy()
  {
    dqh localdqh;
    try
    {
      localdqh = (dqh)bx.Mm();
      localdqh.aOr = bx;
    } catch (Exception localException) {
      localdqh = new dqh();
      localdqh.aOr = null;
      localdqh.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacLeech : " + localException.getMessage());
    }
    localdqh.aOF = this.aOF;
    return localdqh;
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
      switch (anL.aCX[((eu)this.aOF).ordinal()]) {
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

  public void a(aVc paramaVc) {
    super.a(paramaVc);
    if ((this.eWL != null) && (((dpI)this.eWL).bep() == 4))
      this.aOC = (0 == ((dpI)this.eWL).a(3, cVC(), dNF.mei));
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