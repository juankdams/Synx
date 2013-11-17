public final class bcD
{
  private final int bgB;
  private final dxL cZH;

  public bcD(int paramInt, dxL paramdxL)
  {
    this.bgB = paramInt;
    this.cZH = paramdxL;
  }

  public int CF() {
    return this.bgB;
  }

  public dxL EQ() {
    return this.cZH;
  }

  public dxL ES() {
    cYq localcYq = new cYq(this.cZH);
    localcYq.n(cjQ.hJX);
    return localcYq;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("HavenWorldAuctionDefinition{");
    localStringBuilder.append("m_havenWorldId=").append(this.bgB);
    localStringBuilder.append(", m_startDate=").append(this.cZH);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}