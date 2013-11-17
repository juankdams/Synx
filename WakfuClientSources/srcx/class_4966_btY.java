public abstract class btY extends cGj
{
  public static final String NAME = "name";
  public static final String gde = "endangeredStatus";
  public static final String gdf = "endangeredStatus";
  public static final String gdg = "isProtected";
  public static final String gdh = "isExtinct";
  public static final String gdi = "canBeReintroduced";
  public static final String gdj = "protectionPrice";
  public static final String gdk = "protectionPriceValue";
  public static final String gdl = "reintroductionPrice";
  public static final String gdm = "reintroductionPriceValue";
  public static final String ciu = "iconUrl";
  public static final String gdn = "getSeedsText";
  protected final int aDH;
  protected final int gdo;
  protected final int gdp;
  protected final int gdq;

  protected btY(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.aDH = paramInt1;
    this.gdo = paramInt2;
    this.gdp = paramInt3;
    this.gdq = paramInt4;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("isProtected"))
      return Boolean.valueOf(isProtected());
    if (paramString.equals("isExtinct"))
      return Boolean.valueOf(fL());
    if (paramString.equals("protectionPrice"))
      return this.gdp + "§";
    if (paramString.equals("reintroductionPrice"))
      return this.gdq + "§";
    if (paramString.equals("protectionPriceValue"))
      return Integer.valueOf(this.gdp);
    if (paramString.equals("reintroductionPriceValue"))
      return Integer.valueOf(this.gdq);
    if (paramString.equals("iconUrl"))
      return fJ();
    if (paramString.equals("canBeReintroduced"))
      return Boolean.valueOf(fI());
    if (paramString.equals("getSeedsText"))
      return bU.fH().getString("craft.getSeeds", new Object[] { fN() });
    if (paramString.equals("endangeredStatus")) {
      if (fL())
        return bU.fH().getString("protector.ecosystem.extinct.species");
      if (fK()) {
        return bU.fH().getString("protector.ecosystem.endangered.species");
      }
      return bU.fH().getString("protector.ecosystem.well.representated.species");
    }
    if (paramString.equals("endangeredStatus")) {
      if (fL())
        return bNa.gRz.bUV();
      if (fK()) {
        return bNa.gRK.bUV();
      }
      return bNa.gRy.bUV();
    }

    return null;
  }

  public int nn() {
    return this.aDH;
  }

  public int bCf() {
    return this.gdp;
  }

  public int bCg() {
    return this.gdq;
  }

  protected abstract boolean fI();

  protected abstract String fJ();

  protected abstract String getName();

  protected abstract boolean isProtected();

  protected abstract boolean fK();

  protected abstract boolean fL();

  public abstract boolean fM();

  public abstract String fN();

  public void bCh() {
    dLE.doY().a(this, new String[] { "isProtected" });
  }

  public void bCi() {
    dLE.doY().a(this, new String[] { "isExtinct", "endangeredStatus", "endangeredStatus", "iconUrl" });
  }
}