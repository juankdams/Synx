import java.nio.ByteBuffer;
import java.util.ArrayList;

final class Lx
{
  private final ArrayList ayw = new ArrayList(0);
  private int bYg = 0;
  private int ayx = 0;
  private final dnk bYh = new dnk();
  private final bIq ayz = new bIq();
  private final bwk bYi = new bwk();
  private final bba bYj = new bba();

  private Lx(cMH paramcMH) {  } 
  public void z() { this.bYk.ayw.clear();
    this.bYk.ayw.ensureCapacity(this.ayw.size());
    this.bYk.ayw.addAll(this.ayw);
    this.bYk.bYg = this.bYg;
    this.bYk.ayx = this.ayx;
    this.bYk.bYh.lmy.clear();
    this.bYk.bYh.lmy.ensureCapacity(this.bYh.lmy.size());
    this.bYk.bYh.lmy.addAll(this.bYh.lmy);
    this.bYk.bYh.lmz = this.bYh.lmz;
    this.bYk.bYh.lmA = this.bYh.lmA;
    this.bYk.bYh.lmB = this.bYh.lmB;
    this.bYk.ayz.biO = this.ayz.biO;
    this.bYk.ayz.biP.clear();
    this.bYk.ayz.biP.ensureCapacity(this.ayz.biP.size());
    this.bYk.ayz.biP.addAll(this.ayz.biP);
    this.bYk.ayz.biQ.clear();
    this.bYk.ayz.biQ.ensureCapacity(this.ayz.biQ.size());
    this.bYk.ayz.biQ.addAll(this.ayz.biQ);
    this.bYk.bYi.ggL = this.bYi.ggL;
    this.bYk.bYi.ggM.clear();
    this.bYk.bYi.ggM.ensureCapacity(this.bYi.ggM.size());
    this.bYk.bYi.ggM.addAll(this.bYi.ggM);
    this.bYk.bYj.fjc = this.bYj.fjc; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      sD localsD = new sD();
      bool3 = localsD.b(paramByteBuffer, 1);
      if (!bool3)
        return false;
      this.ayw.add(localsD);
    }
    this.bYg = paramByteBuffer.getInt();
    this.ayx = paramByteBuffer.getInt();
    boolean bool1 = this.bYh.b(paramByteBuffer, 1);
    if (!bool1)
      return false;
    boolean bool2 = this.ayz.b(paramByteBuffer, 1);
    if (!bool2)
      return false;
    boolean bool3 = this.bYi.b(paramByteBuffer, 1);
    if (!bool3)
      return false;
    boolean bool4 = this.bYj.b(paramByteBuffer, 1);
    if (!bool4)
      return false;
    return true;
  }

  private boolean l(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      sD localsD = new sD();
      bool3 = localsD.b(paramByteBuffer, 309);
      if (!bool3)
        return false;
      this.ayw.add(localsD);
    }
    this.bYg = paramByteBuffer.getInt();
    this.ayx = paramByteBuffer.getInt();
    boolean bool1 = this.bYh.b(paramByteBuffer, 309);
    if (!bool1)
      return false;
    boolean bool2 = this.ayz.b(paramByteBuffer, 309);
    if (!bool2)
      return false;
    boolean bool3 = this.bYi.b(paramByteBuffer, 309);
    if (!bool3)
      return false;
    boolean bool4 = this.bYj.b(paramByteBuffer, 309);
    if (!bool4)
      return false;
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      sD localsD = new sD();
      bool3 = localsD.b(paramByteBuffer, 313);
      if (!bool3)
        return false;
      this.ayw.add(localsD);
    }
    this.bYg = paramByteBuffer.getInt();
    this.ayx = paramByteBuffer.getInt();
    boolean bool1 = this.bYh.b(paramByteBuffer, 313);
    if (!bool1)
      return false;
    boolean bool2 = this.ayz.b(paramByteBuffer, 313);
    if (!bool2)
      return false;
    boolean bool3 = this.bYi.b(paramByteBuffer, 313);
    if (!bool3)
      return false;
    boolean bool4 = this.bYj.b(paramByteBuffer, 313);
    if (!bool4)
      return false;
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      sD localsD = new sD();
      bool3 = localsD.b(paramByteBuffer, 314);
      if (!bool3)
        return false;
      this.ayw.add(localsD);
    }
    this.bYg = paramByteBuffer.getInt();
    this.ayx = paramByteBuffer.getInt();
    boolean bool1 = this.bYh.b(paramByteBuffer, 314);
    if (!bool1)
      return false;
    boolean bool2 = this.ayz.b(paramByteBuffer, 314);
    if (!bool2)
      return false;
    boolean bool3 = this.bYi.b(paramByteBuffer, 314);
    if (!bool3)
      return false;
    boolean bool4 = this.bYj.b(paramByteBuffer, 314);
    if (!bool4)
      return false;
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      sD localsD = new sD();
      bool3 = localsD.b(paramByteBuffer, 315);
      if (!bool3)
        return false;
      this.ayw.add(localsD);
    }
    this.bYg = paramByteBuffer.getInt();
    this.ayx = paramByteBuffer.getInt();
    boolean bool1 = this.bYh.b(paramByteBuffer, 315);
    if (!bool1)
      return false;
    boolean bool2 = this.ayz.b(paramByteBuffer, 315);
    if (!bool2)
      return false;
    boolean bool3 = this.bYi.b(paramByteBuffer, 315);
    if (!bool3)
      return false;
    boolean bool4 = this.bYj.b(paramByteBuffer, 315);
    if (!bool4)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      sD localsD = new sD();
      bool3 = localsD.b(paramByteBuffer, 10003);
      if (!bool3)
        return false;
      this.ayw.add(localsD);
    }
    this.bYg = paramByteBuffer.getInt();
    this.ayx = paramByteBuffer.getInt();
    boolean bool1 = this.bYh.b(paramByteBuffer, 10003);
    if (!bool1)
      return false;
    boolean bool2 = this.ayz.b(paramByteBuffer, 10003);
    if (!bool2)
      return false;
    boolean bool3 = this.bYi.b(paramByteBuffer, 10003);
    if (!bool3)
      return false;
    boolean bool4 = this.bYj.b(paramByteBuffer, 10003);
    if (!bool4)
      return false;
    return true;
  }

  private boolean q(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      sD localsD = new sD();
      bool3 = localsD.b(paramByteBuffer, 10014);
      if (!bool3)
        return false;
      this.ayw.add(localsD);
    }
    this.bYg = paramByteBuffer.getInt();
    this.ayx = paramByteBuffer.getInt();
    boolean bool1 = this.bYh.b(paramByteBuffer, 10014);
    if (!bool1)
      return false;
    boolean bool2 = this.ayz.b(paramByteBuffer, 10014);
    if (!bool2)
      return false;
    boolean bool3 = this.bYi.b(paramByteBuffer, 10014);
    if (!bool3)
      return false;
    boolean bool4 = this.bYj.b(paramByteBuffer, 10014);
    if (!bool4)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      sD localsD = new sD();
      bool3 = localsD.b(paramByteBuffer, 10023);
      if (!bool3)
        return false;
      this.ayw.add(localsD);
    }
    this.bYg = paramByteBuffer.getInt();
    this.ayx = paramByteBuffer.getInt();
    boolean bool1 = this.bYh.b(paramByteBuffer, 10023);
    if (!bool1)
      return false;
    boolean bool2 = this.ayz.b(paramByteBuffer, 10023);
    if (!bool2)
      return false;
    boolean bool3 = this.bYi.b(paramByteBuffer, 10023);
    if (!bool3)
      return false;
    boolean bool4 = this.bYj.b(paramByteBuffer, 10023);
    if (!bool4)
      return false;
    return true;
  }

  private boolean s(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      sD localsD = new sD();
      bool3 = localsD.b(paramByteBuffer, 1027001);
      if (!bool3)
        return false;
      this.ayw.add(localsD);
    }
    this.bYg = paramByteBuffer.getInt();
    this.ayx = paramByteBuffer.getInt();
    boolean bool1 = this.bYh.b(paramByteBuffer, 1027001);
    if (!bool1)
      return false;
    boolean bool2 = this.ayz.b(paramByteBuffer, 1027001);
    if (!bool2)
      return false;
    boolean bool3 = this.bYi.b(paramByteBuffer, 1027001);
    if (!bool3)
      return false;
    boolean bool4 = this.bYj.b(paramByteBuffer, 1027001);
    if (!bool4)
      return false;
    return true;
  }

  private boolean t(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      sD localsD = new sD();
      bool3 = localsD.b(paramByteBuffer, 1027002);
      if (!bool3)
        return false;
      this.ayw.add(localsD);
    }
    this.bYg = paramByteBuffer.getInt();
    this.ayx = paramByteBuffer.getInt();
    boolean bool1 = this.bYh.b(paramByteBuffer, 1027002);
    if (!bool1)
      return false;
    boolean bool2 = this.ayz.b(paramByteBuffer, 1027002);
    if (!bool2)
      return false;
    boolean bool3 = this.bYi.b(paramByteBuffer, 1027002);
    if (!bool3)
      return false;
    boolean bool4 = this.bYj.b(paramByteBuffer, 1027002);
    if (!bool4)
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