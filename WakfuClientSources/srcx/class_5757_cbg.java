class cbg
  implements Runnable
{
  private static final byte hsg = 0;
  private static final byte hsh = 1;
  private static final byte hsi = 2;
  private final byte bkM;
  private final float hsj;
  private final float hsk;
  private final int hsl;
  private int cAC;
  private float hsm;

  private cbg(aWc paramaWc, byte paramByte, float paramFloat1, float paramFloat2, int paramInt)
  {
    this.bkM = paramByte;
    this.hsj = paramFloat1;
    this.hsk = paramFloat2;
    this.hsl = paramInt;
  }

  public void run() {
    this.hsm = bCO.s(this.hsj, this.hsk, ++this.cAC / this.hsl);
    switch (this.bkM) {
    case 0:
      cpT.hZb.cpd().aU(this.hsm);
      cpT.hZb.cpc().aU(this.hsm);
      cpT.hZb.cpe().aU(this.hsm);
      break;
    case 1:
      cpT.hZc.cpc().aU(this.hsm);
      cpT.hZc.cpd().aU(this.hsm);
      cpT.hZc.cpe().aU(this.hsm);

      cpT.hZd.cpe().aU(this.hsm);

      cpT.hZh.cpd().aU(this.hsm);
      cpT.hZh.cpe().aU(this.hsm);

      cpT.hZe.cpd().aU(this.hsm);
      cpT.hZe.cpe().aU(this.hsm);

      cpT.hZg.cpd().aU(this.hsm);
      cpT.hZg.cpe().aU(this.hsm);

      cpT.hZj.cpd().aU(this.hsm);
      cpT.hZj.cpe().aU(this.hsm);

      cpT.hZi.cpd().aU(this.hsm);
      cpT.hZi.cpe().aU(this.hsm);
      break;
    case 2:
      cpT.hZf.cpd().aU(this.hsm);
    }

    if (this.cAC == this.hsl)
      switch (this.bkM) {
      case 0:
        aWc.a(this.ejv, null);
        break;
      case 1:
        aWc.b(this.ejv, null);
        break;
      case 2:
        aWc.c(this.ejv, null);
      }
  }
}