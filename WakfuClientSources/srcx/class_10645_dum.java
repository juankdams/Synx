public class dum extends cGj
  implements In
{
  public static final String bC = "name";
  public static final String lye = "isNew";
  public static final String fvf = "isLaunched";
  private final aSr lyf;
  private boolean lyg;

  public dum(aSr paramaSr)
  {
    this.lyf = paramaSr;
  }

  public String[] getFields() {
    return new String[0];
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("name")) {
      return getName();
    }
    if (paramString.equals("isNew")) {
      return Boolean.valueOf(this.lyg);
    }
    if (paramString.equals("isLaunched")) {
      return Boolean.valueOf(btw());
    }
    return null;
  }

  public String getName() {
    return this.lyf.getTitle();
  }

  public void kD(boolean paramBoolean) {
    this.lyg = paramBoolean;
  }

  public void launch() {
    bCY.bLy().a(this);
    this.lyf.execute();
  }

  public boolean btw() {
    hg localhg = (hg)dLE.doY().rv("tutorialMessageView");

    return c(localhg);
  }

  private boolean c(hg paramhg) {
    return (paramhg != null) && (paramhg.getTitle().equals(getName()));
  }

  public void a(hg paramhg) {
    if (!c(paramhg))
      return;
    dLE.doY().a(this, new String[] { "isLaunched" });
    bCY.bLy().b(this);
  }

  public void b(hg paramhg) {
    if (!c(paramhg))
      return;
    dLE.doY().a(this, new String[] { "isLaunched" });
  }
}