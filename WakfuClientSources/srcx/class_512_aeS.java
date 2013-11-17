import java.nio.ByteBuffer;

final class aeS
{
  private dzL bPB = null;
  private aSE bPC = null;
  private cir bPD = null;

  private aeS(Hp paramHp) {  } 
  public void z() { this.cWU.bPB = this.bPB;
    this.cWU.bPC = this.bPC;
    this.cWU.bPD = this.bPD; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    return true;
  }

  public void A() {
  }

  public void uF() {
  }

  public void la() {
  }

  public void lb() {
  }

  public void aqy() {
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
        uF();
        la();
        lb();
        aqy();
        return true;
      }
      return false;
    }
    if (paramInt < 313) {
      bool = f(paramByteBuffer);
      if (bool) {
        uF();
        la();
        lb();
        aqy();
        return true;
      }
      return false;
    }
    if (paramInt < 314) {
      bool = m(paramByteBuffer);
      if (bool) {
        la();
        lb();
        aqy();
        return true;
      }
      return false;
    }
    if (paramInt < 315) {
      bool = k(paramByteBuffer);
      if (bool) {
        lb();
        aqy();
        return true;
      }
      return false;
    }
    if (paramInt < 10024001) {
      bool = n(paramByteBuffer);
      if (bool) {
        aqy();
        return true;
      }
      return false;
    }

    return false;
  }
}