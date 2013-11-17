final class cOn extends Mo
{
  private final amX kwD;

  private cOn(byz parambyz, amX paramamX)
  {
    this.kwD = paramamX;
    this.kwD.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Pas de modification de part ici.");
  }

  public void aT() {
    adz localadz1 = byz.u(this.iZ);
    adz localadz2 = byz.v(this.iZ);
    adz localadz3 = byz.w(this.iZ);

    if (this.kwD.dpJ != null)
      byz.a(this.iZ, new adz(this.kwD.dpJ));
    else {
      byz.a(this.iZ, null);
    }
    if (this.kwD.dpK != null)
      byz.b(this.iZ, new adz(this.kwD.dpK));
    else {
      byz.b(this.iZ, null);
    }
    if (this.kwD.dpL != null)
      byz.c(this.iZ, new adz(this.kwD.dpL));
    else {
      byz.c(this.iZ, null);
    }
    if ((!this.iZ.adF()) && (b(localadz3, byz.w(this.iZ))))
      this.iZ.bGV();
    if ((!this.iZ.adF()) && (b(localadz1, byz.u(this.iZ))))
      this.iZ.bGU();
    if ((!this.iZ.adF()) && (b(localadz2, byz.v(this.iZ))))
      this.iZ.bGS();
  }

  private boolean b(adz paramadz1, adz paramadz2) {
    if (paramadz1 == null)
      return paramadz2 != null;
    return !paramadz1.equals(paramadz2);
  }
}