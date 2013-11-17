import java.util.ArrayList;

class cNN extends amp
{
  private cNN(cvx paramcvx)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq) {
    return new Or(0, 0);
  }

  public Or getContentPreferedSize(dRq paramdRq) {
    return new Or(0, 0);
  }

  public void a(dRq paramdRq)
  {
    if (cvx.a(this.ktm))
    {
      cvx.a(this.ktm, false);
    }

    if (cvx.b(this.ktm))
    {
      while (cvx.c(this.ktm) < cvx.d(this.ktm).size()) {
        ((czv)cvx.d(this.ktm).remove(cvx.c(this.ktm))).beH();
      }

      if (cvx.c(this.ktm) > cvx.d(this.ktm).size())
      {
        czv localczv;
        if (cvx.d(this.ktm).size() == 0) {
          localczv = new czv();
          localczv.aJ();
          localczv.setNonBlocking(true);
          localczv.setModulationColor(cvx.e(this.ktm));
          localczv.a(cvx.f(this.ktm).beO());
          a(localczv);
          cvx.d(this.ktm).add(localczv);
        }

        while (cvx.c(this.ktm) > cvx.d(this.ktm).size()) {
          localczv = (czv)((czv)cvx.d(this.ktm).get(0)).beO();
          a(localczv);
          cvx.d(this.ktm).add(localczv);
        }

        this.ktm.h(cvx.g(this.ktm));
        a(cvx.g(this.ktm));
      }
      cvx.h(this.ktm);
      cvx.b(this.ktm, false);
    }

    if (cvx.i(this.ktm)) {
      this.ktm.ctl();
    }

    if (cvx.j(this.ktm)) {
      this.ktm.ctm();
      cvx.h(this.ktm);
    }
  }
}