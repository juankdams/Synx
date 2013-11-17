import java.io.File;
import java.io.FilenameFilter;

public final class dzi
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    return (paramString.endsWith(".x")) && (paramString.startsWith("jna"));
  }
}