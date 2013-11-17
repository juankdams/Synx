class bcL extends cZJ
{
  private static final RY fmS = new RY();
  private dAf fmT;

  bcL()
  {
    super(fmS);
  }

  void a(adG paramadG) {
    super.a(paramadG);
    this.fmT = new dAf();
    this.fmT.L(true);
    this.fmT.a(paramadG.apF());
    Pb.aaU().a(this.fmT);
  }

  void stop() {
    super.stop();
    if (this.fmT != null) {
      this.fmT.L(false);
      this.fmT = null;
    }
  }

  void a(float paramFloat, int paramInt, long paramLong) {
    super.a(paramFloat, paramInt, paramLong);
    if ((paramFloat == 0.0F) && 
      (this.fmT != null)) {
      this.fmT.L(false);
      this.fmT = null;
    }
  }

  void a(adG paramadG, float paramFloat1, float paramFloat2)
  {
    super.a(paramadG, paramFloat1, paramFloat2);
  }

  static
  {
    fmS.crF = 10.0F;
    fmS.crH = 0.05F;
    fmS.crE = 80.0F;
    fmS.crJ = 1.0F;
  }
}