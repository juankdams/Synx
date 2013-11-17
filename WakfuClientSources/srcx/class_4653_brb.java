public final class brb
{
  public static final brb fMm = new brb("always");

  public static final brb fMn = new brb("never");

  public static final brb fMo = new brb("not encodeable");
  private final String name;

  private brb(String paramString)
  {
    this.name = paramString;
  }

  public String toString() {
    return this.name;
  }
}