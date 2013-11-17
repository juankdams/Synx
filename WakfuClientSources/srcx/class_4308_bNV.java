import java.util.Comparator;

final class bNV
  implements Comparator
{
  public int a(cxg paramcxg1, cxg paramcxg2)
  {
    if (paramcxg1 == paramcxg2) {
      return 0;
    }
    if (paramcxg1 == null) {
      return 1;
    }
    if (paramcxg2 == null) {
      return -1;
    }
    return Integer.signum(cxg.d(paramcxg2) - cxg.d(paramcxg1));
  }
}