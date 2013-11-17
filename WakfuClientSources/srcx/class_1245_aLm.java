import org.apache.log4j.Logger;

public final class aLm extends doA
{
  private static final aee bx = new bOO(new czy());

  private static final qM by = new dzQ(new ec[] { new dLx("Id du sort à ajouter, et niveau", new dmb[] { new dmb("Id du sort", dnN.lnR), new dmb("Niveau : -1 = niveau de la cible, -2 = niveau du caster, -3 = niveau du sort courant", dnN.lnR) }) });
  private short epB;
  public cCH aAR = new czB(this, 2);

  public qM aF()
  {
    return by;
  }

  public aLm() {
    aH();
  }

  public aLm bcM()
  {
    aLm localaLm;
    try {
      localaLm = (aLm)bx.Mm();
      localaLm.aOr = bx;
    } catch (Exception localException) {
      localaLm = new aLm();
      localaLm.aOr = null;
      localaLm.eXg = false;
      localaLm.epB = 0;
      K.error("Erreur lors d'un checkOut sur un AddSpellToTemporaryInventory : " + localException.getMessage());
    }
    return localaLm;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    short s = (short)((dpI)this.eWL).a(1, cVC(), dNF.meh);
    switch (s) {
    case -1:
      if ((bkf() != null) && ((bkf() instanceof dHW)))
        this.epB = ((dHW)bkf()).nU();
      else
        this.epB = 0;
      break;
    case -2:
      if ((bke() != null) && ((bke() instanceof dHW)))
        this.epB = ((dHW)bke()).nU();
      else
        this.epB = 0;
      break;
    case -3:
      this.epB = cVC();
      break;
    default:
      this.epB = s;
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.evp == null) {
      cVD();
      return;
    }

    if (!(this.evp instanceof dhJ)) {
      cVD();
      return;
    }

    dhJ localdhJ = (dhJ)this.evp;
    if (!localdhJ.aeE())
      localdhJ.aeB();
    boolean bool = localdhJ.l(this.cxl, this.epB);

    if (!bool) {
      K.info("Unable to add spell " + this.cxl + " to temporary inventory of " + this.evp);
      cVD();
    }
  }

  public boolean Cu()
  {
    if (!(this.evp instanceof dhJ)) {
      return false;
    }
    return super.Cu();
  }

  public void aK()
  {
    if (!this.ksH)
      return;
    if (!(this.evp instanceof dhJ)) {
      return;
    }

    ((dhJ)this.evp).Ad(this.cxl);
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
    this.cxl = 0;
    this.epB = 0;
    super.bc();
  }

  public cCH lJ()
  {
    return this.aAR;
  }
}