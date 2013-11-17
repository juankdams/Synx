public final class cNr
  implements wz
{
  private long ksO;
  private long ksP;

  public int getType()
  {
    return 1;
  }

  public void aN(long paramLong) {
    this.ksO = paramLong;
  }

  public boolean FC() {
    return this.ksP >= this.ksO;
  }

  public void a(kH paramkH) {
    paramkH.type = getType();
    paramkH.aOw = this.ksO;
    paramkH.count = this.ksP;
  }

  public void b(kH paramkH) {
    this.ksO = paramkH.aOw;
    this.ksP = paramkH.count;
  }

  public void cFS() {
    this.ksP += 1L;
  }

  public String toString()
  {
    return "FightLimitedRentInfo{m_durationInFights=" + this.ksO + ", m_fightCount=" + this.ksP + '}';
  }

  public long cFT()
  {
    return Math.max(0L, this.ksO - this.ksP);
  }
}