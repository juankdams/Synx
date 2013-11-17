final class bSu
  implements mJ
{
  private final dxa hdm;

  bSu(dxa paramdxa)
  {
    this.hdm = paramdxa;
  }

  public final boolean a(long paramLong1, long paramLong2) {
    int i = this.hdm.L(paramLong1);
    if ((i >= 0) && (k(paramLong2, this.hdm.gd(paramLong1)))) {
      return true;
    }
    return false;
  }

  private final boolean k(long paramLong1, long paramLong2)
  {
    return paramLong1 == paramLong2;
  }
}