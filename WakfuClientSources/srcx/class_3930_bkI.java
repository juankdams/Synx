final class bkI
  implements doN
{
  bkI(dqa paramdqa, bpn parambpn, int paramInt)
  {
  }

  public boolean a(cSx paramcSx)
  {
    this.fBe.b(paramcSx.mp(), this, false);
    int i = cyb.cvg().getX() - this.fBe.getX(this.fBf) - this.fBe.getWidth() / 2;
    int j = cyb.cvg().getY() - this.fBe.getY(this.fBf) - this.fBe.getHeight() / 2;
    this.fBf.setPosition(i, j);
    bsP.getInstance().setDragged(this.fBe, this.fBg);
    this.fBe.setDragMousePosition(cyb.cvg().getX(), cyb.cvg().getY());
    return false;
  }
}