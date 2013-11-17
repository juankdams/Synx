import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import org.apache.log4j.Logger;

class aby
  implements Callable
{
  public static final Logger K = Logger.getLogger(aby.class);
  public static final int cPZ = 1024;
  private final bTp cQa;

  aby(bTp parambTp)
  {
    this.cQa = parambTp;
  }

  public bTp anW()
  {
    if (this.cQa.bZO()) {
      this.cQa.a(awB.dLM);
      return this.cQa;
    }

    K.info("Downloading " + this.cQa);
    this.cQa.a(awB.dLL);
    OutputStream localOutputStream;
    try {
      localOutputStream = this.cQa.bQF();
    } catch (IOException localIOException1) {
      K.error("Unable to create outputStream for download " + this.cQa, localIOException1);
      this.cQa.a(awB.dLN);
      return this.cQa;
    }

    BufferedInputStream localBufferedInputStream;
    try
    {
      localBufferedInputStream = new BufferedInputStream(this.cQa.bvo().openStream(), 8192);
    } catch (FileNotFoundException localFileNotFoundException) {
      K.error("Unable to download " + this.cQa + " : file not found (404)");
      this.cQa.gg(false);
      this.cQa.a(awB.dLN);
      return this.cQa;
    } catch (IOException localIOException2) {
      K.error("Unable to open url connection for " + this.cQa, localIOException2);
      this.cQa.gg(false);
      this.cQa.a(awB.dLN);
      return this.cQa;
    }

    byte[] arrayOfByte = new byte[1024];
    try
    {
      int i;
      while ((i = localBufferedInputStream.read(arrayOfByte, 0, 1024)) != -1) {
        localOutputStream.write(arrayOfByte, 0, i);
      }

      if (this.cQa.gg(true)) {
        this.cQa.a(awB.dLM);
        K.info("Download finished : " + this.cQa);
      } else {
        this.cQa.a(awB.dLN);
        K.error("Error while closing stream for " + this.cQa);
      }
    }
    catch (IOException localIOException3) {
      K.error("Error while downloading " + this.cQa, localIOException3);
      this.cQa.gg(false);
      this.cQa.a(awB.dLN);
      return this.cQa;
    }
    return this.cQa;
  }
}