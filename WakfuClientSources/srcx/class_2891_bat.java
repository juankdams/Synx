import java.nio.ByteBuffer;

public class bat extends dzz
{
  private int bJP;
  private int aVF;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bJP = localByteBuffer.getInt();
    this.aVF = localByteBuffer.getInt();
    return true;
  }

  public int ajL() {
    return this.bJP;
  }

  public int wx() {
    return this.aVF;
  }

  public int getId()
  {
    return 15954;
  }
}