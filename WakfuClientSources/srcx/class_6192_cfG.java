public class cfG extends cb
{
  cfG()
  {
    super(-1L, "<undefined>", -1L, aUz.eVB, bvi.geZ, new cok());
    aCI().b(this);
  }

  public final boolean R(short paramShort1, short paramShort2) {
    return b(paramShort1, paramShort2);
  }

  public void a(tF paramtF)
  {
    super.a(paramtF);
  }

  public void a(dJN paramdJN) {
    bGO localbGO = h(paramdJN.nx(), paramdJN.ny());
    paramdJN.a(localbGO);
  }

  boolean y(long paramLong, int paramInt) {
    if (paramLong == this.bkK) {
      return true;
    }
    Ka localKa = Ka.fv(paramInt);
    cub localcub = fP();
    dym localdym = localcub.hN(paramLong);
    if (localdym != null) {
      return localdym.a(localKa);
    }
    Xi localXi1 = localcub.b(cuU.ifD);
    if ((byv.bFN().bFO().CD() == CD()) && (localXi1 != null)) {
      return localXi1.a(localKa);
    }
    Xi localXi2 = localcub.b(cuU.ifC);
    return (localXi2 != null) && (localXi2.a(localKa));
  }

  public void release()
  {
    for (aqA localaqA : this.ePu)
      if ((localaqA instanceof dQC)) {
        dQC localdQC = (dQC)localaqA;
        localdQC.release();
      }
  }

  protected void fR()
  {
  }
}