public class cik extends bEj
{
  private final bFH hHc;

  public cik(bFH parambFH)
  {
    super(parambFH);
    this.hHc = parambFH;
  }

  public void fl()
  {
    abv();
  }

  public long bic()
  {
    return this.hHc.dVd[this._index];
  }

  public float zZ()
  {
    return this.hHc.gBL[this._index];
  }

  public float H(float paramFloat)
  {
    float f = zZ();
    this.hHc.gBL[this._index] = paramFloat;
    return f;
  }
}