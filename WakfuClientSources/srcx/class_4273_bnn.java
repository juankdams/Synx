public class bnn
{
  public static final long fGb = 86400000L;
  private final int aw;
  private final float fGc;
  private final float cxt;
  private final float aFm;
  private final bZA aB;
  private final int aKS;
  private final short fBU;

  public bnn(int paramInt1, float paramFloat1, float paramFloat2, float paramFloat3, bZA parambZA, int paramInt2, short paramShort)
  {
    this.aw = paramInt1;
    this.fGc = paramFloat1;
    this.cxt = paramFloat2;
    this.aFm = paramFloat3;
    this.aB = parambZA;
    this.aKS = paramInt2;
    this.fBU = paramShort;
  }

  public int getId() {
    return this.aw;
  }

  public float aIQ() {
    return this.fGc;
  }

  public float bxz() {
    return this.cxt;
  }

  public float oy() {
    return this.aFm;
  }

  public bZA F() {
    return this.aB;
  }

  public int getDuration() {
    return this.aKS;
  }

  public short bwc() {
    return this.fBU;
  }
}