import org.apache.log4j.Logger;

public final class aPX extends doA
{
  private static final aee bx = new bOO(new bbC());

  private static final qM by = new dzQ(new ec[] { new dLx("Défaut", new dmb[] { new dmb("Id de la propriété", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public aPX() {
    aH();
  }

  public aVc aO() {
    aPX localaPX;
    try {
      localaPX = (aPX)bx.Mm();
      localaPX.aOr = bx;
    } catch (Exception localException) {
      localaPX = new aPX();
      localaPX.aOr = null;
      localaPX.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RemoveFightProperty : " + localException.getMessage());
    }
    localaPX.cxl = this.cxl;
    return localaPX;
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

    this.evp.b(localcfY);
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
}