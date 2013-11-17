public class cbj extends cGj
{
  public static final String hsn = "iconStyle";
  public static final String aGo = "title";
  public static final String cgO = "text";
  public static final String cXf = "index";
  public static final String TYPE = "type";
  public final String[] bF = { "iconStyle", "title", "text", "index", "type" };
  private final ana hk;
  private final String hh;
  private final String hi;
  private final int hj;
  private int m_index;
  private dBv hl;

  public cbj(ana paramana, String paramString1, String paramString2, int paramInt, dBv paramdBv)
  {
    this.hk = paramana;
    this.hh = paramString1;
    this.hi = paramString2;
    this.hj = paramInt;
    this.hl = paramdBv;
  }

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("iconStyle")) {
      String str = this.hk.azN();
      return str == null ? "none" : str;
    }if (paramString.equals("title"))
      return this.hh;
    if (paramString.equals("index"))
      return Integer.valueOf(this.m_index);
    if (paramString.equals("text"))
      return this.hi;
    if (paramString.equals("type"))
      return Integer.valueOf(this.hk.getType());
    if (this.hl != null) {
      return this.hl.getFieldValue(paramString);
    }
    return null;
  }

  public ana bu() {
    return this.hk;
  }

  public int getIndex() {
    return this.m_index;
  }

  public void setIndex(int paramInt) {
    this.m_index = paramInt;
  }

  public int getSoundId() {
    return this.hj;
  }

  public String toString() {
    return this.hh + " index=" + this.m_index;
  }

  public boolean equals(Object paramObject) {
    return super.equals(paramObject);
  }
}