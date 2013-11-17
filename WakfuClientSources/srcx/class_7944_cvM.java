public class cvM extends FB
{
  private final dOc aPS;
  private boolean dFk = true;

  public cvM(dOc paramdOc) {
    this.aPS = paramdOc;
  }

  public void i(bSr parambSr)
  {
    if (this.aPS.getContainer() == null)
      return;
    avN localavN1;
    if (this.dFk)
    {
      localavN1 = avN.m(this.aPS.getScreenX() + this.aPS.getAppearance().getLeftInset(), this.aPS.getScreenY() + this.aPS.getAppearance().getBottomInset(), this.aPS.getAppearance().getContentWidth(), this.aPS.getAppearance().getContentHeight());

      cBQ.cxL().cxS().f(localavN1);
      dUq.dup().h(localavN1);
      avN localavN2 = dUq.dup().dur();
      dsZ.cZe().kt(true);
      dsZ.cZe().I(localavN2.getX(), localavN2.getY(), localavN2.getWidth() + 1, localavN2.getHeight() + 1);
      dsZ.cZe().x(parambSr);
    } else {
      dUq.dup().dus();
      localavN1 = dUq.dup().dur();
      if (localavN1 != null) {
        dsZ.cZe().kt(true);
        dsZ.cZe().I(localavN1.getX(), localavN1.getY(), localavN1.getWidth() + 1, localavN1.getHeight() + 1);
        dsZ.cZe().x(parambSr);
      }
    }
    this.dFk = (!this.dFk);
  }
}