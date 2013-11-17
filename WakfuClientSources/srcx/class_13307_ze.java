import java.nio.ByteBuffer;

final class ze
{
  private int bto = 0;
  private boolean btp = false;
  private boolean btq = false;
  private boolean btr = false;
  private boolean bts = false;
  private byte btt = -1;
  private dKK btu = null;

  private ze(Fo paramFo) {  } 
  public void z() { this.btv.bto = this.bto;
    this.btv.btp = this.btp;
    this.btv.btq = this.btq;
    this.btv.btr = this.btr;
    this.btv.bts = this.bts;
    this.btv.btt = this.btt;
    this.btv.btu = this.btu; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    this.bto = paramByteBuffer.getInt();
    this.btp = (paramByteBuffer.get() == 1);
    this.btq = (paramByteBuffer.get() == 1);
    this.btr = (paramByteBuffer.get() == 1);
    this.bts = (paramByteBuffer.get() == 1);
    this.btt = paramByteBuffer.get();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.btu = new dKK();
      boolean bool = this.btu.b(paramByteBuffer, 1);
      if (!bool)
        return false;
    } else {
      this.btu = null;
    }
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