import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bQF
{
  public static final Pattern gYZ = Pattern.compile("\\[(\\d+)\\](i)?(\\d+)(?:x(\\d+))?(?:c(\\d+))?(?:e(\\d+))?(?:\\{(\\w+)\\})?(?:p(\\d+)k(\\d+))?");
  public long cxL;
  public int gZa;
  public short aDf;
  public long timestamp;
  public boolean gZb;
  public byte gZc;
  public int gZd;

  public static bQF kn(String paramString)
  {
    Matcher localMatcher = gYZ.matcher(paramString);
    if (localMatcher.matches()) {
      bQF localbQF = new bQF();
      localbQF.cxL = Long.parseLong(localMatcher.group(1));
      if (localMatcher.group(2) != null) {
        localbQF.gZb = true;
      }
      localbQF.gZa = Integer.parseInt(localMatcher.group(3));
      if (localMatcher.group(4) != null) {
        localbQF.aDf = Short.parseShort(localMatcher.group(4));
      }
      if (localMatcher.group(6) != null) {
        localbQF.timestamp = Long.parseLong(localMatcher.group(6));
      }

      if (localMatcher.group(8) != null) {
        localbQF.gZc = Byte.parseByte(localMatcher.group(8));
        localbQF.gZd = Integer.parseInt(localMatcher.group(9));
      }
      return localbQF;
    }
    return null;
  }

  public static gA a(bQF parambQF)
  {
    gA localgA = new gA(parambQF.cxL);
    gA.a(localgA, Hh.QM().dh(parambQF.gZa));
    gA.a(localgA, (short)(parambQF.aDf > 0 ? parambQF.aDf : 1));
    gA.a(localgA, parambQF.timestamp);
    return localgA;
  }
}