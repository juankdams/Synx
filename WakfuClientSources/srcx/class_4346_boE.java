import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class boE
  implements FilenameFilter
{
  boE(Vm paramVm, Pattern paramPattern)
  {
  }

  public boolean accept(File paramFile, String paramString)
  {
    return this.fIc.matcher(paramString).matches();
  }
}