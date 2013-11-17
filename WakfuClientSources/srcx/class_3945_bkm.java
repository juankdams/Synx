import java.io.File;
import java.net.URL;

public class bkm
{
  private final File fAL;
  private final URL fAM;

  bkm(URL paramURL, File paramFile)
  {
    this.fAL = paramFile;
    this.fAM = paramURL;
  }

  public File getFile() {
    return this.fAL;
  }

  public boolean bvn()
  {
    return (this.fAL != null) && (this.fAL.isFile());
  }

  URL bvo() {
    return this.fAM;
  }
}