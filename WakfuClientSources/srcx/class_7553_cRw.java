import java.nio.ByteBuffer;

public class cRw extends aCZ
{
  private long bqi;
  private byte bqj;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bqj = localByteBuffer.get();
    this.bqi = localByteBuffer.getLong();
    i(localByteBuffer);

    return true;
  }

  public int getId()
  {
    return 4181;
  }

  public byte GE()
  {
    return this.bqj;
  }

  public long GF() {
    return this.bqi;
  }
}