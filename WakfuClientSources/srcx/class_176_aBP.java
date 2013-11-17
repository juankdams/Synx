import java.nio.ByteBuffer;

public class aBP extends dzz
{
  private short[] dVY;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dVY = new short[localByteBuffer.getShort()];
    for (int i = 0; i < this.dVY.length; i++) {
      this.dVY[i] = localByteBuffer.getShort();
    }

    return true;
  }

  public int getId() {
    return 5506;
  }

  public short[] aNR() {
    return this.dVY;
  }
}