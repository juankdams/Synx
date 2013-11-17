import org.apache.log4j.Logger;

public final class jx extends bIL
{
  private static final aee bx = new bOO(new bFW());

  private static final qM by = new dzQ(new ec[] { new dLx("Base HP", new dmb[] { new dmb("Id du bloc", dnN.lnR), new dmb("Base HP", dnN.lnS) }) });
  private int aLC;
  private cCH aFR = new bFX(this, 19);

  public qM aF()
  {
    return by;
  }

  public jx() {
    aH();
  }

  public jx rk()
  {
    jx localjx;
    try {
      localjx = (jx)bx.Mm();
      localjx.aOr = bx;
    } catch (Exception localException) {
      localjx = new jx();
      localjx.aOr = null;
      localjx.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SetSteamerBlock : " + localException.getMessage());
    }
    return localjx;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    super.a(paramaVc, paramBoolean);
    rm();
  }

  public void a(aVc paramaVc) {
    short s = cVC();
    if (this.eWL != null)
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.meh);
    this.aDR = this.ejP.LD().P((byte)2);
    this.gIY = cVC();
    this.gIZ = false;
    this.gJc = CG.bFM;
    this.aLC = rl();
  }

  private int rl() {
    int i = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
    if (this.evo == null) {
      return i;
    }
    int j = this.evo.e(eu.azf);
    int k = this.evo.e(eu.azc);

    return i + i * (j + k) / 100;
  }

  private void rm() {
    if (this.evo == null)
      return;
    if (this.gIX == null)
      return;
    cqm localcqm1 = this.gIX.a(eu.ayM);
    localcqm1.setMax(this.aLC);
    localcqm1.cpx();

    a(eu.azn);
    a(eu.azm);
    a(eu.azk);
    a(eu.azl);
    a(eu.azj);

    Iterable localIterable = this.evo.atO().Cv(bsj.fYS.getId());
    cqm localcqm2 = this.gIX.a(eu.azj);
    for (aVc localaVc : localIterable)
      localcqm2.gv(localaVc.getValue());
  }

  private void a(eu parameu)
  {
    this.gIX.a(parameu).set(this.evo.e(parameu));
  }

  public cCH lJ()
  {
    return this.aFR;
  }
}