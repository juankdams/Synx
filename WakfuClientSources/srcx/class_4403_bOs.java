import java.nio.ByteBuffer;

public final class bOs extends dzz
{
  private long eQx;
  private int hY;
  private int hZ;
  private short aOl;
  private byte boN;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 19) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.eQx = localByteBuffer.getLong();
    this.hY = localByteBuffer.getInt();
    this.hZ = localByteBuffer.getInt();
    this.aOl = localByteBuffer.getShort();
    this.boN = localByteBuffer.get();

    return true;
  }

  public int getId() {
    return 4127;
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

  public short IB() {
    return this.aOl;
  }

  public byte FW() {
    return this.boN;
  }
}