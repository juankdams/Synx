public class bUF
  implements dBv
{
  public static final String bka = "duration";
  public static final String eMT = "selected";
  public static final String hgz = "taxFactor";
  private final bAp hgA;
  private boolean dBi;
  public final String[] bF = { "duration", "selected", "taxFactor" };

  public bUF(BG paramBG, bAp parambAp, boolean paramBoolean)
  {
    this.hgA = parambAp;
    this.dBi = paramBoolean;
  }

  public String caC() {
    return bU.fH().getString("duration.hour", new Object[] { Long.valueOf(this.hgA.gpg / 3600000L) });
  }

  public bAp bdK() {
    return this.hgA;
  }

  public void setSelected(boolean paramBoolean) {
    this.dBi = paramBoolean;
  }

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("duration"))
      return caC();
    if (paramString.equals("selected"))
      return Boolean.valueOf(this.dBi);
    if (paramString.equals("taxFactor")) {
      return bU.fH().getString("desc.taxFactor", new Object[] { Integer.valueOf((int)(this.hgA.gpi * 100.0D)) });
    }
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public String toString()
  {
    return caC();
  }
}