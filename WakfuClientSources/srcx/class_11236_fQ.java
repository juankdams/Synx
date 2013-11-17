public class fQ
  implements bYw
{
  private float aDg;
  private bNa aDh;
  private bNa aDi;
  private bNa aDj;
  private String aDk;
  private boolean aDl = false;

  public fQ(float paramFloat, bNa parambNa1, bNa parambNa2, bNa parambNa3, String paramString) {
    this.aDg = paramFloat;
    this.aDh = parambNa1;
    this.aDi = parambNa2;
    this.aDj = parambNa3;
    this.aDk = paramString;

    this.aDl = true;
  }

  public fQ(K paramK, uk paramuk) {
    if (!paramK.getName().equalsIgnoreCase("tooltip")) {
      return;
    }

    this.aDg = cJN.iId;

    K localK = paramK.e("borderWidth");
    if (localK != null) {
      this.aDg = localK.ai();
    }

    this.aDh = cJN.iIa;

    localK = paramK.e("backgroundColor");
    bNa localbNa;
    if (localK != null) {
      localbNa = this.aDh;

      this.aDh = paramuk.aJ(localK.getStringValue());

      if (this.aDh == null) {
        this.aDh = ((bNa)aKN.bcs().b(bNa.class, localK.getStringValue()));
      }

      if (this.aDh == null) {
        this.aDh = localbNa;
      }
    }

    this.aDi = cJN.iHZ;

    localK = paramK.e("textColor");
    if (localK != null) {
      localbNa = this.aDi;

      this.aDi = paramuk.aJ(localK.getStringValue());

      if (this.aDi == null) {
        this.aDi = ((bNa)aKN.bcs().b(bNa.class, localK.getStringValue()));
      }

      if (this.aDi == null) {
        this.aDi = localbNa;
      }
    }

    this.aDj = cJN.iIb;

    localK = paramK.e("borderColor");
    if (localK != null) {
      localbNa = this.aDj;

      this.aDj = paramuk.aJ(localK.getStringValue());

      if (this.aDj == null) {
        this.aDj = ((bNa)aKN.bcs().b(bNa.class, localK.getStringValue()));
      }

      if (this.aDj == null) {
        this.aDj = localbNa;
      }
    }

    this.aDk = null;

    localK = paramK.e("font");
    if (localK != null) {
      this.aDk = localK.getStringValue();
    }

    this.aDl = true;
  }

  public void a(uk paramuk) {
    if (this.aDl)
      paramuk.a(this.aDg, this.aDh, this.aDi, this.aDj, this.aDk);
  }

  public String a(uk paramuk, bUk parambUk)
  {
    if (!this.aDl) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();

    localStringBuilder.append("InitLoaderManager.getInstance().addLoader(new TooltipInitLoader(").append(this.aDg).append("f, ");

    localStringBuilder.append("new ").append(bNa.class.getSimpleName()).append("(").append(this.aDh.QC()).append("f, ").append(this.aDh.QD()).append("f, ").append(this.aDh.QE()).append("f, ").append(this.aDh.getAlpha()).append("f), ");

    localStringBuilder.append("new ").append(bNa.class.getSimpleName()).append("(").append(this.aDi.QC()).append("f, ").append(this.aDi.QD()).append("f, ").append(this.aDi.QE()).append("f, ").append(this.aDi.getAlpha()).append("f), ");

    localStringBuilder.append("new ").append(bNa.class.getSimpleName()).append("(").append(this.aDj.QC()).append("f, ").append(this.aDj.QD()).append("f, ").append(this.aDj.QE()).append("f, ").append(this.aDj.getAlpha()).append("f), ");

    localStringBuilder.append("\"").append(this.aDk).append("\"));");

    return localStringBuilder.toString();
  }

  public void a(bKD parambKD) {
    if (!this.aDl) {
      return;
    }

    String str = parambKD.bSL();

    parambKD.a(new bol(null, "loadTooltip", str, new String[] { this.aDg + "f", "new " + bNa.class.getSimpleName() + "(" + this.aDh.QC() + "f, " + this.aDh.QD() + "f, " + this.aDh.QE() + "f, " + this.aDh.getAlpha() + "f)", "new " + bNa.class.getSimpleName() + "(" + this.aDi.QC() + "f, " + this.aDi.QD() + "f, " + this.aDi.QE() + "f, " + this.aDi.getAlpha() + "f)", "new " + bNa.class.getSimpleName() + "(" + this.aDj.QC() + "f, " + this.aDj.QD() + "f, " + this.aDj.QE() + "f, " + this.aDj.getAlpha() + "f)", "\"" + this.aDk + "\"" }));
  }

  public boolean isInitialized()
  {
    return this.aDl;
  }
}