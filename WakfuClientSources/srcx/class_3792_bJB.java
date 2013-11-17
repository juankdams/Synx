import java.nio.ByteBuffer;

public class bJB extends dzz
{
  private int cGS;
  private int aHm;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 8)
      return false;
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cGS = localByteBuffer.getInt();
    this.aHm = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 11112;
  }

  public int ok()
  {
    return this.cGS;
  }

  public int getCount() {
    return this.aHm;
  }
}