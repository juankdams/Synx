import java.nio.ByteBuffer;

public class aco extends dzz
{
  private long cRG;
  private byte[] cRH;

  public long aoF()
  {
    return this.cRG;
  }

  public byte[] aoG() {
    return this.cRH;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.cRG = localByteBuffer.getLong();
    this.cRH = new byte[localByteBuffer.getInt()];
    localByteBuffer.get(this.cRH);

    return false;
  }

  public int getId() {
    return 10044;
  }
}