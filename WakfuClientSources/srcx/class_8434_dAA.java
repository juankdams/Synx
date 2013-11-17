import java.nio.ByteBuffer;

public class dAA extends dzz
{
  private int hY;
  private int hZ;
  private short aOl;
  private short aGz;
  private int bFx;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.hY = localByteBuffer.getInt();
    this.hZ = localByteBuffer.getInt();
    this.aOl = localByteBuffer.getShort();
    this.aGz = localByteBuffer.getShort();
    this.bFx = localByteBuffer.getInt();

    return true;
  }

  public int getId() {
    return 4201;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public short IB() {
    return this.aOl;
  }

  public short pl() {
    return this.aGz;
  }

  public int LI() {
    return this.bFx;
  }
}