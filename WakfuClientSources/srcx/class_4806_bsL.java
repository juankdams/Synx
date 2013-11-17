import java.nio.ByteBuffer;

public class bsL extends dzz
{
  private int cGS;
  private short aFe;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.cGS = localByteBuffer.getInt();
    this.aFe = localByteBuffer.getShort();

    return true;
  }

  public int ok() {
    return this.cGS;
  }

  public short nP() {
    return this.aFe;
  }

  public int getId()
  {
    return 15942;
  }
}