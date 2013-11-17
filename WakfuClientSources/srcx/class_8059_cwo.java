import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cwo
{
  private static final Pattern ihO = Pattern.compile("&#([0-9]+);");

  public static String mq(String paramString) {
    StringBuffer localStringBuffer = new StringBuffer();
    Matcher localMatcher = ihO.matcher(paramString);
    int i = 0;
    while (localMatcher.find()) {
      String str = localMatcher.group(1);
      char c = (char)bUD.aR(str);
      localMatcher.appendReplacement(localStringBuffer, String.valueOf(c));
      i = localMatcher.end();
    }
    localStringBuffer.append(paramString.substring(i));
    return localStringBuffer.toString();
  }
}