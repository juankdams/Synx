class Lw extends bhb
{
  final byte[] bFC;

  Lw(byte[] paramArrayOfByte)
  {
    this.bFC = paramArrayOfByte;
  }

  public final int read() {
    return this.bFC[(this.fuZ++)] & 0xFF;
  }
}