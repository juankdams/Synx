public class dhD extends CU
{
  private final int dah;
  private final int dai;
  private dIk aD;

  public dhD(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramLong, paramInt1);
    this.dah = paramInt2;
    this.dai = paramInt3;
  }

  public dhD(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, dFN paramdFN) {
    super(paramLong, paramInt1, paramInt4, paramdFN);
    this.dah = paramInt2;
    this.dai = paramInt3;
  }

  public int arR() {
    return this.dah;
  }

  public int arS() {
    return this.dai;
  }

  public void b(dIk paramdIk) {
    this.aD = paramdIk;
  }

  public boolean H() {
    return (this.aD != null) && (!dzp.qF(this.aD.bTI()));
  }

  public dIk I() {
    return this.aD;
  }

  public String toString()
  {
    return "DragoInfo{m_exitX=" + this.dah + ", m_exitY=" + this.dai + ", m_loading=" + this.aD + '}';
  }
}