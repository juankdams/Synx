class hF
{
  private static final float aHg = 0.3F;
  private static final int aHh = 10;
  private static final int aHi = 20;
  private final CG[] aHj = CG.LQ();
  private int aHk;
  private float aHl;
  private int aHm;
  private byte aHn;

  hF(Jd paramJd, byte paramByte)
  {
    this.aHn = paramByte;
    this.aHk = CG.bFH.getIndex();
    Jd.f(paramJd).setDirection(this.aHk);
  }

  public void start() {
    Jd.g(this.iO);
    pF();
  }

  private void pF() {
    this.aHm += 1;
    if (this.aHm == 10) {
      Jd.a(this.iO, this.iO.St(), this.aHn);
    }
    if (this.aHm > 20) {
      Jd.h(this.iO);
      this.aHk = CG.bFH.getIndex();
      Jd.f(this.iO).setDirection(this.aHk);
      Jd.f(this.iO).setAnimName("AnimLevelUp");
      dLE.doY().bk("characterCreation.editablePlayerInfo", "actorDescriptorLibrary");
      dLE.doY().bk("characterCreation.editablePlayerInfo", "actorLinkage");
      return;
    }
    this.aHl += 0.3F;
    int i = bCO.bD(bCO.bF(this.aHl) * 100.0F);
    dka.cSF().a(new bAP(this), i, 1);
  }
}