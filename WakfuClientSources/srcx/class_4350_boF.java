import java.io.File;
import java.io.FilenameFilter;

class boF
  implements FilenameFilter
{
  boF(Vm paramVm)
  {
  }

  public boolean accept(File paramFile, String paramString)
  {
    int i = paramString.lastIndexOf(".");
    if (i == -1)
      return false;
    String str = paramString.substring(i);

    if (".bdat".equalsIgnoreCase(str))
      return true;
    if (".bdat".equalsIgnoreCase(str)) {
      return true;
    }
    return false;
  }
}