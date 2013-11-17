public class ces
  implements dBv
{
  public static final String RI = "description";
  public static final String aNY = "value";
  private int hyI;

  public ces(int paramInt)
  {
    this.hyI = paramInt;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("description"))
      return bU.fH().getString("realMonth." + this.hyI);
    if (paramString.equals("value")) {
      return Integer.valueOf(this.hyI);
    }
    return null;
  }

  public int cgN() {
    return this.hyI;
  }

  public String[] getFields() {
    return new String[0];
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString) {
    return false;
  }
}