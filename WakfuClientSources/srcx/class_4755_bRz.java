class bRz extends bGg
  implements agk
{
  private bRz(dza paramdza)
  {
    super(paramdza);
  }

  public final void update(int paramInt)
  {
  }

  public final void aMH()
  {
  }

  public final void stop() {
    btL.gcv.b(this);
  }

  public final void start()
  {
    btL.gcv.a(this);
  }

  public boolean wS() {
    float f1 = this.gCm[0].floatValue();
    float f2 = this.gCm[1].floatValue();
    float f3 = this.gCm[2].floatValue();
    return (byn.S(f1, 1.0F)) && (byn.S(f2, 1.0F)) && (byn.S(f3, 1.0F));
  }

  public int getPriority()
  {
    return 0;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat) {
    float f1 = this.gCm[0].floatValue();
    float f2 = this.gCm[1].floatValue();
    float f3 = this.gCm[2].floatValue();

    paramArrayOfFloat[0] *= f1;
    paramArrayOfFloat[1] *= f2;
    paramArrayOfFloat[2] *= f3;
  }
}