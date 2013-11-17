public class bfH
{
  public static final String fte = ".tgam";
  public static final String ftf = "";
  private static final bfH ftg = new bfH(".tgam", false);
  private final String fth;
  private final boolean fti;
  private String ftj = "";

  protected bfH(String paramString, boolean paramBoolean) {
    this.fth = paramString;
    this.fti = paramBoolean;
  }

  public static bfH bsR() {
    return ftg;
  }

  public final void ik(String paramString) {
    this.ftj = paramString;
    if (!paramString.endsWith("/"))
      this.ftj += "/";
  }

  public uz jP(int paramInt)
  {
    String str = pt(paramInt);
    long l = byn.jp(str);

    if (this.fti) {
      return tq.Bg().b(dHL.lSB.dhZ(), l, str, false);
    }
    return tq.Bg().a(dHL.lSB.dhZ(), l, str, false);
  }

  protected final String pt(int paramInt) {
    return this.ftj + paramInt + this.fth;
  }
}