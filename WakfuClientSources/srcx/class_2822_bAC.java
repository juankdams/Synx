import java.util.Comparator;

class bAC
  implements Comparator
{
  bAC(dEh paramdEh)
  {
  }

  public int compare(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 != null) && (paramObject2 != null) && ((paramObject1 instanceof dbV)) && ((paramObject2 instanceof dbV))) {
      dbV localdbV1 = (dbV)paramObject1;
      dbV localdbV2 = (dbV)paramObject2;
      if ((localdbV1.getName() != null) && (localdbV2.getName() != null)) {
        return localdbV1.getName().compareTo(localdbV2.getName());
      }
    }
    return 0;
  }
}