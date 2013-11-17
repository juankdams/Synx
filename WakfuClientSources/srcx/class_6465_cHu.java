public class cHu extends bEj
{
  private final aoL iCw;

  public cHu(aoL paramaoL)
  {
    super(paramaoL);
    this.iCw = paramaoL;
  }

  public void fl()
  {
    abv();
  }

  public long bic()
  {
    return this.iCw.dVd[this._index];
  }

  public Object value()
  {
    return this.iCw.dlG[this._index];
  }

  public Object setValue(Object paramObject)
  {
    Object localObject = value();
    this.iCw.dlG[this._index] = paramObject;
    return localObject;
  }
}