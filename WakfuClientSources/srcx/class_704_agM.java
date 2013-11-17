import java.nio.ByteBuffer;
import java.util.ArrayList;

final class agM
{
  private int id = 0;
  private final ArrayList bED = new ArrayList(0);

  private agM(bph parambph) {  } 
  public void z() { this.daH.id = this.id;
    this.daH.bED.clear();
    this.daH.bED.ensureCapacity(this.bED.size());
    this.daH.bED.addAll(this.bED); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    this.id = paramByteBuffer.getInt();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      daq localdaq = new daq();
      boolean bool = localdaq.b(paramByteBuffer, 0);
      if (!bool)
        return false;
      this.bED.add(localdaq);
    }
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    this.id = paramByteBuffer.getInt();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      daq localdaq = new daq();
      boolean bool = localdaq.b(paramByteBuffer, 1);
      if (!bool)
        return false;
      this.bED.add(localdaq);
    }
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    this.id = paramByteBuffer.getInt();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      daq localdaq = new daq();
      boolean bool = localdaq.b(paramByteBuffer, 313);
      if (!bool)
        return false;
      this.bED.add(localdaq);
    }
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    this.id = paramByteBuffer.getInt();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      daq localdaq = new daq();
      boolean bool = localdaq.b(paramByteBuffer, 314);
      if (!bool)
        return false;
      this.bED.add(localdaq);
    }
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    this.id = paramByteBuffer.getInt();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      daq localdaq = new daq();
      boolean bool = localdaq.b(paramByteBuffer, 315);
      if (!bool)
        return false;
      this.bED.add(localdaq);
    }
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    this.id = paramByteBuffer.getInt();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      daq localdaq = new daq();
      boolean bool = localdaq.b(paramByteBuffer, 10003);
      if (!bool)
        return false;
      this.bED.add(localdaq);
    }
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    this.id = paramByteBuffer.getInt();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bED.clear();
    this.bED.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      daq localdaq = new daq();
      boolean bool = localdaq.b(paramByteBuffer, 10023);
      if (!bool)
        return false;
      this.bED.add(localdaq);
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