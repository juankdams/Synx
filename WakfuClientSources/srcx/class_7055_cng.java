public abstract class cng extends cGj
  implements Comparable
{
  protected static final int hSY = 0;
  protected static final int hSZ = 1;
  public static final String TYPE = "type";
  public static final String hTa = "memberName";
  public static final String bXN = "date";
  private static final String[] bF = new String[0];
  protected final XP hTb;

  public cng(XP paramXP)
  {
    this.hTb = paramXP;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("memberName"))
      return this.hTb.getMemberName();
    if (paramString.equals("date")) {
      cYq localcYq = cYq.jq(this.hTb.getDate());
      return bU.fH().c(localcYq);
    }if (paramString.equals("type")) {
      return Integer.valueOf(getType());
    }
    return null;
  }

  protected abstract int getType();

  public int a(cng paramcng) {
    return bCO.gq(paramcng.hTb.getDate() - this.hTb.getDate());
  }
}