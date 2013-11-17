import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

public class aaX
{
  private static final Logger K = Logger.getLogger(aaX.class);

  private static final aaX cPo = new aaX();
  private String SK;
  private final adz cPp = new adz();
  private final Xv cPq = new Xv();

  public static aaX anG()
  {
    return cPo;
  }

  public void reset()
  {
    this.cPq.reset();
    this.cPp.clear();
  }

  public String getPath() {
    return this.SK;
  }

  public void setPath(String paramString) {
    this.SK = paramString;
  }

  public boolean l(int[] paramArrayOfInt) {
    return this.cPp.n(paramArrayOfInt);
  }

  public boolean hA(int paramInt) {
    return this.cPp.hL(paramInt);
  }

  public void hB(int paramInt) {
    if ((!bB) && (this.SK == null)) throw new AssertionError("PaperMapManager : Path undefined");
    String str = String.format(this.SK, new Object[] { Integer.valueOf(paramInt) });
    try {
      URL localURL = new URL(str);
      this.cPq.d(aYQ.g(new BufferedInputStream(localURL.openStream())));
    } catch (MalformedURLException localMalformedURLException) {
      K.warn("Problem during PaperMapManager Load : invalid URL " + str);
    } catch (IOException localIOException) {
      K.warn("Exception during PaperMapManager Load : ", localIOException);
    }
  }

  public adz hd(int paramInt) {
    return this.cPq.hd(paramInt);
  }

  public cSi anH() {
    cSi localcSi = new cSi();
    a(new wO(this, localcSi));

    return localcSi;
  }

  public void a(aKs paramaKs) {
    if (this.cPp == null) {
      return;
    }
    if (!this.cPp.isEmpty())
      this.cPp.g(new xA(this, paramaKs));
  }

  public void a(drL paramdrL)
  {
    if (this.cPp == null) {
      return;
    }
    if (!this.cPp.isEmpty())
      this.cPp.g(new xz(this, paramdrL));
  }
}