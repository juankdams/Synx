public abstract class agY extends crU
{
  protected short[] daX;
  protected short daY;
  private long daZ;

  public long asD()
  {
    return this.daZ;
  }

  public void asE()
  {
    this.daZ -= 1L;
  }

  public void cK(long paramLong) {
    this.daZ = paramLong;
  }

  public void d(short[] paramArrayOfShort) {
    if ((paramArrayOfShort == null) || (paramArrayOfShort.length >= 3))
    {
      this.daX = paramArrayOfShort;
    } else {
      this.daX = new short[3];
      System.arraycopy(paramArrayOfShort, 0, this.daX, 0, paramArrayOfShort.length);
    }
  }

  public void aw(short paramShort) {
    this.daY = paramShort;
  }

  public short[] asF() {
    return this.daX;
  }

  public short asG() {
    return this.daY;
  }
}