import java.util.Comparator;

final class drK
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
    return localcEz1.cAb() - localcEz2.cAb();
  }
}