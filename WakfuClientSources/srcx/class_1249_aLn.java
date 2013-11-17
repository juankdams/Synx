import java.nio.ByteBuffer;

public class aLn extends dWi
{
  private int bWz;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);
    this.bWz = localByteBuffer.getInt();
    return true;
  }

  public int getId()
  {
    return 8026;
  }

  public int bcN()
  {
    return this.bWz;
  }
}