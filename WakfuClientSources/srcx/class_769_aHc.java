import java.nio.ByteBuffer;

public class aHc extends dzz
{
  private int btQ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.btQ = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 15600;
  }

  public int aSY() {
    return this.btQ;
  }
}