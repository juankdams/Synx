import java.nio.ByteBuffer;

public class AC extends dzz
{
  private byte bwk;
  private long bwl;
  private long bwm;
  private String bwn;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bwk = localByteBuffer.get();
    this.bwl = localByteBuffer.getLong();
    this.bwm = localByteBuffer.getLong();

    int i = localByteBuffer.get();
    byte[] arrayOfByte = new byte[i];
    localByteBuffer.get(arrayOfByte);
    this.bwn = dzp.aJ(arrayOfByte);
    return true;
  }

  public long JP() {
    return this.bwl;
  }

  public String JQ() {
    return this.bwn;
  }

  public long JR() {
    return this.bwm;
  }

  public byte JS() {
    return this.bwk;
  }

  public int getId() {
    return 592;
  }
}