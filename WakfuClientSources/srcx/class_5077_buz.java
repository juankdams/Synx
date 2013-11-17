public class buz extends bEj
{
  private final dJe gdU;

  public buz(dJe paramdJe)
  {
    super(paramdJe);
    this.gdU = paramdJe;
  }

  public void fl()
  {
    abv();
  }

  public int zY()
  {
    return this.gdU.mtW[this._index];
  }

  public long bid()
  {
    return this.gdU.eiO[this._index];
  }

  public long eD(long paramLong)
  {
    long l = bid();
    this.gdU.eiO[this._index] = paramLong;
    return l;
  }
}