import java.lang.reflect.Method;

public class cDp
  implements vN
{
  public static final vN iwH = new cDp(true);
  public static final vN iwI = new cDp(false);
  private final String suffix;

  protected cDp(boolean paramBoolean)
  {
    this.suffix = (paramBoolean ? "W" : "A");
  }

  public String a(bMB parambMB, Method paramMethod)
  {
    String str = paramMethod.getName();
    if ((!str.endsWith("W")) && (!str.endsWith("A"))) {
      try {
        str = parambMB.C(str + this.suffix, 1).getName();
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
      }
    }
    return str;
  }
}