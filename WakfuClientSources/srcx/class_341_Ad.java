import java.nio.ByteBuffer;

public class Ad extends dzz
{
  private byte bvB;
  private int bvC;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bvB = localByteBuffer.get();
    this.bvC = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 8414;
  }

  public byte Jk() {
    return this.bvB;
  }

  public int Jl() {
    return this.bvC;
  }
}