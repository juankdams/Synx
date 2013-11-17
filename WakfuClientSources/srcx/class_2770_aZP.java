import org.apache.log4j.Logger;

public final class aZP extends doA
{
  private static final aee bx = new bOO(new Un());

  private static final qM by = new dzQ(new ec[] { new dLx("State Application Bonus", new dmb[] { new dmb("Id de l'état", dnN.lnQ), new dmb("nb point de bonus", dnN.lnR) }) });
  private short aGz;
  private cCH aGA = new Uj(this, 2);

  public qM aF()
  {
    return by;
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    if (this.evp == null)
      return;
    if (this.aGz == -1)
      return;
    if (!(this.evp instanceof dhJ))
      return;
    dhJ localdhJ = (dhJ)this.evp;
    localdhJ.j(this.aGz, this.cxl);
  }

  public aVc aO() {
    aZP localaZP;
    try {
      localaZP = (aZP)bx.Mm();
      localaZP.aOr = bx;
    } catch (Exception localException) {
      localaZP = new aZP();
      localaZP.aOr = null;
      localaZP.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacBuff : " + localException.getMessage());
    }
    localaZP.aGz = this.aGz;
    return localaZP;
  }

  public boolean aL() {
    return false;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null)
      return;
    if (((dpI)this.eWL).bep() != 2) {
      K.error("Pas le bon nombre de paramètres !!");
      return;
    }
    short s = cVC();
    this.aGz = ((short)((dpI)this.eWL).a(0, s, dNF.mei));
    this.cxl = ((dpI)this.eWL).a(1, s, dNF.mei);
  }

  public cCH lJ() {
    return this.aGA;
  }

  public void aJ()
  {
    super.aJ();
    this.aGz = -1;
  }

  public void aK() {
    dhJ localdhJ = (dhJ)this.evp;
    localdhJ.j(this.aGz, -this.cxl);
    super.aK();
  }
}