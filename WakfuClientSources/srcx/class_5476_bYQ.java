import java.nio.ByteBuffer;

public class bYQ extends dzz
{
  private byte bwR;
  private long bwl;
  private long iI;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bwR = localByteBuffer.get();
    this.bwl = localByteBuffer.getLong();
    this.iI = localByteBuffer.getLong();
    return true;
  }

  public byte Kh() {
    return this.bwR;
  }

  public long JP() {
    return this.bwl;
  }

  public long eq() {
    return this.iI;
  }

  public int getId() {
    return 574;
  }
}