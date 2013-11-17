import java.io.File;
import java.io.FilenameFilter;

final class dVP
  implements FilenameFilter
{
  private final String mvc;

  dVP(String paramString)
  {
  }

  public boolean accept(File paramFile, String paramString)
  {
    return ((paramString.startsWith("lib" + this.mvc + ".so")) || ((paramString.startsWith(this.mvc + ".so")) && (this.mvc.startsWith("lib")))) && (bMB.kb(paramString));
  }
}