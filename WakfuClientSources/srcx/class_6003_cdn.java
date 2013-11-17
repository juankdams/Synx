import java.nio.ByteBuffer;

public class cdn extends cVp
{
  private long cJp;
  private long dES;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dON = localByteBuffer.get();
    this.dOO = localByteBuffer.getShort();
    this.cJp = localByteBuffer.getLong();
    this.dES = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 15724;
  }

  public long apb() {
    return this.cJp;
  }

  public long aFL() {
    return this.dES;
  }
}