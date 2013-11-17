import java.nio.ByteBuffer;
import java.util.ArrayList;

final class cFa
{
  private final cMH izb = new cMH();

  private cFa(cGo paramcGo) {  } 
  public void z() { this.izc.izb.ayw.clear();
    this.izc.izb.ayw.ensureCapacity(this.izb.ayw.size());
    this.izc.izb.ayw.addAll(this.izb.ayw);
    this.izc.izb.bYg = this.izb.bYg;
    this.izc.izb.ayx = this.izb.ayx;
    this.izc.izb.bYh.lmy.clear();
    this.izc.izb.bYh.lmy.ensureCapacity(this.izb.bYh.lmy.size());
    this.izc.izb.bYh.lmy.addAll(this.izb.bYh.lmy);
    this.izc.izb.bYh.lmz = this.izb.bYh.lmz;
    this.izc.izb.bYh.lmA = this.izb.bYh.lmA;
    this.izc.izb.bYh.lmB = this.izb.bYh.lmB;
    this.izc.izb.ayz.biO = this.izb.ayz.biO;
    this.izc.izb.ayz.biP.clear();
    this.izc.izb.ayz.biP.ensureCapacity(this.izb.ayz.biP.size());
    this.izc.izb.ayz.biP.addAll(this.izb.ayz.biP);
    this.izc.izb.ayz.biQ.clear();
    this.izc.izb.ayz.biQ.ensureCapacity(this.izb.ayz.biQ.size());
    this.izc.izb.ayz.biQ.addAll(this.izb.ayz.biQ);
    this.izc.izb.bYi.ggL = this.izb.bYi.ggL;
    this.izc.izb.bYi.ggM.clear();
    this.izc.izb.bYi.ggM.ensureCapacity(this.izb.bYi.ggM.size());
    this.izc.izb.bYi.ggM.addAll(this.izb.bYi.ggM);
    this.izc.izb.bYj.fjc = this.izb.bYj.fjc; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    boolean bool = this.izb.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    return true;
  }

  private boolean l(ByteBuffer paramByteBuffer) {
    boolean bool = this.izb.b(paramByteBuffer, 309);
    if (!bool)
      return false;
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    boolean bool = this.izb.b(paramByteBuffer, 313);
    if (!bool)
      return false;
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    boolean bool = this.izb.b(paramByteBuffer, 314);
    if (!bool)
      return false;
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    boolean bool = this.izb.b(paramByteBuffer, 315);
    if (!bool)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    boolean bool = this.izb.b(paramByteBuffer, 10003);
    if (!bool)
      return false;
    return true;
  }

  private boolean q(ByteBuffer paramByteBuffer) {
    boolean bool = this.izb.b(paramByteBuffer, 10014);
    if (!bool)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    boolean bool = this.izb.b(paramByteBuffer, 10023);
    if (!bool)
      return false;
    return true;
  }

  private boolean s(ByteBuffer paramByteBuffer) {
    boolean bool = this.izb.b(paramByteBuffer, 1027001);
    if (!bool)
      return false;
    return true;
  }

  private boolean t(ByteBuffer paramByteBuffer) {
    boolean bool = this.izb.b(paramByteBuffer, 1027002);
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

  public void Wb() {
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
        Wb();
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
        Wb();
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
        Wb();
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
        Wb();
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
        Wb();
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
        Wb();
        lf();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 10014) {
      bool = o(paramByteBuffer);
      if (bool) {
        Wb();
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