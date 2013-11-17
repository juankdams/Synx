import java.io.InputStream;

public class ut extends InputStream
{
  private aYQ bif;

  public ut(aYQ paramaYQ)
  {
    this.bif = paramaYQ;
  }

  public int read() {
    return this.bif.readByte();
  }

  public int read(byte[] paramArrayOfByte) {
    return this.bif.W(paramArrayOfByte);
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    return this.bif.i(paramArrayOfByte, paramInt1, paramInt2);
  }

  public void close() {
    this.bif.close();
  }

  public int available() {
    return this.bif.available();
  }
}