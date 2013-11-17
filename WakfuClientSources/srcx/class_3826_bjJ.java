public class bjJ extends bEj
{
  private final bjI fAh;

  public bjJ(bjI parambjI)
  {
    super(parambjI);
    this.fAh = parambjI;
  }

  public void fl()
  {
    abv();
  }

  public int zY()
  {
    return this.fAh.mtW[this._index];
  }

  public byte Gh()
  {
    return this.fAh.aZY[this._index];
  }

  public byte L(byte paramByte)
  {
    byte b = Gh();
    this.fAh.aZY[this._index] = paramByte;
    return b;
  }
}