import java.util.Comparator;

final class bQZ
  implements Comparator
{
  public int b(Su paramSu1, Su paramSu2)
  {
    int i = paramSu2.nU() - paramSu1.nU();
    if (i < 0)
      return -1;
    if (i > 0)
      return 1;
    return 0;
  }
}