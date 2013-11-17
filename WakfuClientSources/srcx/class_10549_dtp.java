public class dtp extends bEj
{
  private final cLO lvQ;

  public dtp(cLO paramcLO)
  {
    super(paramcLO);
    this.lvQ = paramcLO;
  }

  public void fl()
  {
    abv();
  }

  public byte rC()
  {
    return this.lvQ.dVU[this._index];
  }

  public float zZ()
  {
    return this.lvQ.gBL[this._index];
  }

  public float H(float paramFloat)
  {
    float f = zZ();
    this.lvQ.gBL[this._index] = paramFloat;
    return f;
  }
}