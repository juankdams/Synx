public class bnP extends bEj
{
  private final dli fGZ;

  public bnP(dli paramdli)
  {
    super(paramdli);
    this.fGZ = paramdli;
  }

  public void fl()
  {
    abv();
  }

  public long bic()
  {
    return this.fGZ.dVd[this._index];
  }

  public short Lb()
  {
    return this.fGZ.aHP[this._index];
  }

  public short C(short paramShort)
  {
    short s = Lb();
    this.fGZ.aHP[this._index] = paramShort;
    return s;
  }
}