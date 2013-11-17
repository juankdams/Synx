final class Jn
  implements aGQ
{
  private final il bTa;

  Jn(il paramil)
  {
    this.bTa = paramil;
  }

  public final boolean k(int paramInt, short paramShort) {
    int i = this.bTa.uK(paramInt);
    if ((i >= 0) && (d(paramShort, this.bTa.get(paramInt)))) {
      return true;
    }
    return false;
  }

  private final boolean d(short paramShort1, short paramShort2)
  {
    return paramShort1 == paramShort2;
  }
}