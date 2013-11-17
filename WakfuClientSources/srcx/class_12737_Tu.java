import java.nio.ByteBuffer;

public class Tu extends dzz
{
  private byte crM;
  private long cws;

  public byte adh()
  {
    return this.crM;
  }

  public long agz() {
    return this.cws;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.crM = localByteBuffer.get();
    this.cws = localByteBuffer.getLong();
    if (this.crM == 0) {
      byte[] arrayOfByte = new byte[localByteBuffer.getShort() & 0xFFFF];
      localByteBuffer.get(arrayOfByte);
    }

    return true;
  }

  public int getId() {
    return 10056;
  }
}