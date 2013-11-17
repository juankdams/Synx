import java.nio.ByteBuffer;

public class abU extends dzz
{
  private int cQD;
  private int hY;
  private int hZ;
  private int aRQ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cQD = localByteBuffer.getInt();

    this.hY = localByteBuffer.getInt();
    this.hZ = localByteBuffer.getInt();
    this.aRQ = localByteBuffer.getInt();

    return true;
  }

  public int getId() {
    return 9506;
  }

  public int aof() {
    return this.cQD;
  }

  public int getX()
  {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public int eo() {
    return this.aRQ;
  }
}