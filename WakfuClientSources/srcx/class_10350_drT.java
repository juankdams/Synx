public class drT extends cGj
  implements caY
{
  public static final String lul = "characValue";
  public static final String lum = "characMaxValue";
  public static final String ciu = "iconUrl";
  public static final String lun = "isHp";
  private static final String[] bF = { "characValue", "iconUrl" };
  private final Rx beP;

  public drT(Rx paramRx)
  {
    this.beP = paramRx;
    this.beP.a(this);
  }

  public String[] getFields() {
    return bF;
  }

  public void a(cqm paramcqm) {
    dLE.doY().a(this, new String[] { "characMaxValue" });
    dLE.doY().a(this, new String[] { "characValue" });
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("characValue"))
      return Integer.valueOf(this.beP.value());
    if (paramString.equals("characMaxValue"))
      return Integer.valueOf(this.beP.max());
    if (paramString.equals("isHp"))
      return Boolean.valueOf((this.beP.Ce() == eu.aAg) || (this.beP.Ce() == eu.ayM));
    if (paramString.equals("iconUrl"));
    return null;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("TimelineCellView");
    localStringBuilder.append("{m_charac=").append(this.beP);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}