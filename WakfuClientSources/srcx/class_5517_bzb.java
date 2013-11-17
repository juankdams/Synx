public class bzb extends cGj
{
  public static final String cTv = "title";
  public static final String aLh = "description";
  private String hh;
  private String aLm;

  public bzb(String paramString1, String paramString2)
  {
    this.hh = paramString1;
    this.aLm = paramString2;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("title")) {
      return this.hh;
    }
    if (paramString.equals("description")) {
      return this.aLm;
    }
    return null;
  }
}