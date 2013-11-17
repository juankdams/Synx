import java.util.Comparator;

final class bkW
  implements Comparator
{
  private final int cyp;
  private final int cyq;

  bkW(int paramInt1, int paramInt2)
  {
    this.cyp = paramInt1;
    this.cyq = paramInt2;
  }

  public int c(dle paramdle1, dle paramdle2) {
    int i = paramdle1.ML().eC(this.cyp, this.cyq);
    int j = paramdle2.ML().eC(this.cyp, this.cyq);
    if (i > j)
      return 1;
    if (i < j)
      return -1;
    return 0;
  }
}