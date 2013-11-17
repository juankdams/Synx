import java.nio.ByteBuffer;

public class bDp extends dzz
{
  private int cIL;
  private int cIM;
  private short cYh;
  private byte[] gyX;

  public int ajM()
  {
    return this.cIL;
  }

  public int ajN() {
    return this.cIM;
  }

  public short biy() {
    return this.cYh;
  }

  public byte[] bMy() {
    return this.gyX;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.cIL = localByteBuffer.getInt();
    this.cIM = localByteBuffer.getInt();
    this.cYh = localByteBuffer.getShort();
    this.gyX = new byte[localByteBuffer.getShort() & 0xFFFF];
    localByteBuffer.get(this.gyX);
    return true;
  }

  public int getId() {
    return 10000;
  }
}