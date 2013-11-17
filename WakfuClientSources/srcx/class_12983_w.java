public class w
  implements dQR
{
  private final int aw;
  private final CG ax;
  private final int[] ay;
  private final short az;
  private final short aA;
  private final bZA aB;
  private boolean aC;
  private dIk aD;

  public w(int paramInt1, int paramInt2, int paramInt3, int paramInt4, short paramShort1, CG paramCG, short paramShort2, bZA parambZA)
  {
    this.aw = paramInt1;
    this.ax = paramCG;
    this.ay = new int[] { paramInt2, paramInt3, paramInt4 };
    this.az = paramShort1;
    this.aA = paramShort2;
    this.aB = parambZA;
  }

  public int[] C() {
    return this.ay;
  }

  public short D() {
    return this.az;
  }

  public CG E() {
    return this.ax;
  }

  public int getId() {
    return this.aw;
  }

  public bZA F() {
    return this.aB;
  }

  public short G() {
    return this.aA;
  }

  public void a(dIk paramdIk) {
    this.aC = true;
    this.aD = paramdIk;
  }

  public void a(boolean paramBoolean) {
    this.aC = paramBoolean;
  }

  public boolean H() {
    return this.aC;
  }

  public dIk I() {
    return this.aD;
  }
}