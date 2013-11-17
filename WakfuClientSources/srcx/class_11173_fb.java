import java.util.Collection;
import org.apache.log4j.Logger;

public final class fb extends doA
{
  private static final aee bx = new bOO(new bqN());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[] { new dmb("Valeur en %", dnN.lnR) }) });

  private final cCH aBZ = new bqT(this, 4);
  private eu aCa;
  private int aCb;

  public qM aF()
  {
    return by;
  }

  private fb()
  {
    aH();
  }

  public fb(eu parameu) {
    aH();
    this.aCa = parameu;
  }

  public fb lZ()
  {
    fb localfb;
    try {
      localfb = (fb)bx.Mm();
      localfb.aOr = bx;
    } catch (Exception localException) {
      localfb = new fb();
      localfb.aOr = null;
      localfb.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HpBoostInPercentFunctionAlliesCount : " + localException.getMessage());
    }
    localfb.aCa = this.aCa;
    return localfb;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    if ((this.evp == null) || (!this.evp.b(this.aCa)) || (!(this.evp instanceof dhJ))) {
      return;
    }
    cOE localcOE = aIq();
    if (!(localcOE instanceof dMC)) {
      return;
    }
    dMC localdMC = (dMC)localcOE;
    dbE localdbE = localdMC.dps();
    if (localdbE == null) {
      return;
    }
    int i = localdbE.cj(((dhJ)this.evp).Fx()).size() - 1;

    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    this.cxl *= i;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp == null) || (!this.evp.b(this.aCa))) {
      cVD();
      return;
    }

    if (this.cxl == 0) {
      cVD();
      return;
    }

    cqm localcqm = this.evp.a(this.aCa);
    int i = localcqm.max();
    localcqm.gu(this.cxl);
    if (bkt()) {
      this.aCb = (localcqm.max() - i);
    }
    localcqm.gv(this.aCb);
  }

  public void aK()
  {
    if (!this.ksH) {
      super.aK();
      return;
    }
    if ((this.evp != null) && (this.evp.b(this.aCa)) && (this.cxl != 0)) {
      cqm localcqm = this.evp.a(this.aCa);

      if (localcqm.value() > 0)
        localcqm.gw(this.aCb > localcqm.value() ? localcqm.value() - 1 : this.aCb);
      localcqm.gu(-this.cxl);
    }
    super.aK();
  }

  public cCH lJ()
  {
    return this.aBZ;
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
    this.aCb = 0;
    super.bc();
  }
}