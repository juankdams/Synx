import java.util.Comparator;

final class bRb
  implements Comparator
{
  public int b(Su paramSu1, Su paramSu2)
  {
    int i = dkh.bA(paramSu2) - dkh.bA(paramSu1);
    if (i < 0)
      return -1;
    if (i > 0)
      return 1;
    return 0;
  }
}