public class bNy
{
  private byte[] gSt;
  private int gSu;
  private int gSv;
  private int[] gSw;
  private long[] gSx;
  private int gSy;
  private int gSz;
  private int gSA;
  private int gSB;
  private int gSC;
  private int gSD;
  private long gSE;

  public bNy()
  {
    init();
  }

  private void init() {
    this.gSt = new byte[16384];
    this.gSy = 1024;
    this.gSw = new int[this.gSy];
    this.gSx = new long[this.gSy];
  }

  public void xo() {
    xp();
  }

  public void init(int paramInt) {
    if (this.gSt == null) {
      init();
    } else {
      for (int i = 0; i < this.gSt.length; i++)
        this.gSt[i] = 0;
      for (i = 0; i < this.gSw.length; i++)
        this.gSw[i] = 0;
      for (i = 0; i < this.gSx.length; i++)
        this.gSx[i] = 0L;
    }
    this.gSC = paramInt;
  }

  public void clear() {
    this.gSt = null;
    this.gSw = null;
    this.gSx = null;
  }

  private void tD(int paramInt)
  {
    int i = this.gSt.length;
    if (i <= this.gSu + paramInt) {
      i += paramInt + 1024;
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.gSt, 0, arrayOfByte, 0, this.gSt.length);
      this.gSt = arrayOfByte;
    }
  }

  private void tE(int paramInt) {
    if (this.gSy <= this.gSz + paramInt) {
      this.gSy += paramInt + 32;
      int[] arrayOfInt = new int[this.gSy];
      System.arraycopy(this.gSw, 0, arrayOfInt, 0, this.gSw.length);
      this.gSw = arrayOfInt;

      long[] arrayOfLong = new long[this.gSy];
      System.arraycopy(this.gSx, 0, arrayOfLong, 0, this.gSx.length);
      this.gSx = arrayOfLong;
    }
  }

  public int a(cAE paramcAE)
  {
    int i = this.gSB;

    if (this.gSA <= i) {
      return 0;
    }

    if ((this.gSw[i] & 0x400) != 0)
    {
      this.gSB += 1;

      this.gSE += 1L;
      return -1;
    }

    int j = this.gSw[i] & 0xFF;

    paramcAE.iqt = this.gSt;
    paramcAE.iqu = this.gSv;
    paramcAE.iqx = (this.gSw[i] & 0x200);
    paramcAE.iqw = (this.gSw[i] & 0x100);
    int k = 0;
    k += j;

    while (j == 255) {
      int m = this.gSw[(++i)];
      j = m & 0xFF;
      if ((m & 0x200) != 0)
        paramcAE.iqx = 512;
      k += j;
    }

    paramcAE.gSE = this.gSE;
    paramcAE.iqy = this.gSx[i];
    paramcAE.iqv = k;

    this.gSv += k;

    this.gSB = (i + 1);

    this.gSE += 1L;
    return 1;
  }

  public int c(Iw paramIw)
  {
    byte[] arrayOfByte1 = paramIw.bRj;
    int i = paramIw.header;
    byte[] arrayOfByte2 = paramIw.bRl;
    int j = paramIw.bRm;
    int k = paramIw.bRn;

    int m = paramIw.version();
    int n = paramIw.RM();
    int i1 = paramIw.RN();
    int i2 = paramIw.RO();
    long l = paramIw.RP();
    int i3 = paramIw.RQ();
    int i4 = paramIw.RR();
    int i5 = arrayOfByte1[(i + 26)] & 0xFF;

    int i6 = this.gSB;
    int i7 = this.gSv;

    if (i7 != 0) {
      this.gSu -= i7;
      if (this.gSu != 0) {
        System.arraycopy(this.gSt, i7, this.gSt, 0, this.gSu);
      }
      this.gSv = 0;
    }

    if (i6 != 0)
    {
      if (this.gSz - i6 != 0) {
        System.arraycopy(this.gSw, i6, this.gSw, 0, this.gSz - i6);
        System.arraycopy(this.gSx, i6, this.gSx, 0, this.gSz - i6);
      }
      this.gSz -= i6;
      this.gSA -= i6;
      this.gSB = 0;
    }

    if (i3 != this.gSC)
      return -1;
    if (m > 0) {
      return -1;
    }
    tE(i5 + 1);

    i6 = 0;
    if (i4 != this.gSD)
    {
      for (i7 = this.gSA; i7 < this.gSz; i7++) {
        this.gSu -= (this.gSw[i7] & 0xFF);
      }

      this.gSz = this.gSA;

      if (this.gSD != -1) {
        this.gSw[(this.gSz++)] = 1024;
        this.gSA += 1;
      }

      if (n != 0) {
        i1 = 0;
        for (; i6 < i5; i6++) {
          i7 = arrayOfByte1[(i + 27 + i6)] & 0xFF;
          j += i7;
          k -= i7;
          if (i7 < 255) {
            i6++;
            break;
          }
        }
      }
    }

    if (k != 0) {
      tD(k);
      System.arraycopy(arrayOfByte2, j, this.gSt, this.gSu, k);
      this.gSu += k;
    }

    i7 = -1;
    while (i6 < i5) {
      int i8 = arrayOfByte1[(i + 27 + i6)] & 0xFF;
      this.gSw[this.gSz] = i8;
      this.gSx[this.gSz] = -1L;

      if (i1 != 0) {
        this.gSw[this.gSz] |= 256;
        i1 = 0;
      }

      if (i8 < 255) {
        i7 = this.gSz;
      }
      this.gSz += 1;
      i6++;

      if (i8 < 255) {
        this.gSA = this.gSz;
      }
    }

    if (i7 != -1) {
      this.gSx[i7] = l;
    }

    if ((i2 != 0) && 
      (this.gSz > 0)) {
      this.gSw[(this.gSz - 1)] |= 512;
    }

    this.gSD = (i4 + 1);
    return 0;
  }

  public int xp() {
    this.gSu = 0;
    this.gSv = 0;

    this.gSz = 0;
    this.gSA = 0;
    this.gSB = 0;

    this.gSD = -1;
    this.gSE = 0L;
    return 0;
  }
}