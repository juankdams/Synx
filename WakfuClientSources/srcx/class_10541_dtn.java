class dtn extends bLe
{
  protected dtn(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected void kN()
  {
    ckT localckT = mD();
    if (localckT == null) {
      return;
    }
    ((czN)localckT).a(dzm.lFK);
    for (Su localSu : localckT.bgG()) {
      if ((localSu instanceof bKm)) {
        cew localcew = localSu.aeL();
        bOJ.a(localcew, localcew.cgZ());
      }
      n(localckT);
    }
  }

  private void n(ckT paramckT) {
    for (Su localSu : paramckT.bgG())
      localSu.aeL().chl();
  }

  protected void kO()
  {
  }
}