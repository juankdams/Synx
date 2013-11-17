import java.nio.ByteBuffer;

public class Aj extends dzz
{
  private int bvH;
  private int bvI;

  public int getValue()
  {
    return this.bvH;
  }

  public int Jt() {
    return this.bvI;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.bvH = localByteBuffer.getInt();
    this.bvI = localByteBuffer.getInt();

    return true;
  }

  public int getId()
  {
    return 4124;
  }
}