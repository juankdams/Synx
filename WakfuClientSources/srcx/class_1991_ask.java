public class ask extends act
{
  private static final ask dCe = new ask();

  private boolean cLT = true;

  private ask() {
    super(10, 5, "timerDialog");
  }

  public static ask aEE() {
    return dCe;
  }

  public ask(int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1, paramInt2, "timerDialog" + paramInt3);
  }

  public void hF(int paramInt)
  {
    e(paramInt, dDE.dft().VN());
  }

  public void e(int paramInt, dxL paramdxL) {
    kb localkb1 = paramdxL.V(dDE.dft().VN());
    kb localkb2 = kb.I(paramInt);
    localkb2.f(localkb1);
    if (!localkb2.rN()) {
      return;
    }
    super.hF((int)localkb2.rO());
    this.cLT = false;

    dOc localdOc = (dOc)cBQ.cxL().a(MK(), VV.dJ("timerDialog"), 8193L, (short)10000);

    cwP localcwP = (cwP)localdOc.getLayoutData();
    localcwP.setAlign(ajb.dhR);
    localcwP.setXOffset(30);
    localcwP.setYOffset(-110);
  }

  public void stop()
  {
    this.cLT = true;
    super.stop();
    clean();
  }

  protected void setDuration(int paramInt)
  {
    if (getDuration() == paramInt) {
      return;
    }

    super.setDuration(paramInt);

    if ((!this.cLT) && (paramInt >= 1) && (paramInt <= 5)) {
      aWc.blo().eO(600128L);
    }

    if (paramInt == 0) {
      if (!this.cLT) {
        aWc.blo().eO(600129L);
      }

      clean();
    }
  }

  private void clean() {
    cBQ.cxL().mW(MK());
  }
}