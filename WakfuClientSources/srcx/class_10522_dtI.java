public class dtI extends bzu
{
  private final String esb;
  private final Object[] lsg;

  public dtI(String paramString, Object[] paramArrayOfObject)
  {
    this.esb = paramString;
    this.lsg = paramArrayOfObject;
  }

  public int getId()
  {
    return 17350;
  }

  public String getCommand() {
    return this.esb;
  }

  public Object[] getParams() {
    return this.lsg;
  }
}