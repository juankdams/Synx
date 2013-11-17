public class aNm extends bEj
{
  private final cyE etu;

  public aNm(cyE paramcyE)
  {
    super(paramcyE);
    this.etu = paramcyE;
  }

  public void fl()
  {
    abv();
  }

  public byte rC()
  {
    return this.etu.dVU[this._index];
  }

  public short Lb()
  {
    return this.etu.aHP[this._index];
  }

  public short C(short paramShort)
  {
    short s = Lb();
    this.etu.aHP[this._index] = paramShort;
    return s;
  }
}