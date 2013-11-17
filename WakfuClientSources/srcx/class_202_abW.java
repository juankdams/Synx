public final class abW
  implements wz
{
  private long cQG;
  private cYq cQH;
  private kb cQI;

  public int getType()
  {
    return 2;
  }

  public void aN(long paramLong) {
    this.cQG = paramLong;
    this.cQI = kb.J(this.cQG);
  }

  public boolean FC() {
    cYq localcYq = dDE.dft().bcF();
    localcYq.o(this.cQI);
    return localcYq.S(this.cQH);
  }

  public void a(kH paramkH) {
    paramkH.type = getType();
    paramkH.aOw = this.cQG;
    paramkH.count = this.cQH.rP();
  }

  public void b(kH paramkH) {
    this.cQG = paramkH.aOw;
    this.cQI = kb.J(this.cQG);
    this.cQH = cYq.jq(paramkH.count);
  }

  public void a(cYq paramcYq) {
    this.cQH = paramcYq;
  }

  public String toString()
  {
    return "TimeLimitedRentInfo{m_rentDuration=" + this.cQG + ", m_buyDate=" + this.cQH + '}';
  }

  public kb aoh()
  {
    cYq localcYq1 = dDE.dft().bcF();
    cYq localcYq2 = new cYq(this.cQH).n(this.cQI);

    return localcYq1.V(localcYq2);
  }
}