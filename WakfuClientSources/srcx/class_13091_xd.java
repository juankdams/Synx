public class xd extends bEj
{
  private final dtw bpd;

  public xd(dtw paramdtw)
  {
    super(paramdtw);
    this.bpd = paramdtw;
  }

  public void fl()
  {
    abv();
  }

  public short fm()
  {
    return this.bpd.kOY[this._index];
  }

  public byte Gh()
  {
    return this.bpd.aZY[this._index];
  }

  public byte L(byte paramByte)
  {
    byte b = Gh();
    this.bpd.aZY[this._index] = paramByte;
    return b;
  }
}