import org.apache.log4j.Logger;

public final class dz extends aWl
{
  private static final aee bx = new bOO(new cNh());

  public dz()
  {
    aH();
  }

  public dz hs()
  {
    dz localdz;
    try {
      localdz = (dz)bx.Mm();
      localdz.aOr = bx;
    } catch (Exception localException) {
      localdz = new dz();
      localdz.aOr = null;
      localdz.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HPGainForUndead : " + localException.getMessage());
    }
    return localdz;
  }

  protected void ht()
  {
    if ((this.evp == null) || (!this.evp.b(eu.ayM))) {
      jJ(true);
      return;
    }
    bmb();
  }

  public void bc()
  {
    super.bc();
  }
}