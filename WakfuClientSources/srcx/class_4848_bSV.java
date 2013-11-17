import java.nio.ByteBuffer;

public class bSV extends dzz
{
  private final aoL aVC = new aoL();

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    while (localByteBuffer.hasRemaining()) {
      long l = localByteBuffer.getLong();
      byte b = localByteBuffer.get();
      cCA localcCA = cCA.ed(b);
      localcCA.a(localByteBuffer);
      this.aVC.put(l, localcCA);
    }

    return true;
  }

  public aoL wO() {
    return this.aVC;
  }

  public int getId()
  {
    return 11118;
  }
}