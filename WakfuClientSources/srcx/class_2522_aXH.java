import org.apache.log4j.Logger;

public final class aXH extends bFw
{
  private static final aee bx = new bOO(new bWj());

  private static final qM by = new dzQ(new ec[] { new dLx("Dommages + % de dégâts subis", new dmb[] { new dmb("Dmg ou valeur %", dnN.lnR), new dmb("+% des dégâts infligés ", dnN.lnS) }) });
  private int fdj;

  public qM aF()
  {
    return by;
  }

  public aXH()
  {
    aH();
  }

  public aXH(bTI parambTI, dnO paramdnO) {
    super(parambTI, paramdnO);
  }

  public aXH bmT()
  {
    aXH localaXH;
    try {
      localaXH = (aXH)bx.Mm();
      localaXH.aOr = bx;
    } catch (Exception localException) {
      localaXH = new aXH();
      localaXH.aOr = null;
      localaXH.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HpLossThenHpLossFunctionPreviousValue : " + localException.getMessage());
    }
    a(localaXH);
    return localaXH;
  }

  protected void b(aVc paramaVc) {
    bNo();
    short s = cVC();
    if (this.eWL == null) {
      return;
    }
    this.cxl = ((dpI)this.eWL).a(0, s, dNF.meh);
    this.fdj = ((dpI)this.eWL).a(1, s, dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    super.a(paramaVc, paramBoolean);

    b(paramaVc, paramBoolean);

    if (!bkt()) {
      return;
    }
    int i = this.cxl * this.fdj / 100;
    if (i == 0) {
      return;
    }
    bFw localbFw = bFw.a(this.ejP, Cz(), dnO.lnU, i, this.evp);
    localbFw.bkr();
    localbFw.b(bdH.brN());
    localbFw.i(this.evo);
    localbFw.c(null, false);
  }

  public void bc()
  {
    this.fdj = 0;
    super.bc();
  }
}