public class apy extends azj
  implements agk
{
  private static final int dvs = 3;
  private static final float[] dvt = { 1.0F, 1.0F, 1.0F };
  private static final float[] dvu = { 0.35F, 0.35F, 0.35F };
  private static final long dvv = 500L;
  private static final int dvw = 2;
  private UG iM;
  private boolean dvx;
  private final bFH dvy = new bFH();

  public apy()
  {
    super(dvt, dvu, 500L);
  }

  public void e(UG paramUG)
  {
    this.iM = paramUG;

    dUx localdUx = bDk.bLI().cr(paramUG.D());
    this.dvx = ((localdUx != null) && (!localdUx.msd));
  }

  public int getPriority() {
    return 700;
  }

  public boolean wS() {
    return this.dvx;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat) {
    long l = bCO.cM(paramInt1, paramInt2);
    if (this.dvy.N(l)) {
      float f = this.dvy.gA(l);
      paramArrayOfFloat[0] *= Math.min(this.dQy[0] + f, 1.0F);
      paramArrayOfFloat[1] *= Math.min(this.dQy[1] + f, 1.0F);
      paramArrayOfFloat[2] *= Math.min(this.dQy[2] + f, 1.0F);
    }
  }
}