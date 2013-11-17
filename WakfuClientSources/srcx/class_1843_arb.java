import java.util.Comparator;

final class arb
  implements Comparator
{
  public int compare(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == paramObject2)
      return 0;
    if ((!(paramObject1 instanceof cEz)) || (!(paramObject2 instanceof cEz)))
      return 0;
    return String.CASE_INSENSITIVE_ORDER.compare(((cEz)paramObject1).Dh(), ((cEz)paramObject2).Dh());
  }
}