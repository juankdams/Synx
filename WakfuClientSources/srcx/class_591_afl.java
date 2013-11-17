import java.nio.ByteBuffer;

public class afl extends dzz
{
  private long cXT;
  private int cXU;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cXT = localByteBuffer.getLong();
    this.cXU = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 5304;
  }

  public long aqR() {
    return this.cXT;
  }

  public int aqS() {
    return this.cXU;
  }
}