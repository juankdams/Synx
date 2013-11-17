import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class bXy
{
  private static final Pattern hmE = Pattern.compile("([ ]+)");
  private static final Pattern hmF = Pattern.compile("([-]+)");
  private static final Pattern hmG = Pattern.compile("([']+)");
  private static final Pattern hmH = Pattern.compile("[ \\-']");

  public static boolean hmI = false;

  protected static final Logger K = Logger.getLogger(bXy.class);

  public static String kF(String paramString)
  {
    String str = paramString;
    str = dzp.qD(str);
    str = hmE.matcher(str).replaceAll(" ");
    str = hmF.matcher(str).replaceAll("-");
    str = hmG.matcher(str).replaceAll("'");
    return str;
  }

  public static bzE kG(String paramString)
  {
    bzE localbzE = aRP.eOQ.hd(paramString);

    if (localbzE != bzE.gnO) {
      return localbzE;
    }

    if (!aiN.avC().eA(paramString)) {
      return bzE.goa;
    }

    if ((paramString.length() > 1) && ((paramString.charAt(0) == '-') || (paramString.charAt(paramString.length() - 1) == '-'))) {
      return bzE.gob;
    }

    String[] arrayOfString1 = paramString.split("[ \\-']");
    for (String str : arrayOfString1) {
      if ((str.length() < 1) || (Character.isLowerCase(str.charAt(0))) || (!str.substring(1).equals(str.substring(1).toLowerCase()))) {
        return bzE.goc;
      }

    }

    return bzE.gnO;
  }

  public static bzE kH(String paramString)
  {
    bzE localbzE = aRP.eOQ.he(paramString);

    if (localbzE != bzE.gnO) {
      return localbzE;
    }

    if (!aiN.avC().eA(paramString)) {
      return bzE.goa;
    }

    if ((paramString.charAt(0) == '-') || (paramString.charAt(paramString.length() - 1) == '-')) {
      return bzE.gob;
    }

    String[] arrayOfString1 = hmH.split(paramString);
    for (String str : arrayOfString1) {
      if ((str.length() < 1) || (Character.isLowerCase(str.charAt(0))) || (!str.substring(1).equals(str.substring(1).toLowerCase()))) {
        return bzE.goc;
      }
    }
    return bzE.gnO;
  }
}