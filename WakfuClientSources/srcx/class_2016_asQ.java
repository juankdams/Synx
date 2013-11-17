import java.nio.ByteBuffer;

public class asQ extends dzz
{
  private int aGC;
  private byte dCT;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aGC = localByteBuffer.getInt();
    this.dCT = localByteBuffer.get();
    return true;
  }

  public int getId() {
    return 15328;
  }

  public int CB() {
    return this.aGC;
  }

  public byte aEV() {
    return this.dCT;
  }
}