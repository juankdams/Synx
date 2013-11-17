class cxy extends cKy
{
  private static int[][][] ilx = new int[2][][];

  private static int[][] ily = (int[][])null;

  Object b(apK paramapK, cf paramcf)
  {
    Wc localWc = new Wc();
    localWc.cFH = paramcf.read(24);
    localWc.end = paramcf.read(24);
    localWc.cFI = (paramcf.read(24) + 1);
    localWc.cFJ = (paramcf.read(6) + 1);
    localWc.cFK = paramcf.read(8);

    int i = 0;
    for (int j = 0; j < localWc.cFJ; j++) {
      int k = paramcf.read(3);
      if (paramcf.read(1) != 0) {
        k |= paramcf.read(5) << 3;
      }
      localWc.cFL[j] = k;
      i += bhz.pG(k);
    }

    for (j = 0; j < i; j++) {
      localWc.cFM[j] = paramcf.read(8);
    }

    if (localWc.cFK >= paramapK.dwg) {
      O(localWc);
      return null;
    }

    for (j = 0; j < i; j++) {
      if (localWc.cFM[j] >= paramapK.dwg) {
        O(localWc);
        return null;
      }
    }
    return localWc;
  }

  Object a(dPO paramdPO, wm paramwm, Object paramObject)
  {
    Wc localWc = (Wc)paramObject;
    aZU localaZU = new aZU(null);
    localaZU.fhj = localWc;

    localaZU.fhk = localWc.cFJ;
    localaZU.fhm = paramdPO.fhm;
    localaZU.fhn = paramdPO.fhm[localWc.cFK];

    int i = localaZU.fhn.cPc;

    localaZU.fho = new int[localaZU.fhk][];

    int j = 0;
    int k = 0;
    int n;
    int i1;
    int i2;
    for (int m = 0; m < localaZU.fhk; m++) {
      n = localWc.cFL[m];
      i1 = bhz.pE(n);
      if (i1 != 0) {
        if (i1 > j)
          j = i1;
        localaZU.fho[m] = new int[i1];
        for (i2 = 0; i2 < i1; i2++) {
          if ((n & 1 << i2) != 0) {
            localaZU.fho[m][i2] = localWc.cFM[(k++)];
          }
        }
      }
    }

    localaZU.fhp = ((int)Math.rint(Math.pow(localaZU.fhk, i)));
    localaZU.fhl = j;
    localaZU.fhq = new int[localaZU.fhp][];
    for (m = 0; m < localaZU.fhp; m++) {
      n = m;
      i1 = localaZU.fhp / localaZU.fhk;
      localaZU.fhq[m] = new int[i];

      for (i2 = 0; i2 < i; i2++) {
        int i3 = n / i1;
        n -= i3 * i1;
        i1 /= localaZU.fhk;
        localaZU.fhq[m][i2] = i3;
      }
    }
    return localaZU;
  }

  void O(Object paramObject)
  {
  }

  static synchronized int a(cPr paramcPr, Object paramObject, float[][] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    aZU localaZU = (aZU)paramObject;
    Wc localWc = localaZU.fhj;

    int i = localWc.cFI;
    int j = localaZU.fhn.cPc;
    int k = localWc.end - localWc.cFH;

    int m = k / i;
    int n = (m + j - 1) / j;

    if (ilx.length < paramInt1) {
      ilx = new int[paramInt1][][];
    }

    for (int i1 = 0; i1 < paramInt1; i1++) {
      if ((ilx[i1] == null) || (ilx[i1].length < n)) {
        ilx[i1] = new int[n][];
      }
    }

    for (int i2 = 0; i2 < localaZU.fhl; i2++)
    {
      int i3 = 0; for (int i4 = 0; i3 < m; i4++) {
        if (i2 == 0)
        {
          for (i1 = 0; i1 < paramInt1; i1++) {
            i5 = localaZU.fhn.b(paramcPr.kyp);
            if (i5 == -1) {
              return 0;
            }
            ilx[i1][i4] = localaZU.fhq[i5];
            if (ilx[i1][i4] == null) {
              return 0;
            }
          }

        }

        for (int i5 = 0; (i5 < j) && (i3 < m); i3++) {
          for (i1 = 0; i1 < paramInt1; i1++) {
            int i6 = localWc.cFH + i3 * i;
            int i7 = ilx[i1][i4][i5];
            if ((localWc.cFL[i7] & 1 << i2) != 0) {
              aaN localaaN = localaZU.fhm[localaZU.fho[i7][i2]];
              if (localaaN != null)
                if (paramInt2 == 0) {
                  if (localaaN.a(paramArrayOfFloat[i1], i6, paramcPr.kyp, i) == -1)
                  {
                    return 0;
                  }
                } else if ((paramInt2 == 1) && 
                  (localaaN.b(paramArrayOfFloat[i1], i6, paramcPr.kyp, i) == -1))
                {
                  return 0;
                }
            }
          }
          i5++;
        }

      }

    }

    return 0;
  }

  static synchronized int a(cPr paramcPr, Object paramObject, float[][] paramArrayOfFloat, int paramInt)
  {
    aZU localaZU = (aZU)paramObject;
    Wc localWc = localaZU.fhj;

    int i = localWc.cFI;
    int j = localaZU.fhn.cPc;
    int k = localWc.end - localWc.cFH;

    int m = k / i;
    int n = (m + j - 1) / j;

    if ((ily == null) || (ily.length < n)) {
      ily = new int[n][];
    }
    for (int i1 = 0; i1 < localaZU.fhl; i1++)
    {
      int i3 = 0; for (int i2 = 0; i3 < m; i2++) {
        if (i1 == 0)
        {
          i4 = localaZU.fhn.b(paramcPr.kyp);
          if (i4 == -1) {
            return 0;
          }
          ily[i2] = localaZU.fhq[i4];
          if (ily[i2] == null) {
            return 0;
          }

        }

        for (int i4 = 0; (i4 < j) && (i3 < m); i3++) {
          int i5 = localWc.cFH + i3 * i;
          int i6 = ily[i2][i4];
          if ((localWc.cFL[i6] & 1 << i1) != 0) {
            aaN localaaN = localaZU.fhm[localaZU.fho[i6][i1]];
            if ((localaaN != null) && 
              (localaaN.a(paramArrayOfFloat, i5, paramInt, paramcPr.kyp, i) == -1))
            {
              return 0;
            }
          }
          i4++;
        }

      }

    }

    return 0;
  }

  int a(cPr paramcPr, Object paramObject, float[][] paramArrayOfFloat, int[] paramArrayOfInt, int paramInt)
  {
    int i = 0;
    for (int j = 0; j < paramInt; j++) {
      if (paramArrayOfInt[j] != 0) {
        paramArrayOfFloat[(i++)] = paramArrayOfFloat[j];
      }
    }
    if (i != 0)
      return a(paramcPr, paramObject, paramArrayOfFloat, i, 0);
    return 0;
  }
}