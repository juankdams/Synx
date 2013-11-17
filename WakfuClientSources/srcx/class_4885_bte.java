import java.nio.ByteBuffer;
import java.util.ArrayList;

final class bte
{
  private final bFi gbh = new bFi();
  private final dQW gbi = new dQW();

  private bte(dlk paramdlk) {  } 
  public void z() { this.gbj.gbh.bED.clear();
    this.gbj.gbh.bED.ensureCapacity(this.gbh.bED.size());
    this.gbj.gbh.bED.addAll(this.gbh.bED);
    this.gbj.gbi.aZC.clear();
    this.gbj.gbi.aZC.ensureCapacity(this.gbi.aZC.size());
    this.gbj.gbi.aZC.addAll(this.gbi.aZC); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    return true;
  }

  private boolean aw(ByteBuffer paramByteBuffer) {
    boolean bool = this.gbh.b(paramByteBuffer, 10001);
    if (!bool)
      return false;
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    boolean bool = this.gbh.b(paramByteBuffer, 10003);
    if (!bool)
      return false;
    return true;
  }

  private boolean ax(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.gbh.b(paramByteBuffer, 10007);
    if (!bool1)
      return false;
    boolean bool2 = this.gbi.b(paramByteBuffer, 10007);
    if (!bool2)
      return false;
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.gbh.b(paramByteBuffer, 10023);
    if (!bool1)
      return false;
    boolean bool2 = this.gbi.b(paramByteBuffer, 10023);
    if (!bool2)
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

  public void bBp() {
  }

  public void bBq() {
  }

  public void bBr() {
  }

  public void bBs() {
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
        bBp();
        bBq();
        bBr();
        bBs();
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
        bBp();
        bBq();
        bBr();
        bBs();
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
        bBp();
        bBq();
        bBr();
        bBs();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 315) {
      bool = k(paramByteBuffer);
      if (bool) {
        lb();
        bBp();
        bBq();
        bBr();
        bBs();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 10001) {
      bool = n(paramByteBuffer);
      if (bool) {
        bBp();
        bBq();
        bBr();
        bBs();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 10003) {
      bool = aw(paramByteBuffer);
      if (bool) {
        bBq();
        bBr();
        bBs();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 10007) {
      bool = o(paramByteBuffer);
      if (bool) {
        bBr();
        bBs();
        uH();
        return true;
      }
      return false;
    }
    if (paramInt < 10023) {
      bool = ax(paramByteBuffer);
      if (bool) {
        bBs();
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