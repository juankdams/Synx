import java.nio.ByteBuffer;
import java.util.ArrayList;

final class bub
{
  private byte gdr = 0;
  private final ArrayList gds = new ArrayList(0);
  private uc gdt = null;

  private bub(dCa paramdCa) {  } 
  public void z() { this.gdu.gdr = this.gdr;
    this.gdu.gds.clear();
    this.gdu.gds.ensureCapacity(this.gds.size());
    this.gdu.gds.addAll(this.gds);
    this.gdu.gdt = this.gdt; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    this.gdr = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gds.clear();
    this.gds.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cku localcku = new cku();
      boolean bool = localcku.b(paramByteBuffer, 1);
      if (!bool)
        return false;
      this.gds.add(localcku);
    }
    this.gdt = uc.g(paramByteBuffer, 1);
    if (this.gdt == null)
      return false;
    return true;
  }

  private boolean l(ByteBuffer paramByteBuffer) {
    this.gdr = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gds.clear();
    this.gds.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cku localcku = new cku();
      boolean bool = localcku.b(paramByteBuffer, 309);
      if (!bool)
        return false;
      this.gds.add(localcku);
    }
    this.gdt = uc.g(paramByteBuffer, 309);
    if (this.gdt == null)
      return false;
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    this.gdr = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gds.clear();
    this.gds.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cku localcku = new cku();
      boolean bool = localcku.b(paramByteBuffer, 313);
      if (!bool)
        return false;
      this.gds.add(localcku);
    }
    this.gdt = uc.g(paramByteBuffer, 313);
    if (this.gdt == null)
      return false;
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    this.gdr = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gds.clear();
    this.gds.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cku localcku = new cku();
      boolean bool = localcku.b(paramByteBuffer, 314);
      if (!bool)
        return false;
      this.gds.add(localcku);
    }
    this.gdt = uc.g(paramByteBuffer, 314);
    if (this.gdt == null)
      return false;
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    this.gdr = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gds.clear();
    this.gds.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cku localcku = new cku();
      boolean bool = localcku.b(paramByteBuffer, 315);
      if (!bool)
        return false;
      this.gds.add(localcku);
    }
    this.gdt = uc.g(paramByteBuffer, 315);
    if (this.gdt == null)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    this.gdr = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gds.clear();
    this.gds.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cku localcku = new cku();
      boolean bool = localcku.b(paramByteBuffer, 10003);
      if (!bool)
        return false;
      this.gds.add(localcku);
    }
    this.gdt = uc.g(paramByteBuffer, 10003);
    if (this.gdt == null)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    this.gdr = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gds.clear();
    this.gds.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cku localcku = new cku();
      boolean bool = localcku.b(paramByteBuffer, 10023);
      if (!bool)
        return false;
      this.gds.add(localcku);
    }
    this.gdt = uc.g(paramByteBuffer, 10023);
    if (this.gdt == null)
      return false;
    return true;
  }

  private boolean s(ByteBuffer paramByteBuffer) {
    this.gdr = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gds.clear();
    this.gds.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cku localcku = new cku();
      boolean bool = localcku.b(paramByteBuffer, 1027001);
      if (!bool)
        return false;
      this.gds.add(localcku);
    }
    this.gdt = uc.g(paramByteBuffer, 1027001);
    if (this.gdt == null)
      return false;
    return true;
  }

  private boolean t(ByteBuffer paramByteBuffer) {
    this.gdr = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gds.clear();
    this.gds.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cku localcku = new cku();
      boolean bool = localcku.b(paramByteBuffer, 1027002);
      if (!bool)
        return false;
      this.gds.add(localcku);
    }
    this.gdt = uc.g(paramByteBuffer, 1027002);
    if (this.gdt == null)
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

  public void uG() {
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
        uG();
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
        uG();
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
        uG();
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
        uG();
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
        uG();
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
        uG();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 10023) {
      bool = o(paramByteBuffer);
      if (bool) {
        uG();
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