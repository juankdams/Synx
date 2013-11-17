public class bM extends bEj
{
  private final bPu kX;

  public bM(bPu parambPu)
  {
    super(parambPu);
    this.kX = parambPu;
  }

  public void fl()
  {
    abv();
  }

  public short fm()
  {
    return this.kX.kOY[this._index];
  }

  public Object value()
  {
    return this.kX.dlG[this._index];
  }

  public Object setValue(Object paramObject)
  {
    Object localObject = value();
    this.kX.dlG[this._index] = paramObject;
    return localObject;
  }
}