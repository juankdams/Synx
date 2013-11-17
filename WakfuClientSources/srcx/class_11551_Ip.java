import java.nio.ByteBuffer;

public class Ip extends dzz
{
  private agT bQX;
  private boolean bQY;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.getShort();
    this.bQX = new agT(i);
    for (int j = 0; j < i; j++) {
      this.bQX.m(localByteBuffer.getShort(), localByteBuffer.getShort());
    }
    this.bQY = (localByteBuffer.get() == 1);
    return true;
  }

  public int getId() {
    return 8408;
  }

  public agT RK() {
    return this.bQX;
  }

  public boolean RL() {
    return this.bQY;
  }
}