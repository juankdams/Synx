import java.util.Comparator;

class dsz
  implements Comparator
{
  dsz(awY paramawY)
  {
  }

  public int a(apX paramapX1, apX paramapX2)
  {
    int i = paramapX2.bsN() - paramapX1.bsN();
    if (i == 0) {
      return (int)(paramapX2.bsO() - paramapX1.bsO());
    }
    return i;
  }
}