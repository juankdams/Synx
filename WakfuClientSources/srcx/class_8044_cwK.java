final class cwK
  implements bhn
{
  private final dPx ijc;

  cwK(dPx paramdPx)
  {
    this.ijc = paramdPx;
  }

  public final boolean b(byte paramByte, Object paramObject) {
    int i = this.ijc.j(paramByte);
    if ((i >= 0) && (eq(paramObject, this.ijc.bf(paramByte)))) {
      return true;
    }
    return false;
  }

  private final boolean eq(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
}