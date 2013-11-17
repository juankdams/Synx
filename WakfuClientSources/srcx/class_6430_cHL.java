public class cHL extends bEj
{
  private final aIX iCS;

  public cHL(aIX paramaIX)
  {
    super(paramaIX);
    this.iCS = paramaIX;
  }

  public void fl()
  {
    abv();
  }

  public byte rC()
  {
    return this.iCS.dVU[this._index];
  }

  public long bid()
  {
    return this.iCS.eiO[this._index];
  }

  public long eD(long paramLong)
  {
    long l = bid();
    this.iCS.eiO[this._index] = paramLong;
    return l;
  }
}