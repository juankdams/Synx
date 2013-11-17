import java.nio.ByteBuffer;
import java.util.ArrayList;

final class bBA
{
  private long ayt = 0L;
  private String ayu = null;
  private long ayv = 0L;
  private int ayx = 0;
  private final ArrayList gat = new ArrayList(0);
  private final ArrayList gau = new ArrayList(0);

  private bBA(bsQ parambsQ) {  } 
  public void z() { this.gur.ayt = this.ayt;
    this.gur.ayu = this.ayu;
    this.gur.ayv = this.ayv;
    this.gur.ayx = this.ayx;
    this.gur.gat.clear();
    this.gur.gat.ensureCapacity(this.gat.size());
    this.gur.gat.addAll(this.gat);
    this.gur.gau.clear();
    this.gur.gau.ensureCapacity(this.gau.size());
    this.gur.gau.addAll(this.gau); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.get() & 0xFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayx = paramByteBuffer.getInt();
    int j = paramByteBuffer.get() & 0xFF;
    this.gat.clear();
    this.gat.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      aWK localaWK = new aWK();
      boolean bool1 = localaWK.b(paramByteBuffer, 1);
      if (!bool1)
        return false;
      this.gat.add(localaWK);
    }
    k = paramByteBuffer.get() & 0xFF;
    this.gau.clear();
    this.gau.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      ayP localayP = new ayP();
      boolean bool2 = localayP.b(paramByteBuffer, 1);
      if (!bool2)
        return false;
      this.gau.add(localayP);
    }
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.get() & 0xFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayx = paramByteBuffer.getInt();
    int j = paramByteBuffer.get() & 0xFF;
    this.gat.clear();
    this.gat.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      aWK localaWK = new aWK();
      boolean bool1 = localaWK.b(paramByteBuffer, 313);
      if (!bool1)
        return false;
      this.gat.add(localaWK);
    }
    k = paramByteBuffer.get() & 0xFF;
    this.gau.clear();
    this.gau.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      ayP localayP = new ayP();
      boolean bool2 = localayP.b(paramByteBuffer, 313);
      if (!bool2)
        return false;
      this.gau.add(localayP);
    }
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.get() & 0xFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayx = paramByteBuffer.getInt();
    int j = paramByteBuffer.get() & 0xFF;
    this.gat.clear();
    this.gat.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      aWK localaWK = new aWK();
      boolean bool1 = localaWK.b(paramByteBuffer, 314);
      if (!bool1)
        return false;
      this.gat.add(localaWK);
    }
    k = paramByteBuffer.get() & 0xFF;
    this.gau.clear();
    this.gau.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      ayP localayP = new ayP();
      boolean bool2 = localayP.b(paramByteBuffer, 314);
      if (!bool2)
        return false;
      this.gau.add(localayP);
    }
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.get() & 0xFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayx = paramByteBuffer.getInt();
    int j = paramByteBuffer.get() & 0xFF;
    this.gat.clear();
    this.gat.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      aWK localaWK = new aWK();
      boolean bool1 = localaWK.b(paramByteBuffer, 315);
      if (!bool1)
        return false;
      this.gat.add(localaWK);
    }
    k = paramByteBuffer.get() & 0xFF;
    this.gau.clear();
    this.gau.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      ayP localayP = new ayP();
      boolean bool2 = localayP.b(paramByteBuffer, 315);
      if (!bool2)
        return false;
      this.gau.add(localayP);
    }
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.get() & 0xFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayx = paramByteBuffer.getInt();
    int j = paramByteBuffer.get() & 0xFF;
    this.gat.clear();
    this.gat.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      aWK localaWK = new aWK();
      boolean bool1 = localaWK.b(paramByteBuffer, 10003);
      if (!bool1)
        return false;
      this.gat.add(localaWK);
    }
    k = paramByteBuffer.get() & 0xFF;
    this.gau.clear();
    this.gau.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      ayP localayP = new ayP();
      boolean bool2 = localayP.b(paramByteBuffer, 10003);
      if (!bool2)
        return false;
      this.gau.add(localayP);
    }
    return true;
  }

  private boolean p(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.get() & 0xFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayv = paramByteBuffer.getLong();
    this.ayx = paramByteBuffer.getInt();
    int j = paramByteBuffer.get() & 0xFF;
    this.gat.clear();
    this.gat.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      aWK localaWK = new aWK();
      boolean bool1 = localaWK.b(paramByteBuffer, 10005);
      if (!bool1)
        return false;
      this.gat.add(localaWK);
    }
    k = paramByteBuffer.get() & 0xFF;
    this.gau.clear();
    this.gau.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      ayP localayP = new ayP();
      boolean bool2 = localayP.b(paramByteBuffer, 10005);
      if (!bool2)
        return false;
      this.gau.add(localayP);
    }
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.get() & 0xFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayv = paramByteBuffer.getLong();
    this.ayx = paramByteBuffer.getInt();
    int j = paramByteBuffer.get() & 0xFF;
    this.gat.clear();
    this.gat.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      aWK localaWK = new aWK();
      boolean bool1 = localaWK.b(paramByteBuffer, 10023);
      if (!bool1)
        return false;
      this.gat.add(localaWK);
    }
    k = paramByteBuffer.get() & 0xFF;
    this.gau.clear();
    this.gau.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      ayP localayP = new ayP();
      boolean bool2 = localayP.b(paramByteBuffer, 10023);
      if (!bool2)
        return false;
      this.gau.add(localayP);
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

  public void ld() {
  }

  public void bKJ() {
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
        ld();
        bKJ();
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
        ld();
        bKJ();
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
        ld();
        bKJ();
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
        ld();
        bKJ();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 10003) {
      bool = n(paramByteBuffer);
      if (bool) {
        lc();
        ld();
        bKJ();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 10005) {
      bool = o(paramByteBuffer);
      if (bool) {
        ld();
        bKJ();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 10023) {
      bool = p(paramByteBuffer);
      if (bool) {
        bKJ();
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