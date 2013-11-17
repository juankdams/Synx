public class aru extends csl
{
  public static final int ENABLED = 0;
  public static final int cRz = 1;
  protected int cRA;
  private String dzS;
  private boolean dzT;
  private String dzU;
  private boolean QX;

  public aru aDS()
  {
    return new aru();
  }

  public boolean isEnabled()
  {
    byz localbyz = byv.bFN().bFO();

    if (!bGP.gDx.a(new aGH[] { localbyz })) {
      this.cRA = 1;
      return false;
    }

    if (!this.dzT) {
      return false;
    }
    if (this.QX) {
      return false;
    }
    if (!super.isEnabled()) {
      return false;
    }
    this.cRA = 0;
    return true;
  }

  public String getLabel()
  {
    String str = super.getLabel();

    lZ locallZ = new lZ().a(str);

    if (this.cRA != 0) {
      locallZ.tH().am(ict);
      switch (this.cRA) {
      case 1:
        locallZ.a(bU.fH().getString("error.playerNotSubscribed"));
      }

      locallZ.tJ();
    }

    if ((this.dzS != null) && (this.dzS.length() > 0)) {
      locallZ.tH().a(this.dzS);
    }

    if ((this.dzU != null) && (this.dzU.length() > 0)) {
      locallZ.tH().a(this.dzU);
    }

    return locallZ.tP();
  }

  public void fn(String paramString) {
    this.dzS = paramString;
  }

  public void cM(boolean paramBoolean) {
    this.dzT = paramBoolean;
  }

  public void setLocked(boolean paramBoolean) {
    this.QX = paramBoolean;
  }

  public void fo(String paramString) {
    this.dzU = paramString;
  }
}