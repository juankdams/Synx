import java.nio.ByteBuffer;

final class aIc
{
  private final aof egq = new aof();

  private aIc(dKK paramdKK) {  } 
  public void z() { this.egr.egq.dsE = this.egq.dsE;
    this.egr.egq.name = this.egq.name;
    this.egr.egq.dsF = this.egq.dsF;
    this.egr.egq.dsG = this.egq.dsG;
    this.egr.egq.dsH = this.egq.dsH;
    this.egr.egq.dsI = this.egq.dsI;
    this.egr.egq.dsJ = this.egq.dsJ;
    this.egr.egq.btt = this.egq.btt;
    this.egr.egq.dsK = this.egq.dsK;
    this.egr.egq.dsL = this.egq.dsL;
    this.egr.egq.direction = this.egq.direction;
    this.egr.egq.dsM = this.egq.dsM; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    boolean bool = this.egq.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    return true;
  }

  public void A() {
  }

  public void J() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 0)
    {
      return false;
    }
    boolean bool;
    if (paramInt < 1) {
      bool = e(paramByteBuffer);
      if (bool) {
        A();
        J();
        return true;
      }
      return false;
    }
    if (paramInt < 10013) {
      bool = f(paramByteBuffer);
      if (bool) {
        J();
        return true;
      }
      return false;
    }

    return false;
  }
}