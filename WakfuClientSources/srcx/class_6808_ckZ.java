import java.util.Comparator;

final class ckZ
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
    return localcEz1.cAe().kNy + localcEz1.cAe().kNx - localcEz2.cAe().kNy - localcEz2.cAe().kNx;
  }
}