import java.nio.ByteBuffer;
import java.util.ArrayList;

final class aCx
{
  private final ArrayList dXh = new ArrayList(0);
  private final ArrayList dXi = new ArrayList(0);

  private aCx(bbO parambbO) {  } 
  public void z() { this.dXj.dXh.clear();
    this.dXj.dXh.ensureCapacity(this.dXh.size());
    this.dXj.dXh.addAll(this.dXh);
    this.dXj.dXi.clear();
    this.dXj.dXi.ensureCapacity(this.dXi.size());
    this.dXj.dXi.addAll(this.dXi); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dXh.clear();
    this.dXh.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bCj localbCj = new bCj();
      boolean bool = localbCj.b(paramByteBuffer, 0);
      if (!bool)
        return false;
      this.dXh.add(localbCj);
    }
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dXh.clear();
    this.dXh.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bCj localbCj = new bCj();
      boolean bool = localbCj.b(paramByteBuffer, 1);
      if (!bool)
        return false;
      this.dXh.add(localbCj);
    }
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dXh.clear();
    this.dXh.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bCj localbCj = new bCj();
      boolean bool = localbCj.b(paramByteBuffer, 313);
      if (!bool)
        return false;
      this.dXh.add(localbCj);
    }
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dXh.clear();
    this.dXh.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bCj localbCj = new bCj();
      boolean bool = localbCj.b(paramByteBuffer, 314);
      if (!bool)
        return false;
      this.dXh.add(localbCj);
    }
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dXh.clear();
    this.dXh.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bCj localbCj = new bCj();
      boolean bool = localbCj.b(paramByteBuffer, 315);
      if (!bool)
        return false;
      this.dXh.add(localbCj);
    }
    return true;
  }

  private boolean ai(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dXh.clear();
    this.dXh.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bCj localbCj = new bCj();
      boolean bool1 = localbCj.b(paramByteBuffer, 10012);
      if (!bool1)
        return false;
      this.dXh.add(localbCj);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.dXi.clear();
    this.dXi.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      Sf localSf = new Sf();
      boolean bool2 = localSf.b(paramByteBuffer, 10012);
      if (!bool2)
        return false;
      this.dXi.add(localSf);
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

  public void aOM() {
  }

  public void aON() {
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
        aOM();
        aON();
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
        aOM();
        aON();
        return true;
      }
      return false;
    }
    if (paramInt < 314) {
      bool = m(paramByteBuffer);
      if (bool) {
        la();
        lb();
        aOM();
        aON();
        return true;
      }
      return false;
    }
    if (paramInt < 315) {
      bool = k(paramByteBuffer);
      if (bool) {
        lb();
        aOM();
        aON();
        return true;
      }
      return false;
    }
    if (paramInt < 10012) {
      bool = n(paramByteBuffer);
      if (bool) {
        aOM();
        aON();
        return true;
      }
      return false;
    }
    if (paramInt < 10024001) {
      bool = ai(paramByteBuffer);
      if (bool) {
        aON();
        return true;
      }
      return false;
    }

    return false;
  }
}