final class bJp
  implements aXb
{
  private final aIX gKn;

  bJp(aIX paramaIX)
  {
    this.gKn = paramaIX;
  }

  public final boolean f(byte paramByte, long paramLong) {
    int i = this.gKn.j(paramByte);
    if ((i >= 0) && (k(paramLong, this.gKn.bO(paramByte)))) {
      return true;
    }
    return false;
  }

  private final boolean k(long paramLong1, long paramLong2)
  {
    return paramLong1 == paramLong2;
  }
}