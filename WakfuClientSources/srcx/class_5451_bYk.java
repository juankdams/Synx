import java.nio.ByteBuffer;

final class bYk
{
  private long bPv = 0L;
  private int aDe = 0;
  private short aDf = 0;
  private btR hok = null;
  private aBA hol = null;
  private bAJ hom = null;
  private dOl hon = null;
  private agU hoo = null;
  private VP hop = null;

  private bYk(dGD paramdGD) {  } 
  public void z() { this.hoq.bPv = this.bPv;
    this.hoq.aDe = this.aDe;
    this.hoq.aDf = this.aDf;
    this.hoq.hok = this.hok;
    this.hoq.hol = this.hol;
    this.hoq.hom = this.hom;
    this.hoq.hoo = this.hoo;
    this.hoq.hop = this.hop; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.aDe = paramByteBuffer.getInt();
    this.aDf = paramByteBuffer.getShort();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.hok = new btR();
      boolean bool = this.hok.b(paramByteBuffer, 1);
      if (!bool)
        return false;
    } else {
      this.hok = null;
    }
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.aDe = paramByteBuffer.getInt();
    this.aDf = paramByteBuffer.getShort();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.hok = new btR();
      bool1 = this.hok.b(paramByteBuffer, 313);
      if (!bool1)
        return false;
    } else {
      this.hok = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.hol = new aBA();
      boolean bool2 = this.hol.b(paramByteBuffer, 313);
      if (!bool2)
        return false;
    } else {
      this.hol = null;
    }
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.aDe = paramByteBuffer.getInt();
    this.aDf = paramByteBuffer.getShort();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.hok = new btR();
      bool1 = this.hok.b(paramByteBuffer, 314);
      if (!bool1)
        return false;
    } else {
      this.hok = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.hol = new aBA();
      bool2 = this.hol.b(paramByteBuffer, 314);
      if (!bool2)
        return false;
    } else {
      this.hol = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.hom = new bAJ();
      boolean bool3 = this.hom.b(paramByteBuffer, 314);
      if (!bool3)
        return false;
    } else {
      this.hom = null;
    }
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.aDe = paramByteBuffer.getInt();
    this.aDf = paramByteBuffer.getShort();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.hok = new btR();
      bool1 = this.hok.b(paramByteBuffer, 315);
      if (!bool1)
        return false;
    } else {
      this.hok = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.hol = new aBA();
      bool2 = this.hol.b(paramByteBuffer, 315);
      if (!bool2)
        return false;
    } else {
      this.hol = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.hom = new bAJ();
      boolean bool3 = this.hom.b(paramByteBuffer, 315);
      if (!bool3)
        return false;
    } else {
      this.hom = null;
    }
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.aDe = paramByteBuffer.getInt();
    this.aDf = paramByteBuffer.getShort();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.hok = new btR();
      bool1 = this.hok.b(paramByteBuffer, 10003);
      if (!bool1)
        return false;
    } else {
      this.hok = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.hol = new aBA();
      bool2 = this.hol.b(paramByteBuffer, 10003);
      if (!bool2)
        return false;
    } else {
      this.hol = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.hom = new bAJ();
      bool3 = this.hom.b(paramByteBuffer, 10003);
      if (!bool3)
        return false;
    } else {
      this.hom = null;
    }
    boolean bool3 = paramByteBuffer.get() == 1;
    if (bool3) {
      this.hon = new dOl();
      boolean bool4 = this.hon.b(paramByteBuffer, 10003);
      if (!bool4)
        return false;
    } else {
      this.hon = null;
    }
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.aDe = paramByteBuffer.getInt();
    this.aDf = paramByteBuffer.getShort();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.hok = new btR();
      bool1 = this.hok.b(paramByteBuffer, 10023);
      if (!bool1)
        return false;
    } else {
      this.hok = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.hol = new aBA();
      bool2 = this.hol.b(paramByteBuffer, 10023);
      if (!bool2)
        return false;
    } else {
      this.hol = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.hom = new bAJ();
      bool3 = this.hom.b(paramByteBuffer, 10023);
      if (!bool3)
        return false;
    } else {
      this.hom = null;
    }
    boolean bool3 = paramByteBuffer.get() == 1;
    if (bool3) {
      this.hoo = new agU();
      boolean bool4 = this.hoo.b(paramByteBuffer, 10023);
      if (!bool4)
        return false;
    } else {
      this.hoo = null;
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