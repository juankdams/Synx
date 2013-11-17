import java.nio.ByteBuffer;

public class er extends cVp
{
  private long ayG;
  private long ayH;
  private int ayI;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dON = localByteBuffer.get();
    this.dOO = localByteBuffer.getShort();
    this.eoe = localByteBuffer.getLong();

    this.ayG = localByteBuffer.getLong();
    this.ayH = localByteBuffer.getLong();
    this.ayI = localByteBuffer.getInt();

    return true;
  }

  public int getId() {
    return 4168;
  }

  public int lk() {
    return this.ayI;
  }

  public long ll() {
    return this.ayG;
  }

  public long lm() {
    return this.ayH;
  }
}