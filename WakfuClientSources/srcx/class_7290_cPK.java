class cPK extends bhb
{
  final short[] kyX;

  cPK(short[] paramArrayOfShort)
  {
    this.kyX = paramArrayOfShort;
  }

  public final int read() {
    return this.kyX[(this.fuZ++)] & 0xFFFF;
  }
}