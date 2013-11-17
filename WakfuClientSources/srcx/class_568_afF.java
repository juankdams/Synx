public class afF extends aIN
{
  private doA cYH;
  private final byte[] bXg;

  public afF(int paramInt1, int paramInt2, int paramInt3, int paramInt4, uY paramuY, byte[] paramArrayOfByte)
  {
    super(paramInt1, paramInt2, paramInt4, paramInt3);

    this.cYH = null;
    ckT localckT = mD();
    this.cYH = ((doA)paramuY.a(localckT != null ? localckT.aIq() : null, ciQ.ckL()));

    this.bXg = paramArrayOfByte;
  }

  public long mC()
  {
    if (this.cYH != null)
    {
      if (this.cYH.aIq() == null) {
        ckT localckT = mD();
        if (localckT != null)
          this.cYH.b(localckT.aIq());
        else {
          this.cYH.b(SN.aga());
        }
      }

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
    dle localdle;
    if ((this.cYH.aN()) || (this.cYH.atX()))
      localdle = this.cYH.bke();
    else {
      localdle = this.cYH.bkf();
    }

    if (((this.cYH.bkM()) || (this.cYH.bkL())) && (localdle != null) && ((this.cYH.aug()) || (this.cYH.bkL())))
    {
      if (localdle.atO() != null) {
        localdle.atO().F(this.cYH);
      }
    }
    this.cYH.oT();

    this.cYH.cVX();
  }

  public int are() {
    return this.cYH.getValue();
  }
}