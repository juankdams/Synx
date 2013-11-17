import java.nio.ByteBuffer;

public class dkq extends dzz
{
  private final aoL aVC = new aoL();
  private byte aVE;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aVE = localByteBuffer.get();

    while (localByteBuffer.hasRemaining()) {
      long l = localByteBuffer.getLong();
      byte b = localByteBuffer.get();
      cCA localcCA = cCA.ed(b);
      localcCA.a(localByteBuffer);

      if (localcCA.L() == 0)
        ((dOx)localcCA).b(true);
      else if (localcCA.L() == 2) {
        ((z)localcCA).b(true);
      }
      this.aVC.put(l, localcCA);
    }

    return true;
  }

  public byte wM() {
    return this.aVE;
  }

  public aoL wO() {
    return this.aVC;
  }

  public int getId()
  {
    return 11122;
  }
}