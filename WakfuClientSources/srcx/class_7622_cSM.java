public final class cSM extends bIL
{
  private static final aee aER = new bOO(new cHb());

  protected aee Bq()
  {
    return aER;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    super.a(paramaVc, paramBoolean);
    cIG();
  }

  public void a(aVc paramaVc) {
    super.a(paramaVc);
    this.gIZ = true;
  }

  private void cIG() {
    int i = this.eUw.getX() - this.evo.fa();
    int j = this.eUw.getY() - this.evo.fb();
    CG localCG;
    if ((i > 1) || (i < -1) || (j > 1) || (j < -1))
      localCG = CG.bFM;
    else {
      localCG = CG.T(i, j);
    }
    this.gIX.c(localCG);
  }
}