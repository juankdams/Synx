import java.nio.ByteBuffer;

public class Ho extends dzz
{
  private int aNN;
  private int bPA;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aNN = localByteBuffer.getInt();
    this.bPA = localByteBuffer.getInt();
    return true;
  }

  public int getId()
  {
    return 11200;
  }

  public int getReason() {
    return this.bPA;
  }

  public int se() {
    return this.aNN;
  }
}