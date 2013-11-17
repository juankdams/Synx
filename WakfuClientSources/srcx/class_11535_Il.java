final class Il
  implements diA
{
  private final cyE bQW;

  Il(cyE paramcyE)
  {
    this.bQW = paramcyE;
  }

  public final boolean a(byte paramByte, short paramShort) {
    int i = this.bQW.j(paramByte);
    if ((i >= 0) && (d(paramShort, this.bQW.ea(paramByte)))) {
      return true;
    }
    return false;
  }

  private final boolean d(short paramShort1, short paramShort2)
  {
    return paramShort1 == paramShort2;
  }
}