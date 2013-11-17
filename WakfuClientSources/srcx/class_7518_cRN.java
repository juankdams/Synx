import java.util.Map;

final class cRN
  implements bZs
{
  private final Map kEg;

  cRN(Map paramMap)
  {
    this.kEg = paramMap;
  }

  public final boolean f(Object paramObject1, Object paramObject2)
  {
    if ((paramObject2 == null) && (!this.kEg.containsKey(paramObject1))) return false;

    Object localObject = this.kEg.get(paramObject1);
    return (localObject == paramObject2) || ((localObject != null) && (localObject.equals(paramObject2)));
  }
}