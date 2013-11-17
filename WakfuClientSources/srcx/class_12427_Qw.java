import java.nio.ByteBuffer;
import java.util.ArrayList;

final class Qw
{
  private final ArrayList aZC = new ArrayList(0);

  private Qw(dQW paramdQW) {  } 
  public void z() { this.cpt.aZC.clear();
    this.cpt.aZC.ensureCapacity(this.aZC.size());
    this.cpt.aZC.addAll(this.aZC); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      aTg localaTg = new aTg();
      boolean bool = localaTg.b(paramByteBuffer, 1);
      if (!bool)
        return false;
      this.aZC.add(localaTg);
    }
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      aTg localaTg = new aTg();
      boolean bool = localaTg.b(paramByteBuffer, 313);
      if (!bool)
        return false;
      this.aZC.add(localaTg);
    }
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      aTg localaTg = new aTg();
      boolean bool = localaTg.b(paramByteBuffer, 314);
      if (!bool)
        return false;
      this.aZC.add(localaTg);
    }
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      aTg localaTg = new aTg();
      boolean bool = localaTg.b(paramByteBuffer, 315);
      if (!bool)
        return false;
      this.aZC.add(localaTg);
    }
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      aTg localaTg = new aTg();
      boolean bool = localaTg.b(paramByteBuffer, 10003);
      if (!bool)
        return false;
      this.aZC.add(localaTg);
    }
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      aTg localaTg = new aTg();
      boolean bool = localaTg.b(paramByteBuffer, 10023);
      if (!bool)
        return false;
      this.aZC.add(localaTg);
    }
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