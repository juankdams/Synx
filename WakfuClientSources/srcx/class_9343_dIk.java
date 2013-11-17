public class dIk
{
  private final String kd;
  private final int lTi;
  private final int dms;
  private final int dmt;

  public dIk(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    this.kd = paramString;
    this.lTi = paramInt1;
    this.dms = paramInt2;
    this.dmt = paramInt3;
  }

  public String bTI() {
    return this.kd;
  }

  public int dic() {
    return this.lTi;
  }

  public int clZ() {
    return this.dms;
  }

  public int cma() {
    return this.dmt;
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("TravelLoadingInfo");
    localStringBuilder.append("{m_animationName='").append(this.kd).append('\'');
    localStringBuilder.append(", m_minDuration=").append(this.lTi);
    localStringBuilder.append(", m_fadeInDuration=").append(this.dms);
    localStringBuilder.append(", m_fadeOutDuration=").append(this.dmt);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}