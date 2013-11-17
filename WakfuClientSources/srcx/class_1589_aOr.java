public class aOr
{
  private boolean bur;
  private boolean euK;
  private final cYq euL = new cYq(cYq.kLU);
  private final kb euM = new kb(cds.hwQ);

  public void normalize() {
    if (!this.bur) {
      return;
    }
    dxL localdxL = dDE.dft().VN();
    kb localkb = this.euL.V(localdxL);
    if (this.euK)
      this.euM.e(localkb);
    else {
      this.euM.f(localkb);
    }

    if (!this.euM.rN()) {
      this.euM.a(cds.hwQ);
    }
    this.euL.P(localdxL);
  }

  public void dK(boolean paramBoolean) {
    this.euK = paramBoolean;
  }

  public boolean isEnabled() {
    return this.bur;
  }

  public void setEnabled(boolean paramBoolean) {
    this.bur = paramBoolean;
  }

  public void g(cds paramcds) {
    this.euM.a(paramcds);
  }

  public void C(dxL paramdxL) {
    this.euL.P(paramdxL);
  }

  public cds bfb() {
    return this.euM;
  }

  public dxL bfc() {
    return this.euL;
  }

  public void reset() {
    this.bur = false;
    this.euK = false;
    this.euL.P(cYq.kLU);
    this.euM.a(cds.hwQ);
  }

  public String toString()
  {
    return "AntiAddictionDataHandler{m_currentUsedQuota=" + this.euM + ", m_enabled=" + this.bur + ", m_lastConnectionDate=" + this.euL + '}';
  }
}