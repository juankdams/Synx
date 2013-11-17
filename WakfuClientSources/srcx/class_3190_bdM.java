import java.nio.ByteBuffer;

public class bdM extends dzz
{
  private dlj fpW;
  private byte[] fpX;
  private int fpY;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.fpW = dlj.values()[localByteBuffer.get()];
    localByteBuffer.get(this.fpX = new byte[localByteBuffer.getInt()]);
    this.fpY = localByteBuffer.getInt();
    return true;
  }

  public byte[] brQ() {
    return this.fpX;
  }

  public int brR() {
    return this.fpY;
  }

  public dlj brS() {
    return this.fpW;
  }

  public int getId() {
    return 20100;
  }
}