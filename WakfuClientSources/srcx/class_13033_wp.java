import java.nio.ByteBuffer;

public class wp extends dWi
{
  private byte[] bmj;
  private byte[] bmk;
  private long aXW;
  private byte bml;
  private byte bmm;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aY(localByteBuffer);

    this.aXW = localByteBuffer.getLong();
    this.bmm = localByteBuffer.get();
    this.bml = localByteBuffer.get();
    this.bmj = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(this.bmj);
    this.bmk = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(this.bmk);

    return true;
  }

  public byte[] Fv() {
    return this.bmj;
  }

  public byte[] Fw() {
    return this.bmk;
  }

  public long AD() {
    return this.aXW;
  }

  public byte Fx() {
    return this.bml;
  }

  public byte Fy() {
    return this.bmm;
  }

  public int getId()
  {
    return 8002;
  }
}