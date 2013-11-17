final class aQz
  implements aAI
{
  private final KR eNk;

  aQz(KR paramKR)
  {
    this.eNk = paramKR;
  }

  public final boolean f(short paramShort, int paramInt) {
    int i = this.eNk.dU(paramShort);
    if ((i >= 0) && (u(paramInt, this.eNk.L(paramShort)))) {
      return true;
    }
    return false;
  }

  private final boolean u(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
}