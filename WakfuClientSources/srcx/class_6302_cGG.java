import java.awt.Point;

class cGG
  implements doN
{
  cGG(aWd paramaWd)
  {
  }

  public boolean a(cSx paramcSx)
  {
    Point localPoint = aWd.a(this.cvX, (dMr)paramcSx);
    Cs localCs = this.cvX.getTextBuilder().df(localPoint.x, -localPoint.y);
    cDG localcDG = (cDG)localCs.getFirst();
    if (localcDG != null) {
      int i = 0;
      switch (Tm.cwe[((nh)localCs.Lp()).ordinal()]) {
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

      this.cvX.a(localcDG, i);
    }

    return false;
  }
}