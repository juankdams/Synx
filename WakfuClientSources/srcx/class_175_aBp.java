import java.nio.ByteBuffer;

public class aBp extends dzz
{
  private int aNN;
  private int aRQ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aNN = localByteBuffer.getInt();
    this.aRQ = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 11206;
  }

  public int se()
  {
    return this.aNN;
  }

  public int eo() {
    return this.aRQ;
  }
}