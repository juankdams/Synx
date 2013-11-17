public final class cpP
  implements caI
{
  private final int hYZ;

  public cpP(cZE paramcZE)
  {
    this.hYZ = paramcZE.cMp();
  }

  public void a(short paramShort, long paramLong) {
    bij localbij = cDj.iwy.dv(paramShort);
    localbij.pM(this.hYZ);
  }

  public void b(short paramShort, long paramLong) {
    bij localbij = cDj.iwy.dv(paramShort);
    localbij.pM(-this.hYZ);
  }

  public boolean vW() {
    return false;
  }
}