import java.util.BitSet;
import org.apache.log4j.Logger;

public class dWw extends doA
{
  private static final aee bx = new bOO(new Oe());

  private static final qM by = new dzQ(new ec[] { new dLx("Set de Charac = charac du caster (a utiliser dans certains cas particulier)", new dmb[0]), new dLx("Set de Charac = valeur (a utiliser dans certains cas particulier). Max non setté", new dmb[] { new dmb("valeur", dnN.lnR) }), new dLx("Set de Charac = valeur (a utiliser dans certains cas particulier). Max settable", new dmb[] { new dmb("valeur", dnN.lnR), new dmb("set max (0 = non, 1 = oui)", dnN.lnS) }) });
  private boolean mwJ;
  private cCH aFR = new Oc(this, 1);
  private dSc aOF;
  private boolean mwK = false;

  public qM aF()
  {
    return by;
  }

  private dWw()
  {
  }

  public dWw(dSc paramdSc)
  {
    this.aOF = paramdSc;
    aH();
  }

  public dWw dvG()
  {
    dWw localdWw;
    try {
      localdWw = (dWw)bx.Mm();
      localdWw.aOr = bx;
    } catch (Exception localException) {
      localdWw = new dWw();
      localdWw.aOr = null;
      K.error("Erreur lors d'un checkOut sur un SetCharac : " + localException.getMessage());
    }
    localdWw.aOF = this.aOF;
    return localdWw;
  }

  public dSc sw() {
    return this.aOF;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((bkt()) && 
      (this.mwK) && 
      (this.evo != null) && (this.evo.b(this.aOF))) {
      this.cxl = this.evo.e(this.aOF);
    }

    switch (this.aOF.ln()) {
    case 0:
      if ((this.evp != null) && (this.evp.b(this.aOF))) {
        cqm localcqm = this.evp.a(this.aOF);
        if (this.mwJ)
          localcqm.setMax(this.cxl);
        localcqm.set(this.cxl);
      }break;
    case 1:
    }
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    this.mwK = true;
    this.mwJ = false;
    if ((this.eWL == null) || (((dpI)this.eWL).bep() == 0))
      return;
    this.mwK = false;
    if (((dpI)this.eWL).bep() >= 1)
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.meh);
    if (((dpI)this.eWL).bep() >= 2)
      this.mwJ = (((dpI)this.eWL).a(1, s, dNF.meh) == 1);
  }

  public void aH()
  {
    super.aH();
    if ((this.aOF.ln() == 0) && 
      (this.aOF == eu.azE))
      this.eWR.set(2140);
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

  public void aK()
  {
    super.aK();
  }

  public void bc()
  {
    this.mwJ = false;
    super.bc();
  }

  public cCH lJ()
  {
    return this.aFR;
  }
}