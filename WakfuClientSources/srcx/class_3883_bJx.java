import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import org.apache.log4j.Logger;

public class bJx extends bTp
{
  public static final Logger K = Logger.getLogger(bJx.class);
  private final File fAL;
  private File gKK;
  private final boolean gKL;
  private OutputStream gKM = null;
  private final boolean gKN;

  public bJx(URL paramURL, File paramFile, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramURL);
    this.fAL = paramFile;
    this.gKL = paramBoolean2;
    this.gKN = paramBoolean1;
  }

  OutputStream bQF()
  {
    if (this.gKN) {
      File localFile1;
      try {
        File localFile2 = this.fAL.getParentFile();
        if (!localFile2.exists())
          localFile2.mkdirs();
        localFile1 = File.createTempFile(new File(bvo().getFile()).getName(), null, localFile2);
        localFile1.deleteOnExit();
      } catch (IOException localIOException) {
        K.error("Unable to create temporary file for " + this);
        localFile1 = null;
      }
      this.gKK = (localFile1 == null ? this.fAL : localFile1);
    } else {
      this.gKK = this.fAL;
    }
    if (this.gKK.exists()) {
      if (!this.gKL) {
        K.error("Dest file already exists for " + this);
        throw new IOException("File already exists " + this.fAL);
      }
    } else {
      this.gKK.getParentFile().mkdirs();
      this.gKK.createNewFile();
      if (this.gKK != this.fAL)
        this.gKK.deleteOnExit();
    }
    this.gKM = new BufferedOutputStream(new FileOutputStream(this.gKK, false));
    return this.gKM;
  }

  boolean gg(boolean paramBoolean) {
    if (this.gKM == null) {
      return false;
    }
    try
    {
      this.gKM.flush();
      this.gKM.close();
    } catch (IOException localIOException) {
      K.error("Error while closing stream for download " + this);
      paramBoolean = false;
    } finally {
      this.gKM = null;
    }

    if (!paramBoolean) {
      return false;
    }

    if (this.gKK == this.fAL) {
      return true;
    }

    if (this.fAL.exists()) {
      if (this.gKL) {
        this.fAL.delete();
      } else {
        K.error("Dest file already exists for " + this);
        return false;
      }
    }

    boolean bool = this.gKK.renameTo(this.fAL);
    if (!bool)
      K.error("Unable to rename temporary file " + this.gKK + "as file " + this.fAL + " for " + this);
    return bool;
  }

  public File bQG() {
    return this.fAL;
  }

  protected String bQH() {
    return this.fAL.toString();
  }
}