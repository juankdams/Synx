import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class bMY
{
  private static final Logger K = Logger.getLogger(bMY.class);
  private static final boolean DEBUG = true;
  private static final Pattern gRq = Pattern.compile("(\\\\\\$([a-zA-Z_]+)\\$)|([^(\\\\\\$([a-zA-Z_]+)\\$)]*)");

  private static final bMY gRr = new bMY();

  public static bMY bUF()
  {
    return gRr;
  }

  private static String kc(String paramString)
  {
    if ((!bB) && (paramString == null)) throw new AssertionError(); try
    {
      return "<b>" + wf.valueOf(paramString).getValue() + "</b>";
    }
    catch (Exception localException) {
      K.error("la variable est inconnu " + paramString, localException);
    }
    return paramString;
  }

  public static String replace(String paramString)
  {
    Matcher localMatcher = gRq.matcher(paramString);

    StringBuilder localStringBuilder = new StringBuilder(paramString.length());

    while (localMatcher.find()) {
      String str = localMatcher.group(2);
      if (str == null)
        localStringBuilder.append(localMatcher.group(3));
      else {
        localStringBuilder.append(kc(str));
      }
    }

    return localStringBuilder.toString();
  }
}