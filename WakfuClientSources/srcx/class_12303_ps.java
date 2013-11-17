import java.nio.ByteBuffer;

public class ps extends dzz
{
  private final aoL aVC = new aoL();
  private final dGD aVD = new dGD();
  private byte aVE;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aVE = localByteBuffer.get();
    this.aVD.h(localByteBuffer);

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

  public gA wN() {
    return vd.QM().c(this.aVD);
  }

  public aoL wO() {
    return this.aVC;
  }

  public int getId()
  {
    return 11120;
  }
}