public final class fw
{
  public static fw aCz = new fw();

  private final aoL aCA = new aoL();
  private final aoL aCB = new aoL();

  public void A(long paramLong)
  {
    this.aCA.remove(paramLong);
    this.aCB.remove(paramLong);
  }

  public void a(long paramLong, dAo paramdAo) {
    this.aCB.put(paramLong, paramdAo);
  }

  public boolean b(long paramLong, dAo paramdAo) {
    return this.aCB.get(paramLong) == paramdAo;
  }

  public void a(aoL paramaoL) {
    cHu localcHu = paramaoL.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      this.aCA.put(localcHu.bic(), localcHu.value());
    }
  }

  public cYk B(long paramLong) {
    return (cYk)this.aCA.get(paramLong);
  }
}