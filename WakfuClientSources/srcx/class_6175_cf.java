public class cf
{
  private static final int[] Rg = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
  private int Rh;
  private byte[] buffer;
  private int Ri;
  private int Rj;
  private int Rk;

  public void b(byte[] paramArrayOfByte, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      paramArrayOfByte[i] = ((byte)read(8));
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.Rh = paramInt1;
    this.buffer = paramArrayOfByte;
    this.Ri = (this.Rj = 0);
    this.Rk = paramInt2;
  }

  public int W(int paramInt) {
    int i = Rg[paramInt];

    paramInt += this.Ri;

    if ((this.Rj + 4 >= this.Rk) && 
      (this.Rj + (paramInt - 1) / 8 >= this.Rk)) {
      return -1;
    }

    int j = X(paramInt);
    return i & j;
  }

  private int X(int paramInt) {
    int i = (this.buffer[this.Rh] & 0xFF) >>> this.Ri;
    if (paramInt <= 8) {
      return i;
    }
    i |= (this.buffer[(this.Rh + 1)] & 0xFF) << 8 - this.Ri;
    if (paramInt > 16) {
      i |= (this.buffer[(this.Rh + 2)] & 0xFF) << 16 - this.Ri;
      if (paramInt > 24) {
        i |= (this.buffer[(this.Rh + 3)] & 0xFF) << 24 - this.Ri;
        if ((paramInt > 32) && (this.Ri != 0)) {
          i |= (this.buffer[(this.Rh + 4)] & 0xFF) << 32 - this.Ri;
        }
      }
    }
    return i;
  }

  public void Y(int paramInt)
  {
    paramInt += this.Ri;
    this.Rh += paramInt / 8;
    this.Rj += paramInt / 8;
    this.Ri = (paramInt & 0x7);
  }

  public int read(int paramInt)
  {
    int i = Rg[paramInt];
    int j = paramInt + this.Ri;
    int k = j / 8;

    if ((this.Rj + 4 >= this.Rk) && 
      (this.Rj + (j - 1) / 8 >= this.Rk)) {
      this.Rh += k;
      this.Rj += k;
      this.Ri = (j & 0x7);
      return -1;
    }

    int m = X(j);

    m &= i;

    this.Rh += k;
    this.Rj += k;
    this.Ri = (j & 0x7);
    return m;
  }

  public int fT()
  {
    int i = this.Rj >= this.Rk ? -1 : this.buffer[this.Rh] >> this.Ri & 0x1;

    this.Ri += 1;
    if (this.Ri > 7) {
      this.Ri = 0;
      this.Rh += 1;
      this.Rj += 1;
    }
    return i;
  }
}