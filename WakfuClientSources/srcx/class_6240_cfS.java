import org.apache.log4j.Logger;

public class cfS extends doA
{
  private static final aee bx = new bOO(new dW());

  private static final qM by = new dzQ(new ec[] { new dLx("Param standard", new dmb[] { new dmb("Valeur", dnN.lnR), new dmb("Type de la valeur (0:increment, 1:nouvelle valeur)", dnN.lnR) }) });
  private boolean hAT;
  private byte hAU;

  public qM aF()
  {
    return by;
  }

  public cfS cis()
  {
    cfS localcfS;
    try {
      localcfS = (cfS)bx.Mm();
      localcfS.aOr = bx;
    } catch (Exception localException) {
      localcfS = new cfS();
      localcfS.aOr = null;
      localcfS.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SetGlyph : " + localException.getMessage());
    }
    return localcfS;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!(this.evp instanceof ajF)) {
      K.error("Execution impossible, la cible n'est pas du bon type");
      jJ(true);
      return;
    }
    ajF localajF = (ajF)this.evp;

    this.hAU = localajF.aws();
    if (this.hAT)
      localajF.aZ((byte)(this.hAU + this.cxl));
    else
      localajF.aZ((byte)this.cxl);
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL != null) {
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.meh);
      this.hAT = (((dpI)this.eWL).a(1, s, dNF.meh) == 0);
    }
  }

  public void aK()
  {
    if ((this.evp instanceof ajF)) {
      ajF localajF = (ajF)this.evp;
      localajF.aZ(this.hAU);
    }
    super.aK();
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
}