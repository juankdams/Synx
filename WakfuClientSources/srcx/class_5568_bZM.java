import org.apache.log4j.Logger;

public final class bZM extends doA
{
  private static final aee bx = new bOO(new cNZ());

  private static final qM by = new dzQ(new ec[] { new dLx("Défaut", new dmb[] { new dmb("Id de la propriété", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public bZM() {
    aH();
  }

  public aVc aO() {
    bZM localbZM;
    try {
      localbZM = (bZM)bx.Mm();
      localbZM.aOr = bx;
    } catch (Exception localException) {
      localbZM = new bZM();
      localbZM.aOr = null;
      localbZM.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ApplyFightProperty : " + localException.getMessage());
    }
    localbZM.cxl = this.cxl;
    return localbZM;
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    if (this.evp == null) {
      jJ(true);
      return;
    }

    cfY localcfY = cfY.vg(this.cxl);
    if (localcfY == null) {
      jJ(true);
      return;
    }

    this.evp.a(localcfY);
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
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  public void aK() {
    cfY localcfY = cfY.vg(this.cxl);
    if (localcfY == null) {
      return;
    }
    this.evp.b(localcfY);

    super.aK();
  }
}