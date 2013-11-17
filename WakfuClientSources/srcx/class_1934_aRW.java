class aRW
  implements doN
{
  aRW(ddG paramddG)
  {
  }

  public boolean a(cSx paramcSx)
  {
    dMr localdMr = (dMr)paramcSx;
    if ((!ddG.g(this.ePq)) && (ddG.d(this.ePq))) {
      dRR localdRR = ddG.e(this.ePq).getScrollBar();
      Jg localJg = localdRR.getAppearance();
      if (localJg == null) {
        return true;
      }
      if (!localJg.bQ(localdMr.y(localdRR), localdMr.z(localdRR))) {
        ddG.f(this.ePq);
        return true;
      }
    }
    if (ddG.g(this.ePq)) {
      ddG.a(this.ePq, false);
    }
    return false;
  }
}