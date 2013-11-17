import java.nio.ByteBuffer;

final class ne
{
  private int aRq = 0;
  private bDs aRr = null;
  private bPH aRs = null;
  private cil aRt = null;
  private ij aRu = null;
  private aTM aRv = null;
  private cvs aRw = null;
  private ara aRx = null;
  private baA aRy = null;
  private dvI aRz = null;
  private bSk aRA = null;
  private ed aRB = null;
  private aKR aRC = null;
  private cZY aRD = null;

  private ne(blx paramblx) {  } 
  public void z() { this.aRE.aRq = this.aRq;
    this.aRE.aRr = this.aRr;
    this.aRE.aRs = this.aRs;
    this.aRE.aRt = this.aRt;
    this.aRE.aRu = this.aRu;
    this.aRE.aRv = this.aRv;
    this.aRE.aRw = this.aRw;
    this.aRE.aRx = this.aRx;
    this.aRE.aRy = this.aRy;
    this.aRE.aRz = this.aRz;
    this.aRE.aRA = this.aRA;
    this.aRE.aRB = this.aRB;
    this.aRE.aRC = this.aRC;
    this.aRE.aRD = this.aRD; }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    this.aRq = paramByteBuffer.getInt();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.aRr = new bDs();
      bool1 = this.aRr.b(paramByteBuffer, 1);
      if (!bool1)
        return false;
    } else {
      this.aRr = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.aRs = new bPH();
      bool2 = this.aRs.b(paramByteBuffer, 1);
      if (!bool2)
        return false;
    } else {
      this.aRs = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.aRt = new cil();
      bool3 = this.aRt.b(paramByteBuffer, 1);
      if (!bool3)
        return false;
    } else {
      this.aRt = null;
    }
    boolean bool3 = paramByteBuffer.get() == 1;
    if (bool3) {
      this.aRu = new ij();
      bool4 = this.aRu.b(paramByteBuffer, 1);
      if (!bool4)
        return false;
    } else {
      this.aRu = null;
    }
    boolean bool4 = paramByteBuffer.get() == 1;
    if (bool4) {
      this.aRv = new aTM();
      bool5 = this.aRv.b(paramByteBuffer, 1);
      if (!bool5)
        return false;
    } else {
      this.aRv = null;
    }
    boolean bool5 = paramByteBuffer.get() == 1;
    if (bool5) {
      this.aRw = new cvs();
      bool6 = this.aRw.b(paramByteBuffer, 1);
      if (!bool6)
        return false;
    } else {
      this.aRw = null;
    }
    boolean bool6 = paramByteBuffer.get() == 1;
    if (bool6) {
      this.aRx = new ara();
      bool7 = this.aRx.b(paramByteBuffer, 1);
      if (!bool7)
        return false;
    } else {
      this.aRx = null;
    }
    boolean bool7 = paramByteBuffer.get() == 1;
    if (bool7) {
      this.aRy = new baA();
      bool8 = this.aRy.b(paramByteBuffer, 1);
      if (!bool8)
        return false;
    } else {
      this.aRy = null;
    }
    boolean bool8 = paramByteBuffer.get() == 1;
    if (bool8) {
      this.aRz = new dvI();
      bool9 = this.aRz.b(paramByteBuffer, 1);
      if (!bool9)
        return false;
    } else {
      this.aRz = null;
    }
    boolean bool9 = paramByteBuffer.get() == 1;
    if (bool9) {
      this.aRA = new bSk();
      bool10 = this.aRA.b(paramByteBuffer, 1);
      if (!bool10)
        return false;
    } else {
      this.aRA = null;
    }
    boolean bool10 = paramByteBuffer.get() == 1;
    if (bool10) {
      this.aRB = new ed();
      bool11 = this.aRB.b(paramByteBuffer, 1);
      if (!bool11)
        return false;
    } else {
      this.aRB = null;
    }
    boolean bool11 = paramByteBuffer.get() == 1;
    if (bool11) {
      this.aRC = new aKR();
      bool12 = this.aRC.b(paramByteBuffer, 1);
      if (!bool12)
        return false;
    } else {
      this.aRC = null;
    }
    boolean bool12 = paramByteBuffer.get() == 1;
    if (bool12) {
      this.aRD = new cZY();
      boolean bool13 = this.aRD.b(paramByteBuffer, 1);
      if (!bool13)
        return false;
    } else {
      this.aRD = null;
    }
    return true;
  }

  private boolean m(ByteBuffer paramByteBuffer) {
    this.aRq = paramByteBuffer.getInt();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.aRr = new bDs();
      bool1 = this.aRr.b(paramByteBuffer, 313);
      if (!bool1)
        return false;
    } else {
      this.aRr = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.aRs = new bPH();
      bool2 = this.aRs.b(paramByteBuffer, 313);
      if (!bool2)
        return false;
    } else {
      this.aRs = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.aRt = new cil();
      bool3 = this.aRt.b(paramByteBuffer, 313);
      if (!bool3)
        return false;
    } else {
      this.aRt = null;
    }
    boolean bool3 = paramByteBuffer.get() == 1;
    if (bool3) {
      this.aRu = new ij();
      bool4 = this.aRu.b(paramByteBuffer, 313);
      if (!bool4)
        return false;
    } else {
      this.aRu = null;
    }
    boolean bool4 = paramByteBuffer.get() == 1;
    if (bool4) {
      this.aRv = new aTM();
      bool5 = this.aRv.b(paramByteBuffer, 313);
      if (!bool5)
        return false;
    } else {
      this.aRv = null;
    }
    boolean bool5 = paramByteBuffer.get() == 1;
    if (bool5) {
      this.aRw = new cvs();
      bool6 = this.aRw.b(paramByteBuffer, 313);
      if (!bool6)
        return false;
    } else {
      this.aRw = null;
    }
    boolean bool6 = paramByteBuffer.get() == 1;
    if (bool6) {
      this.aRx = new ara();
      bool7 = this.aRx.b(paramByteBuffer, 313);
      if (!bool7)
        return false;
    } else {
      this.aRx = null;
    }
    boolean bool7 = paramByteBuffer.get() == 1;
    if (bool7) {
      this.aRy = new baA();
      bool8 = this.aRy.b(paramByteBuffer, 313);
      if (!bool8)
        return false;
    } else {
      this.aRy = null;
    }
    boolean bool8 = paramByteBuffer.get() == 1;
    if (bool8) {
      this.aRz = new dvI();
      bool9 = this.aRz.b(paramByteBuffer, 313);
      if (!bool9)
        return false;
    } else {
      this.aRz = null;
    }
    boolean bool9 = paramByteBuffer.get() == 1;
    if (bool9) {
      this.aRA = new bSk();
      bool10 = this.aRA.b(paramByteBuffer, 313);
      if (!bool10)
        return false;
    } else {
      this.aRA = null;
    }
    boolean bool10 = paramByteBuffer.get() == 1;
    if (bool10) {
      this.aRB = new ed();
      bool11 = this.aRB.b(paramByteBuffer, 313);
      if (!bool11)
        return false;
    } else {
      this.aRB = null;
    }
    boolean bool11 = paramByteBuffer.get() == 1;
    if (bool11) {
      this.aRC = new aKR();
      bool12 = this.aRC.b(paramByteBuffer, 313);
      if (!bool12)
        return false;
    } else {
      this.aRC = null;
    }
    boolean bool12 = paramByteBuffer.get() == 1;
    if (bool12) {
      this.aRD = new cZY();
      boolean bool13 = this.aRD.b(paramByteBuffer, 313);
      if (!bool13)
        return false;
    } else {
      this.aRD = null;
    }
    return true;
  }

  private boolean k(ByteBuffer paramByteBuffer) {
    this.aRq = paramByteBuffer.getInt();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.aRr = new bDs();
      bool1 = this.aRr.b(paramByteBuffer, 314);
      if (!bool1)
        return false;
    } else {
      this.aRr = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.aRs = new bPH();
      bool2 = this.aRs.b(paramByteBuffer, 314);
      if (!bool2)
        return false;
    } else {
      this.aRs = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.aRt = new cil();
      bool3 = this.aRt.b(paramByteBuffer, 314);
      if (!bool3)
        return false;
    } else {
      this.aRt = null;
    }
    boolean bool3 = paramByteBuffer.get() == 1;
    if (bool3) {
      this.aRu = new ij();
      bool4 = this.aRu.b(paramByteBuffer, 314);
      if (!bool4)
        return false;
    } else {
      this.aRu = null;
    }
    boolean bool4 = paramByteBuffer.get() == 1;
    if (bool4) {
      this.aRv = new aTM();
      bool5 = this.aRv.b(paramByteBuffer, 314);
      if (!bool5)
        return false;
    } else {
      this.aRv = null;
    }
    boolean bool5 = paramByteBuffer.get() == 1;
    if (bool5) {
      this.aRw = new cvs();
      bool6 = this.aRw.b(paramByteBuffer, 314);
      if (!bool6)
        return false;
    } else {
      this.aRw = null;
    }
    boolean bool6 = paramByteBuffer.get() == 1;
    if (bool6) {
      this.aRx = new ara();
      bool7 = this.aRx.b(paramByteBuffer, 314);
      if (!bool7)
        return false;
    } else {
      this.aRx = null;
    }
    boolean bool7 = paramByteBuffer.get() == 1;
    if (bool7) {
      this.aRy = new baA();
      bool8 = this.aRy.b(paramByteBuffer, 314);
      if (!bool8)
        return false;
    } else {
      this.aRy = null;
    }
    boolean bool8 = paramByteBuffer.get() == 1;
    if (bool8) {
      this.aRz = new dvI();
      bool9 = this.aRz.b(paramByteBuffer, 314);
      if (!bool9)
        return false;
    } else {
      this.aRz = null;
    }
    boolean bool9 = paramByteBuffer.get() == 1;
    if (bool9) {
      this.aRA = new bSk();
      bool10 = this.aRA.b(paramByteBuffer, 314);
      if (!bool10)
        return false;
    } else {
      this.aRA = null;
    }
    boolean bool10 = paramByteBuffer.get() == 1;
    if (bool10) {
      this.aRB = new ed();
      bool11 = this.aRB.b(paramByteBuffer, 314);
      if (!bool11)
        return false;
    } else {
      this.aRB = null;
    }
    boolean bool11 = paramByteBuffer.get() == 1;
    if (bool11) {
      this.aRC = new aKR();
      bool12 = this.aRC.b(paramByteBuffer, 314);
      if (!bool12)
        return false;
    } else {
      this.aRC = null;
    }
    boolean bool12 = paramByteBuffer.get() == 1;
    if (bool12) {
      this.aRD = new cZY();
      boolean bool13 = this.aRD.b(paramByteBuffer, 314);
      if (!bool13)
        return false;
    } else {
      this.aRD = null;
    }
    return true;
  }

  private boolean n(ByteBuffer paramByteBuffer) {
    this.aRq = paramByteBuffer.getInt();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.aRr = new bDs();
      bool1 = this.aRr.b(paramByteBuffer, 315);
      if (!bool1)
        return false;
    } else {
      this.aRr = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.aRs = new bPH();
      bool2 = this.aRs.b(paramByteBuffer, 315);
      if (!bool2)
        return false;
    } else {
      this.aRs = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.aRt = new cil();
      bool3 = this.aRt.b(paramByteBuffer, 315);
      if (!bool3)
        return false;
    } else {
      this.aRt = null;
    }
    boolean bool3 = paramByteBuffer.get() == 1;
    if (bool3) {
      this.aRu = new ij();
      bool4 = this.aRu.b(paramByteBuffer, 315);
      if (!bool4)
        return false;
    } else {
      this.aRu = null;
    }
    boolean bool4 = paramByteBuffer.get() == 1;
    if (bool4) {
      this.aRv = new aTM();
      bool5 = this.aRv.b(paramByteBuffer, 315);
      if (!bool5)
        return false;
    } else {
      this.aRv = null;
    }
    boolean bool5 = paramByteBuffer.get() == 1;
    if (bool5) {
      this.aRw = new cvs();
      bool6 = this.aRw.b(paramByteBuffer, 315);
      if (!bool6)
        return false;
    } else {
      this.aRw = null;
    }
    boolean bool6 = paramByteBuffer.get() == 1;
    if (bool6) {
      this.aRx = new ara();
      bool7 = this.aRx.b(paramByteBuffer, 315);
      if (!bool7)
        return false;
    } else {
      this.aRx = null;
    }
    boolean bool7 = paramByteBuffer.get() == 1;
    if (bool7) {
      this.aRy = new baA();
      bool8 = this.aRy.b(paramByteBuffer, 315);
      if (!bool8)
        return false;
    } else {
      this.aRy = null;
    }
    boolean bool8 = paramByteBuffer.get() == 1;
    if (bool8) {
      this.aRz = new dvI();
      bool9 = this.aRz.b(paramByteBuffer, 315);
      if (!bool9)
        return false;
    } else {
      this.aRz = null;
    }
    boolean bool9 = paramByteBuffer.get() == 1;
    if (bool9) {
      this.aRA = new bSk();
      bool10 = this.aRA.b(paramByteBuffer, 315);
      if (!bool10)
        return false;
    } else {
      this.aRA = null;
    }
    boolean bool10 = paramByteBuffer.get() == 1;
    if (bool10) {
      this.aRB = new ed();
      bool11 = this.aRB.b(paramByteBuffer, 315);
      if (!bool11)
        return false;
    } else {
      this.aRB = null;
    }
    boolean bool11 = paramByteBuffer.get() == 1;
    if (bool11) {
      this.aRC = new aKR();
      bool12 = this.aRC.b(paramByteBuffer, 315);
      if (!bool12)
        return false;
    } else {
      this.aRC = null;
    }
    boolean bool12 = paramByteBuffer.get() == 1;
    if (bool12) {
      this.aRD = new cZY();
      boolean bool13 = this.aRD.b(paramByteBuffer, 315);
      if (!bool13)
        return false;
    } else {
      this.aRD = null;
    }
    return true;
  }

  private boolean o(ByteBuffer paramByteBuffer) {
    this.aRq = paramByteBuffer.getInt();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.aRr = new bDs();
      bool1 = this.aRr.b(paramByteBuffer, 10003);
      if (!bool1)
        return false;
    } else {
      this.aRr = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.aRs = new bPH();
      bool2 = this.aRs.b(paramByteBuffer, 10003);
      if (!bool2)
        return false;
    } else {
      this.aRs = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.aRt = new cil();
      bool3 = this.aRt.b(paramByteBuffer, 10003);
      if (!bool3)
        return false;
    } else {
      this.aRt = null;
    }
    boolean bool3 = paramByteBuffer.get() == 1;
    if (bool3) {
      this.aRu = new ij();
      bool4 = this.aRu.b(paramByteBuffer, 10003);
      if (!bool4)
        return false;
    } else {
      this.aRu = null;
    }
    boolean bool4 = paramByteBuffer.get() == 1;
    if (bool4) {
      this.aRv = new aTM();
      bool5 = this.aRv.b(paramByteBuffer, 10003);
      if (!bool5)
        return false;
    } else {
      this.aRv = null;
    }
    boolean bool5 = paramByteBuffer.get() == 1;
    if (bool5) {
      this.aRw = new cvs();
      bool6 = this.aRw.b(paramByteBuffer, 10003);
      if (!bool6)
        return false;
    } else {
      this.aRw = null;
    }
    boolean bool6 = paramByteBuffer.get() == 1;
    if (bool6) {
      this.aRx = new ara();
      bool7 = this.aRx.b(paramByteBuffer, 10003);
      if (!bool7)
        return false;
    } else {
      this.aRx = null;
    }
    boolean bool7 = paramByteBuffer.get() == 1;
    if (bool7) {
      this.aRy = new baA();
      bool8 = this.aRy.b(paramByteBuffer, 10003);
      if (!bool8)
        return false;
    } else {
      this.aRy = null;
    }
    boolean bool8 = paramByteBuffer.get() == 1;
    if (bool8) {
      this.aRz = new dvI();
      bool9 = this.aRz.b(paramByteBuffer, 10003);
      if (!bool9)
        return false;
    } else {
      this.aRz = null;
    }
    boolean bool9 = paramByteBuffer.get() == 1;
    if (bool9) {
      this.aRA = new bSk();
      bool10 = this.aRA.b(paramByteBuffer, 10003);
      if (!bool10)
        return false;
    } else {
      this.aRA = null;
    }
    boolean bool10 = paramByteBuffer.get() == 1;
    if (bool10) {
      this.aRB = new ed();
      bool11 = this.aRB.b(paramByteBuffer, 10003);
      if (!bool11)
        return false;
    } else {
      this.aRB = null;
    }
    boolean bool11 = paramByteBuffer.get() == 1;
    if (bool11) {
      this.aRC = new aKR();
      bool12 = this.aRC.b(paramByteBuffer, 10003);
      if (!bool12)
        return false;
    } else {
      this.aRC = null;
    }
    boolean bool12 = paramByteBuffer.get() == 1;
    if (bool12) {
      this.aRD = new cZY();
      boolean bool13 = this.aRD.b(paramByteBuffer, 10003);
      if (!bool13)
        return false;
    } else {
      this.aRD = null;
    }
    return true;
  }

  private boolean r(ByteBuffer paramByteBuffer) {
    this.aRq = paramByteBuffer.getInt();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.aRr = new bDs();
      bool1 = this.aRr.b(paramByteBuffer, 10023);
      if (!bool1)
        return false;
    } else {
      this.aRr = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.aRs = new bPH();
      bool2 = this.aRs.b(paramByteBuffer, 10023);
      if (!bool2)
        return false;
    } else {
      this.aRs = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.aRt = new cil();
      bool3 = this.aRt.b(paramByteBuffer, 10023);
      if (!bool3)
        return false;
    } else {
      this.aRt = null;
    }
    boolean bool3 = paramByteBuffer.get() == 1;
    if (bool3) {
      this.aRu = new ij();
      bool4 = this.aRu.b(paramByteBuffer, 10023);
      if (!bool4)
        return false;
    } else {
      this.aRu = null;
    }
    boolean bool4 = paramByteBuffer.get() == 1;
    if (bool4) {
      this.aRv = new aTM();
      bool5 = this.aRv.b(paramByteBuffer, 10023);
      if (!bool5)
        return false;
    } else {
      this.aRv = null;
    }
    boolean bool5 = paramByteBuffer.get() == 1;
    if (bool5) {
      this.aRw = new cvs();
      bool6 = this.aRw.b(paramByteBuffer, 10023);
      if (!bool6)
        return false;
    } else {
      this.aRw = null;
    }
    boolean bool6 = paramByteBuffer.get() == 1;
    if (bool6) {
      this.aRx = new ara();
      bool7 = this.aRx.b(paramByteBuffer, 10023);
      if (!bool7)
        return false;
    } else {
      this.aRx = null;
    }
    boolean bool7 = paramByteBuffer.get() == 1;
    if (bool7) {
      this.aRy = new baA();
      bool8 = this.aRy.b(paramByteBuffer, 10023);
      if (!bool8)
        return false;
    } else {
      this.aRy = null;
    }
    boolean bool8 = paramByteBuffer.get() == 1;
    if (bool8) {
      this.aRz = new dvI();
      bool9 = this.aRz.b(paramByteBuffer, 10023);
      if (!bool9)
        return false;
    } else {
      this.aRz = null;
    }
    boolean bool9 = paramByteBuffer.get() == 1;
    if (bool9) {
      this.aRA = new bSk();
      bool10 = this.aRA.b(paramByteBuffer, 10023);
      if (!bool10)
        return false;
    } else {
      this.aRA = null;
    }
    boolean bool10 = paramByteBuffer.get() == 1;
    if (bool10) {
      this.aRB = new ed();
      bool11 = this.aRB.b(paramByteBuffer, 10023);
      if (!bool11)
        return false;
    } else {
      this.aRB = null;
    }
    boolean bool11 = paramByteBuffer.get() == 1;
    if (bool11) {
      this.aRC = new aKR();
      bool12 = this.aRC.b(paramByteBuffer, 10023);
      if (!bool12)
        return false;
    } else {
      this.aRC = null;
    }
    boolean bool12 = paramByteBuffer.get() == 1;
    if (bool12) {
      this.aRD = new cZY();
      boolean bool13 = this.aRD.b(paramByteBuffer, 10023);
      if (!bool13)
        return false;
    } else {
      this.aRD = null;
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