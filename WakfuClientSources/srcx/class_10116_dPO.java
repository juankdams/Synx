public class dPO
{
  private static final float gGg = 3.141593F;
  apK miW;
  int miX;
  private float[][] kyo;
  private int miY;
  private int miZ;
  private int mja;
  private int kyq;
  private int kyr;
  private int mjb;
  private long iqy;
  private long kyv;
  private bUh mjc;
  private bUh mjd;
  private cEm mje;
  private cEm mjf;
  aaN[] fhm;
  Object[] mjg;
  private static final aPP mjh = new aPP();

  public void xo()
  {
  }

  cEm Dl(int paramInt)
  {
    if ((!bB) && ((paramInt < 0) || (paramInt >= 2))) throw new AssertionError();
    return paramInt == 0 ? this.mje : this.mjf;
  }

  public float[] K(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if ((!bB) && (paramInt1 != 0) && (paramInt1 != 1)) throw new AssertionError();
    if ((!bB) && (paramInt2 != 0) && (paramInt2 != 1)) throw new AssertionError();
    if ((!bB) && (paramInt3 != 0) && (paramInt3 != 1)) throw new AssertionError();
    if ((!bB) && (paramInt4 != 0)) throw new AssertionError();

    if (paramInt1 == 0)
      return this.mjc.di(paramInt2, paramInt3);
    return this.mjd.di(paramInt2, paramInt3);
  }

  private static float[] L(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 != 0) {
      return null;
    }
    bVF localbVF = new bVF(paramInt2, paramInt3, paramInt4, null);
    float[] arrayOfFloat;
    synchronized (mjh) {
      arrayOfFloat = (float[])mjh.getValue(localbVF);
      if (arrayOfFloat == null) {
        arrayOfFloat = M(paramInt1, paramInt2, paramInt3, paramInt4);
        mjh.put(localbVF, arrayOfFloat);
      }
    }
    return arrayOfFloat;
  }

  private static float[] M(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    float[] arrayOfFloat = new float[paramInt2];

    int i = paramInt2 / 4 - paramInt3 / 2;
    int j = paramInt2 - paramInt2 / 4 - paramInt4 / 2;
    float f;
    for (int k = 0; k < paramInt3; k++) {
      f = (float)((k + 0.5D) / paramInt3 * 3.141592741012573D / 2.0D);
      f = (float)Math.sin(f);
      f *= f;
      f = (float)(f * 1.570796370506287D);
      f = (float)Math.sin(f);
      arrayOfFloat[(k + i)] = f;
    }

    for (k = i + paramInt3; k < j; k++) {
      arrayOfFloat[k] = 1.0F;
    }

    for (k = 0; k < paramInt4; k++) {
      f = (float)((paramInt4 - k - 0.5D) / paramInt4 * 3.141592741012573D / 2.0D);
      f = (float)Math.sin(f);
      f *= f;
      f = (float)(f * 1.570796370506287D);
      f = (float)Math.sin(f);
      arrayOfFloat[(k + j)] = f;
    }

    return arrayOfFloat;
  }

  int a(apK paramapK, boolean paramBoolean)
  {
    this.miW = paramapK;
    this.miX = bhz.pF(paramapK.dwb);

    this.mje = cEm.xA(paramapK.dwa[0]);
    this.mjf = cEm.xA(paramapK.dwa[1]);

    this.mjc = bUh.J(paramapK.dwa);
    this.mjd = bUh.K(paramapK.dwa);

    this.fhm = new aaN[paramapK.dwg];
    for (int i = 0; i < paramapK.dwg; i++) {
      this.fhm[i] = new aaN(paramapK.dwl[i]);
    }

    this.miY = 0;

    this.kyo = new float[paramapK.dvV][];

    this.kyq = 0;
    this.kyr = 0;

    this.mjb = (paramapK.dwa[1] / 2);

    this.miZ = this.mjb;

    this.mjg = new drr[paramapK.dwb];
    for (i = 0; i < paramapK.dwb; i++) {
      int j = paramapK.dwh[i].bmf;
      if ((!bB) && (paramapK.dwi[j].aGs != 0)) throw new AssertionError();
      Vw.aiK(); this.mjg[i] = Vw.a(this, paramapK.dwh[i], (cyk)paramapK.dwi[j].fpV);
    }
    return 0;
  }

  public int a(apK paramapK) {
    a(paramapK, false);

    this.mja = this.mjb;
    this.mjb -= paramapK.dwa[this.kyr] / 4 + paramapK.dwa[this.kyq] / 4;
    this.iqy = -1L;
    this.kyv = -1L;
    return 0;
  }

  public int a(cPr paramcPr)
  {
    if ((this.mjb > this.miW.dwa[1] / 2) && (this.mja > 8192))
    {
      i = this.mjb - this.miW.dwa[1] / 2;
      i = this.mja < i ? this.mja : i;

      this.miZ -= i;
      this.mjb -= i;
      this.mja -= i;
      if (i != 0) {
        for (j = 0; j < this.miW.dvV; j++) {
          System.arraycopy(this.kyo[j], i, this.kyo[j], 0, this.miZ);
        }
      }
    }

    this.kyq = this.kyr;
    this.kyr = paramcPr.kyr;

    if (this.kyv + 1L != paramcPr.kyv) {
      this.iqy = -1L;
    }
    this.kyv = paramcPr.kyv;

    int i = this.miW.dwa[this.kyr];
    int j = this.mjb + this.miW.dwa[this.kyq] / 4 + i / 4;
    float[] arrayOfFloat1 = j - i / 2;
    int k = arrayOfFloat1 + i;
    float[] arrayOfFloat2 = 0;
    float[] arrayOfFloat3 = 0;
    float[] arrayOfFloat4;
    if (k > this.miY)
    {
      this.miY = Math.max(k + this.miW.dwa[1], 16384);
      for (m = 0; m < this.miW.dvV; m++)
      {
        arrayOfFloat4 = new float[this.miY];
        if (this.kyo[m] != null)
          System.arraycopy(this.kyo[m], 0, arrayOfFloat4, 0, this.kyo[m].length);
        this.kyo[m] = arrayOfFloat4;
      }

    }

    switch (this.kyr) {
    case 0:
      arrayOfFloat2 = 0;
      arrayOfFloat3 = this.miW.dwa[0] / 2;
      break;
    case 1:
      arrayOfFloat2 = this.miW.dwa[1] / 4 - this.miW.dwa[this.kyq] / 4;
      arrayOfFloat3 = arrayOfFloat2 + this.miW.dwa[this.kyq] / 2;
    }

    for (int m = 0; m < this.miW.dvV; m++) {
      arrayOfFloat4 = arrayOfFloat1;

      for (float[] arrayOfFloat5 = arrayOfFloat2; arrayOfFloat5 < arrayOfFloat3; arrayOfFloat5++) {
        this.kyo[m][(arrayOfFloat4 + arrayOfFloat5)] += paramcPr.kyo[m][arrayOfFloat5];
      }

      System.arraycopy(paramcPr.kyo[m], arrayOfFloat3, this.kyo[m], arrayOfFloat4 + arrayOfFloat3, i - arrayOfFloat3);
    }

    if (this.iqy == -1L) {
      this.iqy = paramcPr.iqy;
    } else {
      this.iqy += j - this.mjb;
      if ((paramcPr.iqy != -1L) && (this.iqy != paramcPr.iqy)) {
        if ((this.iqy > paramcPr.iqy) && (paramcPr.kyu != 0))
        {
          j = (int)(j - (this.iqy - paramcPr.iqy));
        }

        this.iqy = paramcPr.iqy;
      }

    }

    this.mjb = j;
    this.miZ = k;

    return 0;
  }

  public int a(float[][][] paramArrayOfFloat, int[] paramArrayOfInt)
  {
    if (this.mja >= this.mjb) {
      return 0;
    }
    if (paramArrayOfFloat != null) {
      for (int i = 0; i < this.miW.dvV; i++) {
        paramArrayOfInt[i] = this.mja;
      }
      paramArrayOfFloat[0] = this.kyo;
    }
    return this.mjb - this.mja;
  }

  public int Dm(int paramInt) {
    if ((paramInt != 0) && (this.mja + paramInt > this.mjb))
      return -1;
    this.mja += paramInt;
    return 0;
  }

  public void clear()
  {
  }
}