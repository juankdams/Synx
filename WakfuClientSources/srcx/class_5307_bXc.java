import java.nio.ByteBuffer;

public class bXc extends dzz
{
  private long fAU;
  private byte[] hlA;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.fAU = localByteBuffer.getLong();
    this.hlA = new byte[localByteBuffer.remaining()];
    localByteBuffer.get(this.hlA);
    return true;
  }

  public int getId() {
    return 15730;
  }

  public long bvt() {
    return this.fAU;
  }

  public byte[] ccq() {
    return this.hlA;
  }
}