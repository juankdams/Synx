import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.log4j.Logger;

public class Zt
  implements bhC
{
  public static final Logger K = Logger.getLogger(Zt.class);

  public static final Zt cKQ = new Zt();
  private dcz cKR;
  private URL cKS = null;
  private File cKT = null;
  private aKk cKU = aKk.ekG;
  private aCd cKV = null;

  private Zt()
  {
    this.cKR = null;
    this.cKU = aKk.ekG;
  }

  public aKk b(URL paramURL, String paramString) {
    if ((this.cKR != null) && (this.cKR.isAlive())) {
      K.error("News are already downloading (thread still running)");
      this.cKU = aKk.ekJ;
      return this.cKU;
    }

    File localFile;
    try
    {
      localFile = new File(paramString).getCanonicalFile();
    } catch (IOException localIOException) {
      K.error("Invalid news cached directory : " + new File(paramString), localIOException);
      this.cKU = aKk.ekJ;
      return this.cKU;
    }

    if ((paramURL == this.cKS) && (this.cKT == localFile)) {
      return this.cKU;
    }

    if (!a(paramURL, localFile)) {
      this.cKU = aKk.ekJ;
      return this.cKU;
    }

    this.cKR = new dcz(paramURL, localFile, this);
    this.cKU = aKk.ekH;
    this.cKR.start();

    return this.cKU;
  }

  public aKk akB() {
    return this.cKU;
  }

  public boolean cq(long paramLong)
  {
    if ((this.cKU == aKk.ekI) || (this.cKU == aKk.ekH))
      return this.cKR.cq(paramLong);
    return false;
  }

  public void a(aCd paramaCd)
  {
    if (paramaCd != null) {
      this.cKV = paramaCd;
      this.cKU = aKk.ekI;
    } else {
      this.cKU = aKk.ekJ;
      this.cKR = null;
    }
  }

  public void akC() {
    if (this.cKU != aKk.ekI)
      K.error("We receive an 'images loaded' event, but we are not expecting it");
    this.cKU = aKk.ekK;
  }

  private boolean a(URL paramURL, File paramFile)
  {
    if ((paramURL == null) || (paramFile == null)) {
      K.error("No News URL or no cache directory : NewsManager not succesfully initialized");
      return false;
    }

    if (!paramFile.exists()) {
      if (!paramFile.mkdirs()) {
        K.error("Unable to create news cache directory : " + paramFile);
        return false;
      }
    } else if (!paramFile.isDirectory()) {
      K.error("Unable to create news cache directory : " + paramFile + " : a file with this name already exists");
      return false;
    }
    return true;
  }

  public aCd akD() {
    return this.cKV;
  }
}