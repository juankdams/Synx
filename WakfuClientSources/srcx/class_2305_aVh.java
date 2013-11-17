import java.nio.ByteBuffer;

public class aVh extends dzz
{
  private int eXv;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.eXv = localByteBuffer.getInt();
    return false;
  }

  public int getId() {
    return 20054;
  }

  public int getErrorCode() {
    return this.eXv;
  }
}