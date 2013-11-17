import java.nio.ByteBuffer;
import java.util.ArrayList;

final class Hn
{
  private long bPv = 0L;
  private int bPw = 0;
  private byte aYU = 0;
  private byte type = 0;
  private short bPx = 0;
  private final dQW bPy = new dQW();

  private Hn(btn parambtn) {  } 
  public void z() { this.bPz.bPv = this.bPv;
    this.bPz.bPw = this.bPw;
    this.bPz.aYU = this.aYU;
    this.bPz.bPx = this.bPx;
    this.bPz.bPy.aZC.clear();
    this.bPz.bPy.aZC.ensureCapacity(this.bPy.aZC.size());
    this.bPz.bPy.aZC.addAll(this.bPy.aZC); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.bPw = paramByteBuffer.getInt();
    this.aYU = paramByteBuffer.get();
    this.type = paramByteBuffer.get();
    this.bPx = paramByteBuffer.getShort();
    boolean bool = this.bPy.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.bPw = paramByteBuffer.getInt();
    this.aYU = paramByteBuffer.get();
    this.type = paramByteBuffer.get();
    this.bPx = paramByteBuffer.getShort();
    boolean bool = this.bPy.b(paramByteBuffer, 313);
    if (!bool)
      return false;
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.bPw = paramByteBuffer.getInt();
    this.aYU = paramByteBuffer.get();
    this.type = paramByteBuffer.get();
    this.bPx = paramByteBuffer.getShort();
    boolean bool = this.bPy.b(paramByteBuffer, 314);
    if (!bool)
      return false;
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.bPw = paramByteBuffer.getInt();
    this.aYU = paramByteBuffer.get();
    this.type = paramByteBuffer.get();
    this.bPx = paramByteBuffer.getShort();
    boolean bool = this.bPy.b(paramByteBuffer, 315);
    if (!bool)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.bPw = paramByteBuffer.getInt();
    this.aYU = paramByteBuffer.get();
    this.type = paramByteBuffer.get();
    this.bPx = paramByteBuffer.getShort();
    boolean bool = this.bPy.b(paramByteBuffer, 10003);
    if (!bool)
      return false;
    return true;
  }

  private boolean E(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.bPw = paramByteBuffer.getInt();
    this.aYU = paramByteBuffer.get();
    this.bPx = paramByteBuffer.getShort();
    boolean bool = this.bPy.b(paramByteBuffer, 10020);
    if (!bool)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.bPw = paramByteBuffer.getInt();
    this.aYU = paramByteBuffer.get();
    this.bPx = paramByteBuffer.getShort();
    boolean bool = this.bPy.b(paramByteBuffer, 10023);
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