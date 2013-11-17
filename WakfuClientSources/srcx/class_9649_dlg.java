class dlg extends bGg
{
  private aTu liA;
  private String eWF;
  private rp cHC;

  private dlg(bAZ parambAZ)
  {
    super(parambAZ);
  }

  public final void aMH()
  {
    String str = this.gCm[0].stringValue();
    if (!str.equals(this.eWF)) {
      this.liA.dF(str);
      this.eWF = str;
    }
    float f1 = this.gCm[1].floatValue();
    float f2 = this.gCm[2].floatValue();
    float f3 = this.gCm[3].floatValue();
    float f4 = this.gCm[4].floatValue();
    float f5 = this.gCm[5].floatValue();

    this.liA.J(f1, f2);
    this.liA.aV(f3);
    this.liA.aW(f4);
    this.liA.aX(f5);
  }

  public final void stop()
  {
    btL.gcv.b(this.liA);
    this.liA = null;
    this.eWF = null;
  }

  public final void start()
  {
    this.liA = new aTu();
    this.liA.a(this.cHC);
    btL.gcv.a(this.liA);
  }

  public void f(cXf paramcXf)
  {
    super.f(paramcXf);
    this.cHC = paramcXf.cKV();
  }
}