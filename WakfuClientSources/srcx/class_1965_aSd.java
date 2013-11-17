class aSd
  implements doN
{
  aSd(ddG paramddG)
  {
  }

  public boolean a(cSx paramcSx)
  {
    dMr localdMr = (dMr)paramcSx;
    if (ddG.d(this.ePq)) {
      if (this.ePq.czl == null) {
        return true;
      }
      if (this.ePq.czl.bQ(localdMr.y(this.ePq), localdMr.z(this.ePq))) {
        return true;
      }

      cVL localcVL = ddG.e(this.ePq).getAppearance();
      if (localcVL == null) {
        return true;
      }
      if (!localcVL.bQ(localdMr.y(ddG.e(this.ePq)), localdMr.z(ddG.e(this.ePq)))) {
        ddG.f(this.ePq);
        return true;
      }
    }

    return false;
  }
}