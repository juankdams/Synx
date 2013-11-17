import org.apache.log4j.Logger;

public class Dh extends doA
{
  private static final aee bx = new bOO(new sh());
  private static final int bHz = 1;
  private static final int bHA = 2;
  private static final int bHB = 3;
  private static final int bHC = 4;
  private static final qM by = new dzQ(new ec[] { new dLx("Boost bonus soin en fonction d'une carac dommage", new dmb[] { new dmb("valeur (1 pour dmg air, 2 pour dmg terre, 3 pour dmg feu, 4 pour dmg eau )", dnN.lnR), new dmb("% de la valeur à ajouter", dnN.lnR) }) });

  private int aRo = 0;

  public qM aF()
  {
    return by;
  }

  public Dh() {
    aH();
  }

  public Dh Mu()
  {
    Dh localDh;
    try {
      localDh = (Dh)bx.Mm();
      localDh.aOr = bx;
    } catch (Exception localException) {
      localDh = new Dh();
      localDh.aOr = null;
      K.error("Erreur lors d'un checkOut sur un CharacGain : " + localException.getMessage());
    }
    return localDh;
  }

  public void aH()
  {
    super.aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp != null) && (this.evp.b(eu.aza)))
    {
      cqm localcqm = this.evp.a(eu.aza);

      int i = localcqm.value();

      localcqm.gv(this.cxl);

      this.aRo = (localcqm.value() - i);
    }
  }

  public void a(aVc paramaVc)
  {
    if (bke() == null) {
      this.cxl = 0;
      return;
    }
    short s = cVC();
    if ((this.eWL != null) && (((dpI)this.eWL).bep() > 0)) {
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
    }
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

  public void aK()
  {
    if ((this.ksH) && (bkM()) && 
      (this.evp != null) && (this.evp.b(eu.aza))) {
      cqm localcqm = this.evp.a(eu.aza);
      int i = localcqm.value() - this.aRo;
      localcqm.set(i);
    }

    super.aK();
  }
}