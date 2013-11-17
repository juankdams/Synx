public class dIR extends bxG
{
  private cuB lUq;
  private final CG lUr;
  private final boolean lUs;
  private final dNZ lUt;

  public dIR(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, dNZ paramdNZ, cuB paramcuB, CG paramCG, boolean paramBoolean)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);

    O(paramLong);
    this.lUt = paramdNZ;
    this.lUq = paramcuB;
    this.lUr = paramCG;
    this.lUs = paramBoolean;
  }

  public long mC()
  {
    if (this.lUq == null)
      return 0L;
    Su localSu = dX(gA());

    if (localSu == null) {
      return 0L;
    }
    cew localcew1 = localSu.aeL();
    localcew1.chh();

    cYl localcYl = d(localSu, localcew1);
    int i;
    if ((localcYl != null) && ((localcYl instanceof Su))) {
      cew localcew2 = ((Su)localcYl).aeL();
      localcew2.a(new dRl(this, localSu, localcew1));

      i = localcew2.H("Anim04Porte");
      this.lUq = this.lUq.dM(1, this.lUq.csW());
    } else {
      c(localSu, localcew1);
      i = 0;
    }

    int j = localcew1.caw().b(localcew1, this.lUq.csW()).a(localcew1);
    if ((localSu.cRe() != null) && (((Su)localSu.cRe()).aeL().dpz() == null))
      return 0L;
    int k = i + this.lUq.csW() * j;
    if (this.lUt == dNZ.meA)
      k -= j + 75;
    return k;
  }

  private void c(Su paramSu, cew paramcew) {
    if (this.lUq.csW() == 0) {
      return;
    }
    if (this.lUt == dNZ.mez)
      paramcew.a(bQA.a(true, paramcew, apQ.aBL(), apQ.aBL()));
    if (this.lUt == dNZ.meA) {
      paramcew.a(bQA.a(true, paramcew, cdo.cgl(), cdo.cgl()));
    }
    paramcew.a(this.lUq, true, paramSu.aeQ() == null);
    if (paramSu.adF()) {
      e(paramSu, paramcew);
    }
    if (this.lUs)
      bIR.bQl().aD(paramSu);
  }

  private cYl d(Su paramSu, cew paramcew) {
    cYl localcYl = paramSu.Vl();
    if (localcYl == null) {
      return null;
    }
    int[] arrayOfInt = this.lUq.csY();
    cYk localcYk = new cYk(arrayOfInt[0], arrayOfInt[1], (short)arrayOfInt[2]);

    if ((localcYk.equals(paramSu.ML())) && (this.lUq.csW() > 1)) {
      arrayOfInt = this.lUq.wR(1);
      localcYk.j(arrayOfInt);
    }
    localcYl.m(localcYk);
    aYX.bnY().boa();
    return localcYl;
  }

  private void e(Su paramSu, cew paramcew) {
    dRi localdRi = new dRi(this, paramSu);

    paramcew.b(localdRi);
  }

  private void bH(Su paramSu) {
    if ((paramSu.adL() == byv.bFN().bFO()) && (!paramSu.cQJ()))
      aYX.bnY().boa();
  }

  protected void kO()
  {
    if ((mD() instanceof arl)) {
      ((arl)mD()).a(dX(gA()), null, dNZ.mew);
    }
    Su localSu = dX(gA());

    if (localSu != null)
    {
      localSu.f(this.lUr);
    }
    super.kO();
  }
}