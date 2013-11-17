import java.io.File;
import java.io.FilenameFilter;

final class aDa
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    return paramString.endsWith(".lua");
  }
}