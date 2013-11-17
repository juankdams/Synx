import java.nio.ByteBuffer;
import java.util.ArrayList;

final class em
{
  private long ayt = 0L;
  private String ayu = null;
  private long ayv = 0L;
  private final ArrayList ayw = new ArrayList(0);
  private int ayx = 0;
  private cnO ayy = null;
  private final bIq ayz = new bIq();

  private em(drq paramdrq) {  } 
  public void z() { this.ayA.ayt = this.ayt;
    this.ayA.ayu = this.ayu;
    this.ayA.ayv = this.ayv;
    this.ayA.ayw.clear();
    this.ayA.ayw.ensureCapacity(this.ayw.size());
    this.ayA.ayw.addAll(this.ayw);
    this.ayA.ayx = this.ayx;
    this.ayA.ayy = this.ayy;
    this.ayA.ayz.biO = this.ayz.biO;
    this.ayA.ayz.biP.clear();
    this.ayA.ayz.biP.ensureCapacity(this.ayz.biP.size());
    this.ayA.ayz.biP.addAll(this.ayz.biP);
    this.ayA.ayz.biQ.clear();
    this.ayA.ayz.biQ.ensureCapacity(this.ayz.biQ.size());
    this.ayA.ayz.biQ.addAll(this.ayz.biQ); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    int j = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cXz localcXz = new cXz();
      boolean bool2 = localcXz.b(paramByteBuffer, 1);
      if (!bool2)
        return false;
      this.ayw.add(localcXz);
    }
    this.ayx = paramByteBuffer.getInt();
    k = paramByteBuffer.get() == 1 ? 1 : 0;
    if (k != 0) {
      this.ayy = new cnO();
      bool1 = this.ayy.b(paramByteBuffer, 1);
      if (!bool1)
        return false;
    } else {
      this.ayy = null;
    }
    boolean bool1 = this.ayz.b(paramByteBuffer, 1);
    if (!bool1)
      return false;
    return true;
  }

  private boolean l(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    int j = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cXz localcXz = new cXz();
      boolean bool2 = localcXz.b(paramByteBuffer, 309);
      if (!bool2)
        return false;
      this.ayw.add(localcXz);
    }
    this.ayx = paramByteBuffer.getInt();
    k = paramByteBuffer.get() == 1 ? 1 : 0;
    if (k != 0) {
      this.ayy = new cnO();
      bool1 = this.ayy.b(paramByteBuffer, 309);
      if (!bool1)
        return false;
    } else {
      this.ayy = null;
    }
    boolean bool1 = this.ayz.b(paramByteBuffer, 309);
    if (!bool1)
      return false;
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    int j = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cXz localcXz = new cXz();
      boolean bool2 = localcXz.b(paramByteBuffer, 313);
      if (!bool2)
        return false;
      this.ayw.add(localcXz);
    }
    this.ayx = paramByteBuffer.getInt();
    k = paramByteBuffer.get() == 1 ? 1 : 0;
    if (k != 0) {
      this.ayy = new cnO();
      bool1 = this.ayy.b(paramByteBuffer, 313);
      if (!bool1)
        return false;
    } else {
      this.ayy = null;
    }
    boolean bool1 = this.ayz.b(paramByteBuffer, 313);
    if (!bool1)
      return false;
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    int j = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cXz localcXz = new cXz();
      boolean bool2 = localcXz.b(paramByteBuffer, 314);
      if (!bool2)
        return false;
      this.ayw.add(localcXz);
    }
    this.ayx = paramByteBuffer.getInt();
    k = paramByteBuffer.get() == 1 ? 1 : 0;
    if (k != 0) {
      this.ayy = new cnO();
      bool1 = this.ayy.b(paramByteBuffer, 314);
      if (!bool1)
        return false;
    } else {
      this.ayy = null;
    }
    boolean bool1 = this.ayz.b(paramByteBuffer, 314);
    if (!bool1)
      return false;
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    int j = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cXz localcXz = new cXz();
      boolean bool2 = localcXz.b(paramByteBuffer, 315);
      if (!bool2)
        return false;
      this.ayw.add(localcXz);
    }
    this.ayx = paramByteBuffer.getInt();
    k = paramByteBuffer.get() == 1 ? 1 : 0;
    if (k != 0) {
      this.ayy = new cnO();
      bool1 = this.ayy.b(paramByteBuffer, 315);
      if (!bool1)
        return false;
    } else {
      this.ayy = null;
    }
    boolean bool1 = this.ayz.b(paramByteBuffer, 315);
    if (!bool1)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    int j = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cXz localcXz = new cXz();
      boolean bool2 = localcXz.b(paramByteBuffer, 10003);
      if (!bool2)
        return false;
      this.ayw.add(localcXz);
    }
    this.ayx = paramByteBuffer.getInt();
    k = paramByteBuffer.get() == 1 ? 1 : 0;
    if (k != 0) {
      this.ayy = new cnO();
      bool1 = this.ayy.b(paramByteBuffer, 10003);
      if (!bool1)
        return false;
    } else {
      this.ayy = null;
    }
    boolean bool1 = this.ayz.b(paramByteBuffer, 10003);
    if (!bool1)
      return false;
    return true;
  }

  private boolean p(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayv = paramByteBuffer.getLong();
    int j = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cXz localcXz = new cXz();
      boolean bool2 = localcXz.b(paramByteBuffer, 10005);
      if (!bool2)
        return false;
      this.ayw.add(localcXz);
    }
    this.ayx = paramByteBuffer.getInt();
    k = paramByteBuffer.get() == 1 ? 1 : 0;
    if (k != 0) {
      this.ayy = new cnO();
      bool1 = this.ayy.b(paramByteBuffer, 10005);
      if (!bool1)
        return false;
    } else {
      this.ayy = null;
    }
    boolean bool1 = this.ayz.b(paramByteBuffer, 10005);
    if (!bool1)
      return false;
    return true;
  }

  private boolean q(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayv = paramByteBuffer.getLong();
    int j = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cXz localcXz = new cXz();
      boolean bool2 = localcXz.b(paramByteBuffer, 10014);
      if (!bool2)
        return false;
      this.ayw.add(localcXz);
    }
    this.ayx = paramByteBuffer.getInt();
    k = paramByteBuffer.get() == 1 ? 1 : 0;
    if (k != 0) {
      this.ayy = new cnO();
      bool1 = this.ayy.b(paramByteBuffer, 10014);
      if (!bool1)
        return false;
    } else {
      this.ayy = null;
    }
    boolean bool1 = this.ayz.b(paramByteBuffer, 10014);
    if (!bool1)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayv = paramByteBuffer.getLong();
    int j = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cXz localcXz = new cXz();
      boolean bool2 = localcXz.b(paramByteBuffer, 10023);
      if (!bool2)
        return false;
      this.ayw.add(localcXz);
    }
    this.ayx = paramByteBuffer.getInt();
    k = paramByteBuffer.get() == 1 ? 1 : 0;
    if (k != 0) {
      this.ayy = new cnO();
      bool1 = this.ayy.b(paramByteBuffer, 10023);
      if (!bool1)
        return false;
    } else {
      this.ayy = null;
    }
    boolean bool1 = this.ayz.b(paramByteBuffer, 10023);
    if (!bool1)
      return false;
    return true;
  }

  private boolean s(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayv = paramByteBuffer.getLong();
    int j = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cXz localcXz = new cXz();
      boolean bool2 = localcXz.b(paramByteBuffer, 1027001);
      if (!bool2)
        return false;
      this.ayw.add(localcXz);
    }
    this.ayx = paramByteBuffer.getInt();
    k = paramByteBuffer.get() == 1 ? 1 : 0;
    if (k != 0) {
      this.ayy = new cnO();
      bool1 = this.ayy.b(paramByteBuffer, 1027001);
      if (!bool1)
        return false;
    } else {
      this.ayy = null;
    }
    boolean bool1 = this.ayz.b(paramByteBuffer, 1027001);
    if (!bool1)
      return false;
    return true;
  }

  private boolean t(ByteBuffer paramByteBuffer) {
    this.ayt = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.ayu = dzp.aJ(arrayOfByte);
    this.ayv = paramByteBuffer.getLong();
    int j = paramByteBuffer.get() & 0xFF;
    this.ayw.clear();
    this.ayw.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      cXz localcXz = new cXz();
      boolean bool2 = localcXz.b(paramByteBuffer, 1027002);
      if (!bool2)
        return false;
      this.ayw.add(localcXz);
    }
    this.ayx = paramByteBuffer.getInt();
    k = paramByteBuffer.get() == 1 ? 1 : 0;
    if (k != 0) {
      this.ayy = new cnO();
      bool1 = this.ayy.b(paramByteBuffer, 1027002);
      if (!bool1)
        return false;
    } else {
      this.ayy = null;
    }
    boolean bool1 = this.ayz.b(paramByteBuffer, 1027002);
    if (!bool1)
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

  public void ld() {
  }

  public void le() {
  }

  public void lf() {
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
        ld();
        le();
        lf();
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
        ld();
        le();
        lf();
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
        ld();
        le();
        lf();
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
        ld();
        le();
        lf();
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
        ld();
        le();
        lf();
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
        ld();
        le();
        lf();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 10005) {
      bool = o(paramByteBuffer);
      if (bool) {
        ld();
        le();
        lf();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 10014) {
      bool = p(paramByteBuffer);
      if (bool) {
        le();
        lf();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 10023) {
      bool = q(paramByteBuffer);
      if (bool) {
        lf();
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