class dH
  implements dUd
{
  dH(bED parambED, Jl paramJl)
  {
  }

  public boolean a(cWG paramcWG)
  {
    Fs localFs = this.Ue.Ta();
    if (localFs == null)
      return false;
    cHu localcHu = localFs.dbH().aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      bKm localbKm = (bKm)CA.Lv().bj(localcHu.bic());
      if (localbKm != null) {
        localbKm.gQ(((dKQ)paramcWG).getTimeStamp());
      }
    }
    return false;
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }
}