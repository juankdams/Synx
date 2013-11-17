import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class li
{
  public static boolean d(String paramString1, String paramString2)
  {
    return (cnK.hUs.matcher(paramString1).matches()) && (Pattern.compile(aj(paramString1)).matcher(paramString2).matches());
  }

  static String aj(String paramString)
  {
    String str = paramString;

    for (aax localaax : aax.values()) {
      str = str.replaceAll(String.valueOf(aax.cOH.getChar()) + localaax.getChar(), localaax.getPattern());
    }
    return str;
  }
}