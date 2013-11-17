import java.nio.ByteBuffer;

public class aZW extends dzz
{
  private int dFY;
  private short aFe;
  private long fhr;

  public int aFY()
  {
    return this.dFY;
  }

  public short nP() {
    return this.aFe;
  }

  public long boV() {
    return this.fhr;
  }

  public boolean a(byte[] paramArrayOfByte) {
    if (paramArrayOfByte.length == 14) {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
      this.dFY = localByteBuffer.getInt();
      this.aFe = localByteBuffer.getShort();
      this.fhr = localByteBuffer.getLong();
      return true;
    }
    return false;
  }

  public int getId()
  {
    return 5244;
  }
}