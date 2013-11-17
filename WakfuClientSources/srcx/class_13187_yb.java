import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

public class yb extends Random
  implements Serializable
{
  private static final long serialVersionUID = 2932129847991607657L;
  private static final yb bre = new yb();
  private static final int brf = 624;
  private static final int brg = 397;
  private static final int brh = -1727483681;
  private static final int bri = -2147483648;
  private static final int brj = 2147483647;
  private static final int brk = -1658038656;
  private static final int brl = -272236544;
  private int[] brm;
  private int brn;
  private int[] bro;
  private double brp;
  private boolean brq;

  public yb()
  {
    this(System.currentTimeMillis());
  }

  public yb(long paramLong)
  {
    super(paramLong);
    setSeed(paramLong);
  }

  public yb(int[] paramArrayOfInt)
  {
    super(System.currentTimeMillis());
    h(paramArrayOfInt);
  }

  public synchronized void setSeed(long paramLong)
  {
    super.setSeed(paramLong);

    this.brq = false;

    this.brm = new int[624];

    this.bro = new int[2];
    this.bro[0] = 0;
    this.bro[1] = -1727483681;

    this.brm[0] = ((int)(paramLong & 0xFFFFFFF));
    for (this.brn = 1; this.brn < 624; this.brn += 1) {
      this.brm[this.brn] = (1812433253 * (this.brm[(this.brn - 1)] ^ this.brm[(this.brn - 1)] >>> 30) + this.brn);

      this.brm[this.brn] &= -1;
    }
  }

  public synchronized void h(int[] paramArrayOfInt)
  {
    setSeed(19650218L);
    int i = 1;
    int j = 0;
    for (int k = 624 > paramArrayOfInt.length ? 624 : paramArrayOfInt.length; 
      k != 0; k--) {
      this.brm[i] = ((this.brm[i] ^ (this.brm[(i - 1)] ^ this.brm[(i - 1)] >>> 30) * 1664525) + paramArrayOfInt[j] + j);
      this.brm[i] &= -1;
      i++;
      j++;
      if (i >= 624) {
        this.brm[0] = this.brm[623];
        i = 1;
      }
      if (j >= paramArrayOfInt.length)
        j = 0;
    }
    for (k = 623; k != 0; k--) {
      this.brm[i] = ((this.brm[i] ^ (this.brm[(i - 1)] ^ this.brm[(i - 1)] >>> 30) * 1566083941) - i);
      this.brm[i] &= -1;
      i++;
      if (i >= 624) {
        this.brm[0] = this.brm[623];
        i = 1;
      }
    }
    this.brm[0] = -2147483648;
  }

  protected synchronized int next(int paramInt)
  {
    if (this.brn >= 624)
    {
      for (int j = 0; j < 227; j++) {
        i = this.brm[j] & 0x80000000 | this.brm[(j + 1)] & 0x7FFFFFFF;
        this.brm[j] = (this.brm[(j + 397)] ^ i >>> 1 ^ this.bro[(i & 0x1)]);
      }
      for (; j < 623; j++) {
        i = this.brm[j] & 0x80000000 | this.brm[(j + 1)] & 0x7FFFFFFF;
        this.brm[j] = (this.brm[(j + -227)] ^ i >>> 1 ^ this.bro[(i & 0x1)]);
      }
      i = this.brm[623] & 0x80000000 | this.brm[0] & 0x7FFFFFFF;
      this.brm[623] = (this.brm[396] ^ i >>> 1 ^ this.bro[(i & 0x1)]);

      this.brn = 0;
    }

    int i = this.brm[(this.brn++)];
    i ^= i >>> 11;
    i ^= i << 7 & 0x9D2C5680;
    i ^= i << 15 & 0xEFC60000;
    i ^= i >>> 18;

    return i >>> 32 - paramInt;
  }

  private synchronized void a(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.defaultWriteObject();
  }

  private synchronized void a(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
  }

  public boolean nextBoolean()
  {
    return next(1) != 0;
  }

  public boolean L(float paramFloat)
  {
    if ((paramFloat < 0.0F) || (paramFloat > 1.0F))
      throw new IllegalArgumentException("probability must be between 0.0 and 1.0 inclusive.");
    if (paramFloat == 0.0F)
      return false;
    if (paramFloat == 1.0F)
      return true;
    return nextFloat() < paramFloat;
  }

  public boolean d(double paramDouble)
  {
    if ((paramDouble < 0.0D) || (paramDouble > 1.0D))
      throw new IllegalArgumentException("probability must be between 0.0 and 1.0 inclusive.");
    if (paramDouble == 0.0D)
      return false;
    if (paramDouble == 1.0D)
      return true;
    return nextDouble() < paramDouble;
  }

  public int nextInt(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("n must be >= 0");
    }
    if (paramInt == 0) {
      return 0;
    }
    if ((paramInt & -paramInt) == paramInt)
      return (int)(paramInt * next(31) >> 31); int i;
    int j;
    do {
      i = next(31);
      j = i % paramInt;
    }
    while (i - j + (paramInt - 1) < 0);
    return j;
  }

  public long aU(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("n must be > 0");
    }
    if (paramLong == 0L)
      return 0L; long l1;
    long l2;
    do {
      l1 = nextLong() >>> 1;
      l2 = l1 % paramLong;
    }
    while (l1 - l2 + (paramLong - 1L) < 0L);
    return l2;
  }

  public double nextDouble()
  {
    return ((next(26) << 27) + next(27)) / 9007199254740992.0D;
  }

  public float nextFloat()
  {
    return next(24) / 16777216.0F;
  }

  public void nextBytes(byte[] paramArrayOfByte)
  {
    for (int i = 0; i < paramArrayOfByte.length; i++)
      paramArrayOfByte[i] = ((byte)next(8));
  }

  public char GZ()
  {
    return (char)next(16);
  }

  public short nextShort()
  {
    return (short)next(16);
  }

  public byte nextByte()
  {
    return (byte)next(8);
  }

  public synchronized double nextGaussian()
  {
    if (this.brq) {
      this.brq = false;
      return this.brp; } double d1;
    double d2;
    double d3;
    do { d1 = 2.0D * nextDouble() - 1.0D;
      d2 = 2.0D * nextDouble() - 1.0D;
      d3 = d1 * d1 + d2 * d2; }
    while ((d3 >= 1.0D) || (d3 == 0.0D));
    double d4 = Math.sqrt(-2.0D * Math.log(d3) / d3);
    this.brp = (d2 * d4);
    this.brq = true;
    return d1 * d4;
  }

  public static final synchronized yb Ha()
  {
    return bre;
  }
}