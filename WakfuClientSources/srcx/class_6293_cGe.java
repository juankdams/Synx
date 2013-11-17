import java.nio.ByteBuffer;

final class cGe
{
  private long gbV = 0L;
  private int boH = 0;
  private int boI = 0;
  private short boJ = 0;
  private byte boK = 0;
  private final dGD gbW = new dGD();
  private Dy gbX = null;

  private cGe(btq parambtq) {  } 
  public void z() { this.iBp.gbV = this.gbV;
    this.iBp.boH = this.boH;
    this.iBp.boI = this.boI;
    this.iBp.boJ = this.boJ;
    this.iBp.boK = this.boK;
    this.iBp.gbW.bPv = this.gbW.bPv;
    this.iBp.gbW.aDe = this.gbW.aDe;
    this.iBp.gbW.aDf = this.gbW.aDf;
    this.iBp.gbW.hok = this.gbW.hok;
    this.iBp.gbW.hol = this.gbW.hol;
    this.iBp.gbW.hom = this.gbW.hom;
    this.iBp.gbW.hoo = this.gbW.hoo;
    this.iBp.gbW.hop = this.gbW.hop;
    this.iBp.gbX = this.gbX; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    this.gbV = paramByteBuffer.getLong();
    this.boH = paramByteBuffer.getInt();
    this.boI = paramByteBuffer.getInt();
    this.boJ = paramByteBuffer.getShort();
    this.boK = paramByteBuffer.get();
    boolean bool = this.gbW.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    this.gbX = Dy.h(paramByteBuffer, 1);
    if (this.gbX == null)
      return false;
    return true;
  }

  private boolean l(ByteBuffer paramByteBuffer) {
    this.gbV = paramByteBuffer.getLong();
    this.boH = paramByteBuffer.getInt();
    this.boI = paramByteBuffer.getInt();
    this.boJ = paramByteBuffer.getShort();
    this.boK = paramByteBuffer.get();
    boolean bool = this.gbW.b(paramByteBuffer, 309);
    if (!bool)
      return false;
    this.gbX = Dy.h(paramByteBuffer, 309);
    if (this.gbX == null)
      return false;
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    this.gbV = paramByteBuffer.getLong();
    this.boH = paramByteBuffer.getInt();
    this.boI = paramByteBuffer.getInt();
    this.boJ = paramByteBuffer.getShort();
    this.boK = paramByteBuffer.get();
    boolean bool = this.gbW.b(paramByteBuffer, 313);
    if (!bool)
      return false;
    this.gbX = Dy.h(paramByteBuffer, 313);
    if (this.gbX == null)
      return false;
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    this.gbV = paramByteBuffer.getLong();
    this.boH = paramByteBuffer.getInt();
    this.boI = paramByteBuffer.getInt();
    this.boJ = paramByteBuffer.getShort();
    this.boK = paramByteBuffer.get();
    boolean bool = this.gbW.b(paramByteBuffer, 314);
    if (!bool)
      return false;
    this.gbX = Dy.h(paramByteBuffer, 314);
    if (this.gbX == null)
      return false;
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    this.gbV = paramByteBuffer.getLong();
    this.boH = paramByteBuffer.getInt();
    this.boI = paramByteBuffer.getInt();
    this.boJ = paramByteBuffer.getShort();
    this.boK = paramByteBuffer.get();
    boolean bool = this.gbW.b(paramByteBuffer, 315);
    if (!bool)
      return false;
    this.gbX = Dy.h(paramByteBuffer, 315);
    if (this.gbX == null)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    this.gbV = paramByteBuffer.getLong();
    this.boH = paramByteBuffer.getInt();
    this.boI = paramByteBuffer.getInt();
    this.boJ = paramByteBuffer.getShort();
    this.boK = paramByteBuffer.get();
    boolean bool = this.gbW.b(paramByteBuffer, 10003);
    if (!bool)
      return false;
    this.gbX = Dy.h(paramByteBuffer, 10003);
    if (this.gbX == null)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    this.gbV = paramByteBuffer.getLong();
    this.boH = paramByteBuffer.getInt();
    this.boI = paramByteBuffer.getInt();
    this.boJ = paramByteBuffer.getShort();
    this.boK = paramByteBuffer.get();
    boolean bool = this.gbW.b(paramByteBuffer, 10023);
    if (!bool)
      return false;
    this.gbX = Dy.h(paramByteBuffer, 10023);
    if (this.gbX == null)
      return false;
    return true;
  }

  private boolean s(ByteBuffer paramByteBuffer) {
    this.gbV = paramByteBuffer.getLong();
    this.boH = paramByteBuffer.getInt();
    this.boI = paramByteBuffer.getInt();
    this.boJ = paramByteBuffer.getShort();
    this.boK = paramByteBuffer.get();
    boolean bool = this.gbW.b(paramByteBuffer, 1027001);
    if (!bool)
      return false;
    this.gbX = Dy.h(paramByteBuffer, 1027001);
    if (this.gbX == null)
      return false;
    return true;
  }

  private boolean t(ByteBuffer paramByteBuffer) {
    this.gbV = paramByteBuffer.getLong();
    this.boH = paramByteBuffer.getInt();
    this.boI = paramByteBuffer.getInt();
    this.boJ = paramByteBuffer.getShort();
    this.boK = paramByteBuffer.get();
    boolean bool = this.gbW.b(paramByteBuffer, 1027002);
    if (!bool)
      return false;
    this.gbX = Dy.h(paramByteBuffer, 1027002);
    if (this.gbX == null)
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