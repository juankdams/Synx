import java.io.IOException;
import java.io.InputStream;

public class cYJ extends InputStream
  implements dAb
{
  private afP dYk;
  private final long kMw;
  private final long iwM;

  public cYJ(afP paramafP, long paramLong1, long paramLong2)
  {
    this.dYk = paramafP;
    this.iwM = paramLong1;
    this.kMw = paramLong2;

    paramafP.seek(paramLong1);
  }

  public int read()
  {
    if (this.dYk.getFilePointer() - this.iwM == this.kMw) {
      return -1;
    }

    return this.dYk.read();
  }

  public int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l = this.dYk.getFilePointer() - this.iwM;
    return this.dYk.read(paramArrayOfByte, paramInt1, (int)Math.min(this.kMw - l, paramInt2));
  }

  public void seek(long paramLong) {
    if (paramLong < 0L)
    {
      throw new IOException("Position invalide dans le flux : " + paramLong + ". Taille du fichier : " + this.kMw);
    }

    this.dYk.seek(this.iwM + paramLong);
  }

  public long length() {
    return this.kMw;
  }

  public long tell() {
    return this.dYk.getFilePointer() - this.iwM;
  }

  public void close()
  {
    this.dYk.close();
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

  public int available() {
    return (int)this.kMw;
  }
}