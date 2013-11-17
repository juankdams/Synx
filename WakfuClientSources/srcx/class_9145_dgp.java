import org.apache.log4j.Logger;

public class dgp extends Vk
{
  private static final aee bx = new bOO(new aMk());

  private static final qM by = new dzQ(new ec[] { new dLx("Normal", new dmb[0]), new dLx("Original controleur", new dmb[] { new dmb("Controleur courant du caster (0 = non, 1 = oui)", dnN.lnS) }) });
  private boolean lbn;
  private boolean lbo;
  private final cCH cum = new aMm(this, 1);

  public qM aF()
  {
    return by;
  }

  public dgp cPO()
  {
    dgp localdgp;
    try {
      localdgp = (dgp)bx.Mm();
      localdgp.aOr = bx;
    } catch (Exception localException) {
      localdgp = new dgp();
      localdgp.aOr = null;
      localdgp.eXg = false;
      K.error("Erreur lors d'un newInstance sur ChangeController : " + localException.getMessage());
    }
    return localdgp;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evo == null) || (this.evp == null)) {
      cVD();
      return;
    }
    if (!(this.evo instanceof dhJ)) {
      return;
    }
    dhJ localdhJ = (dhJ)this.evo;
    long l;
    if ((this.lbo) && (localdhJ.afw() != null))
      l = localdhJ.afw().getId();
    else {
      l = this.evo.getId();
    }
    localdhJ.h(this.evp.getId(), l);
    if (bkt()) {
      aiq();
    }

    this.lbn = ((dhJ)this.evp).cQJ();
    if (((dhJ)this.evo).cQJ())
      ((dhJ)this.evp).jh(true);
  }

  public void aK()
  {
    if ((this.ksH) && ((this.evp instanceof dhJ))) {
      dhJ localdhJ = (dhJ)this.evp;
      localdhJ.aeb();
      localdhJ.jh(this.lbn);
    }
    super.aK();
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    if (((dpI)this.eWL).bep() >= 1)
      this.lbo = (((dpI)this.eWL).a(0, cVC(), dNF.meh) == 1);
    else
      this.lbo = false;
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

  public cCH lJ()
  {
    return this.cum;
  }

  public void bc()
  {
    this.lbo = false;
    super.bc();
  }
}