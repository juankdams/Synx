public class cqI extends bEj
{
  private final aPF iax;

  public cqI(aPF paramaPF)
  {
    super(paramaPF);
    this.iax = paramaPF;
  }

  public void fl()
  {
    abv();
  }

  public long bic()
  {
    return this.iax.dVd[this._index];
  }

  public byte Gh()
  {
    return this.iax.aZY[this._index];
  }

  public byte L(byte paramByte)
  {
    byte b = Gh();
    this.iax.aZY[this._index] = paramByte;
    return b;
  }
}