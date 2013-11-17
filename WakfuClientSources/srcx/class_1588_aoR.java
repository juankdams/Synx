import java.nio.ByteBuffer;
import java.util.ArrayList;

final class aoR
{
  private final Xe dur = new Xe();
  private final Xe dus = new Xe();
  private final Xe dut = new Xe();
  private final Xe duu = new Xe();

  private aoR(aTM paramaTM) {  } 
  public void z() { this.duv.dur.cxL = this.dur.cxL;
    this.duv.dur.aZC.clear();
    this.duv.dur.aZC.ensureCapacity(this.dur.aZC.size());
    this.duv.dur.aZC.addAll(this.dur.aZC);
    this.duv.dus.cxL = this.dus.cxL;
    this.duv.dus.aZC.clear();
    this.duv.dus.aZC.ensureCapacity(this.dus.aZC.size());
    this.duv.dus.aZC.addAll(this.dus.aZC);
    this.duv.dut.cxL = this.dut.cxL;
    this.duv.dut.aZC.clear();
    this.duv.dut.aZC.ensureCapacity(this.dut.aZC.size());
    this.duv.dut.aZC.addAll(this.dut.aZC);
    this.duv.duu.cxL = this.duu.cxL;
    this.duv.duu.aZC.clear();
    this.duv.duu.aZC.ensureCapacity(this.duu.aZC.size());
    this.duv.duu.aZC.addAll(this.duu.aZC); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    boolean bool1 = this.dur.b(paramByteBuffer, 0);
    if (!bool1)
      return false;
    boolean bool2 = this.dus.b(paramByteBuffer, 0);
    if (!bool2)
      return false;
    boolean bool3 = this.dut.b(paramByteBuffer, 0);
    if (!bool3)
      return false;
    boolean bool4 = this.duu.b(paramByteBuffer, 0);
    if (!bool4)
      return false;
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.dur.b(paramByteBuffer, 1);
    if (!bool1)
      return false;
    boolean bool2 = this.dus.b(paramByteBuffer, 1);
    if (!bool2)
      return false;
    boolean bool3 = this.dut.b(paramByteBuffer, 1);
    if (!bool3)
      return false;
    boolean bool4 = this.duu.b(paramByteBuffer, 1);
    if (!bool4)
      return false;
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.dur.b(paramByteBuffer, 313);
    if (!bool1)
      return false;
    boolean bool2 = this.dus.b(paramByteBuffer, 313);
    if (!bool2)
      return false;
    boolean bool3 = this.dut.b(paramByteBuffer, 313);
    if (!bool3)
      return false;
    boolean bool4 = this.duu.b(paramByteBuffer, 313);
    if (!bool4)
      return false;
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.dur.b(paramByteBuffer, 314);
    if (!bool1)
      return false;
    boolean bool2 = this.dus.b(paramByteBuffer, 314);
    if (!bool2)
      return false;
    boolean bool3 = this.dut.b(paramByteBuffer, 314);
    if (!bool3)
      return false;
    boolean bool4 = this.duu.b(paramByteBuffer, 314);
    if (!bool4)
      return false;
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.dur.b(paramByteBuffer, 315);
    if (!bool1)
      return false;
    boolean bool2 = this.dus.b(paramByteBuffer, 315);
    if (!bool2)
      return false;
    boolean bool3 = this.dut.b(paramByteBuffer, 315);
    if (!bool3)
      return false;
    boolean bool4 = this.duu.b(paramByteBuffer, 315);
    if (!bool4)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.dur.b(paramByteBuffer, 10003);
    if (!bool1)
      return false;
    boolean bool2 = this.dus.b(paramByteBuffer, 10003);
    if (!bool2)
      return false;
    boolean bool3 = this.dut.b(paramByteBuffer, 10003);
    if (!bool3)
      return false;
    boolean bool4 = this.duu.b(paramByteBuffer, 10003);
    if (!bool4)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.dur.b(paramByteBuffer, 10023);
    if (!bool1)
      return false;
    boolean bool2 = this.dus.b(paramByteBuffer, 10023);
    if (!bool2)
      return false;
    boolean bool3 = this.dut.b(paramByteBuffer, 10023);
    if (!bool3)
      return false;
    boolean bool4 = this.duu.b(paramByteBuffer, 10023);
    if (!bool4)
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