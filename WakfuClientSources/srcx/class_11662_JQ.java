import org.apache.log4j.Logger;

public final class JQ extends doA
{
  private static final aee bx = new bOO(new bwb());

  private static final qM by = new dzQ(new ec[] { new dLx("Default", new dmb[0]) });
  private dPU bVb;

  public qM aF()
  {
    return by;
  }

  public JQ() {
    aH();
  }

  public JQ Up()
  {
    JQ localJQ;
    try {
      localJQ = (JQ)bx.Mm();
      localJQ.aOr = bx;
    } catch (Exception localException) {
      localJQ = new JQ();
      localJQ.aOr = null;
      localJQ.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ApAsMp : " + localException.getMessage());
    }
    return localJQ;
  }

  public void a(aVc paramaVc)
  {
    if ((this.evp == null) || (!this.evp.b(eu.ayN)) || (!this.evp.b(eu.ayO))) {
      return;
    }

    cqm localcqm = this.evp.a(eu.ayN);

    this.cxl = localcqm.max();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp == null) || (!this.evp.b(eu.ayN)) || (!this.evp.b(eu.ayO))) {
      cVD();
      return;
    }

    cqm localcqm1 = this.evp.a(eu.ayN);
    cqm localcqm2 = this.evp.a(eu.ayO);
    int i = localcqm1.value();

    localcqm2.setMax(localcqm2.max() + this.cxl);
    localcqm2.gv(i);

    this.bVb = new dPU(null);
    this.bVb.mjC = localcqm1.max();
    this.bVb.cug = localcqm1.value();
    this.bVb.evp = this.evp;

    localcqm1.a(this.bVb);
    this.evp.a(cfY.hBW);
  }

  public void aK()
  {
    if ((this.evp == null) || (!this.evp.b(eu.ayN)) || (!this.evp.b(eu.ayO))) {
      return;
    }

    cqm localcqm1 = this.evp.a(eu.ayN);
    cqm localcqm2 = this.evp.a(eu.ayO);

    localcqm1.b(this.bVb);

    int i = this.bVb == null ? 0 : this.bVb.mjD;
    localcqm2.setMax(localcqm2.max() - this.cxl - i);
    localcqm2.cpx();

    this.evp.b(cfY.hBW);

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
  }
}