final class amU
  implements aZf
{
  private final PX dpF;

  amU(PX paramPX)
  {
    this.dpF = paramPX;
  }

  public final boolean g(byte paramByte, int paramInt) {
    int i = this.dpF.j(paramByte);
    if ((i >= 0) && (u(paramInt, this.dpF.ap(paramByte)))) {
      return true;
    }
    return false;
  }

  private final boolean u(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
}