public final class boW
  implements crQ
{
  private static final bTM bRt = new bTM(44225);
  private byte[] fIG;
  private byte[] fIH;

  public bTM HA()
  {
    return bRt;
  }

  public bTM Oz()
  {
    return new bTM(this.fIG == null ? 0 : this.fIG.length);
  }

  public bTM Ox()
  {
    return this.fIH == null ? Oz() : new bTM(this.fIH.length);
  }

  public byte[] Oy()
  {
    return bom.ab(this.fIG);
  }

  public byte[] Ow()
  {
    return this.fIH == null ? Oy() : bom.ab(this.fIH);
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.fIG = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, this.fIG, 0, paramInt2);
  }

  public void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.fIH = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, this.fIH, 0, paramInt2);
    if (this.fIG == null)
      b(paramArrayOfByte, paramInt1, paramInt2);
  }
}