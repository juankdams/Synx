import java.util.List;
import java.util.regex.Pattern;

public class arm extends diQ
{
  private static final Pattern[] dzJ = { Pattern.compile("libvlc\\.so(?:\\.\\d)*"), Pattern.compile("libvlccore\\.so(?:\\.\\d)*") };

  protected Pattern[] aDN()
  {
    return dzJ;
  }

  protected void q(List paramList)
  {
    paramList.add("/usr/lib");
    paramList.add("/usr/local/lib");
  }
}