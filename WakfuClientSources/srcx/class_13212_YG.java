import java.io.File;
import java.io.FilenameFilter;

class YG
  implements FilenameFilter
{
  YG(bDf parambDf)
  {
  }

  public boolean accept(File paramFile, String paramString)
  {
    return paramString.endsWith(this.cJN.getExtension());
  }
}