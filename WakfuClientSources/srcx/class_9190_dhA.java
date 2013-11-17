import java.io.File;
import java.io.FileReader;

public class dhA
  implements aHJ
{
  public boolean isValid()
  {
    return true;
  }

  public String a(File paramFile)
  {
    FileReader localFileReader = null;
    try {
      if (!paramFile.canRead()) {
        return null;
      }
      localFileReader = new FileReader(paramFile);
      int i = wh.c(localFileReader).hashCode();
      return Integer.toString(i);
    }
    catch (Exception localException)
    {
      String str2;
      return null;
    } finally {
      wh.e(localFileReader);
    }
  }

  public String toString()
  {
    return "HashvalueAlgorithm";
  }
}