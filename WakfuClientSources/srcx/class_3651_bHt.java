import java.nio.ByteBuffer;
import java.util.ArrayList;

final class bHt
{
  private long cxL = 0L;
  private byte dBZ = -1;
  private short dCa = 0;
  private byte dCb = 1;
  private final ArrayList aZC = new ArrayList(0);
  private String dCc = null;
  private boolean dCd = false;
  private long gFU = 0L;

  private bHt(asj paramasj) {  } 
  public void z() { this.gFV.cxL = this.cxL;
    this.gFV.dBZ = this.dBZ;
    this.gFV.dCa = this.dCa;
    this.gFV.dCb = this.dCb;
    this.gFV.aZC.clear();
    this.gFV.aZC.ensureCapacity(this.aZC.size());
    this.gFV.aZC.addAll(this.aZC);
    this.gFV.dCc = this.dCc;
    this.gFV.dCd = this.dCd; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    this.cxL = paramByteBuffer.getLong();
    this.dBZ = paramByteBuffer.get();
    this.dCa = paramByteBuffer.getShort();
    this.dCb = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      localObject = new cGd();
      boolean bool = ((cGd)localObject).b(paramByteBuffer, 1);
      if (!bool)
        return false;
      this.aZC.add(localObject);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    Object localObject = new byte[j];
    paramByteBuffer.get((byte[])localObject);
    this.dCc = dzp.aJ((byte[])localObject);
    this.dCd = (paramByteBuffer.get() == 1);
    this.gFU = paramByteBuffer.getLong();
    return true;
  }

  private boolean l(ByteBuffer paramByteBuffer) {
    this.cxL = paramByteBuffer.getLong();
    this.dBZ = paramByteBuffer.get();
    this.dCa = paramByteBuffer.getShort();
    this.dCb = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      localObject = new cGd();
      boolean bool = ((cGd)localObject).b(paramByteBuffer, 309);
      if (!bool)
        return false;
      this.aZC.add(localObject);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    Object localObject = new byte[j];
    paramByteBuffer.get((byte[])localObject);
    this.dCc = dzp.aJ((byte[])localObject);
    this.dCd = (paramByteBuffer.get() == 1);
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    this.cxL = paramByteBuffer.getLong();
    this.dBZ = paramByteBuffer.get();
    this.dCa = paramByteBuffer.getShort();
    this.dCb = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      localObject = new cGd();
      boolean bool = ((cGd)localObject).b(paramByteBuffer, 313);
      if (!bool)
        return false;
      this.aZC.add(localObject);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    Object localObject = new byte[j];
    paramByteBuffer.get((byte[])localObject);
    this.dCc = dzp.aJ((byte[])localObject);
    this.dCd = (paramByteBuffer.get() == 1);
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    this.cxL = paramByteBuffer.getLong();
    this.dBZ = paramByteBuffer.get();
    this.dCa = paramByteBuffer.getShort();
    this.dCb = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      localObject = new cGd();
      boolean bool = ((cGd)localObject).b(paramByteBuffer, 314);
      if (!bool)
        return false;
      this.aZC.add(localObject);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    Object localObject = new byte[j];
    paramByteBuffer.get((byte[])localObject);
    this.dCc = dzp.aJ((byte[])localObject);
    this.dCd = (paramByteBuffer.get() == 1);
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    this.cxL = paramByteBuffer.getLong();
    this.dBZ = paramByteBuffer.get();
    this.dCa = paramByteBuffer.getShort();
    this.dCb = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      localObject = new cGd();
      boolean bool = ((cGd)localObject).b(paramByteBuffer, 315);
      if (!bool)
        return false;
      this.aZC.add(localObject);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    Object localObject = new byte[j];
    paramByteBuffer.get((byte[])localObject);
    this.dCc = dzp.aJ((byte[])localObject);
    this.dCd = (paramByteBuffer.get() == 1);
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    this.cxL = paramByteBuffer.getLong();
    this.dBZ = paramByteBuffer.get();
    this.dCa = paramByteBuffer.getShort();
    this.dCb = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      localObject = new cGd();
      boolean bool = ((cGd)localObject).b(paramByteBuffer, 10003);
      if (!bool)
        return false;
      this.aZC.add(localObject);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    Object localObject = new byte[j];
    paramByteBuffer.get((byte[])localObject);
    this.dCc = dzp.aJ((byte[])localObject);
    this.dCd = (paramByteBuffer.get() == 1);
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    this.cxL = paramByteBuffer.getLong();
    this.dBZ = paramByteBuffer.get();
    this.dCa = paramByteBuffer.getShort();
    this.dCb = paramByteBuffer.get();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      localObject = new cGd();
      boolean bool = ((cGd)localObject).b(paramByteBuffer, 10023);
      if (!bool)
        return false;
      this.aZC.add(localObject);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    Object localObject = new byte[j];
    paramByteBuffer.get((byte[])localObject);
    this.dCc = dzp.aJ((byte[])localObject);
    this.dCd = (paramByteBuffer.get() == 1);
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
        kY();
        kZ();
        la();
        lb();
        lc();
        uG();
        uH();
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
        uH();
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