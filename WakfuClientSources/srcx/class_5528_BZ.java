public class BZ extends bEj
{
  private final il bEy;

  public BZ(il paramil)
  {
    super(paramil);
    this.bEy = paramil;
  }

  public void fl()
  {
    abv();
  }

  public int zY()
  {
    return this.bEy.mtW[this._index];
  }

  public short Lb()
  {
    return this.bEy.aHP[this._index];
  }

  public short C(short paramShort)
  {
    short s = Lb();
    this.bEy.aHP[this._index] = paramShort;
    return s;
  }
}