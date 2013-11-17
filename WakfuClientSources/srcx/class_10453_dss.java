import java.io.File;
import java.io.FilenameFilter;

class dss
  implements FilenameFilter
{
  dss(wh paramwh, String paramString)
  {
  }

  public boolean accept(File paramFile, String paramString)
  {
    return (paramString.equalsIgnoreCase(this.luJ)) && (!paramString.equals(this.luJ));
  }
}