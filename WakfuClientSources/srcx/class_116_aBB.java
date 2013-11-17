import java.nio.ByteBuffer;

public class aBB extends dzz
{
  private boolean dVB;
  private drq dVC;
  private boolean dVD;
  private boolean dVE = true;
  private boolean dVF = false;
  private int dVG;

  public boolean aNI()
  {
    return this.dVB;
  }

  public drq aNJ() {
    return this.dVC;
  }

  public int aNK() {
    return this.dVG;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.dVB = (localByteBuffer.get() == 1);
    this.dVD = (localByteBuffer.get() == 1);
    this.dVG = localByteBuffer.getInt();
    if (this.dVB) {
      if (!this.dVD) {
        this.dVC = new drq();
        this.dVC.h(localByteBuffer);
      } else {
        this.dVF = (localByteBuffer.get() == 1);
        this.dVE = (localByteBuffer.get() == 1);
        this.dVC = null;
      }
    }
    return true;
  }

  public int getId() {
    return 10004;
  }

  public boolean aNL() {
    return this.dVD;
  }

  public boolean aNM() {
    return this.dVF;
  }

  public boolean aNN() {
    return this.dVE;
  }
}