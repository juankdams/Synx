import java.util.HashMap;

public enum clq
{
  private static final HashMap hNl;
  private final String hge;

  private clq(String arg3)
  {
    Object localObject;
    this.hge = localObject;
  }

  public static clq lr(String paramString) {
    return (clq)hNl.get(paramString);
  }

  public String getTag() {
    return this.hge;
  }

  static
  {
    hNl = new HashMap();

    for (clq localclq : values())
      hNl.put(localclq.hge, localclq);
  }
}