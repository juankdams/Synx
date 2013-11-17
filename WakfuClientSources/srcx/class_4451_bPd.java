import java.nio.ByteBuffer;

public class bPd extends dzz
{
  private int aGC;
  private int ie;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aGC = localByteBuffer.getInt();
    this.ie = localByteBuffer.getInt();

    return true;
  }

  public int CB() {
    return this.aGC;
  }

  public int bP() {
    return this.ie;
  }

  public int getId() {
    return 15302;
  }
}