public final class auh extends bxG
{
  private static final String cqb = "AnimCueillette-Debut";
  private static final int dGq = 500;
  private boolean bvn;
  private long brC;

  public auh(int paramInt1, int paramInt2, int paramInt3, int paramInt4, cnI paramcnI)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.bvn = paramcnI.IR();
    this.brC = paramcnI.anE();
  }

  protected long mC()
  {
    Object localObject;
    if (this.bvn) {
      localObject = byv.bFN().bFO();
      ((byz)localObject).aeL().eq("AnimCueillette-Debut");
    } else {
      localObject = new aEe(bU.fH().getString("item.lootInFightImpossible.inventoryFull"));
      ((aEe)localObject).mm(3);
      CM.LV().a((aEe)localObject);
    }
    return 500L;
  }

  protected void kO() {
    if (this.bvn) {
      aGt();
      bls localbls = aGs();
      c(localbls);
    }
    super.kO();
  }

  private void c(bls parambls) {
    if (parambls == null)
      return;
    dtY.aU(parambls.getItem());
  }

  private bls aGs() {
    bls localbls = dLf.djM().kG(this.brC);
    byv.bFN().bFO().bGP().ap(localbls.getItem());
    localbls.bwt();
    return localbls;
  }

  private void aGt() {
    String str = aDO.v(byv.bFN().bFO().aeL().ata(), true);
    byv.bFN().bFO().aeL().eq(str);
  }
}