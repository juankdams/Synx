final class ait
  implements bPA
{
  private final cSR dex;

  ait(cSR paramcSR)
  {
    this.dex = paramcSR;
  }

  public final boolean c(int paramInt, Object paramObject) {
    int i = this.dex.uK(paramInt);
    if ((i >= 0) && (eq(paramObject, this.dex.get(paramInt)))) {
      return true;
    }
    return false;
  }

  private final boolean eq(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
}