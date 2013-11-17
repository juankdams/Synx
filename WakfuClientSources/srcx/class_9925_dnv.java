import java.nio.ByteBuffer;

public class dnv extends dzz
{
  private int cQD;
  private int hY;
  private int hZ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cQD = localByteBuffer.getInt();
    this.hY = localByteBuffer.getInt();
    this.hZ = localByteBuffer.getInt();

    return true;
  }

  public int getId() {
    return 9508;
  }

  public int aof() {
    return this.cQD;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }
}