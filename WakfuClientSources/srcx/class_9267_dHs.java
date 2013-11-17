final class dHs
  implements dsW
{
  private final dFu lSv;

  dHs(dFu paramdFu)
  {
    this.lSv = paramdFu;
  }

  public final boolean aL(int paramInt1, int paramInt2) {
    int i = this.lSv.uK(paramInt1);
    if ((i >= 0) && (u(paramInt2, this.lSv.get(paramInt1)))) {
      return true;
    }
    return false;
  }

  private final boolean u(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
}