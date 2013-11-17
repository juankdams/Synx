import org.apache.log4j.Logger;

public final class bCl extends cXE
{
  private static final aee bx = new bOO(new afb());

  private bCl()
  {
  }

  public bCl(eu parameu)
  {
    aH();
    this.aCa = parameu;
  }

  public bCl bKR()
  {
    bCl localbCl;
    try {
      localbCl = (bCl)bx.Mm();
      localbCl.aOr = bx;
    } catch (Exception localException) {
      localbCl = new bCl();
      localbCl.aOr = null;
      localbCl.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ModifySubEffectValueByCasterCharac : " + localException.getMessage());
    }
    localbCl.aCa = this.aCa;
    return localbCl;
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
    return this.evp;
  }
}