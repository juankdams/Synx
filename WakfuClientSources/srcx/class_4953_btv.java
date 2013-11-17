public class btv
  implements cvW
{
  private static btv gce = new btv();

  public static final btv bBS()
  {
    return gce;
  }

  public boolean a(cWG paramcWG) {
    byv localbyv = byv.bFN();
    switch (paramcWG.getId()) {
    case 17681:
      if (!localbyv.c(pY.xl())) {
        localbyv.a(pY.xl());
      }
      return false;
    case 17682:
      if (localbyv.c(pY.xl())) {
        localbyv.b(pY.xl());
      }
      return false;
    case 17683:
      if (localbyv.c(pY.xl()))
        localbyv.b(pY.xl());
      else {
        localbyv.a(pY.xl());
      }
      return false;
    }

    return true;
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean);
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean);
  }
}