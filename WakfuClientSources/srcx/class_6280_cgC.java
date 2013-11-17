final class cgC
  implements azb
{
  private final dli hEB;

  cgC(dli paramdli)
  {
    this.hEB = paramdli;
  }

  public final boolean b(long paramLong, short paramShort) {
    int i = this.hEB.L(paramLong);
    if ((i >= 0) && (d(paramShort, this.hEB.jK(paramLong)))) {
      return true;
    }
    return false;
  }

  private final boolean d(short paramShort1, short paramShort2)
  {
    return paramShort1 == paramShort2;
  }
}