import java.util.BitSet;
import org.apache.log4j.Logger;

public class dgb extends doA
{
  private static final aee bx = new bOO(new bYi());

  private static final qM by = new dzQ(new ec[] { new dLx("En fonction du caster", new dmb[] { new dmb("Valeur en %", dnN.lnR), new dmb("Augmente la valeur courante (0 non 1 oui)", dnN.lnS), new dmb("Diminue à la désapplication (0 généralement. Si vous hésitez, demandez ! Bug à l'horizon)", dnN.lnS) }) });
  private eu aCa;
  private boolean aOG = true;
  private boolean aOH = true;
  private int aOI = 0;

  private cCH aGA = new bYh(this);

  public qM aF()
  {
    return by;
  }

  private dgb() {
    aH();
  }

  public dgb(eu parameu) {
    this.aCa = parameu;
    aH();
  }

  public dgb cPG()
  {
    dgb localdgb;
    try {
      localdgb = (dgb)bx.Mm();
      localdgb.aOr = bx;
    } catch (Exception localException) {
      localdgb = new dgb();
      localdgb.eXg = false;
      localdgb.aOr = null;
      K.error("Erreur lors d'un checkOut sur un CharacBuff : " + localException.getMessage());
    }
    localdgb.aCa = this.aCa;
    return localdgb;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(3);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp == null) || (!this.evp.b(this.aCa))) {
      jJ(true);
      return;
    }

    if ((this.evp != null) && (this.evp.b(this.aCa))) {
      cqm localcqm = this.evp.a(this.aCa);
      int i = localcqm.acX();
      int j = localcqm.max();
      localcqm.gx(this.cxl);
      if (bkt()) {
        this.cxl = (localcqm.acX() - i);
        this.aOI = (localcqm.max() - j);
      }

      if (this.aOG) {
        localcqm.gv(this.aOI);
        this.ksH = true;
      }
    } else {
      jJ(true);
    }
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    short s = cVC();
    int i = ((dpI)this.eWL).a(0, s, dNF.mei);

    if (((dpI)this.eWL).a(1, s, dNF.mei) == 0)
      this.aOG = false;
    else {
      this.aOG = true;
    }
    if (((dpI)this.eWL).a(2, s, dNF.mei) == 0)
      this.aOH = false;
    else {
      this.aOH = true;
    }
    if ((this.evo != null) && (this.evo.b(this.aCa)))
    {
      this.cxl = (i * this.evo.a(this.aCa).max() / 100);
    }
  }

  public void aK()
  {
    if ((this.ksH) && 
      (this.evp != null) && (this.evp.b(this.aCa))) {
      cqm localcqm = this.evp.a(this.aCa);

      if (localcqm.value() > 0)
        localcqm.gw(this.aOI > localcqm.value() ? localcqm.value() - 1 : this.aOI);
      localcqm.gx(-this.cxl);
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

  public void bc()
  {
    super.bc();
    this.aOI = 0;
    this.aOG = true;
    this.aOH = true;
  }

  public cCH lJ()
  {
    return this.aGA;
  }
}