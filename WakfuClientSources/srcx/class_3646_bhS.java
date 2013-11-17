import java.nio.ByteBuffer;

public class bhS extends dzz
{
  private int dqb;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dqb = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 11226;
  }

  public int azM()
  {
    return this.dqb;
  }
}