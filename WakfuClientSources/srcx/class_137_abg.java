import java.util.Comparator;

final class abg
  implements Comparator
{
  public int compare(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == paramObject2)
      return 0;
    if ((!(paramObject1 instanceof cEz)) || (!(paramObject2 instanceof cEz)))
      return 0;
    cEz localcEz1 = (cEz)paramObject1;
    cEz localcEz2 = (cEz)paramObject2;

    cZL localcZL1 = localcEz1.cAe();
    cZL localcZL2 = localcEz2.cAe();
    int i;
    if (localcZL1.hasMark())
      i = localcZL1.kNy - localcEz1.cAh();
    else
      i = 0;
    int j;
    if (localcZL2.hasMark())
      j = localcZL2.kNy - localcEz2.cAh();
    else
      j = 0;
    return i - j;
  }
}