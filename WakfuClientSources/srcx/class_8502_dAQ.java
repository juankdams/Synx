class dAQ
  implements doN
{
  dAQ(cvx paramcvx)
  {
  }

  public boolean a(cSx paramcSx)
  {
    if ((cvx.k(this.ktm)) || (paramcSx.cIl() != cvx.g(this.ktm))) {
      return false;
    }
    dMr localdMr = (dMr)paramcSx;
    int i;
    float f1;
    float f2;
    float f3;
    if (cvx.n(this.ktm)) {
      i = localdMr.y((dOc)localdMr.cIk()) - cvx.p(this.ktm);
      f1 = (int)Math.floor(cvx.g(this.ktm).getWidth() / 2.0D);
      f2 = (int)Math.ceil(cvx.g(this.ktm).getWidth() / 2.0D);
      if (i < f1)
        i = (int)f1;
      else if (i > this.ktm.haN.width - f2) {
        i = this.ktm.haN.width - (int)f2;
      }
      f3 = (i - f1) / (this.ktm.haN.width - cvx.g(this.ktm).getWidth());
      this.ktm.setValue(cvx.b(this.ktm, f3));
    } else {
      i = localdMr.z((dOc)localdMr.cIk()) - cvx.q(this.ktm);
      f1 = (float)Math.floor(cvx.g(this.ktm).getHeight() / 2.0D);
      f2 = (float)Math.ceil(cvx.g(this.ktm).getHeight() / 2.0D);
      if (i < f1)
        i = (int)f1;
      else if (i > this.ktm.haN.height - f2) {
        i = this.ktm.haN.height - (int)f2;
      }
      f3 = (i - f1) / (this.ktm.haN.height - cvx.g(this.ktm).getHeight());
      this.ktm.setValue(cvx.b(this.ktm, f3));
    }

    return true;
  }
}