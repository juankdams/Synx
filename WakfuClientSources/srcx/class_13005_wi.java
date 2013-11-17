public final class wi
{
  public static final wi blv = new wi("fail");

  public static final wi blw = new wi("warn");

  public static final wi blx = new wi("ignore");

  private static final wi[] bly = { blv, blw, blx };
  private final String name;

  private wi(String paramString)
  {
    this.name = paramString;
  }

  public String name() {
    return this.name;
  }

  public String toString() {
    return this.name;
  }

  public static wi aX(String paramString) {
    if (paramString == null) {
      throw new NullPointerException();
    }
    for (int i = 0; i < bly.length; i++) {
      if (paramString.equals(bly[i].name())) {
        return bly[i];
      }
    }
    throw new IllegalArgumentException("Unknown onMissingExtensionPoint " + paramString);
  }
}