public class bWe extends bEj
{
  private final dUy hit;

  public bWe(dUy paramdUy)
  {
    super(paramdUy);
    this.hit = paramdUy;
  }

  public void fl()
  {
    abv();
  }

  public long bic()
  {
    return this.hit.dVd[this._index];
  }

  public int value()
  {
    return this.hit.bXB[this._index];
  }

  public int bf(int paramInt)
  {
    int i = value();
    this.hit.bXB[this._index] = paramInt;
    return i;
  }
}