import java.nio.ByteBuffer;

public class bsZ extends dzz
{
  private int aPh;
  private long bXM;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aPh = localByteBuffer.getInt();
    this.bXM = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 15612;
  }

  public long bBa() {
    return this.bXM;
  }

  public int sY() {
    return this.aPh;
  }
}