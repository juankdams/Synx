public class dHE extends dkV
{
  private String eoE;
  private String eoF;
  private aeB eoG;
  private cfC eoH;
  private boolean initialized = false;
  private String eoI = "";
  private int eoJ;
  private cyp cVX;

  public void setPattern(String paramString)
  {
    this.eoE = paramString;
  }

  public void gH(String paramString)
  {
    this.eoF = paramString;
  }

  public void gI(String paramString)
  {
    this.eoI = paramString;
  }

  private void initialize() {
    if (this.initialized) {
      return;
    }
    this.eoJ = aAd.fY(this.eoI);
    if (this.eoE == null) {
      throw new cJ("Missing pattern in replaceregex");
    }
    this.eoG = new aeB();
    this.eoG.setPattern(this.eoE);
    this.cVX = this.eoG.r(Ga());
    if (this.eoF == null) {
      this.eoF = "";
    }
    this.eoH = new cfC();
    this.eoH.setExpression(this.eoF);
  }

  public String dR(String paramString)
  {
    initialize();

    if (!this.cVX.u(paramString, this.eoJ)) {
      return paramString;
    }
    return this.cVX.b(paramString, this.eoH.P(Ga()), this.eoJ);
  }
}