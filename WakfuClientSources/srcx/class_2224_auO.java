public class auO extends bEj
{
  private final agT dJk;

  public auO(agT paramagT)
  {
    super(paramagT);
    this.dJk = paramagT;
  }

  public void fl()
  {
    abv();
  }

  public short fm()
  {
    return this.dJk.kOY[this._index];
  }

  public short Lb()
  {
    return this.dJk.aHP[this._index];
  }

  public short C(short paramShort)
  {
    short s = Lb();
    this.dJk.aHP[this._index] = paramShort;
    return s;
  }
}