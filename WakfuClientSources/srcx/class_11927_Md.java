import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Md
{
  private static final Pattern bZo = Pattern.compile("(.*!!.*)", 32);
  private static final Pattern bZp = Pattern.compile("\\*\\*.*", 32);
  private static final Pattern bZq = Pattern.compile("--.*", 32);
  private final bae bZr;
  private final int bZs;
  private final int bZt;

  private Md(bae paramInt2, int arg4, int arg5)
  {
    this.bZr = paramInt2;
    int i;
    this.bZs = i;
    int j;
    this.bZt = j;
  }

  public bae WA() {
    return this.bZr;
  }

  public int WB() {
    return this.bZs;
  }

  public int WC() {
    return this.bZt;
  }

  public static final Cs cH(String paramString)
  {
    Cs localCs = new Cs();
    Md localMd = bZk;
    Matcher localMatcher1 = bZo.matcher(paramString);
    Matcher localMatcher2 = bZp.matcher(paramString);
    Matcher localMatcher3 = bZq.matcher(paramString);

    if (localMatcher1.matches()) {
      if (paramString.startsWith("!!"))
        paramString = paramString.replaceFirst("!!", "");
      localMd = bZm;
    } else if (localMatcher2.matches())
    {
      paramString = paramString.replaceFirst("\\*\\*", "");
      localMd = bZl;
    } else if (localMatcher3.matches())
    {
      paramString = paramString.replaceFirst("--", "");
      localMd = bZn;
    }
    localCs.w(localMd);
    localCs.x(paramString);
    return localCs;
  }
}