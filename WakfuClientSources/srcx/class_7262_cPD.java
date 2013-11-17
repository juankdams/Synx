import org.apache.log4j.Logger;

public final class cPD extends doA
{
  private static final aee bx = new bOO(new abt());

  private static final qM by = new dzQ(new ec[] { new dLx("Change la valeur de hp regen", new dmb[] { new dmb("Nouvelle valeur", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public aVc aO() {
    cPD localcPD;
    try {
      localcPD = (cPD)bx.Mm();
      localcPD.aOr = bx;
    } catch (Exception localException) {
      localcPD = new cPD();
      localcPD.aOr = null;
      K.error("Erreur lors d'un checkOut sur un CharacGain : " + localException.getMessage());
    }
    return localcPD;
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    if ((this.evp == null) || (!(this.evp instanceof dhJ))) {
      return;
    }
    ((dhJ)this.evp).rB(this.cxl);
  }

  public void a(aVc paramaVc) {
    if (((dpI)this.eWL).bep() == 1)
      this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.mei);
    else
      this.cxl = 0;
  }

  public void aK() {
    if ((this.evp == null) || (!(this.evp instanceof dhJ))) {
      return;
    }
    ((dhJ)this.evp).cRg();
    super.aK();
  }

  public boolean aL() {
    return true;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }

  public void bc() {
    super.bc();
  }
}