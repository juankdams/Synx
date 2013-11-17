import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dxO
{
  private final drq hiA = new drq();

  private dxO(bWr parambWr) {  } 
  public void z() { this.ixB.hiA.ayt = this.hiA.ayt;
    this.ixB.hiA.ayu = this.hiA.ayu;
    this.ixB.hiA.ayv = this.hiA.ayv;
    this.ixB.hiA.ayw.clear();
    this.ixB.hiA.ayw.ensureCapacity(this.hiA.ayw.size());
    this.ixB.hiA.ayw.addAll(this.hiA.ayw);
    this.ixB.hiA.ayx = this.hiA.ayx;
    this.ixB.hiA.ayy = this.hiA.ayy;
    this.ixB.hiA.ayz.biO = this.hiA.ayz.biO;
    this.ixB.hiA.ayz.biP.clear();
    this.ixB.hiA.ayz.biP.ensureCapacity(this.hiA.ayz.biP.size());
    this.ixB.hiA.ayz.biP.addAll(this.hiA.ayz.biP);
    this.ixB.hiA.ayz.biQ.clear();
    this.ixB.hiA.ayz.biQ.ensureCapacity(this.hiA.ayz.biQ.size());
    this.ixB.hiA.ayz.biQ.addAll(this.hiA.ayz.biQ); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    boolean bool = this.hiA.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    return true;
  }

  private boolean l(ByteBuffer paramByteBuffer) {
    boolean bool = this.hiA.b(paramByteBuffer, 309);
    if (!bool)
      return false;
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    boolean bool = this.hiA.b(paramByteBuffer, 313);
    if (!bool)
      return false;
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    boolean bool = this.hiA.b(paramByteBuffer, 314);
    if (!bool)
      return false;
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    boolean bool = this.hiA.b(paramByteBuffer, 315);
    if (!bool)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    boolean bool = this.hiA.b(paramByteBuffer, 10003);
    if (!bool)
      return false;
    return true;
  }

  private boolean p(ByteBuffer paramByteBuffer) {
    boolean bool = this.hiA.b(paramByteBuffer, 10005);
    if (!bool)
      return false;
    return true;
  }

  private boolean q(ByteBuffer paramByteBuffer) {
    boolean bool = this.hiA.b(paramByteBuffer, 10014);
    if (!bool)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    boolean bool = this.hiA.b(paramByteBuffer, 10023);
    if (!bool)
      return false;
    return true;
  }

  private boolean s(ByteBuffer paramByteBuffer) {
    boolean bool = this.hiA.b(paramByteBuffer, 1027001);
    if (!bool)
      return false;
    return true;
  }

  private boolean t(ByteBuffer paramByteBuffer) {
    boolean bool = this.hiA.b(paramByteBuffer, 1027002);
    if (!bool)
      return false;
    return true;
  }

  public void A() {
  }

  public void kY() {
  }

  public void kZ() {
  }

  public void la() {
  }

  public void lb() {
  }

  public void lc() {
  }

  public void ld() {
  }

  public void le() {
  }

  public void lf() {
  }

  public void lg() {
  }

  public void lh() {
  }

  public void li() {
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
        kY();
        kZ();
        la();
        lb();
        lc();
        ld();
        le();
        lf();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 309) {
      bool = f(paramByteBuffer);
      if (bool) {
        kY();
        kZ();
        la();
        lb();
        lc();
        ld();
        le();
        lf();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 313) {
      bool = l(paramByteBuffer);
      if (bool) {
        kZ();
        la();
        lb();
        lc();
        ld();
        le();
        lf();
        lg();
        lh();
        li();
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
        ld();
        le();
        lf();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 315) {
      bool = k(paramByteBuffer);
      if (bool) {
        lb();
        lc();
        ld();
        le();
        lf();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 10003) {
      bool = n(paramByteBuffer);
      if (bool) {
        lc();
        ld();
        le();
        lf();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 10005) {
      bool = o(paramByteBuffer);
      if (bool) {
        ld();
        le();
        lf();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 10014) {
      bool = p(paramByteBuffer);
      if (bool) {
        le();
        lf();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 10023) {
      bool = q(paramByteBuffer);
      if (bool) {
        lf();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 1027001) {
      bool = r(paramByteBuffer);
      if (bool) {
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 1027002) {
      bool = s(paramByteBuffer);
      if (bool) {
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 10028000) {
      bool = t(paramByteBuffer);
      if (bool) {
        li();
        return true;
      }
      return false;
    }

    return false;
  }
}