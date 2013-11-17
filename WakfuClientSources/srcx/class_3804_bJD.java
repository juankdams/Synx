import java.nio.ByteBuffer;

public class bJD extends dzz
{
  private int ie;

  public int bP()
  {
    return this.ie;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.ie = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 15132;
  }
}