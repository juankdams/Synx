public class cPM extends bLe
{
  private final doA cYH;
  private final byte[] bXg;

  public cPM(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte)
  {
    super(paramInt1, paramInt2, paramInt4, paramInt3);

    uY localuY = (uY)bsj.bAv().kD(bsj.fSj.getId());
    this.cYH = ((doA)localuY.a(SN.aga(), ciQ.ckL()));
    this.bXg = paramArrayOfByte;
  }

  protected void kN()
  {
    this.cYH.q(this.bXg);
    dle localdle = this.cYH.bkf();
    if (localdle == null) {
      return;
    }
    if (!this.cYH.bkM()) {
      return;
    }
    if (localdle.atO() != null) {
      localdle.atO().F(this.cYH);
    }
    this.cYH.oT();
    if (!this.cYH.aug())
      this.cYH.bkz();
  }

  protected void kO()
  {
    this.cYH.cVX();
  }
}