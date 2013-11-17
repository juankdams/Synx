class cCl
  implements dCS
{
  cCl(dGW paramdGW, bpn parambpn)
  {
  }

  public void pL()
  {
    cpa localcpa = cBQ.cxL().coO().nf("equipmentDialog");
    if (localcpa == null) {
      return;
    }
    bpn localbpn = (bpn)localcpa.fi("equipInventWindow");
    float f = cBQ.cxL().cxS().MH();
    int i = localbpn.getX();
    int j;
    if (i + localbpn.getWidth() + this.aHA.getWidth() < f)
      j = (int)bCO.t(i + localbpn.getWidth() + 20, 0.0F, f - this.aHA.getWidth());
    else {
      j = (int)bCO.t(i - this.aHA.getWidth() - 20, 0.0F, f - this.aHA.getWidth());
    }
    this.aHA.setX(j);
    this.aHA.b(this);
  }
}