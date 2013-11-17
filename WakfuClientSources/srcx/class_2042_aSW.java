public abstract class aSW extends cqy
  implements cBS
{
  public static int eQm = 3;
  private hx eQn;

  protected aSW(dFU[] paramArrayOfdFU)
  {
    super(a(paramArrayOfdFU));
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    T(new bEG(this));
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void f(hx paramhx) {
    this.eQn = paramhx;
  }

  public hx bis() {
    return this.eQn;
  }

  private static dFU[] a(dFU[] paramArrayOfdFU) {
    dFU[] arrayOfdFU1 = { new CN() };

    dFU[] arrayOfdFU2 = new dFU[arrayOfdFU1.length + paramArrayOfdFU.length];
    System.arraycopy(arrayOfdFU1, 0, arrayOfdFU2, 0, arrayOfdFU1.length);
    System.arraycopy(paramArrayOfdFU, 0, arrayOfdFU2, arrayOfdFU1.length, paramArrayOfdFU.length);
    return arrayOfdFU2;
  }
}