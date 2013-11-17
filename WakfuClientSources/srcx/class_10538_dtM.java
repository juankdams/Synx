import java.util.Comparator;

class dtM
  implements Comparator
{
  public int a(cDs paramcDs1, cDs paramcDs2)
  {
    MD localMD1 = bnp.qn(paramcDs1.bqQ());
    MD localMD2 = bnp.qn(paramcDs2.bqQ());

    if (localMD1.getX() == 0) {
      return 1;
    }

    if (localMD2.getX() == 0) {
      return -1;
    }

    if (localMD1.getY() == localMD2.getY()) {
      return localMD1.getX() - localMD2.getX();
    }

    return localMD1.getY() - localMD2.getY();
  }
}