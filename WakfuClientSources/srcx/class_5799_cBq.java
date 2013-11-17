import java.io.File;
import java.io.FilenameFilter;

class cBq
  implements FilenameFilter
{
  cBq(dtA paramdtA, String paramString)
  {
  }

  public boolean accept(File paramFile, String paramString)
  {
    return this.isw.equals(paramString);
  }
}