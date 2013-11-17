import java.io.InputStream;
import java.net.URL;

public class deQ
  implements blq
{
  private final URL aJK;
  private InputStream bFB;

  public deQ(URL paramURL)
  {
    this.aJK = paramURL;
  }

  public void aPF()
  {
    InputStream localInputStream = this.aJK.openStream();

    StringBuilder localStringBuilder = new StringBuilder();
    int i = localInputStream.read();
    while ((i != -1) && (localStringBuilder.length() < 3)) {
      localStringBuilder.append((char)i);
      i = localInputStream.read();
    }
    localInputStream.close();

    int j = !localStringBuilder.toString().toUpperCase().equals("OGG") ? 1 : 0;
    if (j != 0)
      this.bFB = new acc(this.aJK.openStream());
    else
      this.bFB = this.aJK.openStream();
  }

  public void reset()
  {
    if (this.bFB != null) {
      this.bFB.close();
    }

    aPF();
  }

  public void close() {
    if (this.bFB != null) {
      this.bFB.close();
      this.bFB = null;
    }
  }

  public boolean aPG() {
    return false;
  }

  public void seek(long paramLong)
  {
  }

  public long length() {
    return 0L;
  }

  public long tell() {
    return 0L;
  }

  public int read() {
    return this.bFB.read();
  }

  public int read(byte[] paramArrayOfByte) {
    return this.bFB.read(paramArrayOfByte);
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    return this.bFB.read(paramArrayOfByte, paramInt1, paramInt2);
  }

  public String getDescription() {
    return this.aJK.toString();
  }

  public String als() {
    return dtb.pY(this.aJK.toString());
  }
}