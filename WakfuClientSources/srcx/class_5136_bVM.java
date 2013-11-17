import org.apache.log4j.Logger;

public final class bVM extends Vk
{
  private static final aee bx = new bOO(new xP());

  private static final qM by = new dzQ(new ec[] { new dLx("Normal", new dmb[] { new dmb("ia (1) ou pas d'ia (0)", dnN.lnS) }) });

  public qM aF()
  {
    return by;
  }

  public bVM cbm()
  {
    bVM localbVM;
    try {
      localbVM = (bVM)bx.Mm();
      localbVM.aOr = bx;
    } catch (Exception localException) {
      localbVM = new bVM();
      localbVM.aOr = null;
      localbVM.eXg = false;
      K.error("Erreur lors d'un newInstance sur SetAI : " + localException.getMessage());
    }
    return localbVM;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp != null) && ((this.evp instanceof dhJ))) {
      ((dhJ)this.evp).jh(this.cxl == 1);
      if (bkt())
        aiq();
    }
  }

  public void aK()
  {
    if ((this.evp != null) && ((this.evp instanceof dhJ))) {
      dhJ localdhJ = (dhJ)this.evp;
      localdhJ.jh(localdhJ.JD());
    }
    super.aK();
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL != null) {
      int i = ((dpI)this.eWL).a(0, s, dNF.mei);
      if (i > 0)
        this.cxl = 1;
      else
        this.cxl = 0;
    }
  }

  public boolean aL()
  {
    return true;
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