import java.io.InputStream;

public class acc extends InputStream
{
  private InputStream cQR;

  public acc(InputStream paramInputStream)
  {
    this.cQR = paramInputStream;
  }

  public int read()
  {
    int i = this.cQR.read();
    if (i == -1) return -1;

    return (i - 1 + 256) % 256;
  }

  public int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = this.cQR.read(paramArrayOfByte, paramInt1, paramInt2);
    int j = paramInt1; for (int k = paramInt1 + paramInt2; j < k; j++) {
      paramArrayOfByte[j] = ((byte)((paramArrayOfByte[j] - 1 + 256) % 256));
    }

    return i;
  }

  public long skip(long paramLong)
  {
    return this.cQR.skip(paramLong);
  }

  public int available()
  {
    return this.cQR.available();
  }

  public void close()
  {
    this.cQR.close();
  }

  public void mark(int paramInt)
  {
    this.cQR.mark(paramInt);
  }

  public void reset()
  {
    this.cQR.reset();
  }

  public boolean markSupported()
  {
    return this.cQR.markSupported();
  }
}