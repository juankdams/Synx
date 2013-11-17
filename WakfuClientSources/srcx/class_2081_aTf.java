import java.nio.ByteBuffer;

public class aTf extends dzz
{
  private long eQx;
  private int hY;
  private int hZ;
  private short cYh;
  private boolean eQy;
  private boolean eQz;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 20, true)) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.eQx = localByteBuffer.getLong();
    this.hY = localByteBuffer.getInt();
    this.hZ = localByteBuffer.getInt();
    this.cYh = localByteBuffer.getShort();
    this.eQy = (localByteBuffer.get() == 1);
    this.eQz = (localByteBuffer.get() == 1);
    return true;
  }

  public int getId()
  {
    return 4126;
  }

  public long bix() {
    return this.eQx;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public short biy() {
    return this.cYh;
  }

  public boolean biz() {
    return this.eQy;
  }

  public boolean biA() {
    return this.eQz;
  }
}