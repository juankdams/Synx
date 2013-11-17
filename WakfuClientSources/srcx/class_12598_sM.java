public class sM extends bEj
{
  private final cTD bbR;

  public sM(cTD paramcTD)
  {
    super(paramcTD);
    this.bbR = paramcTD;
  }

  public void fl()
  {
    abv();
  }

  public int zY()
  {
    return this.bbR.mtW[this._index];
  }

  public float zZ()
  {
    return this.bbR.gBL[this._index];
  }

  public float H(float paramFloat)
  {
    float f = zZ();
    this.bbR.gBL[this._index] = paramFloat;
    return f;
  }
}