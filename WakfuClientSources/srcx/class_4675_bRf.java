import java.util.Comparator;

final class bRf
  implements Comparator
{
  final Comparator[] hae = { dkh.cSM(), dkh.cSN(), dkh.cSO() };

  public int b(Su paramSu1, Su paramSu2)
  {
    int i = 0;
    int j = 0;
    while ((j == 0) && (i < this.hae.length)) {
      j = this.hae[(i++)].compare(paramSu1, paramSu2);
    }
    return j;
  }
}