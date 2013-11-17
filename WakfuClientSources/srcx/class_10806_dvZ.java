import java.nio.ByteBuffer;

public class dvZ extends dzz
{
  private boolean dwy = false;
  private long lBm;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dwy = (localByteBuffer.get() != 0);
    this.lBm = localByteBuffer.getLong();
    return false;
  }

  public boolean dbj() {
    return this.dwy;
  }

  public long dbk() {
    return this.lBm;
  }

  public int getId() {
    return 12404;
  }
}