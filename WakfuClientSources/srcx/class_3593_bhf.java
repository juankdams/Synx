public final class bhf
{
  private static final String fvS = "ant:if";
  private static final String fvT = "ant:unless";
  private static final String fvU = "org.apache.tools.ant.";
  private final aXW fvV;

  public bhf(aXW paramaXW)
  {
    this.fvV = paramaXW;
  }

  public void execute()
  {
    io("ant:if");
    io("ant:unless");

    Y("true", "IfTrueAttribute");
    Y("set", "IfSetAttribute");
    Y("blank", "IfBlankAttribute");
  }

  private void io(String paramString) {
    dTY localdTY = new dTY();
    localdTY.setName(dhB.pf(paramString));
    localdTY.setClassName("org.apache.tools.ant.attribute.AttributeNamespace");
    localdTY.setClassLoader(getClass().getClassLoader());
    localdTY.iC(true);
    this.fvV.a(localdTY);
  }

  private void Y(String paramString1, String paramString2) {
    String str = "org.apache.tools.ant.attribute." + paramString2;
    d("ant:if", paramString1, str);
    d("ant:unless", paramString1, str + "$Unless");
  }

  private void d(String paramString1, String paramString2, String paramString3) {
    dTY localdTY = new dTY();
    String str = dhB.bg(paramString1, paramString2);
    localdTY.setName(dhB.bg(paramString1, paramString2));
    localdTY.setClassName(paramString3);
    localdTY.setClassLoader(getClass().getClassLoader());
    localdTY.iC(true);
    this.fvV.a(localdTY);
  }
}