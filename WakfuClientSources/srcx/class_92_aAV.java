class aAV extends bGg
{
  private aAV(cer paramcer)
  {
    super(paramcer);
  }

  public final void aMH()
  {
    float f1 = this.gCm[0].floatValue();
    float f2 = this.gCm[1].floatValue();
    btL.gcv.P(f1, f2);
  }

  public final void stop()
  {
    btL.gcv.P(1.0F, 0.0F);
  }

  public final void start()
  {
  }
}