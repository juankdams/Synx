public class aRo extends aIN
{
  private final byte[] bXg;
  private final long kD;
  private final long bXh;
  private doA cYH;

  public aRo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, uY paramuY, long paramLong1, long paramLong2, byte[] paramArrayOfByte)
  {
    super(paramInt1, paramInt2, paramInt4, paramInt3);

    this.bXg = paramArrayOfByte;
    this.kD = paramLong2;
    this.bXh = paramLong1;
  }

  public long mC()
  {
    Su localSu = dX(this.kD);
    if ((localSu != null) && (localSu.ayK() != null))
    {
      this.cYH = ((doA)localSu.ayK().kw(this.bXh));
    }

    if (this.cYH != null)
    {
      this.cYH.q(this.bXg);
      if (this.cYH.bkf() != null) {
        O(this.cYH.bkf().getId());
      }
      if (this.cYH.bke() != null) {
        fE(this.cYH.bke().getId());
      }
      this.cYH.bkr();
    }
    return super.mC();
  }

  protected void kO()
  {
    if (this.cYH == null) {
      return;
    }
    if (!this.cYH.bWq()) {
      return;
    }

    if (this.cYH.bkq() != null)
      this.cYH.bkq().G(this.cYH);
    else
      this.cYH.cVX();
  }

  public int are()
  {
    return this.cYH.getValue();
  }
}