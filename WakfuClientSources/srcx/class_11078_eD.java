class eD
  implements doN
{
  eD(bZh parambZh)
  {
  }

  public boolean a(cSx paramcSx)
  {
    dMr localdMr = (dMr)paramcSx;
    if (bZh.b(this.aAS)) {
      if (this.aAS.czl == null) {
        return true;
      }
      if (this.aAS.czl.bQ(localdMr.y(this.aAS), localdMr.z(this.aAS))) {
        return true;
      }

      Jg localJg = bZh.c(this.aAS).getAppearance();
      if (localJg == null) {
        return true;
      }
      if (!localJg.bQ(localdMr.y(bZh.c(this.aAS)), localdMr.z(bZh.c(this.aAS)))) {
        bZh.d(this.aAS);
        return true;
      }
    }

    return false;
  }
}