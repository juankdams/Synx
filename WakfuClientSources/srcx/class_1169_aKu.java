import org.apache.log4j.Logger;

public final class aKu extends doA
{
  private static final aee bx = new bOO(new bHQ());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[] { new dmb("Nouveau min", dnN.lnR) }) });
  private eu aCa;

  public qM aF()
  {
    return by;
  }

  public aKu(eu parameu)
  {
    this.aCa = parameu;
    aH();
  }

  private aKu()
  {
  }

  public aKu bcg() {
    aKu localaKu;
    try {
      localaKu = (aKu)bx.Mm();
      localaKu.aOr = bx;
    } catch (Exception localException) {
      localaKu = new aKu();
      localaKu.aOr = null;
      localaKu.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacMinModification : " + localException.getMessage());
    }
    localaKu.aCa = this.aCa;
    return localaKu;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp == null) || (!this.evp.b(this.aCa))) {
      cVD();
      return;
    }

    cqm localcqm = this.evp.a(this.aCa);
    int i = localcqm.min();
    if (bkt()) {
      localcqm.setMin(this.cxl);
      this.cxl = (localcqm.min() - i);
    } else {
      localcqm.setMin(localcqm.min() + this.cxl);
    }
  }

  public void aK()
  {
    if ((this.evp == null) || (!this.evp.b(this.aCa))) {
      return;
    }
    cqm localcqm = this.evp.a(this.aCa);
    localcqm.setMin(localcqm.min() - this.cxl);
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
    this.aCa = null;
    super.bc();
  }
}