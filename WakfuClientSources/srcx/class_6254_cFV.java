public class cFV extends azj
  implements agk
{
  public static final float iAW = 1.5F;
  private static final float[] dvt = { 1.0F, 1.0F, 1.0F };
  private static final float[] dvu = { 0.5F, 0.5F, 0.5F };
  private static final long dvv = 500L;
  private static final float iAX = 1.4F;
  private final UG iM;
  private float iAY = 1.0F;
  private final boolean dvx;
  private boolean iAZ;

  public cFV(UG paramUG)
  {
    super(dvt, dvu, 500L);
    this.iM = paramUG;
    dUx localdUx = bDk.bLI().cr(paramUG.D());
    this.dvx = ((localdUx != null) && (!localdUx.msd));
  }

  public void cN(float paramFloat) {
    this.iAY = (0.5F * paramFloat + 0.5F);
  }

  public int getPriority() {
    return 700;
  }

  public boolean wS() {
    return this.dvx;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat) {
    boolean bool = this.iM.ap(paramInt1, paramInt2);
    if ((bool) || (!this.iM.ar(paramInt1, paramInt2))) {
      k(paramArrayOfFloat, (!this.iAZ) && (bool) ? 0.9F : 0.5F);
    }
    else if ((this.iAY != 1.0F) && (this.iM.ay(paramInt1, paramInt2))) {
      k(paramArrayOfFloat, this.iAY);
    }

    float f = btL.gcv.bBZ();
    if (f > 0.0039063F) {
      paramArrayOfFloat[0] *= (1.0F + 0.9F * f);
      paramArrayOfFloat[1] *= (1.0F + 0.9F * f);
      paramArrayOfFloat[2] *= (1.0F + 0.9F * f);
    }
  }

  private void k(float[] paramArrayOfFloat, float paramFloat) {
    paramArrayOfFloat[0] *= paramFloat * this.dQy[0];
    paramArrayOfFloat[1] *= paramFloat * this.dQy[1];
    paramArrayOfFloat[2] *= paramFloat * this.dQy[2];
  }

  public void id(boolean paramBoolean) {
    this.iAZ = paramBoolean;
  }
}