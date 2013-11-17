final class bFQ
  implements aCq
{
  private final dJe gBP;

  bFQ(dJe paramdJe)
  {
    this.gBP = paramdJe;
  }

  public final boolean f(int paramInt, long paramLong) {
    int i = this.gBP.uK(paramInt);
    if ((i >= 0) && (k(paramLong, this.gBP.get(paramInt)))) {
      return true;
    }
    return false;
  }

  private final boolean k(long paramLong1, long paramLong2)
  {
    return paramLong1 == paramLong2;
  }
}