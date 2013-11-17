final class bef
  implements dVV
{
  private final cTD fqO;

  bef(cTD paramcTD)
  {
    this.fqO = paramcTD;
  }

  public final boolean h(int paramInt, float paramFloat) {
    int i = this.fqO.uK(paramInt);
    if ((i >= 0) && (v(paramFloat, this.fqO.get(paramInt)))) {
      return true;
    }
    return false;
  }

  private final boolean v(float paramFloat1, float paramFloat2)
  {
    return paramFloat1 == paramFloat2;
  }
}