import java.nio.ByteBuffer;

public class bet extends dzz
{
  private long frs;
  private int buQ;
  private byte frt;
  private long ctZ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.frs = localByteBuffer.getLong();
    this.buQ = localByteBuffer.getInt();
    this.frt = localByteBuffer.get();
    this.ctZ = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 15716;
  }

  public long bsh() {
    return this.frs;
  }

  public int IG() {
    return this.buQ;
  }

  public byte bsi() {
    return this.frt;
  }

  public long getDuration() {
    return this.ctZ;
  }
}