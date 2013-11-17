public class dyO extends bEj
{
  private final KR lFp;

  public dyO(KR paramKR)
  {
    super(paramKR);
    this.lFp = paramKR;
  }

  public void fl()
  {
    abv();
  }

  public short fm()
  {
    return this.lFp.kOY[this._index];
  }

  public int value()
  {
    return this.lFp.bXB[this._index];
  }

  public int bf(int paramInt)
  {
    int i = value();
    this.lFp.bXB[this._index] = paramInt;
    return i;
  }
}