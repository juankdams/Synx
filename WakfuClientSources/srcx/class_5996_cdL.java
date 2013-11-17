import java.nio.ByteBuffer;

public class cdL extends dzz
{
  private Qy hxL;
  private int cio;
  private int cip;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.hxL = Qy.T(localByteBuffer);
    this.cio = localByteBuffer.getInt();
    this.cip = localByteBuffer.getInt();
    return true;
  }

  public Qy cgz() {
    return this.hxL;
  }

  public int abA() {
    return this.cio;
  }

  public int abB() {
    return this.cip;
  }

  public int getId()
  {
    return 15122;
  }
}