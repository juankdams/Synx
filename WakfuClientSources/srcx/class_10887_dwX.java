import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dwX
{
  private final ArrayList dQE = new ArrayList(0);

  private dwX(azr paramazr) {  } 
  public void z() { this.lCT.dQE.clear();
    this.lCT.dQE.ensureCapacity(this.dQE.size());
    this.lCT.dQE.addAll(this.dQE); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dQE.clear();
    this.dQE.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cqY localcqY = new cqY();
      boolean bool = localcqY.b(paramByteBuffer, 0);
      if (!bool)
        return false;
      this.dQE.add(localcqY);
    }
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dQE.clear();
    this.dQE.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cqY localcqY = new cqY();
      boolean bool = localcqY.b(paramByteBuffer, 1);
      if (!bool)
        return false;
      this.dQE.add(localcqY);
    }
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dQE.clear();
    this.dQE.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cqY localcqY = new cqY();
      boolean bool = localcqY.b(paramByteBuffer, 313);
      if (!bool)
        return false;
      this.dQE.add(localcqY);
    }
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dQE.clear();
    this.dQE.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cqY localcqY = new cqY();
      boolean bool = localcqY.b(paramByteBuffer, 314);
      if (!bool)
        return false;
      this.dQE.add(localcqY);
    }
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dQE.clear();
    this.dQE.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cqY localcqY = new cqY();
      boolean bool = localcqY.b(paramByteBuffer, 315);
      if (!bool)
        return false;
      this.dQE.add(localcqY);
    }
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dQE.clear();
    this.dQE.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cqY localcqY = new cqY();
      boolean bool = localcqY.b(paramByteBuffer, 10003);
      if (!bool)
        return false;
      this.dQE.add(localcqY);
    }
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dQE.clear();
    this.dQE.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cqY localcqY = new cqY();
      boolean bool = localcqY.b(paramByteBuffer, 10023);
      if (!bool)
        return false;
      this.dQE.add(localcqY);
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