import java.util.List;
import java.util.regex.Pattern;

public class cAV extends diQ
{
  private static final Pattern[] dzJ = { Pattern.compile("libvlc\\.dll"), Pattern.compile("libvlccore\\.dll") };

  protected Pattern[] aDN()
  {
    return dzJ;
  }

  public final boolean bBt()
  {
    return cha.bPY();
  }

  protected void q(List paramList)
  {
    String str = cKG.cEe();
    if (str != null)
      paramList.add(str);
  }
}