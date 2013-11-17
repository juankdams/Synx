import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class bzF
  implements btf
{
  public final String bBu()
  {
    aHA.debug("discover()", new Object[0]);
    Object localObject = null;

    ArrayList localArrayList = new ArrayList();
    y(localArrayList);
    aHA.debug("directoryNames={}", new Object[] { localArrayList });

    for (String str : localArrayList) {
      aHA.debug("directoryName={}", new Object[] { str });
      if (ju(str)) {
        localObject = str;
        break;
      }
    }
    aHA.debug("result={}", new Object[] { localObject });
    return localObject;
  }

  private boolean ju(String paramString)
  {
    File localFile1 = new File(paramString);
    File[] arrayOfFile1 = localFile1.listFiles();
    if (arrayOfFile1 != null) {
      Pattern[] arrayOfPattern1 = aDN();
      int i = 0;
      for (File localFile2 : arrayOfFile1) {
        for (Pattern localPattern : arrayOfPattern1) {
          Matcher localMatcher = localPattern.matcher(localFile2.getName());
          if (localMatcher.matches()) {
            aHA.debug("Matched '{}' in '{}'", new Object[] { localFile2.getName(), paramString });
            i++;
            if (i == arrayOfPattern1.length) {
              aHA.debug("Matched all required files", new Object[0]);
              return true;
            }
          }
        }
      }
    }
    aHA.debug("Failed to matched all required files", new Object[0]);
    return false;
  }

  protected final List bIr()
  {
    String str = System.getenv("PATH");
    if (str != null) {
      String[] arrayOfString = str.split(File.pathSeparator);
      return Arrays.asList(arrayOfString);
    }

    return Collections.emptyList();
  }

  protected abstract Pattern[] aDN();

  protected abstract void y(List paramList);
}