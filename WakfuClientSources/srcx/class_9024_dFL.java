import java.nio.ByteBuffer;

public class dFL extends dzz
{
  private long lPZ;
  private byte lQa;
  private long lQb;
  private byte lQc;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.lPZ = localByteBuffer.getLong();
    this.lQa = localByteBuffer.get();
    if (localByteBuffer.get() == 1) {
      this.lQb = localByteBuffer.getLong();
      this.lQc = localByteBuffer.get();
    } else {
      this.lQb = -1L;
      this.lQc = -1;
    }
    return true;
  }

  public long dha() {
    return this.lPZ;
  }

  public byte dhb() {
    return this.lQa;
  }

  public boolean dhc() {
    return (this.lQb != -1L) && (this.lQc != -1);
  }

  public long dhd() {
    return this.lQb;
  }

  public byte dhe() {
    return this.lQc;
  }

  public int getId()
  {
    return 5228;
  }
}