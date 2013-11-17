import java.util.HashMap;

public enum dEX
{
  private static final HashMap lOo;
  private final String lOp;
  private final String goZ;

  private dEX(String arg3, String arg4)
  {
    Object localObject1;
    this.lOp = localObject1;
    Object localObject2;
    this.goZ = localObject2;
  }

  public String dgD() {
    return this.lOp;
  }

  public String getPropertyName() {
    return this.goZ;
  }

  public static dEX qW(String paramString) {
    return (dEX)lOo.get(paramString);
  }

  static
  {
    lOo = new HashMap();

    for (dEX localdEX : values())
      lOo.put(localdEX.getPropertyName(), localdEX);
  }
}