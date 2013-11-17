public class aJp extends bEj
{
  private final dPx ejC;

  public aJp(dPx paramdPx)
  {
    super(paramdPx);
    this.ejC = paramdPx;
  }

  public void fl()
  {
    abv();
  }

  public byte rC()
  {
    return this.ejC.dVU[this._index];
  }

  public Object value()
  {
    return this.ejC.dlG[this._index];
  }

  public Object setValue(Object paramObject)
  {
    Object localObject = value();
    this.ejC.dlG[this._index] = paramObject;
    return localObject;
  }
}