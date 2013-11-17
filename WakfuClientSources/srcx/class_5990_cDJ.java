import org.apache.log4j.Logger;

public final class cDJ extends doA
{
  private static final aee bx = new bOO(new cJS());

  private static final qM by = new dzQ(new ec[] { new dLx("Default", new dmb[] { new dmb("% de vie max en vie virtuelle", dnN.lnR) }) });
  private int ixl;
  private cCH aGA = new cJU(this);

  public qM aF()
  {
    return by;
  }

  public cDJ() {
    aH();
  }

  public cDJ czC()
  {
    cDJ localcDJ;
    try {
      localcDJ = (cDJ)bx.Mm();
      localcDJ.aOr = bx;
    } catch (Exception localException) {
      localcDJ = new cDJ();
      localcDJ.aOr = null;
      localcDJ.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SetVirtualHpFromHp : " + localException.getMessage());
    }
    return localcDJ;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);

    int i = this.evp.a(eu.ayM).max();
    this.cxl = (i * this.cxl / 100);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp == null) || (!this.evp.b(eu.ayM)) || (!this.evp.b(eu.aAj)))
    {
      cVD();
      return;
    }

    cqm localcqm1 = this.evp.a(eu.aAj);
    localcqm1.gx(this.cxl);
    if (bkt()) {
      cqm localcqm2 = this.evp.a(eu.ayM);
      float f = localcqm2.value() / localcqm2.max();
      localcqm1.set((int)(localcqm1.max() * f));
      this.ixl = localcqm1.value();
    } else {
      localcqm1.set(this.ixl);
    }
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
    this.ixl = 0;
    super.bc();
  }

  public cCH lJ()
  {
    return this.aGA;
  }
}