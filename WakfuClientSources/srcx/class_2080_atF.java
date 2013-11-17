public class atF extends FB
{
  private final dOc aPS;
  private boolean dFk = true;

  public atF(dOc paramdOc) {
    this.aPS = paramdOc;
  }

  public void i(bSr parambSr)
  {
    dRq localdRq = this.aPS.getContainer();
    if (localdRq == null) {
      return;
    }

    if (this.dFk) {
      if (localdRq.dqh()) {
        this.aPS.setScreenPosition(this.aPS.getScreenX(), this.aPS.getScreenY());
        localdRq.setScreenPosition(localdRq.getScreenX(), localdRq.getScreenY());

        avN localavN1 = localdRq.getScissor(this.aPS);
        cBQ.cxL().cxS().f(localavN1);
        dUq.dup().h(localavN1);
        avN localavN2 = this.aPS.getComputedScissor();
        if (localavN2 != null) {
          cBQ.cxL().cxS().f(localavN2);
          dUq.dup().h(localavN2);
        }
        o(parambSr);
      }
    }
    else if (localdRq.dqh()) {
      this.aPS.setScreenPosition(-1, -1);
      localdRq.setScreenPosition(-1, -1);

      dUq.dup().dus();

      if (this.aPS.getScissor() != null) {
        dUq.dup().dus();
      }
      o(parambSr);
    }

    this.dFk = (!this.dFk);
  }

  private void o(bSr parambSr) {
    avN localavN = dUq.dup().dur();
    if (localavN != null) {
      dsZ localdsZ = dsZ.cZe();
      localdsZ.kt(true);
      localdsZ.I(localavN.getX(), localavN.getY(), localavN.getWidth() + 1, localavN.getHeight() + 1);
    }
  }
}