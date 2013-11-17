import java.nio.ByteBuffer;

public class aWm extends dWi
{
  long aXW;
  int fbw;
  int fbx;
  int fby;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length != 24) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);
    this.aXW = localByteBuffer.getLong();
    this.fbw = localByteBuffer.getInt();
    this.fbx = localByteBuffer.getInt();
    this.fby = localByteBuffer.getInt();
    return true;
  }

  public int bmf() {
    return this.fbx;
  }

  public long AD() {
    return this.aXW;
  }

  public int bmg() {
    return this.fbw;
  }

  public int bmh() {
    return this.fby;
  }

  public int getId() {
    return 8114;
  }
}