import java.util.Comparator;

final class bRd
  implements Comparator
{
  public int b(Su paramSu1, Su paramSu2)
  {
    int i = paramSu2.uO() - paramSu1.uO();
    if (i < 0)
      return -1;
    if (i > 0)
      return 1;
    return 0;
  }
}