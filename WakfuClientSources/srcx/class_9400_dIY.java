import java.util.Comparator;

class dIY
  implements Comparator
{
  dIY(cYG paramcYG)
  {
  }

  public int a(boU paramboU1, boU paramboU2)
  {
    dxL localdxL1 = paramboU1.byA();
    dxL localdxL2 = paramboU2.byA();
    if ((localdxL1 == null) || (localdxL2 == null)) {
      return 0;
    }
    if (localdxL1.Q(localdxL2)) {
      return -1;
    }
    return 1;
  }
}