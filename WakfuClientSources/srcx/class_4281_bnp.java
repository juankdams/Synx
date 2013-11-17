import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class bnp
{
  private static final Logger K = Logger.getLogger(bnp.class);

  public static final akl fGd = new akl(9, 9, (short)-32768);
  public static final akl fGe = new akl(9, 9, (short)0);

  private static final cOO[] fGf = new cOO[0];

  public static final short fGg = cu(1, 0);
  public static final short fGh = 0;
  public static final int fGi = 2;
  public static final int fGj = 2;
  public static final int fGk = 9;
  public static final int fGl = 9;
  public static final int dBG = 81;
  public final int aw;
  private byte[] ePJ;
  private bGO fGm;
  private bGO fGn;
  private bGO fGo;
  private bGO fGp;
  private cOO[] fGq;

  protected bnp(int paramInt)
  {
    this.aw = paramInt;
  }

  public boolean ay(int paramInt1, int paramInt2) {
    if ((!bB) && ((paramInt1 < 0) || (paramInt1 >= 9))) throw new AssertionError();
    if ((!bB) && ((paramInt2 < 0) || (paramInt2 >= 9))) throw new AssertionError();
    if (this.ePJ == null) {
      return false;
    }
    return Je.c(this.ePJ, paramInt2 * 9 + paramInt1);
  }

  public boolean cq(int paramInt1, int paramInt2) {
    if ((!bB) && ((paramInt1 < 0) || (paramInt1 >= 9))) throw new AssertionError();
    if ((!bB) && ((paramInt2 < 0) || (paramInt2 >= 9))) throw new AssertionError();
    bxA();
    if (this.fGq == fGf) {
      return false;
    }

    for (int i = 0; i < this.fGq.length; i++) {
      if ((this.fGq[i].boO == paramInt1) && (this.fGq[i].boP == paramInt2)) {
        return true;
      }
    }
    return false;
  }

  private void bxA() {
    if (this.fGq != null) {
      return;
    }

    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < 9; i++)
      for (int j = 0; j < 9; j++) {
        int k = blh.bwk().a(i, j, 0, this.fGm);
        dKM localdKM = djb.cRJ().Ak(k);
        if (localdKM != null)
        {
          if (!dxA.BU(k))
          {
            int[] arrayOfInt = localdKM.djB();
            if (arrayOfInt.length != 0)
            {
              short s = a(this, i, j);
              localArrayList.add(new cOO((byte)i, (byte)j, s, arrayOfInt[0]));
            }
          }
        }
      }
    if (localArrayList.isEmpty()) {
      this.fGq = fGf;
    } else {
      this.fGq = new cOO[localArrayList.size()];
      localArrayList.toArray(this.fGq);
    }
  }

  public void L(dGy paramdGy) {
    bxA();
    if (this.fGq == fGf) {
      return;
    }

    for (int i = 0; i < this.fGq.length; i++)
      if (!paramdGy.d(this.fGq[i]))
        return;
  }

  public short cr(int paramInt1, int paramInt2)
  {
    return fGe.a(paramInt1, paramInt2, 0, this.fGo);
  }

  public short cs(int paramInt1, int paramInt2) {
    return fGe.a(paramInt1, paramInt2, 0, this.fGp);
  }

  public short ct(int paramInt1, int paramInt2) {
    return fGd.a(paramInt1, paramInt2, 0, this.fGn);
  }

  public short a(int paramInt1, int paramInt2, int paramInt3) {
    return blh.bwk().a(paramInt1, paramInt2, paramInt3, this.fGm);
  }

  public void g(aYQ paramaYQ) {
    p(paramaYQ);
    q(paramaYQ);
  }

  protected final void p(aYQ paramaYQ) {
    int i = paramaYQ.readByte();
    if (i <= 0) {
      this.ePJ = null;
    } else {
      if ((!bB) && (i != Je.getDataLength(81))) throw new AssertionError();
      this.ePJ = paramaYQ.ot(i);
    }
    this.fGn = bGO.a(paramaYQ, fGd.axy());
    this.fGp = bGO.a(paramaYQ, fGe.axy());
    this.fGo = bGO.a(paramaYQ, fGe.axy());
  }

  protected void q(aYQ paramaYQ) {
    this.fGm = bGO.a(paramaYQ, blh.bwk().axy());
  }

  public static short cu(int paramInt1, int paramInt2) {
    if ((paramInt1 < 0) || (paramInt1 > 15)) {
      throw new UnsupportedOperationException("coordonée x de patch hors contraintes mapCoordX=" + paramInt1);
    }

    if ((paramInt2 < 0) || (paramInt2 > 4095)) {
      throw new UnsupportedOperationException("coordonée y de patch hors contraintes mapCoordY=" + paramInt2);
    }

    int i = (short)(paramInt1 & 0xF);
    int j = (short)(paramInt2 & 0xFFF);
    return (short)(i << 12 | j);
  }

  public static MD qn(int paramInt) {
    int i = paramInt >> 12 & 0xF;
    int j = paramInt & 0xFFF;
    return new MD(i, j);
  }

  public static bGO b(bnp parambnp1, bnp parambnp2, bnp parambnp3, bnp parambnp4)
  {
    short[] arrayOfShort = new short[324];
    int i = 0;
    int k;
    for (int j = 0; j < 9; j++) {
      for (k = 0; k < 9; k++) {
        arrayOfShort[(i++)] = a(parambnp1, k, j);
      }
      for (k = 0; k < 9; k++) {
        arrayOfShort[(i++)] = a(parambnp2, k, j);
      }
    }
    for (j = 0; j < 9; j++) {
      for (k = 0; k < 9; k++) {
        arrayOfShort[(i++)] = a(parambnp3, k, j);
      }
      for (k = 0; k < 9; k++)
        arrayOfShort[(i++)] = a(parambnp4, k, j);
    }
    try
    {
      return dCl.fGd.e(arrayOfShort);
    } catch (cbF localcbF) {
      K.error("", localcbF);
    }
    return null;
  }

  public static bGO c(bnp parambnp1, bnp parambnp2, bnp parambnp3, bnp parambnp4)
  {
    short[] arrayOfShort = new short[324];
    int i = 0;
    int k;
    for (int j = 0; j < 9; j++) {
      for (k = 0; k < 9; k++) {
        arrayOfShort[(i++)] = b(parambnp1, k, j);
      }
      for (k = 0; k < 9; k++) {
        arrayOfShort[(i++)] = b(parambnp2, k, j);
      }
    }
    for (j = 0; j < 9; j++) {
      for (k = 0; k < 9; k++) {
        arrayOfShort[(i++)] = b(parambnp3, k, j);
      }
      for (k = 0; k < 9; k++)
        arrayOfShort[(i++)] = b(parambnp4, k, j);
    }
    try
    {
      return dCl.fGe.e(arrayOfShort);
    } catch (cbF localcbF) {
      K.error("", localcbF);
    }
    return null;
  }

  public static bGO d(bnp parambnp1, bnp parambnp2, bnp parambnp3, bnp parambnp4)
  {
    short[] arrayOfShort = new short[324];
    int i = 0;
    int k;
    for (int j = 0; j < 9; j++) {
      for (k = 0; k < 9; k++) {
        arrayOfShort[(i++)] = c(parambnp1, k, j);
      }
      for (k = 0; k < 9; k++) {
        arrayOfShort[(i++)] = c(parambnp2, k, j);
      }
    }
    for (j = 0; j < 9; j++) {
      for (k = 0; k < 9; k++) {
        arrayOfShort[(i++)] = c(parambnp3, k, j);
      }
      for (k = 0; k < 9; k++)
        arrayOfShort[(i++)] = c(parambnp4, k, j);
    }
    try
    {
      return dCl.fGe.e(arrayOfShort);
    } catch (cbF localcbF) {
      K.error("", localcbF);
    }
    return null;
  }

  private static short a(bnp parambnp, int paramInt1, int paramInt2) {
    return parambnp != null ? parambnp.ct(paramInt1, paramInt2) : fGd.axy();
  }

  private static short b(bnp parambnp, int paramInt1, int paramInt2) {
    return parambnp != null ? parambnp.cs(paramInt1, paramInt2) : fGe.axy();
  }

  private static short c(bnp parambnp, int paramInt1, int paramInt2) {
    return parambnp != null ? parambnp.cr(paramInt1, paramInt2) : fGe.axy();
  }

  private static short d(bnp parambnp, int paramInt1, int paramInt2) {
    return parambnp != null ? parambnp.a(paramInt1, paramInt2, 0) : blh.bwj().axy();
  }

  public static bGO e(bnp parambnp1, bnp parambnp2, bnp parambnp3, bnp parambnp4)
  {
    short[] arrayOfShort = new short[324];
    int i = 0;
    int k;
    for (int j = 0; j < 9; j++) {
      for (k = 0; k < 9; k++) {
        arrayOfShort[(i++)] = d(parambnp1, k, j);
      }
      for (k = 0; k < 9; k++) {
        arrayOfShort[(i++)] = d(parambnp2, k, j);
      }
    }
    for (j = 0; j < 9; j++) {
      for (k = 0; k < 9; k++) {
        arrayOfShort[(i++)] = d(parambnp3, k, j);
      }
      for (k = 0; k < 9; k++)
        arrayOfShort[(i++)] = d(parambnp4, k, j);
    }
    try
    {
      return blh.bwj().e(arrayOfShort);
    } catch (cbF localcbF) {
      K.error("", localcbF);
    }
    return null;
  }

  public static int qo(int paramInt) {
    int i = paramInt / 9;
    if ((paramInt < 0) && (paramInt % 9 != 0)) {
      i--;
    }
    if ((!bB) && (i != Math.floor(paramInt / 9.0D))) throw new AssertionError();
    return i;
  }

  public static int qp(int paramInt) {
    int i = paramInt / 9;
    if ((paramInt < 0) && (paramInt % 9 != 0)) {
      i--;
    }
    if ((!bB) && (i != Math.floor(paramInt / 9.0D))) throw new AssertionError();
    return i;
  }

  public static boolean bS(short paramShort) {
    int i = qn(paramShort).getX();
    return (i != 1) && (i != 2);
  }
}