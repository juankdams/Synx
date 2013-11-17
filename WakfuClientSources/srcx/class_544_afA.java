import java.nio.ByteBuffer;

public class afA extends dzz
{
  private int buP;
  private long cYw;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.buP = localByteBuffer.getInt();
    this.cYw = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 15714;
  }

  public int IF() {
    return this.buP;
  }

  public long arb() {
    return this.cYw;
  }
}