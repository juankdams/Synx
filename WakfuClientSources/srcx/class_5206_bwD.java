import java.nio.ByteBuffer;

final class bwD
{
  private short cIh = 0;
  private byte type = 0;
  private int gha = 0;
  private long aOw = 0L;
  private long ghb = -1L;
  private final Qv ehJ = new Qv();

  private bwD(bKX parambKX) {  } 
  public void z() { this.ghc.cIh = this.cIh;
    this.ghc.type = this.type;
    this.ghc.gha = this.gha;
    this.ghc.aOw = this.aOw;
    this.ghc.ghb = this.ghb;
    this.ghc.ehJ.cpq.bPv = this.ehJ.cpq.bPv;
    this.ghc.ehJ.cpq.aDe = this.ehJ.cpq.aDe;
    this.ghc.ehJ.cpq.aDf = this.ehJ.cpq.aDf;
    this.ghc.ehJ.cpq.hok = this.ehJ.cpq.hok;
    this.ghc.ehJ.cpq.hol = this.ehJ.cpq.hol;
    this.ghc.ehJ.cpq.hom = this.ehJ.cpq.hom;
    this.ghc.ehJ.cpq.hoo = this.ehJ.cpq.hoo;
    this.ghc.ehJ.cpq.hop = this.ehJ.cpq.hop;
    this.ghc.ehJ.cpr = this.ehJ.cpr;
    this.ghc.ehJ.cps = this.ehJ.cps; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    this.type = paramByteBuffer.get();
    this.gha = paramByteBuffer.getInt();
    this.aOw = paramByteBuffer.getLong();
    this.ghb = paramByteBuffer.getLong();
    boolean bool = this.ehJ.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    this.type = paramByteBuffer.get();
    this.gha = paramByteBuffer.getInt();
    this.aOw = paramByteBuffer.getLong();
    this.ghb = paramByteBuffer.getLong();
    boolean bool = this.ehJ.b(paramByteBuffer, 313);
    if (!bool)
      return false;
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    this.type = paramByteBuffer.get();
    this.gha = paramByteBuffer.getInt();
    this.aOw = paramByteBuffer.getLong();
    this.ghb = paramByteBuffer.getLong();
    boolean bool = this.ehJ.b(paramByteBuffer, 314);
    if (!bool)
      return false;
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    this.type = paramByteBuffer.get();
    this.gha = paramByteBuffer.getInt();
    this.aOw = paramByteBuffer.getLong();
    this.ghb = paramByteBuffer.getLong();
    boolean bool = this.ehJ.b(paramByteBuffer, 315);
    if (!bool)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    this.type = paramByteBuffer.get();
    this.gha = paramByteBuffer.getInt();
    this.aOw = paramByteBuffer.getLong();
    this.ghb = paramByteBuffer.getLong();
    boolean bool = this.ehJ.b(paramByteBuffer, 10003);
    if (!bool)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    this.cIh = paramByteBuffer.getShort();
    this.type = paramByteBuffer.get();
    this.gha = paramByteBuffer.getInt();
    this.aOw = paramByteBuffer.getLong();
    this.ghb = paramByteBuffer.getLong();
    boolean bool = this.ehJ.b(paramByteBuffer, 10023);
    if (!bool)
      return false;
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