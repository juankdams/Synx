public class qb
{
  private byte[] data;
  private int Rk;
  private int fill;
  private int aWL;
  private int aWM;
  private int aWN;
  private int aWO;
  private final Iw aWP = new Iw();
  private final byte[] aWQ = new byte[4];

  public byte[] getData()
  {
    return this.data;
  }

  public int xn() {
    this.data = null;
    return 0;
  }

  public void xo() {
    this.data = null;
    this.Rk = 0;
    this.fill = 0;
    this.aWL = 0;
    this.aWM = 0;
    this.aWN = 0;
    this.aWO = 0;
  }

  public int ce(int paramInt)
  {
    if (this.aWL != 0) {
      this.fill -= this.aWL;
      if (this.fill > 0) {
        System.arraycopy(this.data, this.aWL, this.data, 0, this.fill);
      }
      this.aWL = 0;
    }

    if (paramInt > this.Rk - this.fill)
    {
      int i = paramInt + this.fill + 4096;
      if (this.data != null) {
        byte[] arrayOfByte = new byte[i];

        System.arraycopy(this.data, 0, arrayOfByte, 0, this.data.length);
        this.data = arrayOfByte;
      } else {
        this.data = new byte[i];
      }
      this.Rk = i;
    }

    return this.fill;
  }

  public int cf(int paramInt) {
    if (this.fill + paramInt > this.Rk)
      return -1;
    this.fill += paramInt;
    return 0;
  }

  public int a(Iw paramIw)
  {
    int i = this.aWL;

    int k = this.fill - this.aWL;
    int j;
    if (this.aWN == 0) {
      if (k < 27) {
        return 0;
      }

      if ((this.data[i] != 79) || (this.data[(i + 1)] != 103) || (this.data[(i + 2)] != 103) || (this.data[(i + 3)] != 83))
      {
        this.aWN = 0;
        this.aWO = 0;

        j = 0;
        for (m = 0; m < k - 1; m++) {
          if (this.data[(i + 1 + m)] == 79) {
            j = i + 1 + m;
            break;
          }
        }

        if (j == 0) {
          j = this.fill;
        }
        this.aWL = j;
        return -(j - i);
      }
      int m = (this.data[(i + 26)] & 0xFF) + 27;
      if (k < m) {
        return 0;
      }

      for (int n = 0; n < (this.data[(i + 26)] & 0xFF); n++) {
        this.aWO += (this.data[(i + 27 + n)] & 0xFF);
      }
      this.aWN = m;
    }

    if (this.aWO + this.aWN > k) {
      return 0;
    }

    synchronized (this.aWQ)
    {
      System.arraycopy(this.data, i + 22, this.aWQ, 0, 4);
      this.data[(i + 22)] = 0;
      this.data[(i + 23)] = 0;
      this.data[(i + 24)] = 0;
      this.data[(i + 25)] = 0;

      Iw localIw = this.aWP;
      localIw.bRj = this.data;
      localIw.header = i;
      localIw.bRk = this.aWN;

      localIw.bRl = this.data;
      localIw.bRm = (i + this.aWN);
      localIw.bRn = this.aWO;
      localIw.RS();

      if ((this.aWQ[0] != this.data[(i + 22)]) || (this.aWQ[1] != this.data[(i + 23)]) || (this.aWQ[2] != this.data[(i + 24)]) || (this.aWQ[3] != this.data[(i + 25)]))
      {
        System.arraycopy(this.aWQ, 0, this.data, i + 22, 4);

        this.aWN = 0;
        this.aWO = 0;

        j = 0;
        for (int i1 = 0; i1 < k - 1; i1++) {
          if (this.data[(i + 1 + i1)] == 79) {
            j = i + 1 + i1;
            break;
          }
        }

        if (j == 0)
          j = this.fill;
        this.aWL = j;
        return -(j - i);
      }

    }

    i = this.aWL;

    if (paramIw != null) {
      paramIw.bRj = this.data;
      paramIw.header = i;
      paramIw.bRk = this.aWN;
      paramIw.bRl = this.data;
      paramIw.bRm = (i + this.aWN);
      paramIw.bRn = this.aWO;
    }

    this.aWM = 0;
    this.aWL += (k = this.aWN + this.aWO);
    this.aWN = 0;
    this.aWO = 0;
    return k;
  }

  public int b(Iw paramIw)
  {
    while (true)
    {
      int i = a(paramIw);
      if (i > 0)
      {
        return 1;
      }
      if (i == 0)
      {
        return 0;
      }

      if (this.aWM == 0) {
        this.aWM = 1;
        return -1;
      }
    }
  }

  public int xp()
  {
    this.fill = 0;
    this.aWL = 0;
    this.aWM = 0;
    this.aWN = 0;
    this.aWO = 0;
    return 0;
  }
}