import org.apache.log4j.Logger;

public final class cMd extends cXE
{
  private static final aee bx = new bOO(new dcD());

  private cMd()
  {
  }

  public cMd(eu parameu)
  {
    aH();
    this.aCa = parameu;
  }

  public cMd cFg()
  {
    cMd localcMd;
    try {
      localcMd = (cMd)bx.Mm();
      localcMd.aOr = bx;
    } catch (Exception localException) {
      localcMd = new cMd();
      localcMd.aOr = null;
      localcMd.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ModifySubEffectValueByCasterCharac : " + localException.getMessage());
    }
    localcMd.aCa = this.aCa;
    return localcMd;
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

  protected dle bKS() {
    return this.evo;
  }

  public void bc() {
    super.bc();
  }
}