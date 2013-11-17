public class bRB extends cGj
{
  public static final String hbj = "quest";
  private final int aw;

  public bRB(int paramInt)
  {
    this.aw = paramInt;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("quest")) {
      aiX localaiX = Oj.cfd.gf(this.aw);
      return localaiX.avJ() ? null : cHT.iDr.xQ(localaiX.sY());
    }
    return null;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AlmanachEntryView");
    localStringBuilder.append("{m_id=").append(this.aw);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}