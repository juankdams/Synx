public class cbT extends cGj
{
  public static final String cVG = "currency";
  public static final String beE = "value";
  public static final String aLh = "description";
  private final dPS htn;
  private final dlS cVN;

  public cbT(dlS paramdlS, dPS paramdPS)
  {
    this.cVN = paramdlS;
    this.htn = paramdPS;
  }

  public String[] getFields() {
    return lJb;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("currency")) {
      return this.cVN.fJ();
    }
    if (paramString.equals("value")) {
      return Integer.valueOf(this.htn.a(this.cVN));
    }
    if (paramString.equals("description")) {
      return this.cVN.getDescription();
    }
    return null;
  }

  void cfz() {
    dLE.doY().a(this, new String[] { "value" });
  }

  public String toString()
  {
    return "WalletEntry{m_currency=" + this.cVN + '}';
  }
}