import java.io.File;
import java.io.FilenameFilter;

final class uO
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    return paramString.endsWith(".jar");
  }
}