import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class dfm
  implements biv
{
  private String pattern;

  public void setPattern(String paramString)
  {
    this.pattern = paramString;
  }

  public String getPattern()
  {
    return this.pattern;
  }

  protected Pattern zS(int paramInt)
  {
    int i = zT(paramInt);
    try {
      return Pattern.compile(this.pattern, i);
    }
    catch (PatternSyntaxException localPatternSyntaxException) {
      throw new cJ(localPatternSyntaxException);
    }
  }

  public boolean matches(String paramString)
  {
    return u(paramString, 0);
  }

  public boolean u(String paramString, int paramInt)
  {
    try
    {
      Pattern localPattern = zS(paramInt);
      return localPattern.matcher(paramString).find();
    } catch (Exception localException) {
      throw new cJ(localException);
    }
  }

  public Vector iq(String paramString)
  {
    return v(paramString, 0);
  }

  public Vector v(String paramString, int paramInt)
  {
    Pattern localPattern = zS(paramInt);
    Matcher localMatcher = localPattern.matcher(paramString);
    if (!localMatcher.find()) {
      return null;
    }
    Vector localVector = new Vector();
    int i = localMatcher.groupCount();
    for (int j = 0; j <= i; j++) {
      String str = localMatcher.group(j);

      if (str == null) {
        str = "";
      }
      localVector.addElement(str);
    }
    return localVector;
  }

  protected int zT(int paramInt)
  {
    int i = 1;

    if (afN.aX(paramInt, 256)) {
      i |= 2;
    }
    if (afN.aX(paramInt, 4096)) {
      i |= 8;
    }
    if (afN.aX(paramInt, 65536)) {
      i |= 32;
    }

    return i;
  }
}