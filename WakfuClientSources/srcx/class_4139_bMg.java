class bMg
  implements cvW
{
  private final bab gPB;

  bMg(bab parambab)
  {
    this.gPB = parambab;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 20096:
      a((aMo)paramcWG);
      return false;
    }
    return true;
  }

  private void a(aMo paramaMo)
  {
    aOy localaOy = aOy.bfr();
    if (byv.bFN().c(localaOy)) {
      localaOy.a(new anS(paramaMo.arM()));
      localaOy.bft();
    } else {
      localaOy.a(this.gPB);
      localaOy.a(new anS(paramaMo.arM()));
      byv.bFN().a(localaOy);
    }
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }

  public String toString() {
    return "Frame{m_collector=" + this.gPB + '}';
  }
}