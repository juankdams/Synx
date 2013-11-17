import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class aPj
  implements Vj
{
  protected static final Logger K = Logger.getLogger(aPj.class);

  public static final Class caa = String.class;

  private static final Pattern eLo = Pattern.compile("(%([^%]*)%)");

  public String convert(String paramString) {
    return e(caa, paramString);
  }

  public String e(Class paramClass, String paramString)
  {
    if (paramString == null) {
      return null;
    }

    Matcher localMatcher = eLo.matcher(paramString);
    String str1 = paramString;
    while (localMatcher.find()) {
      try {
        String str2 = cBQ.cxL().mL(localMatcher.group(2));
        str1 = cOg.replace(str1, localMatcher.group(1), str2);
      } catch (Exception localException) {
        K.error("Exception", localException);
      }
    }

    return str1;
  }

  public Class WY()
  {
    return caa;
  }

  public boolean WZ() {
    return true;
  }

  public boolean Xa() {
    return false;
  }

  public String a(deg paramdeg, uk paramuk, Class paramClass, String paramString, cDA paramcDA)
  {
    paramdeg.al(caa);

    Matcher localMatcher = eLo.matcher(paramString);
    if (localMatcher.find()) {
      localMatcher.reset();
      String str = paramdeg.can();

      paramdeg.a(new cHH(paramClass, str, '"' + paramString + '"'));

      while (localMatcher.find())
      {
        paramdeg.a(new cHH(paramClass, str, str + ".replace(\"" + localMatcher.group(1) + "\", Xulor.getInstance().getTranslatedString(\"" + localMatcher.group(2) + "\"))"));
      }

      return str;
    }

    return '"' + cOg.replace(paramString, "\\", "\\\\") + '"';
  }
}