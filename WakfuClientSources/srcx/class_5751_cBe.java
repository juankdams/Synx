import java.nio.ByteBuffer;

public class cBe extends dzz
{
  private int cIL;
  private int cIM;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cIL = localByteBuffer.getInt();
    this.cIM = localByteBuffer.getInt();
    return true;
  }

  public int getId()
  {
    return 4125;
  }

  public int ajM() {
    return this.cIL;
  }

  public int ajN() {
    return this.cIM;
  }
}