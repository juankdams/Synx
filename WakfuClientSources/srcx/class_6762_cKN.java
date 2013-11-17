import java.util.LinkedList;

class cKN
  implements ddy
{
  cKN(dJn paramdJn, boolean paramBoolean)
  {
  }

  public void a(cKq paramcKq, byN parambyN)
  {
    switch (cKP.iS[parambyN.ordinal()]) {
    case 1:
      paramcKq.b(this);
      if (this.iaR) {
        dka.cSF().a(new cFS(this), 2500L, 1);
      }
      else if (dJn.b(this.fih).size() > 0) {
        dka.cSF().a(new cFT(this), 2000L, 1);
      }
      else
      {
        if (dJn.c(this.fih) != null) {
          dJn.d(this.fih).getAppearance().c(dJn.c(this.fih));
          dJn.a(this.fih, null);
        }
        dJn.a(this.fih, null);
        dJn.a(this.fih, null);
        dLE.doY().t("splashText", null);
      }
      break;
    }
  }
}