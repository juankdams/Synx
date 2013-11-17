import java.nio.ByteBuffer;

public class za extends dzz
{
  private long iI;
  private byte[] btm;

  public void g(long paramLong)
  {
    this.iI = paramLong;
  }

  public void n(byte[] paramArrayOfByte) {
    this.btm = paramArrayOfByte;
  }

  public long eq() {
    return this.iI;
  }

  public byte[] HF() {
    return this.btm;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.iI = localByteBuffer.getLong();
    this.btm = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(this.btm);
    return true;
  }

  public int getId()
  {
    return 20002;
  }
}