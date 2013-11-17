import java.nio.ByteBuffer;

public class dMv extends dWi
{
  private long aXW;
  private cYk cGk;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 22, false)) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aY(localByteBuffer);

    this.aXW = localByteBuffer.getLong();
    this.cGk = new cYk(localByteBuffer.getInt(), localByteBuffer.getInt(), localByteBuffer.getShort());
    return true;
  }

  public int getId()
  {
    return 4528;
  }

  public long AD() {
    return this.aXW;
  }

  public cYk ML() {
    return this.cGk;
  }
}