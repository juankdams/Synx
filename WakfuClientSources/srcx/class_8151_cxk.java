import java.nio.ByteBuffer;

final class cxk
{
  private short cIh = 0;
  private final dGD cpq = new dGD();

  private cxk(aTg paramaTg) {  } 
  public void z() { this.ikd.cIh = this.cIh;
    this.ikd.cpq.bPv = this.cpq.bPv;
    this.ikd.cpq.aDe = this.cpq.aDe;
    this.ikd.cpq.aDf = this.cpq.aDf;
    this.ikd.cpq.hok = this.cpq.hok;
    this.ikd.cpq.hol = this.cpq.hol;
    this.ikd.cpq.hom = this.cpq.hom;
    this.ikd.cpq.hoo = this.cpq.hoo;
    this.ikd.cpq.hop = this.cpq.hop; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    boolean bool = this.cpq.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    boolean bool = this.cpq.b(paramByteBuffer, 313);
    if (!bool)
      return false;
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    boolean bool = this.cpq.b(paramByteBuffer, 314);
    if (!bool)
      return false;
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    boolean bool = this.cpq.b(paramByteBuffer, 315);
    if (!bool)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    boolean bool = this.cpq.b(paramByteBuffer, 10003);
    if (!bool)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    boolean bool = this.cpq.b(paramByteBuffer, 10023);
    if (!bool)
      return false;
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

  public void lc() {
  }

  public void uG() {
  }

  public void uH() {
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
        lc();
        uG();
        uH();
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
        lc();
        uG();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 314) {
      bool = m(paramByteBuffer);
      if (bool) {
        la();
        lb();
        lc();
        uG();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 315) {
      bool = k(paramByteBuffer);
      if (bool) {
        lb();
        lc();
        uG();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 10003) {
      bool = n(paramByteBuffer);
      if (bool) {
        lc();
        uG();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 10023) {
      bool = o(paramByteBuffer);
      if (bool) {
        uG();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 10028000) {
      bool = r(paramByteBuffer);
      if (bool) {
        uH();
        return true;
      }
      return false;
    }

    return false;
  }
}