public class dmn extends bEj
{
  private final cSR lkc;

  public dmn(cSR paramcSR)
  {
    super(paramcSR);
    this.lkc = paramcSR;
  }

  public void fl()
  {
    abv();
  }

  public int zY()
  {
    return this.lkc.mtW[this._index];
  }

  public Object value()
  {
    return this.lkc.dlG[this._index];
  }

  public Object setValue(Object paramObject)
  {
    Object localObject = value();
    this.lkc.dlG[this._index] = paramObject;
    return localObject;
  }
}