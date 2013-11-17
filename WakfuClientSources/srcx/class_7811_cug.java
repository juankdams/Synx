import java.nio.ByteBuffer;

public class cug extends dzz
{
  private long kM;
  private short fev;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.kM = localByteBuffer.getLong();
    this.fev = localByteBuffer.getShort();
    return true;
  }

  public int getId() {
    return 5504;
  }

  public long eW() {
    return this.kM;
  }

  public short bSl() {
    return this.fev;
  }
}