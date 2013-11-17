class cj
{
  private short Rp;
  private short Rq;
  private short Rr;

  cj(Y paramY)
  {
  }

  cj(Y paramY, short paramShort1, short paramShort2, short paramShort3)
  {
    this.Rp = paramShort1;
    this.Rq = paramShort2;
    this.Rr = paramShort3;
  }

  public short gc() {
    return this.Rp;
  }

  public short gd() {
    return this.Rq;
  }

  public short ge() {
    return this.Rr;
  }
}