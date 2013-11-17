public abstract class bjn extends brP
{
  public bjn(bBg parambBg)
  {
    super(parambBg);
  }

  public boolean h(aXL paramaXL) {
    if (paramaXL.isTemporary()) {
      k(paramaXL);
      j(paramaXL);
      i(paramaXL);
    }
    l(paramaXL);
    m(paramaXL);

    return !bzZ();
  }

  protected abstract void i(aXL paramaXL);

  private void j(aXL paramaXL) {
    int i = dGu.b(paramaXL, (bBg)this.fNP);
    if (i > 0)
      b(new dGa(new cbR(paramaXL), i));
  }

  private void k(aXL paramaXL)
  {
    long l = dGu.a(paramaXL, (bBg)this.fNP);
    if (l > 0L)
      b(new aNw(new cbR(paramaXL), l));
  }

  private void l(aXL paramaXL)
  {
    int i = dGu.c(paramaXL, (bBg)this.fNP);
    if (i > 0)
      b(new bee(new cbR(paramaXL), i));
  }

  private void m(aXL paramaXL)
  {
    ajZ localajZ = dGu.d(paramaXL, (bBg)this.fNP);

    localajZ.a(new dFi(this, paramaXL));
  }
}