class dAM
  implements doN
{
  dAM(cvx paramcvx)
  {
  }

  public boolean a(cSx paramcSx)
  {
    if (cvx.k(this.ktm)) {
      return false;
    }
    dMr localdMr = (dMr)paramcSx;
    if (paramcSx.cIl() == cvx.g(this.ktm)) {
      cvx.a(this.ktm, localdMr.y(cvx.g(this.ktm)) - cvx.g(this.ktm).getWidth() / 2);
      cvx.b(this.ktm, localdMr.z(cvx.g(this.ktm)) - cvx.g(this.ktm).getHeight() / 2);
    } else if (paramcSx.cIl() == paramcSx.cIk())
    {
      float f = cvx.l(this.ktm) ? 1.0F / cvx.c(this.ktm) + 0.001F : cvx.m(this.ktm);
      if (((cvx.n(this.ktm)) && (localdMr.y((dOc)localdMr.cIl()) < cvx.g(this.ktm).getX())) || ((!cvx.n(this.ktm)) && (localdMr.z((dOc)localdMr.cIl()) < cvx.g(this.ktm).getY())))
      {
        this.ktm.setValue(cvx.b(this.ktm, cvx.a(this.ktm, cvx.o(this.ktm)) - f));
      }
      else this.ktm.setValue(cvx.b(this.ktm, cvx.a(this.ktm, cvx.o(this.ktm)) + f));
    }

    return false;
  }
}