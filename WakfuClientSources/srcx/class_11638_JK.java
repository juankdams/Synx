class JK
  implements cvW
{
  private final bNm bUI;

  JK(bNm parambNm)
  {
    this.bUI = parambNm;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 20300:
      a((Eg)paramcWG);
      return false;
    }
    return true;
  }

  private void a(Eg paramEg)
  {
    uh localuh = uh.CL();

    localuh.h(paramEg.MN());
    byv.bFN().a(localuh);

    byv.bFN().b(this);
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }

  public String toString() {
    return "Frame{m_board=" + this.bUI + '}';
  }
}