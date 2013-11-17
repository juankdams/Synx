import java.util.Date;

public class cwS extends cji
{
  private int brn;
  private int[] brm = new int[624];
  private static final int brf = 624;
  private static final int brg = 397;
  private static final int brh = -1727483681;
  private static final int bri = -2147483648;
  private static final int brj = 2147483647;
  private static final int brk = -1658038656;
  private static final int brl = -272236544;
  private static final int ijF = 0;
  private static final int ijG = -1727483681;
  public static final int ijH = 4357;

  public cwS()
  {
    this(4357);
  }

  public cwS(int paramInt)
  {
    wX(paramInt);
  }

  public cwS(Date paramDate)
  {
    this((int)paramDate.getTime());
  }

  public Object clone()
  {
    cwS localcwS = (cwS)super.clone();
    localcwS.brm = ((int[])this.brm.clone());
    return localcwS;
  }

  protected void cuk()
  {
    for (int j = 0; j < 227; j++)
    {
      i = this.brm[j] & 0x80000000 | this.brm[(j + 1)] & 0x7FFFFFFF;
      this.brm[j] = (this.brm[(j + 397)] ^ i >>> 1 ^ ((i & 0x1) == 0 ? 0 : -1727483681));
    }
    while (j < 623)
    {
      i = this.brm[j] & 0x80000000 | this.brm[(j + 1)] & 0x7FFFFFFF;
      this.brm[j] = (this.brm[(j + -227)] ^ i >>> 1 ^ ((i & 0x1) == 0 ? 0 : -1727483681));
      j++;
    }
    int i = this.brm[623] & 0x80000000 | this.brm[0] & 0x7FFFFFFF;
    this.brm[623] = (this.brm[396] ^ i >>> 1 ^ ((i & 0x1) == 0 ? 0 : -1727483681));
    this.brn = 0;
  }

  public int nextInt()
  {
    if (this.brn == 624)
      cuk();
    int i = this.brm[(this.brn++)];
    i ^= i >>> 11;
    i ^= i << 7 & 0x9D2C5680;
    i ^= i << 15 & 0xEFC60000;
    i ^= i >>> 18;
    return i;
  }

  protected void wX(int paramInt)
  {
    this.brm[0] = (paramInt & 0xFFFFFFFF);
    for (int i = 1; i < 624; i++)
    {
      this.brm[i] = (1812433253 * (this.brm[(i - 1)] ^ this.brm[(i - 1)] >> 30) + i);
      this.brm[i] &= -1;
    }
    this.brn = 624;
  }
}