public class jR extends bEj
{
  private final PX aMG;

  public jR(PX paramPX)
  {
    super(paramPX);
    this.aMG = paramPX;
  }

  public void fl()
  {
    abv();
  }

  public byte rC()
  {
    return this.aMG.dVU[this._index];
  }

  public int value()
  {
    return this.aMG.bXB[this._index];
  }

  public int bf(int paramInt)
  {
    int i = value();
    this.aMG.bXB[this._index] = paramInt;
    return i;
  }
}