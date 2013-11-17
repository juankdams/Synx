import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class CF
{
  private static final byte[] bFA = new byte[1048576];
  private URL aJK;
  private InputStream bFB;
  private byte[] bFC;
  private int bFD;
  private boolean bim;
  private boolean bFE;

  public CF(URL paramURL)
  {
    this.aJK = paramURL;
    this.bim = false;
    this.bFE = false;
  }

  public void LL()
  {
    if ((!bB) && (this.bim)) throw new AssertionError("Stream must not be call if the file is already loaded");
    if ((!bB) && (this.bFE)) throw new AssertionError("Stream must not be call if the file loading has failed");
    try
    {
      if (this.bFB == null) {
        this.bFB = new BufferedInputStream(this.aJK.openStream());
        this.bFD = 0;
      }

      int i = this.bFB.read(bFA, 0, bFA.length);

      if (i == -1) {
        this.bFB.close();
        this.bim = true;
      } else {
        byte[] arrayOfByte = new byte[this.bFD + i];
        if (this.bFC != null)
          System.arraycopy(this.bFC, 0, arrayOfByte, 0, this.bFD);
        System.arraycopy(bFA, 0, arrayOfByte, this.bFD, i);
        this.bFC = arrayOfByte;
        this.bFD += i;
      }
    } catch (IOException localIOException) {
      if (this.bFB != null)
        this.bFB.close();
      this.bFE = true;
      throw localIOException;
    }
  }

  void LM() {
    this.bFE = true;
  }

  public final boolean gI() {
    return this.bim;
  }

  public final boolean LN() {
    return this.bFE;
  }

  public final URL getURL() {
    return this.aJK;
  }

  public final byte[] getData() {
    return this.bFC;
  }

  public String toString() {
    return this.aJK.toString() + " ready=" + this.bim;
  }
}