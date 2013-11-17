public class aSp extends bEj
{
  private final dxa ePC;

  public aSp(dxa paramdxa)
  {
    super(paramdxa);
    this.ePC = paramdxa;
  }

  public void fl()
  {
    abv();
  }

  public long bic()
  {
    return this.ePC.dVd[this._index];
  }

  public long bid()
  {
    return this.ePC.eiO[this._index];
  }

  public long eD(long paramLong)
  {
    long l = bid();
    this.ePC.eiO[this._index] = paramLong;
    return l;
  }
}