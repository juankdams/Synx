public class bxy
{
  public static final String PACKAGE = "console";

  public static void processInputKeyEvent(ctH paramctH, dso paramdso)
  {
    bbo localbbo = paramdso.getProperty("debug.console");
    switch (paramctH.getKeyCode())
    {
    case 10:
      paramdso.cYU();
      String str = localbbo.hL("input");
      cth.cqP().mb(str);
      localbbo.a("input", "");
      break;
    case 38:
      localbbo.a("input", cth.cqP().ceN());
      break;
    case 40:
      localbbo.a("input", cth.cqP().ceO());
    }
  }

  public static void clear(cSx paramcSx)
  {
    cBQ.cxL().coO().czu().e("debug.console", "logs", "");
  }
}