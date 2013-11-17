public class ddX extends cGj
{
  public static final String NAME = "name";
  public static final String beE = "value";
  private final cWb kXY;

  public ddX(cWb paramcWb)
  {
    this.kXY = paramcWb;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("name"))
      return this.kXY.getName();
    if (paramString.equals("value")) {
      return this.kXY;
    }
    return null;
  }

  public cWb cOR() {
    return this.kXY;
  }
}