import java.io.InputStream;

public class cES extends InputStream
  implements dAb
{
  private cYJ iyX;

  public cES(cYJ paramcYJ)
  {
    this.iyX = paramcYJ;
  }

  public int read()
  {
    int i = this.iyX.read();
    if (i == -1) {
      return -1;
    }
    return (i - 1 + 256) % 256;
  }

  public int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = this.iyX.read(paramArrayOfByte, paramInt1, paramInt2);
    int j = paramInt1; for (int k = paramInt1 + paramInt2; j < k; j++) {
      paramArrayOfByte[j] = ((byte)((paramArrayOfByte[j] - 1 + 256) % 256));
    }

    return i;
  }

  public long skip(long paramLong)
  {
    return this.iyX.skip(paramLong);
  }

  public int available()
  {
    return this.iyX.available();
  }

  public void close()
  {
    this.iyX.close();
  }

  public void mark(int paramInt)
  {
  }

  public void reset()
  {
  }

  public boolean markSupported()
  {
    return false;
  }

  public void seek(long paramLong) {
    this.iyX.seek(paramLong);
  }

  public long length() {
    return this.iyX.length();
  }

  public long tell() {
    return this.iyX.tell();
  }
}