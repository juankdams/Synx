class cmo extends agu
{
  private jJ cTD;

  private cmo(cTy paramcTy)
  {
  }

  public void a(ccR paramccR, jJ paramjJ, String paramString)
  {
    aHA.debug("nextItem(item={},itemMrl={})", new Object[] { paramjJ, paramString });
    cnl();
    this.cTD = paramjJ;
    cnk();
  }

  private void cnk()
  {
    aHA.debug("registerMediaEventListener()", new Object[0]);

    if (this.cTD != null) {
      tH localtH = cTy.e(this.diU).m(this.cTD);
      for (dWm localdWm : dWm.values())
        if ((localdWm.intValue() >= dWm.mvv.intValue()) && (localdWm.intValue() <= dWm.mvA.intValue())) {
          aHA.debug("event={}", new Object[] { localdWm });
          int k = cTy.g(this.diU).a(localtH, localdWm.intValue(), cTy.f(this.diU), null);
          aHA.debug("result={}", new Object[] { Integer.valueOf(k) });
        }
    }
  }

  private void cnl()
  {
    aHA.debug("deregisterMediaEventListener()", new Object[0]);

    if (this.cTD != null) {
      tH localtH = cTy.h(this.diU).m(this.cTD);
      for (dWm localdWm : dWm.values()) {
        if ((localdWm.intValue() >= dWm.mvv.intValue()) && (localdWm.intValue() <= dWm.mvA.intValue())) {
          aHA.debug("event={}", new Object[] { localdWm });
          cTy.i(this.diU).b(localtH, localdWm.intValue(), cTy.f(this.diU), null);
        }
      }
      localtH = null;
    }
  }
}