public class aso extends bEj
{
  private final dFu dCh;

  public aso(dFu paramdFu)
  {
    super(paramdFu);
    this.dCh = paramdFu;
  }

  public void fl()
  {
    abv();
  }

  public int zY()
  {
    return this.dCh.mtW[this._index];
  }

  public int value()
  {
    return this.dCh.bXB[this._index];
  }

  public int bf(int paramInt)
  {
    int i = value();
    this.dCh.bXB[this._index] = paramInt;
    return i;
  }
}