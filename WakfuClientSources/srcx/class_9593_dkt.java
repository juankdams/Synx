import java.io.File;
import java.io.FileFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class dkt
  implements FileFilter
{
  private final Pattern lhC = Pattern.compile("(accountPreferences|characterPreferences).*(.properties)");

  dkt(aIH paramaIH) {  } 
  private boolean pr(String paramString) { return (paramString.length() > 0) && (this.lhC.matcher(paramString).matches()); }

  public boolean accept(File paramFile)
  {
    return (paramFile.isDirectory()) || (pr(paramFile.getName()));
  }
}