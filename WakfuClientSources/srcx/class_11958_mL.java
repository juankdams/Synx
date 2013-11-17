final class mL
  implements ok
{
  private final agT aRh;

  mL(agT paramagT)
  {
    this.aRh = paramagT;
  }

  public final boolean c(short paramShort1, short paramShort2) {
    int i = this.aRh.dU(paramShort1);
    if ((i >= 0) && (d(paramShort2, this.aRh.au(paramShort1)))) {
      return true;
    }
    return false;
  }

  private final boolean d(short paramShort1, short paramShort2)
  {
    return paramShort1 == paramShort2;
  }
}