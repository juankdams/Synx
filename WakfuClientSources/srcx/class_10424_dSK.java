public class dSK
{
  public static final dSK moQ = new dSK("encryption");

  public static final dSK moR = new dSK("compression method");

  public static final dSK moS = new dSK("data descriptor");
  private final String name;

  private dSK(String paramString)
  {
    this.name = paramString;
  }

  public String toString()
  {
    return this.name;
  }
}