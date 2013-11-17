import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class hi
  implements FilenameFilter
{
  hi(yZ paramyZ)
  {
  }

  public boolean accept(File paramFile, String paramString)
  {
    return yZ.qZ().matcher(paramString).matches();
  }
}