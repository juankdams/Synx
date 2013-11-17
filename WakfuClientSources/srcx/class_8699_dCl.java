import org.apache.log4j.Logger;

public class dCl extends aSv
  implements cFC
{
  private static final Logger K = Logger.getLogger(dCl.class);

  public static final akl fGd = new akl(18, 18, (short)-32768);
  public static final akl fGe = new akl(18, 18, (short)0);
  private aXL[] TM;
  private bGO fGn;
  private bGO fGp;
  private bGO fGo;

  public dCl(int paramInt1, int paramInt2)
  {
    this.hY = (paramInt1 * 18);
    this.hZ = (paramInt2 * 18);
    this.aOl = 0;
  }

  public void a(bnp parambnp1, bnp parambnp2, bnp parambnp3, bnp parambnp4)
  {
    int i = 9;
    int j = 9;

    e(parambnp1, 0, 0);
    e(parambnp2, 9, 0);
    e(parambnp3, 0, 9);
    e(parambnp4, 9, 9);

    this.fGn = bnp.b(parambnp1, parambnp2, parambnp3, parambnp4);
    this.fGp = bnp.c(parambnp1, parambnp2, parambnp3, parambnp4);
    this.fGo = bnp.d(parambnp1, parambnp2, parambnp3, parambnp4);
  }

  public void a(aXL[] paramArrayOfaXL) {
    this.TM = paramArrayOfaXL;
  }

  private void e(bnp parambnp, int paramInt1, int paramInt2) {
    int i = paramInt1 + this.hY;
    int j = paramInt2 + this.hZ;
    for (int k = 0; k < 9; k++)
      for (int m = 0; m < 9; m++)
        if ((parambnp == null) || (parambnp.ay(m, k)))
          a(m + i, k + j, true);
  }

  public final boolean I(int paramInt1, int paramInt2)
  {
    if (!super.I(paramInt1, paramInt2)) {
      return false;
    }
    if (this.TM.length != 0) {
      for (aXL localaXL : this.TM) {
        if ((localaXL.contains(paramInt1, paramInt2)) && (localaXL.I(paramInt1, paramInt2))) {
          return true;
        }
      }
    }
    return true;
  }

  public void d(aYQ paramaYQ)
  {
    throw new UnsupportedOperationException("Impossible sur les patch");
  }

  public final int a(int paramInt1, int paramInt2, bep[] paramArrayOfbep, int paramInt3)
  {
    if ((!bB) && (!a(paramInt1, paramInt2, paramArrayOfbep))) throw new AssertionError();
    int i = 1;
    bep localbep = paramArrayOfbep[paramInt3];
    localbep.hY = paramInt1;
    localbep.hZ = paramInt2;
    localbep.aOl = fc(paramInt1, paramInt2);
    localbep.io = ((byte)Math.max(0, localbep.aOl));
    localbep.flI = (super.I(paramInt1, paramInt2) ? -1 : 7);
    localbep.gPY = false;
    localbep.frm = ((byte)cs(paramInt1, paramInt2));
    localbep.frn = ((byte)fd(paramInt1, paramInt2));

    if (this.TM.length != 0) {
      for (aXL localaXL : this.TM) {
        int m = localaXL.a(paramInt1, paramInt2, paramArrayOfbep, paramInt3 + i);
        if (m != -1) {
          i += a(paramArrayOfbep, paramInt3, paramInt3 + i, m);
        }
      }
    }
    return i;
  }

  public int a(int paramInt1, int paramInt2, cZc[] paramArrayOfcZc, int paramInt3)
  {
    if ((!bB) && (!a(paramInt1, paramInt2, paramArrayOfcZc))) throw new AssertionError();
    int i = 1;
    cZc localcZc = paramArrayOfcZc[paramInt3];
    localcZc.hY = paramInt1;
    localcZc.hZ = paramInt2;
    localcZc.aOl = fc(paramInt1, paramInt2);
    localcZc.io = ((byte)Math.max(0, localcZc.aOl));
    localcZc.gPY = false;

    if (this.TM.length != 0) {
      for (aXL localaXL : this.TM) {
        int m = localaXL.a(paramInt1, paramInt2, paramArrayOfcZc, paramInt3 + i);
        if (m != -1) {
          i += a(paramArrayOfcZc, paramInt3, paramInt3 + i, m);
        }
      }
    }

    return i;
  }

  private short fc(int paramInt1, int paramInt2) {
    if (this.fGn == null) {
      return fGd.axy();
    }
    return fGd.a(paramInt1 - this.hY, paramInt2 - this.hZ, 0, this.fGn);
  }

  private short fd(int paramInt1, int paramInt2) {
    if (this.fGo == null) {
      return fGe.axy();
    }
    return fGe.a(paramInt1 - this.hY, paramInt2 - this.hZ, 0, this.fGo);
  }

  private short cs(int paramInt1, int paramInt2) {
    if (this.fGp == null) {
      return fGe.axy();
    }
    return fGe.a(paramInt1 - this.hY, paramInt2 - this.hZ, 0, this.fGp);
  }

  private static int a(bMu[] paramArrayOfbMu, int paramInt1, int paramInt2, int paramInt3)
  {
    int j;
    for (int i = paramInt1; i < paramInt2; i++) {
      for (j = paramInt2; j < paramInt2 + paramInt3; )
        if (!bMu.a(paramArrayOfbMu[i], paramArrayOfbMu[j])) {
          j++;
        }
        else
        {
          bMu localbMu = paramArrayOfbMu[i];
          paramArrayOfbMu[i] = paramArrayOfbMu[i].a(paramArrayOfbMu[j]);
          paramInt3--;
          if (paramInt3 != 0) {
            System.arraycopy(paramArrayOfbMu, j + 1, paramArrayOfbMu, j, paramInt3);
            paramArrayOfbMu[(j + paramInt3)] = localbMu;
          }
        }
    }
    return paramInt3;
  }
}