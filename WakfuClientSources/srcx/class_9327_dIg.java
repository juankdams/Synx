import java.nio.ByteBuffer;

public class dIg extends dWi
{
  private int lTb = -1;

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);
    this.lTb = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 8014;
  }

  public int dib() {
    return this.lTb;
  }
}