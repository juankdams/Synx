import java.nio.ByteBuffer;
import java.util.ArrayList;

final class cVG
{
  private final dCa bbJ = new dCa();

  private cVG(cXz paramcXz) {  } 
  public void z() { this.kIo.bbJ.gdr = this.bbJ.gdr;
    this.kIo.bbJ.gds.clear();
    this.kIo.bbJ.gds.ensureCapacity(this.bbJ.gds.size());
    this.kIo.bbJ.gds.addAll(this.bbJ.gds);
    this.kIo.bbJ.gdt = this.bbJ.gdt; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    boolean bool = this.bbJ.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    return true;
  }

  private boolean l(ByteBuffer paramByteBuffer) {
    boolean bool = this.bbJ.b(paramByteBuffer, 309);
    if (!bool)
      return false;
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    boolean bool = this.bbJ.b(paramByteBuffer, 313);
    if (!bool)
      return false;
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    boolean bool = this.bbJ.b(paramByteBuffer, 314);
    if (!bool)
      return false;
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    boolean bool = this.bbJ.b(paramByteBuffer, 315);
    if (!bool)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    boolean bool = this.bbJ.b(paramByteBuffer, 10003);
    if (!bool)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    boolean bool = this.bbJ.b(paramByteBuffer, 10023);
    if (!bool)
      return false;
    return true;
  }

  private boolean s(ByteBuffer paramByteBuffer) {
    boolean bool = this.bbJ.b(paramByteBuffer, 1027001);
    if (!bool)
      return false;
    return true;
  }

  private boolean t(ByteBuffer paramByteBuffer) {
    boolean bool = this.bbJ.b(paramByteBuffer, 1027002);
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