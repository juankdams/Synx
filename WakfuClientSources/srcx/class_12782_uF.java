final class uF
  implements bhG
{
  private final aoL biE;

  uF(aoL paramaoL)
  {
    this.biE = paramaoL;
  }

  public final boolean a(long paramLong, Object paramObject) {
    int i = this.biE.L(paramLong);
    if ((i >= 0) && (eq(paramObject, this.biE.get(paramLong)))) {
      return true;
    }
    return false;
  }

  private final boolean eq(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
}