import java.nio.ByteBuffer;

public class dWC extends dzz
{
  private drq dVC;

  public drq aNJ()
  {
    return this.dVC;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.dVC = new drq();
    this.dVC.h(localByteBuffer);

    return true;
  }

  public int getId() {
    return 10018;
  }
}