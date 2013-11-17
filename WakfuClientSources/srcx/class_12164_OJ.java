import java.nio.ByteBuffer;

public class OJ extends dzz
{
  private final aoL aVC = new aoL();
  private long cfR;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.cfR = localByteBuffer.getLong();

    while (localByteBuffer.hasRemaining()) {
      long l = localByteBuffer.getLong();
      byte b = localByteBuffer.get();
      cCA localcCA = cCA.ed(b);
      localcCA.a(localByteBuffer);
      if ((localcCA instanceof dOx))
        ((dOx)localcCA).b(true);
      this.aVC.put(l, localcCA);
    }

    return true;
  }

  public aoL wO() {
    return this.aVC;
  }

  public long aaK() {
    return this.cfR;
  }

  public int getId()
  {
    return 5224;
  }
}