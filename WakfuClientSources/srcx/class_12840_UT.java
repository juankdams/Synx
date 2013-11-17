public class UT extends cGj
{
  public static final String csm = "breedInfo";
  public static final String czg = "enabled";
  private final SB czh;
  private boolean bur;
  private int czi;

  public UT(SB paramSB)
  {
    this.czh = paramSB;
  }

  public void setEnabled(boolean paramBoolean) {
    this.bur = paramBoolean;
  }

  public boolean isEnabled() {
    return this.bur;
  }

  public void gX(int paramInt) {
    this.czi = paramInt;
  }

  public int aih() {
    return this.czi;
  }

  public String[] getFields() {
    return lJb;
  }

  public SB aii() {
    return this.czh;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("breedInfo")) {
      return aQC.bhe().nx(this.czh.uO());
    }
    if (paramString.equals("enabled")) {
      return Boolean.valueOf(this.bur);
    }
    return null;
  }
}