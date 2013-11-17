import java.nio.ShortBuffer;

public final class dUU
{
  public static final dUU mtb = new dUU(new short[] { 0, 1, 2, 3 });

  public static final dUU mtc = new dUU(arrayOfShort);
  public ShortBuffer mtd;
  public ayd mte;
  private final int hEV;

  public dUU(short[] paramArrayOfShort)
  {
    this.hEV = paramArrayOfShort.length;
    this.mte = cJX.cDN().ya(this.hEV * 2);
    this.mtd = ((ShortBuffer)this.mte.getBuffer());
    dvi().put(paramArrayOfShort);
  }

  public int dvg() {
    return this.hEV;
  }

  public int dvh() {
    return this.hEV;
  }

  public ShortBuffer dvi() {
    this.mtd.rewind();
    return this.mtd;
  }

  public void release() {
    this.mte.release();
    this.mtd = null;
  }

  static
  {
    short[] arrayOfShort = new short[32767];
    for (int i = 0; i < arrayOfShort.length; i = (short)(i + 1))
      arrayOfShort[i] = i;
  }
}