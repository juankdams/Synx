import java.util.Comparator;

final class kv
  implements Comparator
{
  public int a(Qy paramQy1, Qy paramQy2)
  {
    if (paramQy1 == paramQy2)
      return 0;
    if ((paramQy1.ach()) && (paramQy2.ach()))
      return 0;
    if (paramQy1.ach())
      return 1;
    if (paramQy2.ach()) {
      return -1;
    }
    if (paramQy1.acg() != paramQy2.acg()) {
      return paramQy2.acg() - paramQy1.acg();
    }
    if (paramQy1.bsZ() != paramQy2.bsZ()) {
      return paramQy2.bsZ() - paramQy1.bsZ();
    }
    return paramQy1.getId() <= paramQy2.getId() ? -1 : 1;
  }
}