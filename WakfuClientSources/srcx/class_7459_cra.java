import org.apache.log4j.Logger;

public final class cra extends doA
{
  private static final aee bx = new bOO(new dpd());

  private static final qM by = new dzQ(new ec[] { new dLx("Défaut", new dmb[] { new dmb("Id de la propriété", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public cra() {
    aH();
  }

  public aVc aO()
  {
    cra localcra;
    try {
      localcra = (cra)bx.Mm();
      localcra.aOr = bx;
    } catch (Exception localException) {
      localcra = new cra();
      localcra.aOr = null;
      localcra.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ApplyFightProperty : " + localException.getMessage());
    }
    localcra.cxl = this.cxl;
    return localcra;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.evp == null) {
      jJ(true);
      return;
    }

    dKm localdKm = dKm.CM(this.cxl);
    if (localdKm == null) {
      jJ(true);
      return;
    }

    this.evp.a(localdKm);
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

  public void a(aVc paramaVc)
  {
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  public void aK()
  {
    if (this.evp == null) {
      return;
    }
    this.evp.b(dKm.CM(this.cxl));
  }
}