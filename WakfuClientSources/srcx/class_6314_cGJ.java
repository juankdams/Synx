import java.awt.Point;

class cGJ
  implements doN
{
  cGJ(aWd paramaWd)
  {
  }

  public boolean a(cSx paramcSx)
  {
    if (paramcSx.cIl() != this.cvX) {
      return false;
    }

    Point localPoint = aWd.a(this.cvX, (dMr)paramcSx);
    Cs localCs = this.cvX.getTextBuilder().df(localPoint.x, -localPoint.y);
    cDG localcDG = (cDG)localCs.getFirst();
    nh localnh = (nh)localCs.Lp();
    if (localcDG != null) {
      int i = 0;
      switch (Tm.cwe[localnh.ordinal()]) {
      case 1:
      case 2:
        i = 0;
        break;
      case 3:
        i = localcDG.a(this.cvX.getTextBuilder().aFz(), localPoint.x - localcDG.getX() - localcDG.drQ().getX());

        break;
      case 4:
      case 5:
        i = localcDG.aOb();
      }

      this.cvX.c(localcDG, i);
    }

    return true;
  }
}