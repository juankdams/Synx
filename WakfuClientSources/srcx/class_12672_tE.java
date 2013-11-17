import java.util.BitSet;
import org.apache.log4j.Logger;

public final class tE extends doA
{
  private static final aee bx = new bOO(new bIb());

  private static final qM by = new dzQ(new ec[] { new dLx("Se lie avec la cible", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public tE() {
    aH();
  }

  public tE BU()
  {
    tE localtE;
    try {
      localtE = (tE)bx.Mm();
      localtE.aOr = bx;
    } catch (Exception localException) {
      localtE = new tE();
      localtE.aOr = null;
      localtE.eXg = false;
      K.error("Erreur lors d'un checkOut sur un LinkCasterAndTarget : " + localException.getMessage());
    }
    return localtE;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(2123);
  }

  public void a(aVc paramaVc)
  {
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    int i = 1;
    if ((this.evp == null) || (this.evo == null))
      i = 0;
    else if ((this.evp.c(cfY.hBk)) || (this.evo.c(cfY.hBk)))
      i = 0;
    else if ((!(this.evp instanceof dhJ)) || (!(this.evo instanceof dhJ))) {
      i = 0;
    }
    if (i == 0) {
      jJ(true);
      return;
    }

    dhJ localdhJ1 = (dhJ)this.evo;
    dhJ localdhJ2 = (dhJ)this.evp;

    localdhJ1.unlink();
    localdhJ2.unlink();

    localdhJ1.aV(localdhJ2);
    localdhJ2.aV(localdhJ1);
  }

  public void aK()
  {
    if ((this.evp == null) || (this.evo == null))
      return;
    if ((!(this.evp instanceof dhJ)) || (!(this.evo instanceof dhJ))) {
      return;
    }
    ((dhJ)this.evo).unlink();
    ((dhJ)this.evp).unlink();

    if (bkt()) {
      if (bkq() == this.evo.atO())
        this.evp.atO().a(wa(), true);
      else {
        this.evo.atO().a(wa(), true);
      }
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
}