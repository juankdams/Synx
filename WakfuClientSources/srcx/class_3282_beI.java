import java.io.File;
import javax.swing.filechooser.FileFilter;

class beI extends FileFilter
{
  public boolean accept(File paramFile)
  {
    return paramFile.isDirectory();
  }

  public String getDescription() {
    return "Répertoire";
  }
}