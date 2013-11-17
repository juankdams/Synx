import java.nio.ByteBuffer;

public class bbB extends dzz
{
  private long eQx;
  private int hY;
  private int hZ;
  private short aOl;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.eQx = localByteBuffer.getLong();
    this.hY = localByteBuffer.getInt();
    this.hZ = localByteBuffer.getInt();
    this.aOl = localByteBuffer.getShort();

    return true;
  }

  public int getId() {
    return 4115;
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
}