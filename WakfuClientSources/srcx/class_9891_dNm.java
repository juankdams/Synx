import java.util.Comparator;

final class dNm
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
    if ((localcZL1 == null) || (localcZL2 == null))
      return 0;
    return Math.round(localcZL1.cMw() * 100.0F - localcZL2.cMw() * 100.0F);
  }
}