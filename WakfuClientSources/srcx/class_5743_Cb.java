import java.nio.ByteBuffer;
import java.util.ArrayList;

final class Cb
{
  private int id = -1;
  private boolean enabled = true;
  private final ArrayList bED = new ArrayList(0);
  private chB bEE = null;

  private Cb(dya paramdya) {  } 
  public void z() { this.bEF.id = this.id;
    this.bEF.enabled = this.enabled;
    this.bEF.bED.clear();
    this.bEF.bED.ensureCapacity(this.bED.size());
    this.bEF.bED.addAll(this.bED);
    this.bEF.bEE = this.bEE; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      XI localXI = new XI();
      boolean bool = localXI.b(paramByteBuffer, 0);
      if (!bool)
        return false;
      this.bED.add(localXI);
    }
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      XI localXI = new XI();
      boolean bool = localXI.b(paramByteBuffer, 1);
      if (!bool)
        return false;
      this.bED.add(localXI);
    }
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      XI localXI = new XI();
      boolean bool = localXI.b(paramByteBuffer, 313);
      if (!bool)
        return false;
      this.bED.add(localXI);
    }
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      XI localXI = new XI();
      boolean bool = localXI.b(paramByteBuffer, 314);
      if (!bool)
        return false;
      this.bED.add(localXI);
    }
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      XI localXI = new XI();
      boolean bool = localXI.b(paramByteBuffer, 315);
      if (!bool)
        return false;
      this.bED.add(localXI);
    }
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      XI localXI = new XI();
      boolean bool = localXI.b(paramByteBuffer, 10003);
      if (!bool)
        return false;
      this.bED.add(localXI);
    }
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      XI localXI = new XI();
      boolean bool = localXI.b(paramByteBuffer, 10023);
      if (!bool)
        return false;
      this.bED.add(localXI);
    }
    return true;
  }

  private boolean C(ByteBuffer paramByteBuffer) {
    this.id = paramByteBuffer.getInt();
    this.enabled = (paramByteBuffer.get() == 1);
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      XI localXI = new XI();
      boolean bool = localXI.b(paramByteBuffer, 10025000);
      if (!bool)
        return false;
      this.bED.add(localXI);
    }
    return true;
  }

  private boolean D(ByteBuffer paramByteBuffer) {
    this.id = paramByteBuffer.getInt();
    this.enabled = (paramByteBuffer.get() == 1);
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      XI localXI = new XI();
      boolean bool2 = localXI.b(paramByteBuffer, 10025001);
      if (!bool2)
        return false;
      this.bED.add(localXI);
    }
    j = paramByteBuffer.get() == 1 ? 1 : 0;
    if (j != 0) {
      this.bEE = new chB();
      boolean bool1 = this.bEE.b(paramByteBuffer, 10025001);
      if (!bool1)
        return false;
    } else {
      this.bEE = null;
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

  public void Ld() {
  }

  public void Le() {
  }

  public void Lf() {
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
        Ld();
        Le();
        Lf();
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
        Ld();
        Le();
        Lf();
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
        Ld();
        Le();
        Lf();
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
        Ld();
        Le();
        Lf();
        return true;
      }
      return false;
    }
    if (paramInt < 10003) {
      bool = n(paramByteBuffer);
      if (bool) {
        lc();
        uG();
        Ld();
        Le();
        Lf();
        return true;
      }
      return false;
    }
    if (paramInt < 10023) {
      bool = o(paramByteBuffer);
      if (bool) {
        uG();
        Ld();
        Le();
        Lf();
        return true;
      }
      return false;
    }
    if (paramInt < 10025000) {
      bool = r(paramByteBuffer);
      if (bool) {
        Ld();
        Le();
        Lf();
        return true;
      }
      return false;
    }
    if (paramInt < 10025001) {
      bool = C(paramByteBuffer);
      if (bool) {
        Le();
        Lf();
        return true;
      }
      return false;
    }
    if (paramInt < 10028000) {
      bool = D(paramByteBuffer);
      if (bool) {
        Lf();
        return true;
      }
      return false;
    }

    return false;
  }
}