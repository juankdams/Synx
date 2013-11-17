import java.nio.ByteBuffer;

public class acJ extends dzz
{
  private byte bwR;
  private long bwl;
  private cYq aHo;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bwR = localByteBuffer.get();
    this.bwl = localByteBuffer.getLong();
    this.aHo = cYq.jq(localByteBuffer.getLong());
    return true;
  }

  public byte Kh() {
    return this.bwR;
  }

  public long JP() {
    return this.bwl;
  }

  public dxL VN() {
    return this.aHo;
  }

  public int getId() {
    return 586;
  }
}