final class dwd
  implements doN
{
  dwd(bpn parambpn)
  {
  }

  public boolean a(cSx paramcSx)
  {
    dRq localdRq = this.bZI.getContainer();

    clA localclA = this.bZI.getStickData();
    Object localObject = localclA != null ? localclA.cmX() : null;
    int i;
    int j;
    if ((localObject == null) || (localObject == bCo.gwz)) {
      i = bCO.J(this.bZI.getX(), 0, localdRq.getWidth() - this.bZI.getWidth());
      j = bCO.J(this.bZI.getY(), 0, localdRq.getHeight() - this.bZI.getHeight());
    } else {
      i = localObject.a(this.bZI.getX(), this.bZI);
      j = localObject.b(this.bZI.getY(), this.bZI);
    }
    this.bZI.setPosition(i, j);

    return false;
  }
}