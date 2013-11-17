import java.nio.ByteBuffer;

final class aLi
{
  private cGo epA = null;

  private aLi(bYp parambYp) {  } 
  public void z() { this.cIE.epA = this.epA; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.epA = new cGo();
      boolean bool = this.epA.b(paramByteBuffer, 1);
      if (!bool)
        return false;
    } else {
      this.epA = null;
    }
    return true;
  }

  private boolean l(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.epA = new cGo();
      boolean bool = this.epA.b(paramByteBuffer, 309);
      if (!bool)
        return false;
    } else {
      this.epA = null;
    }
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.epA = new cGo();
      boolean bool = this.epA.b(paramByteBuffer, 313);
      if (!bool)
        return false;
    } else {
      this.epA = null;
    }
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.epA = new cGo();
      boolean bool = this.epA.b(paramByteBuffer, 314);
      if (!bool)
        return false;
    } else {
      this.epA = null;
    }
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.epA = new cGo();
      boolean bool = this.epA.b(paramByteBuffer, 315);
      if (!bool)
        return false;
    } else {
      this.epA = null;
    }
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.epA = new cGo();
      boolean bool = this.epA.b(paramByteBuffer, 10003);
      if (!bool)
        return false;
    } else {
      this.epA = null;
    }
    return true;
  }

  private boolean q(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.epA = new cGo();
      boolean bool = this.epA.b(paramByteBuffer, 10014);
      if (!bool)
        return false;
    } else {
      this.epA = null;
    }
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.epA = new cGo();
      boolean bool = this.epA.b(paramByteBuffer, 10023);
      if (!bool)
        return false;
    } else {
      this.epA = null;
    }
    return true;
  }

  private boolean s(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.epA = new cGo();
      boolean bool = this.epA.b(paramByteBuffer, 1027001);
      if (!bool)
        return false;
    } else {
      this.epA = null;
    }
    return true;
  }

  private boolean t(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.epA = new cGo();
      boolean bool = this.epA.b(paramByteBuffer, 1027002);
      if (!bool)
        return false;
    } else {
      this.epA = null;
    }
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

  public void Wb() {
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
        Wb();
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
        Wb();
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
        Wb();
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
        Wb();
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
        Wb();
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
        Wb();
        lf();
        lg();
        lh();
        li();
        return true;
      }
      return false;
    }
    if (paramInt < 10014) {
      bool = o(paramByteBuffer);
      if (bool) {
        Wb();
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