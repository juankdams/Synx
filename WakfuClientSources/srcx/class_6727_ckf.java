import java.io.File;
import java.net.URL;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;

class ckf
  implements Enumeration
{
  private String hKP;
  private int hKQ;
  private URL hKR;

  ckf(iA paramiA, String paramString)
  {
    this.hKP = paramString;
    this.hKQ = 0;
    cmn();
  }

  public boolean hasMoreElements()
  {
    return this.hKR != null;
  }

  public URL nextElement()
  {
    URL localURL = this.hKR;
    if (localURL == null) {
      throw new NoSuchElementException();
    }
    cmn();
    return localURL;
  }

  private void cmn()
  {
    URL localURL = null;
    while ((this.hKQ < iA.a(this.hKS).size()) && (localURL == null)) {
      try {
        File localFile = (File)iA.a(this.hKS).elementAt(this.hKQ);
        localURL = this.hKS.b(localFile, this.hKP);
        this.hKQ += 1;
      }
      catch (cJ localcJ)
      {
      }
    }
    this.hKR = localURL;
  }
}