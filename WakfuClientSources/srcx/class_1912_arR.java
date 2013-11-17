import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class arR extends bFe
  implements ep
{
  private static final wh aIk = wh.Fo();
  private static final int dBf = bFe.aj("null URL".getBytes());
  private URL url;
  private URLConnection conn;
  private URL dBg;
  private String dBh;

  public arR()
  {
  }

  public arR(URL paramURL)
  {
    setURL(paramURL);
  }

  public arR(ep paramep)
  {
    setURL(paramep.getURL());
  }

  public arR(File paramFile)
  {
    C(paramFile);
  }

  public arR(String paramString)
  {
    this(fq(paramString));
  }

  public synchronized void setURL(URL paramURL)
  {
    cuu();
    this.url = paramURL;
  }

  public synchronized void C(File paramFile)
  {
    try
    {
      setURL(aIk.k(paramFile));
    } catch (MalformedURLException localMalformedURLException) {
      throw new cJ(localMalformedURLException);
    }
  }

  public synchronized void a(URL paramURL)
  {
    cuu();
    if (this.url != null) {
      throw new cJ("can't define URL and baseURL attribute");
    }
    this.dBg = paramURL;
  }

  public synchronized void fp(String paramString)
  {
    cuu();
    if (this.url != null) {
      throw new cJ("can't define URL and relativePath attribute");
    }

    this.dBh = paramString;
  }

  public synchronized URL getURL()
  {
    if (cum()) {
      return ((arR)cup()).getURL();
    }
    if ((this.url == null) && 
      (this.dBg != null)) {
      if (this.dBh == null) {
        throw new cJ("must provide relativePath attribute when using baseURL.");
      }
      try
      {
        this.url = new URL(this.dBg, this.dBh);
      } catch (MalformedURLException localMalformedURLException) {
        throw new cJ(localMalformedURLException);
      }
    }

    return this.url;
  }

  public synchronized void a(cxK paramcxK)
  {
    if ((this.url != null) || (this.dBg != null) || (this.dBh != null)) {
      throw cuq();
    }
    super.a(paramcxK);
  }

  public synchronized String getName()
  {
    if (cum()) {
      return ((bFe)cup()).getName();
    }
    String str = getURL().getFile();
    return "".equals(str) ? str : str.substring(1);
  }

  public synchronized String toString()
  {
    return cum() ? cup().toString() : String.valueOf(getURL());
  }

  public synchronized boolean TY()
  {
    if (cum()) {
      return ((bFe)cup()).TY();
    }
    return cO(false);
  }

  private synchronized boolean cO(boolean paramBoolean)
  {
    if (getURL() == null)
      return false;
    try
    {
      jS(3);
      return true;
    } catch (IOException localIOException) {
      return false;
    } finally {
      if (paramBoolean)
        close();
    }
  }

  public synchronized long getLastModified()
  {
    if (cum()) {
      return ((bFe)cup()).getLastModified();
    }
    if (!cO(false)) {
      return 0L;
    }
    return this.conn.getLastModified();
  }

  public synchronized boolean isDirectory()
  {
    return cum() ? ((bFe)cup()).isDirectory() : getName().endsWith("/");
  }

  public synchronized long getSize()
  {
    if (cum()) {
      return ((bFe)cup()).getSize();
    }
    if (!cO(false))
      return 0L;
    try
    {
      connect();
      long l = this.conn.getContentLength();
      close();
      return l; } catch (IOException localIOException) {
    }
    return -1L;
  }

  public synchronized boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (cum()) {
      return cup().equals(paramObject);
    }
    if (!paramObject.getClass().equals(getClass())) {
      return false;
    }
    arR localarR = (arR)paramObject;
    return getURL() == null ? false : localarR.getURL() == null ? true : getURL().equals(localarR.getURL());
  }

  public synchronized int hashCode()
  {
    if (cum()) {
      return cup().hashCode();
    }
    return gAf * (getURL() == null ? dBf : getURL().hashCode());
  }

  public synchronized InputStream getInputStream()
  {
    if (cum()) {
      return ((bFe)cup()).getInputStream();
    }
    connect();
    try {
      return this.conn.getInputStream();
    } finally {
      this.conn = null;
    }
  }

  public synchronized OutputStream getOutputStream()
  {
    if (cum()) {
      return ((bFe)cup()).getOutputStream();
    }
    connect();
    try {
      return this.conn.getOutputStream();
    } finally {
      this.conn = null;
    }
  }

  protected void connect()
  {
    jS(0);
  }

  protected synchronized void jS(int paramInt)
  {
    URL localURL = getURL();
    if (localURL == null) {
      throw new cJ("URL not set");
    }
    if (this.conn == null)
      try {
        this.conn = localURL.openConnection();
        this.conn.connect();
      } catch (IOException localIOException) {
        d(localIOException.toString(), paramInt);
        this.conn = null;
        throw localIOException;
      }
  }

  private synchronized void close()
  {
    try
    {
      wh.a(this.conn);
    } finally {
      this.conn = null;
    }
  }

  private static URL fq(String paramString) {
    try {
      return new URL(paramString);
    } catch (MalformedURLException localMalformedURLException) {
      throw new cJ(localMalformedURLException);
    }
  }
}