final class iZ
  implements dOg
{
  private final cYR aJN;

  iZ(cYR paramcYR)
  {
    this.aJN = paramcYR;
  }

  public final boolean a(Object paramObject, int paramInt) {
    int i = this.aJN.index(paramObject);
    if ((i >= 0) && (u(paramInt, this.aJN.get(paramObject)))) {
      return true;
    }
    return false;
  }

  private final boolean u(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
}