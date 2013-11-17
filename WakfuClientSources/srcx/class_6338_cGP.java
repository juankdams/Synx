public class cGP extends doh
  implements dBv
{
  public static final String ciu = "iconUrl";
  public static final String aLh = "description";

  public cGP(int paramInt, String paramString, TD paramTD)
  {
    super(paramInt, paramString, paramTD);
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("iconUrl"))
      return bU.a(fE());
    if (paramString.equals("description")) {
      String str = "community.description." + fE().getName().toUpperCase();
      if (!bU.fH().containsKey(str))
        return null;
      return bU.fH().getString(str);
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
}