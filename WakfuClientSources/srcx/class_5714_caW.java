public class caW
{
  private int hrO = 0;
  private int hrP = -1;
  private byte hrQ = -1;

  public final int[] hrR = new int[32];

  public caW() {
  }

  public caW(int paramInt1, byte paramByte, int paramInt2) {
    this.hrQ = paramByte;
    this.hrO = paramInt1;
    this.hrP = paramInt2;
  }

  public final int ceT() {
    return this.hrO;
  }

  public final void b(int paramInt1, byte paramByte, int paramInt2) {
    this.hrO = paramInt1;
    this.hrP = paramInt2;
    this.hrQ = paramByte;
  }

  public final int ceU() {
    return this.hrP;
  }

  public byte ceV() {
    return this.hrQ;
  }

  public final int a(int paramInt1, int paramInt2, int paramInt3, bep[] paramArrayOfbep1, int paramInt4, int paramInt5, bep[] paramArrayOfbep2)
  {
    if ((!bB) && (this.hrO <= 0)) throw new AssertionError("no moverHeight defined");
    if ((!bB) && (this.hrP < 0)) throw new AssertionError("no jump capacity defined");
    if ((!bB) && ((paramArrayOfbep1 == null) || (paramArrayOfbep2 == null))) throw new AssertionError("startCellData and nextCellData can't be null");

    if ((!bB) && ((paramInt2 < 0) || (paramInt3 <= 0) || (paramInt2 + paramInt3 >= paramArrayOfbep1.length))) throw new AssertionError("startCell indexes out of bounds");
    if ((!bB) && ((paramInt4 < 0) || (paramInt5 <= 0) || (paramInt4 + paramInt5 >= paramArrayOfbep2.length))) throw new AssertionError("nextCell indexes out of bounds");
    if ((!bB) && ((paramInt1 < paramInt2) || (paramInt1 >= paramInt2 + paramInt3))) throw new AssertionError("startCellIndex out of bounds");

    if ((!bB) && (!cTI.a(paramInt1, paramInt2, paramInt3, paramArrayOfbep1, this.hrO))) throw new AssertionError("incoming position is not valid : " + paramArrayOfbep1[paramInt1].hY + "," + paramArrayOfbep1[paramInt1].hZ + ", " + paramArrayOfbep1[paramInt1].aOl);

    bep localbep1 = paramArrayOfbep1[paramInt1];
    int m;
    if (paramInt5 == 1)
    {
      bep localbep2 = paramArrayOfbep2[paramInt4];

      if ((localbep2.flI == -1) || (localbep2.gPY)) {
        return 0;
      }
      j = localbep2.aOl - localbep1.aOl;

      if ((j < 0 ? -j : j) > this.hrP) {
        return 0;
      }

      if (!a(localbep1, localbep2)) {
        return 0;
      }

      if (j <= 0) {
        this.hrR[0] = paramInt4;
        return 1;
      }

      if (paramInt1 == paramInt2 + paramInt3 - 1) {
        this.hrR[0] = paramInt4;
        return 1;
      }

      int k = localbep2.aOl + this.hrO;

      for (m = paramInt1 + 1; m < paramInt2 + paramInt3; m++) {
        bep localbep4 = paramArrayOfbep1[m];

        if (localbep4.aOl - localbep4.io >= k) {
          this.hrR[0] = paramInt4;
          return 1;
        }

        if (!localbep4.gPY) {
          return 0;
        }
      }

      this.hrR[0] = paramInt4;
      return 1;
    }

    int i = 0;

    label715: label727: for (int j = paramInt4; j < paramInt4 + paramInt5; j++) {
      bep localbep3 = paramArrayOfbep2[j];

      if ((localbep3.flI != -1) && (!localbep3.gPY))
      {
        m = localbep3.aOl - localbep1.aOl;
        if ((m < 0 ? -m : m) <= this.hrP)
        {
          if (a(localbep1, localbep3))
          {
            int n = localbep3.aOl + this.hrO;

            int i1 = Math.max(n, localbep1.aOl + this.hrO);

            for (int i2 = j + 1; i2 < paramInt4 + paramInt5; i2++) {
              bep localbep5 = paramArrayOfbep2[i2];
              int i3 = localbep5.aOl - localbep5.io;

              if (i3 >= i1)
              {
                if (m <= 0) {
                  break;
                }
                if (paramInt1 == paramInt2 + paramInt3 - 1)
                {
                  break;
                }
                for (int i4 = paramInt1 + 1; i4 < paramInt2 + paramInt3; i4++) {
                  bep localbep6 = paramArrayOfbep1[i4];

                  if (localbep6.aOl - localbep6.io >= n)
                  {
                    break label715;
                  }
                  if (!localbep3.gPY)
                  {
                    break label727;
                  }
                }
              }
              if (!localbep5.gPY)
              {
                break label727;
              }
            }
            this.hrR[(i++)] = j;
          }
        }
      }
    }
    return i;
  }

  public final boolean a(int paramInt1, int paramInt2, int paramInt3, bep[] paramArrayOfbep1, int paramInt4, int paramInt5, int paramInt6, bep[] paramArrayOfbep2)
  {
    int i = a(paramInt1, paramInt2, paramInt3, paramArrayOfbep1, paramInt5, paramInt6, paramArrayOfbep2);
    if (i == 0)
      return false;
    for (int j = 0; j < i; j++)
      if (this.hrR[j] == paramInt4)
        return true;
    return false;
  }

  public static boolean a(bep parambep1, bep parambep2) {
    if ((!bB) && (parambep1 == null)) throw new AssertionError("Can't check murfin movement validity for null cell");
    if ((!bB) && (parambep2 == null)) throw new AssertionError("Can't check murfin movement validity for null cell");

    int i = parambep1.bsb();
    int j = parambep2.bsb();
    if (i == j) {
      return true;
    }
    if (!dp(parambep1.bsc(), parambep2.bsc())) {
      return false;
    }
    if (parambep1.bsd() == parambep2.bsd()) {
      return true;
    }
    int k = parambep1.bsa();
    int m = parambep2.bsa();

    switch (k)
    {
    case 0:
      return (m == 0) || (m == 64);
    case 128:
      return (parambep1.RV() == parambep2.RV()) && ((m == 128) || (m == 192));
    case 64:
      return (m == 0) || (m == 64) || ((m == 192) && (parambep1.RV() == parambep2.RV()));
    case 192:
      return (parambep1.RV() == parambep2.RV()) && ((m == 64) || (m == 128) || (m == 192));
    }

    if (!bB) throw new AssertionError("Type de Cellule non connu poru valider un murfin : " + k);
    return false;
  }

  private static boolean dp(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2)
      return true;
    return (paramInt1 | paramInt2) == 48;
  }
}