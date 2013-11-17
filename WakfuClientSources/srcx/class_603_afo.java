import java.io.File;
import java.io.FileFilter;

class afo
  implements FileFilter
{
  afo(bXb parambXb)
  {
  }

  public boolean accept(File paramFile)
  {
    return paramFile.isDirectory();
  }
}