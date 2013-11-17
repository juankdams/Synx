class aRp
  implements Runnable
{
  private int aJy;
  private int aJz;
  private int dZm;
  private byte eOp;

  aRp(buI parambuI)
  {
  }

  public void bO(int paramInt1, int paramInt2)
  {
    this.aJy = paramInt1;
    this.aJz = (paramInt1 + paramInt2);
    this.eOp = nJ(paramInt2);
    this.dZm = this.aJy;

    cpa localcpa = cBQ.cxL().coO().nf("arcadeDungeonDialog");
    cWk localcWk = (cWk)localcpa.fi("score");
    localcWk.setStyle("StyledBold16Dark");
  }

  private byte nJ(int paramInt) {
    return (byte)Math.max(0, String.valueOf(paramInt).length() - 2);
  }

  public boolean azx() {
    return this.dZm >= this.aJz;
  }

  public void run() {
    int i = (int)(Math.pow(10.0D, this.eOp) * 10.0D / 9.0D);
    this.dZm += (this.dZm + i > this.aJz ? this.aJz - this.dZm : i);
    buI.h(this.eOq).uC(this.dZm);
    if (azx())
      finish();
  }

  private void finish() {
    this.eOp = 1;
    dka.cSF().j(this);
    cpa localcpa = cBQ.cxL().coO().nf("arcadeDungeonDialog");
    cWk localcWk = (cWk)localcpa.fi("score");
    localcWk.setStyle("DarkTitle");
  }

  public void nK(int paramInt) {
    this.aJz += paramInt;
    byte b = nJ(this.aJz - this.aJy);
    if (this.eOp < b)
      this.eOp = b;
  }

  public void bhH() {
    buI.h(this.eOq).uC(this.aJz);
    finish();
  }

  public byte bhI() {
    return this.eOp;
  }
}