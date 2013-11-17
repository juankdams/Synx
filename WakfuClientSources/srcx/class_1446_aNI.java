import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class aNI extends dfm
  implements cyp
{
  private static final int DECIMAL = 10;

  protected int nk(int paramInt)
  {
    int i = 1;
    if (afN.aX(paramInt, 16)) {
      i = 16;
    }
    return i;
  }

  public String b(String paramString1, String paramString2, int paramInt)
  {
    StringBuffer localStringBuffer1 = new StringBuffer();
    for (int i = 0; i < paramString2.length(); i++) {
      char c = paramString2.charAt(i);
      if (c == '$') {
        localStringBuffer1.append('\\');
        localStringBuffer1.append('$');
      } else if (c == '\\') {
        i++; if (i < paramString2.length()) {
          c = paramString2.charAt(i);
          int j = Character.digit(c, 10);
          if (j > -1)
            localStringBuffer1.append("$").append(j);
          else
            localStringBuffer1.append(c);
        }
        else
        {
          localStringBuffer1.append('\\');
        }
      } else {
        localStringBuffer1.append(c);
      }
    }
    paramString2 = localStringBuffer1.toString();

    i = nk(paramInt);
    Pattern localPattern = zS(paramInt);
    StringBuffer localStringBuffer2 = new StringBuffer();

    Matcher localMatcher = localPattern.matcher(paramString1);
    if (afN.aX(i, 16)) {
      localStringBuffer2.append(localMatcher.replaceAll(paramString2));
    } else {
      boolean bool = localMatcher.find();
      if (bool) {
        localMatcher.appendReplacement(localStringBuffer2, paramString2);
        localMatcher.appendTail(localStringBuffer2);
      } else {
        localStringBuffer2.append(paramString1);
      }
    }
    return localStringBuffer2.toString();
  }
}