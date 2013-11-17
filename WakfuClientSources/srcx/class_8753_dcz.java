import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.Future;
import org.apache.log4j.Logger;

class dcz extends Thread
  implements byP
{
  public static final Logger K = Logger.getLogger(dcz.class);
  private final bhC kVC;
  private final URL kVD;
  private final File kVE;
  private final abI fiE;
  private final ArrayList kVF = new ArrayList();

  dcz(URL paramURL, File paramFile, bhC parambhC) {
    setDaemon(true);
    this.kVD = paramURL;
    this.kVE = paramFile;
    this.kVC = parambhC;
    this.fiE = new abI();
  }

  public void run()
  {
    bWC localbWC = new bWC(this.kVD);
    Future localFuture = this.fiE.a(localbWC);
    try {
      localFuture.get();
    } catch (Exception localException) {
      K.error("Error while downloading news stream", localException);
      this.fiE.anZ();
      if (this.kVC != null)
        this.kVC.a(null);
      return;
    }

    if (localbWC.bZP() != awB.dLM) {
      K.error("Error while downloading news stream, bad state" + localbWC);
      if (this.kVC != null)
        this.kVC.a(null);
      this.fiE.anZ();
      return;
    }
    String str;
    try
    {
      str = localbWC.getAsString();
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      K.error("Error while parsing news stream : bad encoding", localUnsupportedEncodingException);
      if (this.kVC != null)
        this.kVC.a(null);
      this.fiE.anZ();
      return;
    }
    aCd localaCd;
    try
    {
      localaCd = aiu.a(str, this);
    } catch (dbt localdbt) {
      K.error("Error while parsing news stream : bad format", localdbt);
      if (this.kVC != null)
        this.kVC.a(null);
      this.fiE.anZ();
      return;
    }

    this.kVC.a(localaCd);
    bhU localbhU;
    if (this.kVF.isEmpty()) {
      if (this.kVC != null)
        this.kVC.akC();
    } else {
      localaCd.lQ(this.kVF.size());

      localbhU = new bhU(this, localaCd);

      for (bkm localbkm : this.kVF)
        this.fiE.a(new bJx(localbkm.bvo(), localbkm.getFile(), true, true), localbhU);
    }
  }

  boolean cq(long paramLong) {
    return this.fiE.cq(paramLong);
  }

  public bkm a(URL paramURL, String paramString, long paramLong)
  {
    if (paramURL == null) {
      return null;
    }
    String str1 = Long.toHexString(paramLong);
    File localFile = null;

    if ((paramString != null) && (paramString.length() > 0))
    {
      localObject = "";
      String str2 = paramURL.getFile().toLowerCase();
      if ((str2.endsWith(".jpg")) || (str2.endsWith(".jpeg")))
        localObject = ".jpg";
      else if (str2.endsWith(".png")) {
        localObject = ".png";
      }
      localFile = new File(this.kVE, paramString + '_' + str1 + (String)localObject);
      if (!V(localFile)) {
        localFile = null;
      }
    }

    if (localFile == null)
    {
      localObject = new File(paramURL.getFile()).getName();
      int i = ((String)localObject).lastIndexOf(".");
      String str3;
      if (i == -1)
        str3 = (String)localObject + '_' + str1;
      else {
        str3 = ((String)localObject).substring(0, i) + '_' + str1 + ((String)localObject).substring(i);
      }
      localFile = new File(this.kVE, str3);
      if (!V(localFile)) {
        K.error("Unable to get a valid local file for remote file " + paramURL + " (" + str3 + ")");
        return null;
      }

    }

    Object localObject = new bkm(paramURL, localFile);

    if ((!localFile.exists()) || (localFile.length() == 0L)) {
      this.kVF.add(localObject);
    }
    return localObject;
  }

  private boolean V(File paramFile)
  {
    if (!paramFile.exists()) {
      File localFile = paramFile.getParentFile();

      if (!localFile.exists()) {
        if (!localFile.mkdirs()) {
          K.error("Unable to create parent directories for local file " + paramFile);
          return false;
        }
      } else if (!localFile.isDirectory()) {
        K.error("Unable to create file : parent directory is not a directory : " + localFile);
        return false;
      }
      try
      {
        paramFile.createNewFile();
      } catch (IOException localIOException) {
        K.error("Unable to create local file " + paramFile, localIOException);
        return false;
      }
      paramFile.delete();
      return true;
    }

    if (!paramFile.isFile()) {
      K.error("Invalid local file : " + paramFile + " is a directory");
      return false;
    }
    return true;
  }
}