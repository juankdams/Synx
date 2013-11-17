import java.nio.ByteBuffer;

final class cRr
{
  private final btq hLC = new btq();

  private cRr(cku paramcku) {  } 
  public void z() { this.kDG.hLC.gbV = this.hLC.gbV;
    this.kDG.hLC.boH = this.hLC.boH;
    this.kDG.hLC.boI = this.hLC.boI;
    this.kDG.hLC.boJ = this.hLC.boJ;
    this.kDG.hLC.boK = this.hLC.boK;
    this.kDG.hLC.gbW.bPv = this.hLC.gbW.bPv;
    this.kDG.hLC.gbW.aDe = this.hLC.gbW.aDe;
    this.kDG.hLC.gbW.aDf = this.hLC.gbW.aDf;
    this.kDG.hLC.gbW.hok = this.hLC.gbW.hok;
    this.kDG.hLC.gbW.hol = this.hLC.gbW.hol;
    this.kDG.hLC.gbW.hom = this.hLC.gbW.hom;
    this.kDG.hLC.gbW.hoo = this.hLC.gbW.hoo;
    this.kDG.hLC.gbW.hop = this.hLC.gbW.hop;
    this.kDG.hLC.gbX = this.hLC.gbX; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    boolean bool = this.hLC.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    return true;
  }

  private boolean l(ByteBuffer paramByteBuffer) {
    boolean bool = this.hLC.b(paramByteBuffer, 309);
    if (!bool)
      return false;
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    boolean bool = this.hLC.b(paramByteBuffer, 313);
    if (!bool)
      return false;
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    boolean bool = this.hLC.b(paramByteBuffer, 314);
    if (!bool)
      return false;
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    boolean bool = this.hLC.b(paramByteBuffer, 315);
    if (!bool)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    boolean bool = this.hLC.b(paramByteBuffer, 10003);
    if (!bool)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    boolean bool = this.hLC.b(paramByteBuffer, 10023);
    if (!bool)
      return false;
    return true;
  }

  private boolean s(ByteBuffer paramByteBuffer) {
    boolean bool = this.hLC.b(paramByteBuffer, 1027001);
    if (!bool)
      return false;
    return true;
  }

  private boolean t(ByteBuffer paramByteBuffer) {
    boolean bool = this.hLC.b(paramByteBuffer, 1027002);
    if (!bool)
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