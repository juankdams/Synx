public class Dj extends cqq
  implements Qh
{
  private static Dj bHD = new Dj();

  private Dj() {
    init();
  }

  public static Dj My() {
    return bHD;
  }

  private void init() {
    a(aHr.efc);
  }

  protected xk a(int paramInt1, cdm paramcdm, Object paramObject, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    xk localxk = new xk(paramcdm, paramObject, paramInt2, paramInt3, paramInt4, paramInt5);
    localxk.setIconUrl(ay.bd().a("compassTypePath", "defaultIconPath", new Object[] { Integer.valueOf(paramInt1) }));
    return localxk;
  }

  public void a(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, Object paramObject, aYY paramaYY)
  {
    aHr.efc.setTarget(byv.bFN().bFO().aeL());

    super.a(paramInt1, paramLong, paramInt2, paramInt3, paramInt4, paramObject, paramaYY);
    Su localSu = CA.Lv().bj(paramLong);
    if (localSu != null)
      a(0, localSu.getId(), localSu.aeL());
  }

  public void a(dMM paramdMM)
  {
    if (paramdMM != null)
      a(0, paramdMM.getId(), paramdMM);
  }

  public void b(dMM paramdMM) {
    if (paramdMM != null)
      a(0, paramdMM.getId(), null);
  }

  public void a(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    a(0, paramdMM.getId(), paramInt1, paramInt2, paramShort);
  }
}