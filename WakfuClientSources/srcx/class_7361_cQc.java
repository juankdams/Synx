import java.util.Comparator;

final class cQc
  implements Comparator
{
  public int a(AS paramAS1, AS paramAS2)
  {
    long l = paramAS2.getDate() - paramAS1.getDate();
    if (l > 0L)
      return 1;
    if (l < 0L) {
      return -1;
    }
    return 0;
  }
}