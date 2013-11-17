class dvz
  implements cvW
{
  private final ckG lAO;

  dvz(ckG paramckG)
  {
    this.lAO = paramckG;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 15942:
      a((bsL)paramcWG);
      return false;
    }
    return true;
  }

  private void a(bsL parambsL)
  {
    aFx localaFx = aFx.aRI();
    if (!byv.bFN().c(localaFx)) {
      byv.bFN().a(localaFx);
      localaFx.a(this.lAO);
    }
    localaFx.n(parambsL.ok(), parambsL.nP());
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }

  public String toString() {
    return "Frame{m_seedSpreader=" + this.lAO + '}';
  }
}