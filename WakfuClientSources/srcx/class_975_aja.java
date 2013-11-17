final class aja
  implements dyg
{
  private final dxQ dhQ;

  aja(dxQ paramdxQ)
  {
    this.dhQ = paramdxQ;
  }

  public final boolean a(Object paramObject, long paramLong) {
    int i = this.dhQ.index(paramObject);
    if ((i >= 0) && (k(paramLong, this.dhQ.get(paramObject)))) {
      return true;
    }
    return false;
  }

  private final boolean k(long paramLong1, long paramLong2)
  {
    return paramLong1 == paramLong2;
  }
}