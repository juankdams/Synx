public final class bHC
  implements caI
{
  private final int dkP;

  public bHC(akh paramakh)
  {
    this.dkP = paramakh.axv();
  }

  public void a(short paramShort, long paramLong) {
    bij localbij = cDj.iwy.dv(paramShort);
    localbij.pN(this.dkP);
  }

  public void b(short paramShort, long paramLong) {
    bij localbij = cDj.iwy.dv(paramShort);
    localbij.pN(0);
  }

  public boolean vW() {
    return false;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PerceptionBonus{");
    localStringBuilder.append("m_perceptionRate=").append(this.dkP);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}