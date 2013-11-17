public class aAa
  implements agk
{
  private float bOZ;
  private float bPa;
  private float bPb;
  private boolean dvx;

  public void update(int paramInt)
  {
  }

  public void l(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.bOZ = paramFloat1;
    this.bPa = paramFloat2;
    this.bPb = paramFloat3;
    this.dvx = ((byn.S(this.bOZ, 0.0F)) && (byn.S(this.bPa, 0.0F)) && (byn.S(this.bPb, 0.0F)));
  }

  public int getPriority() {
    return 500;
  }

  public boolean wS() {
    return this.dvx;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat) {
    paramArrayOfFloat[0] += this.bOZ;
    paramArrayOfFloat[1] += this.bPa;
    paramArrayOfFloat[2] += this.bPb;
  }
}