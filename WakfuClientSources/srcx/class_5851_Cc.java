import java.nio.ByteBuffer;
import java.util.ArrayList;

final class Cc
{
  private final btn bEG = new btn();

  private Cc(bMl parambMl) {  } 
  public void z() { this.bEH.bEG.bPv = this.bEG.bPv;
    this.bEH.bEG.bPw = this.bEG.bPw;
    this.bEH.bEG.aYU = this.bEG.aYU;
    this.bEH.bEG.bPx = this.bEG.bPx;
    this.bEH.bEG.bPy.aZC.clear();
    this.bEH.bEG.bPy.aZC.ensureCapacity(this.bEG.bPy.aZC.size());
    this.bEH.bEG.bPy.aZC.addAll(this.bEG.bPy.aZC); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    boolean bool = this.bEG.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    boolean bool = this.bEG.b(paramByteBuffer, 313);
    if (!bool)
      return false;
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    boolean bool = this.bEG.b(paramByteBuffer, 314);
    if (!bool)
      return false;
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    boolean bool = this.bEG.b(paramByteBuffer, 315);
    if (!bool)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    boolean bool = this.bEG.b(paramByteBuffer, 10003);
    if (!bool)
      return false;
    return true;
  }

  private boolean E(ByteBuffer paramByteBuffer) {
    boolean bool = this.bEG.b(paramByteBuffer, 10020);
    if (!bool)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    boolean bool = this.bEG.b(paramByteBuffer, 10023);
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

  public void Lg() {
  }

  public void Lh() {
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
        Lg();
        Lh();
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
        Lg();
        Lh();
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
        Lg();
        Lh();
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
        Lg();
        Lh();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 10003) {
      bool = n(paramByteBuffer);
      if (bool) {
        lc();
        Lg();
        Lh();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 10020) {
      bool = o(paramByteBuffer);
      if (bool) {
        Lg();
        Lh();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 10023) {
      bool = E(paramByteBuffer);
      if (bool) {
        Lh();
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