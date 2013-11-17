import java.util.List;
import java.util.regex.Pattern;

public class dmQ extends diQ
{
  private static final Pattern[] dzJ = { Pattern.compile("libvlc\\.dylib"), Pattern.compile("libvlccore\\.dylib") };

  protected Pattern[] aDN()
  {
    return dzJ;
  }

  public final boolean bBt()
  {
    return cha.bPT();
  }

  protected void q(List paramList)
  {
    paramList.add("/Applications/VLC.app/Contents/MacOS/lib");
  }
}