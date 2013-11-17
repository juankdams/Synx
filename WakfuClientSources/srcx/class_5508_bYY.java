import java.nio.ByteBuffer;

public class bYY extends dzz
{
  private byte[] fpX;
  private int fpY;
  private int hpm;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    localByteBuffer.get(this.fpX = new byte[localByteBuffer.getInt()]);
    this.fpY = localByteBuffer.getInt();
    this.hpm = localByteBuffer.getInt();
    return true;
  }

  public byte[] brQ() {
    return this.fpX;
  }

  public int brR() {
    return this.fpY;
  }

  public int cdI() {
    return this.hpm;
  }

  public int getId() {
    return 20102;
  }
}