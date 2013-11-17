final class dJw
  implements dIy
{
  private final aPF lVf;

  dJw(aPF paramaPF)
  {
    this.lVf = paramaPF;
  }

  public final boolean f(long paramLong, byte paramByte) {
    int i = this.lVf.L(paramLong);
    if ((i >= 0) && (g(paramByte, this.lVf.er(paramLong)))) {
      return true;
    }
    return false;
  }

  private final boolean g(byte paramByte1, byte paramByte2)
  {
    return paramByte1 == paramByte2;
  }
}