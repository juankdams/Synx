class Vw
{
  private float[][] cAr;
  private int[] cAs;
  private int[] cAt;
  private Object[] cAu;
  private static final Vw cAv = new Vw();

  public static Vw aiK() {
    return cAv;
  }

  static void O(Object paramObject)
  {
  }

  static drr a(dPO paramdPO, wm paramwm, cyk paramcyk)
  {
    apK localapK = paramdPO.miW;
    drr localdrr = new drr();
    cyk localcyk = localdrr.ltO = paramcyk;
    localdrr.ltN = paramwm;

    localdrr.ltP = new Object[localcyk.imr];
    localdrr.ltQ = new Object[localcyk.imr];

    localdrr.ltR = new dqm[localcyk.imr];
    localdrr.ltS = new cKy[localcyk.imr];

    for (int i = 0; i < localcyk.imr; i++) {
      int j = localcyk.imt[i];
      int k = localcyk.imu[i];

      localdrr.ltR[i] = dqm.lrR[localapK.dwj[j].aGs];
      localdrr.ltP[i] = localdrr.ltR[i].a(paramdPO, paramwm, localapK.dwj[j].fpV);
      localdrr.ltS[i] = cKy.iJm[localapK.dwk[k].aGs];
      localdrr.ltQ[i] = localdrr.ltS[i].a(paramdPO, paramwm, localapK.dwk[k].fpV);
    }

    return localdrr;
  }

  static cyk a(apK paramapK, cf paramcf)
  {
    int i;
    if (paramcf.read(1) != 0)
      i = paramcf.read(4) + 1;
    else {
      i = 1;
    }

    cyk localcyk = new cyk(i);
    int k;
    if (paramcf.read(1) != 0) {
      localcyk.xe(paramcf.read(8) + 1);

      for (j = 0; j < localcyk.imv; j++) {
        k = localcyk.imw[j] = paramcf.read(bhz.pF(paramapK.dvV));
        int m = localcyk.imx[j] = paramcf.read(bhz.pF(paramapK.dvV));

        if ((k < 0) || (m < 0) || (k == m) || (k >= paramapK.dvV) || (m >= paramapK.dvV))
        {
          localcyk.free();
          return null;
        }
      }
    }

    if (paramcf.read(2) > 0) {
      localcyk.free();
      return null;
    }

    if (localcyk.imr > 1) {
      for (j = 0; j < paramapK.dvV; j++) {
        localcyk.ims[j] = paramcf.read(4);
        if (localcyk.ims[j] >= localcyk.imr) {
          localcyk.free();
          return null;
        }
      }
    }

    for (int j = 0; j < localcyk.imr; j++) {
      k = paramcf.read(8);
      if (k >= paramapK.dwd) {
        localcyk.free();
        return null;
      }
      localcyk.imt[j] = paramcf.read(8);
      if (localcyk.imt[j] >= paramapK.dwe) {
        localcyk.free();
        return null;
      }
      localcyk.imu[j] = paramcf.read(8);
      if (localcyk.imu[j] >= paramapK.dwf) {
        localcyk.free();
        return null;
      }
    }
    return localcyk;
  }

  synchronized int a(cPr paramcPr, Object paramObject)
  {
    dPO localdPO = paramcPr.kyw;
    apK localapK = localdPO.miW;
    drr localdrr = (drr)paramObject;
    cyk localcyk = localdrr.ltO;
    wm localwm = localdrr.ltN;
    int i = paramcPr.kyt = localapK.dwa[paramcPr.kyr];

    float[] arrayOfFloat1 = localdPO.K(paramcPr.kyr, paramcPr.kyq, paramcPr.kys, localwm.bmd);
    if ((this.cAr == null) || (this.cAr.length < localapK.dvV)) {
      this.cAr = new float[localapK.dvV][];
      this.cAt = new int[localapK.dvV];
      this.cAs = new int[localapK.dvV];
      this.cAu = new Object[localapK.dvV];
    }
    int n;
    int i2;
    for (int j = 0; j < localapK.dvV; j++) {
      float[] arrayOfFloat2 = paramcPr.kyo[j];
      n = localcyk.ims[j];

      this.cAu[j] = localdrr.ltR[n].a(paramcPr, localdrr.ltP[n], this.cAu[j]);
      if (this.cAu[j] != null)
        this.cAt[j] = 1;
      else {
        this.cAt[j] = 0;
      }
      for (i2 = 0; i2 < i / 2; i2++) {
        arrayOfFloat2[i2] = 0.0F;
      }

    }

    for (j = 0; j < localcyk.imv; j++) {
      if ((this.cAt[localcyk.imw[j]] != 0) || (this.cAt[localcyk.imx[j]] != 0)) {
        this.cAt[localcyk.imw[j]] = 1;
        this.cAt[localcyk.imx[j]] = 1;
      }

    }

    for (j = 0; j < localcyk.imr; j++) {
      int k = 0;
      for (n = 0; n < localapK.dvV; n++) {
        if (localcyk.ims[n] == j) {
          if (this.cAt[n] != 0)
            this.cAs[k] = 1;
          else {
            this.cAs[k] = 0;
          }
          this.cAr[(k++)] = paramcPr.kyo[n];
        }
      }

      localdrr.ltS[j].a(paramcPr, localdrr.ltQ[j], this.cAr, this.cAs, k);
    }

    for (j = localcyk.imv - 1; j >= 0; j--) {
      float[] arrayOfFloat3 = paramcPr.kyo[localcyk.imw[j]];
      float[] arrayOfFloat5 = paramcPr.kyo[localcyk.imx[j]];

      for (i2 = 0; i2 < i / 2; i2++) {
        float f1 = arrayOfFloat3[i2];
        float f2 = arrayOfFloat5[i2];

        if (f1 > 0.0F) {
          if (f2 > 0.0F) {
            arrayOfFloat3[i2] = f1;
            arrayOfFloat5[i2] = (f1 - f2);
          } else {
            arrayOfFloat5[i2] = f1;
            arrayOfFloat3[i2] = (f1 + f2);
          }
        }
        else if (f2 > 0.0F) {
          arrayOfFloat3[i2] = f1;
          arrayOfFloat5[i2] = (f1 + f2);
        } else {
          arrayOfFloat5[i2] = f1;
          arrayOfFloat3[i2] = (f1 - f2);
        }

      }

    }

    for (j = 0; j < localapK.dvV; j++) {
      int m = localcyk.ims[j];
      localdrr.ltR[m].a(paramcPr, localdrr.ltP[m], this.cAu[j], paramcPr.kyo[j]);
    }
    float[] arrayOfFloat4;
    for (j = 0; j < localapK.dvV; j++) {
      arrayOfFloat4 = paramcPr.kyo[j];

      localdPO.Dl(paramcPr.kyr).e(arrayOfFloat4, arrayOfFloat4);
    }

    for (j = 0; j < localapK.dvV; j++) {
      arrayOfFloat4 = paramcPr.kyo[j];
      int i1;
      if (this.cAt[j] != 0) {
        for (i1 = 0; i1 < i; i1++)
          arrayOfFloat4[i1] *= arrayOfFloat1[i1];
      }
      else {
        for (i1 = 0; i1 < i; i1++) {
          arrayOfFloat4[i1] = 0.0F;
        }

      }

    }

    return 0;
  }
}