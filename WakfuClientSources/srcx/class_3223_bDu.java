import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

class bDu
  implements FilenameFilter
{
  private final String[] gzb;

  bDu(String[] paramArrayOfString)
  {
    this.gzb = paramArrayOfString; } 
  public boolean accept(File paramFile, String paramString) { String str = paramString.toLowerCase(Locale.US);
    for (int i = 0; i < this.gzb.length; i++) {
      if (str.endsWith(this.gzb[i])) {
        return true;
      }
    }
    return false;
  }
}