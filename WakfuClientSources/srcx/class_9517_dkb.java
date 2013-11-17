import java.util.BitSet;
import org.apache.log4j.Logger;

public class dkb extends doA
{
  private static final aee bx = new bOO(new aqO());

  private static final qM by = new dzQ(new ec[] { new dLx("Pas de param", new dmb[0]), new dLx("Ne declenche pas de KO", new dmb[] { new dmb("Pas de KO (non = 0 (defaut), oui = 1)", dnN.lnS) }) });
  private boolean lhk;

  public qM aF()
  {
    return by;
  }

  public dkb() {
    aH();
    this.eWR.set(192);
  }

  public dkb cSK()
  {
    dkb localdkb;
    try {
      localdkb = (dkb)bx.Mm();
      localdkb.aOr = bx;
    } catch (Exception localException) {
      localdkb = new dkb();
      localdkb.eXg = false;
      localdkb.aOr = null;
      K.error("Erreur lors d'un checkOut sur un RE:Death : " + localException.getMessage());
    }
    this.eWS = 1;
    return localdkb;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(192);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.evp == null) {
      jJ(true);
      return;
    }

    if (this.evp.b(eu.ayM)) {
      this.evp.a(eu.ayM).cpy();
    } else if (this.evp.b(eu.aAg)) {
      this.evp.a(eu.aAg).cpy();
    } else {
      cVD();
      return;
    }

    if (this.lhk) {
      this.evp.a(cfY.hCl);
    }
    if (this.evp.b(eu.ayX))
      this.evp.a(eu.ayX).setMax(0);
  }

  public void a(aVc paramaVc)
  {
    this.lhk = false;
    if (this.eWL == null) {
      return;
    }
    if (((dpI)this.eWL).bep() == 0) {
      return;
    }
    if (((dpI)this.eWL).bep() >= 1)
      this.lhk = (((dpI)this.eWL).a(0, cVC(), dNF.meh) == 1);
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

  protected boolean afW()
  {
    return true;
  }

  public void bc()
  {
    super.bc();
    this.lhk = false;
  }
}