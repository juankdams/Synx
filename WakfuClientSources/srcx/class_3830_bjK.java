class bjK extends csA
{
  bjK(oG paramoG)
  {
  }

  public boolean a(cSx paramcSx)
  {
    if ((paramcSx.cIl() == null) || (!(paramcSx.cIl() instanceof dOc))) {
      return true;
    }
    dOc localdOc = (dOc)paramcSx.cIl();
    if ((localdOc == bsP.getInstance()) || ((localdOc != null) && (localdOc.isNonBlocking()))) {
      return true;
    }

    byv.bFN().b(this.fAi);
    return false;
  }
}