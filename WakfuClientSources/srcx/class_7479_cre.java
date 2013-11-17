import java.nio.ByteBuffer;

public class cre extends dzz
{
  private int bQo;
  private byte bwR;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bQo = localByteBuffer.getInt();
    this.bwR = localByteBuffer.get();

    return true;
  }

  public int getId()
  {
    return 1202;
  }

  public int anM()
  {
    return this.bQo;
  }

  public byte Kh()
  {
    return this.bwR;
  }
}