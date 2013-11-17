import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zA
  implements Comparable
{
  private static final Pattern bui = Pattern.compile("(\\d)+\\.(\\d)+\\.(\\d+)[\\-_\\s]?(.*)");
  private final String version;
  private final Integer buj;
  private final Integer buk;
  private final Integer bul;
  private final String bum;

  public zA(String paramString)
  {
    this.version = paramString;
    Matcher localMatcher = bui.matcher(paramString);
    if (localMatcher.matches()) {
      this.buj = Integer.valueOf(Integer.parseInt(localMatcher.group(1)));
      this.buk = Integer.valueOf(Integer.parseInt(localMatcher.group(2)));
      this.bul = Integer.valueOf(Integer.parseInt(localMatcher.group(3)));
      if (localMatcher.groupCount() > 3) {
        this.bum = localMatcher.group(4);
      }
      else
        this.bum = null;
    }
    else
    {
      throw new IllegalArgumentException("Can't parse version from '" + paramString + "'");
    }
  }

  public String fB()
  {
    return this.version;
  }

  public int Il()
  {
    return this.buj.intValue();
  }

  public int Im()
  {
    return this.buk.intValue();
  }

  public int In()
  {
    return this.bul.intValue();
  }

  public String Io()
  {
    return this.bum;
  }

  public boolean a(zA paramzA)
  {
    return b(paramzA) >= 0;
  }

  public int b(zA paramzA)
  {
    if (this.buj == paramzA.buj) {
      if (this.buk == paramzA.buk) {
        if (this.bul == paramzA.bul) {
          return 0;
        }

        return this.bul.intValue() - paramzA.bul.intValue();
      }

      return this.buk.intValue() - paramzA.buk.intValue();
    }

    return this.buj.intValue() - paramzA.buj.intValue();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(20);
    localStringBuilder.append(this.version);
    return localStringBuilder.toString();
  }
}