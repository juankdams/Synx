import org.apache.log4j.Logger;

public class vV extends doA
{
  private static final aee bx = new bOO(new cYQ());

  private static final qM by = new dzQ(new ec[] { new dLx("Gain de niveau de sort", new dmb[] { new dmb("id du sort", dnN.lnQ), new dmb("valeur (en niveaux)", dnN.lnR) }) });
  private int bla;

  public qM aF()
  {
    return by;
  }

  public vV()
  {
    aH();
  }

  public vV Fg()
  {
    vV localvV;
    try {
      localvV = (vV)bx.Mm();
      localvV.aOr = bx;
    } catch (Exception localException) {
      localvV = new vV();
      localvV.aOr = null;
      K.error("Erreur lors d'un checkOut sur un " + vV.class + " : " + localException.getMessage());
    }
    localvV.bla = this.bla;
    return localvV;
  }

  public int Fh() {
    return this.bla;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    bfE localbfE = Fi();

    if ((this.evp != null) && (localbfE != null)) {
      localbfE.jv(this.cxl);
      ((dhJ)this.evp).n(localbfE.Cz());
    } else {
      jJ(true);
    }
  }

  private bfE Fi() {
    if (this.evp == null) {
      return null;
    }
    dCi localdCi = ((dhJ)this.evp).auL();

    if (localdCi == null) {
      return null;
    }
    return (bfE)localdCi.hh(this.bla);
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL != null) {
      this.bla = ((dpI)this.eWL).a(0, s, dNF.meh);
      this.cxl = ((dpI)this.eWL).a(1, s, dNF.meh);
    }
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

  public void aK()
  {
    if (this.ksH) {
      bfE localbfE = Fi();
      if (localbfE != null) {
        localbfE.jv(-this.cxl);
        if (this.evp != null)
          ((dhJ)this.evp).n(localbfE.Cz());
      }
    }
    super.aK();
  }
}