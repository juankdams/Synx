public class cQB extends bEj
{
  private final rU kBY;

  public cQB(rU paramrU)
  {
    super(paramrU);
    this.kBY = paramrU;
  }

  public void fl()
  {
    abv();
  }

  public byte rC()
  {
    return this.kBY.dVU[this._index];
  }

  public byte Gh()
  {
    return this.kBY.aZY[this._index];
  }

  public byte L(byte paramByte)
  {
    byte b = Gh();
    this.kBY.aZY[this._index] = paramByte;
    return b;
  }
}