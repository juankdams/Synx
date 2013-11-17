final class bVW
  implements eA
{
  private final bPu hhX;

  bVW(bPu parambPu)
  {
    this.hhX = parambPu;
  }

  public final boolean a(short paramShort, Object paramObject) {
    int i = this.hhX.dU(paramShort);
    if ((i >= 0) && (eq(paramObject, this.hhX.cx(paramShort)))) {
      return true;
    }
    return false;
  }

  private final boolean eq(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
}