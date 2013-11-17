import java.nio.ByteBuffer;

public class bJd extends dzz
{
  private long eQx;
  private final PX gJY = new PX();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.eQx = localByteBuffer.getLong();
    int i = localByteBuffer.get();
    for (int j = 0; j < i; j = (byte)(j + 1)) {
      byte b = localByteBuffer.get();
      this.gJY.c(b, localByteBuffer.getInt());
    }
    return true;
  }

  public int getId() {
    return 5206;
  }

  public PX bQu()
  {
    return this.gJY;
  }

  public long bix() {
    return this.eQx;
  }
}