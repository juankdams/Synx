import java.util.BitSet;
import org.apache.log4j.Logger;

public class aeU extends doA
{
  private static final aee bx = new bOO(new dJa());
  private static final int bHz = 1;
  private static final int bHA = 2;
  private static final int bHB = 3;
  private static final int bHC = 4;
  private static final qM by = new dzQ(new ec[] { new dLx("Boost de HP en fonction du bonus dmg d'un element", new dmb[] { new dmb("valeur (1 pour dmg air, 2 pour dmg terre, 3 pour dmg feu, 4 pour dmg eau )", dnN.lnR), new dmb("% de la valeur à ajouter", dnN.lnR), new dmb("Augmente la valeur courante (0 non 1 oui)", dnN.lnS), new dmb("Diminue à la désapplication (0 généralement. Si vous hésitez, demandez ! Bug à l'horizon)", dnN.lnS) }) });

  protected boolean aOG = true;
  protected boolean aOH = true;
  protected int aOI;
  private cCH aGA = new dIS(this);

  public qM aF()
  {
    return by;
  }

  public aeU() {
    aH();
  }

  public aeU aqz()
  {
    aeU localaeU;
    try {
      localaeU = (aeU)bx.Mm();
      localaeU.aOr = bx;
    } catch (Exception localException) {
      localaeU = new aeU();
      localaeU.eXg = false;
      localaeU.aOr = null;
      K.error("Erreur lors d'un checkOut sur un CharacBuff : " + localException.getMessage());
    }
    return localaeU;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(3);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp == null) || (!this.evp.b(eu.ayM))) {
      jJ(true);
      return;
    }

    cqm localcqm = this.evp.a(eu.ayM);
    int i = localcqm.max();
    int j = localcqm.acX();
    localcqm.gx(this.cxl);
    if (bkt()) {
      this.cxl = (localcqm.acX() - j);
      this.aOI = (localcqm.max() - i);
    }

    if (this.aOG) {
      localcqm.gv(this.aOI);
      this.ksH = true;
    }
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL != null) {
      short s = cVC();
      int i = ((dpI)this.eWL).a(0, s, dNF.mei);
      int j = ((dpI)this.eWL).a(1, s, dNF.mei);
      switch (i) {
      case 1:
        if (bke().b(eu.azg)) {
          this.cxl = bke().e(eu.azg);
        }
        if (bke().b(eu.azt))
          this.cxl += bke().e(eu.azt); break;
      case 2:
        if (bke().b(eu.azf)) {
          this.cxl = bke().e(eu.azf);
        }
        if (bke().b(eu.azu))
          this.cxl += bke().e(eu.azu); break;
      case 3:
        if (bke().b(eu.azd)) {
          this.cxl = bke().e(eu.azd);
        }
        if (bke().b(eu.azv))
          this.cxl += bke().e(eu.azv); break;
      case 4:
        if (bke().b(eu.aze)) {
          this.cxl = bke().e(eu.aze);
        }
        if (bke().b(eu.azs))
          this.cxl += bke().e(eu.azs); break;
      default:
        this.cxl = 0;
      }

      if (bke().b(eu.azc)) {
        this.cxl += bke().e(eu.azc);
      }

      this.cxl = (this.cxl * j / 100);

      if (((dpI)this.eWL).a(2, s, dNF.mei) == 0) {
        this.aOG = false;
      }
      if (((dpI)this.eWL).a(3, s, dNF.mei) == 0)
        this.aOH = false;
    }
  }

  public void aK()
  {
    if ((this.ksH) && 
      (this.evp != null) && (this.evp.b(eu.ayM))) {
      cqm localcqm = this.evp.a(eu.ayM);

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

  public cCH lJ()
  {
    return this.aGA;
  }
}