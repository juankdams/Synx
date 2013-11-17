import java.awt.Rectangle;

class dHY extends FB
{
  private boolean dFk = true;

  private dHY(dad paramdad)
  {
  }

  public void i(bSr parambSr)
  {
    avN localavN1;
    if (this.dFk)
    {
      dad.d(this.bgw).setScreenPosition(dad.d(this.bgw).getScreenX(), dad.d(this.bgw).getScreenY());

      localavN1 = dad.d(this.bgw).getScissor(null);
      localavN1.setSize(dad.l(this.bgw).getSize());
      localavN1.setLocation(localavN1.getX(), (int)(localavN1.getY() + dad.u(this.bgw)));
      cBQ.cxL().cxS().f(localavN1);
      dUq.dup().h(localavN1);
      avN localavN2 = dUq.dup().dur();
      dsZ.cZe().kt(true);
      dsZ.cZe().I(localavN2.getX(), localavN2.getY(), localavN2.getWidth() + 1, localavN2.getHeight() + 1);
    } else {
      dad.d(this.bgw).setScreenPosition(-1, -1);
      dUq.dup().dus();
      localavN1 = dUq.dup().dur();
      if (localavN1 != null) {
        dsZ.cZe().kt(true);
        dsZ.cZe().I(localavN1.getX(), localavN1.getY(), localavN1.getWidth() + 1, localavN1.getHeight() + 1);
      }
    }
    this.dFk = (!this.dFk);
  }
}