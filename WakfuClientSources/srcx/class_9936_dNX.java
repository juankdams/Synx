import java.io.InputStream;

public class dNX extends InputStream
{
  private static final int mev = 255;
  private FF aIn;

  public dNX(FF paramFF)
  {
    this.aIn = paramFF;
  }

  public int read()
  {
    byte[] arrayOfByte = new byte[1];
    if (this.aIn.d(arrayOfByte, 0, 1) == -1) {
      return -1;
    }
    return arrayOfByte[0] & 0xFF;
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return this.aIn.d(paramArrayOfByte, paramInt1, paramInt2);
  }
}