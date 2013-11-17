public class mC extends axJ
  implements dBv
{
  public static final String bC = "name";
  public static final String aQV = "characterName";
  public static final String aQW = "displayedName";
  public static final String aQX = "online";
  public static final String[] bF = { "name", "characterName", "displayedName", "online" };

  public mC(String paramString1, String paramString2, boolean paramBoolean, long paramLong)
  {
    super(paramString1, paramString2, paramBoolean, paramLong);
  }

  public mC(long paramLong, String paramString1, String paramString2)
  {
    super(paramLong, paramString1, paramString2);
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("characterName"))
      return aJm();
    if (paramString.equals("displayedName")) {
      String str = aJm();
      if ((str != null) && (!str.equals(""))) {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(str).append("\n(");
        localStringBuilder.append(getName()).append(")");
        return localStringBuilder.toString();
      }
      return getName();
    }
    if (paramString.equals("online")) {
      return Boolean.valueOf(aJl());
    }
    return null;
  }

  public void G(boolean paramBoolean) {
    super.G(paramBoolean);
    dWe.dvA().a(this, new String[] { "online", "displayedName" });
  }

  public String[] getFields()
  {
    return bF;
  }

  public boolean l(String paramString)
  {
    return false;
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void a(String paramString, Object paramObject)
  {
  }
}