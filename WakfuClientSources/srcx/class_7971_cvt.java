import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cvt extends alw
{
  public static final Pattern igq = Pattern.compile("\\[(([a-z]|[A-Z]|[0-9])+)\\]");
  public static final Pattern igr = Pattern.compile("\\[b=([0-9]+)\\]");
  public static final Pattern igs = Pattern.compile("\\[r=([0-9]+)\\]");
  private final int baj;
  private final int igt;

  public cvt(int paramInt1, int paramInt2)
  {
    this.igt = paramInt2;
    this.baj = paramInt1;
  }

  protected String getDescription()
  {
    amY localamY = qn.xw().ck(this.baj);
    dDU localdDU = qn.xw().cl(this.baj);
    dNR localdNR = localdDU.Cy(this.igt);

    long l = 0L;
    String str1 = localdNR.cKo();
    if ((localamY != null) && (str1 != null) && (str1.length() > 0)) {
      l = localamY.eN(str1);
    }

    if ((l == 0L) || (localamY.azv())) {
      return a(localdDU);
    }
    if (localamY.a(localdNR) == 1) {
      String str2 = a(localdNR, localamY, localdDU);
      if (str2 != null) {
        return str2;
      }
    }
    return null;
  }

  protected long P()
  {
    return -1L;
  }

  protected boolean Q()
  {
    amY localamY = qn.xw().ck(this.baj);
    dDU localdDU = qn.xw().cl(this.baj);
    dNR localdNR = localdDU.Cy(this.igt);

    if (localamY == null)
      return true;
    return localamY.a(localdNR) == 2;
  }

  protected static String a(dDU paramdDU) {
    String str = paramdDU.dfR();
    if ((str != null) && (str.length() == 0)) {
      return null;
    }
    return str;
  }

  public static String a(dNR paramdNR, amY paramamY, dDU paramdDU) {
    String str = paramdNR.dqc();
    if ((str == null) || (str.length() == 0)) {
      return null;
    }
    str = (String)cnR.a(str, FH.bNL, paramdDU.bCI());

    Matcher localMatcher = igr.matcher(str);
    Object localObject;
    while (localMatcher.find()) {
      localObject = bU.fH().b(7, bUD.aR(localMatcher.group(1)), new Object[0]);
      str = localMatcher.replaceFirst((String)localObject);
      localMatcher = igr.matcher(str);
    }

    localMatcher = igs.matcher(str);
    while (localMatcher.find()) {
      localObject = bU.fH().b(12, bUD.aR(localMatcher.group(1)), new Object[0]);
      str = localMatcher.replaceFirst((String)localObject);
      localMatcher = igs.matcher(str);
    }

    localMatcher = igq.matcher(str);
    while (localMatcher.find()) {
      localObject = Long.valueOf(paramamY.eN(localMatcher.group().substring(1, localMatcher.group().length() - 1)));
      str = localMatcher.replaceFirst(((Long)localObject).toString());
      localMatcher = igq.matcher(str);
    }

    return str;
  }

  protected boolean R() {
    return false;
  }

  protected boolean S() {
    return false;
  }

  protected boolean T() {
    return false;
  }
}