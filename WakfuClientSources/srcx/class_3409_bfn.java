public class bfn
{
  static byte fsE = 6;
  static byte fsF = 2;

  static final int fsG = 18 / fsE;
  static final int fsH = 18 / fsF;

  private final dPx fsI = new dPx();

  public bfn(short paramShort1, short paramShort2)
  {
    dJN localdJN = (dJN)cPV.cGZ().V(paramShort1, paramShort2);

    long l1 = localdJN != null ? localdJN.diW() : 0L;
    long l2 = localdJN != null ? localdJN.diX() : 0L;
    long l3 = localdJN != null ? localdJN.diY() : 0L;
    long l4 = localdJN != null ? localdJN.diZ() : 0L;

    this.fsI.c(bkA.fAY.bJ(), new fC(l1, null));
    this.fsI.c(bkA.fAZ.bJ(), new fC(l2, null));
    this.fsI.c(bkA.fBa.bJ(), new fC(l3, null));
    this.fsI.c(bkA.fBb.bJ(), new fC(l4, null));
  }

  public byte d(byte paramByte, int paramInt1, int paramInt2)
  {
    fC localfC = (fC)this.fsI.bf(paramByte);
    if (localfC == null) {
      return 0;
    }
    return localfC.m(paramInt1, paramInt2);
  }

  public byte e(byte paramByte, int paramInt1, int paramInt2) {
    fC localfC = (fC)this.fsI.bf(paramByte);
    if (localfC == null) {
      return 0;
    }
    return localfC.n(paramInt1, paramInt2);
  }

  public boolean f(byte paramByte, int paramInt1, int paramInt2) {
    fC localfC = (fC)this.fsI.bf(paramByte);
    return (localfC != null) && (localfC.o(paramInt1, paramInt2));
  }

  public boolean cH(byte paramByte) {
    fC localfC = (fC)this.fsI.bf(paramByte);
    return (localfC != null) && (localfC.mF());
  }

  private static int pi(int paramInt) {
    return paramInt / fsH;
  }

  private static int pj(int paramInt) {
    return paramInt * fsF / fsE;
  }

  private static int B(int paramInt1, int paramInt2, int paramInt3) {
    return paramInt2 + paramInt3 * paramInt1;
  }

  public static int pk(int paramInt) {
    return (int)Math.floor(paramInt / fsG);
  }

  public static int pl(int paramInt) {
    return (int)Math.floor(paramInt / fsH);
  }

  public static int pm(int paramInt) {
    return (int)((paramInt + 0.5D) * fsG);
  }

  public static int pn(int paramInt) {
    return (int)((paramInt + 0.5D) * fsH);
  }

  public static short po(int paramInt) {
    return (short)(int)Math.floor(paramInt / fsE);
  }

  public static short pp(int paramInt) {
    return (short)(int)Math.floor(paramInt / fsF);
  }
}