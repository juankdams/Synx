public class sx
{
  public static final sx bbD = new sx();

  private final cSR bbE = new cSR();
  private final cSR bbF = new cSR();

  public void a(dmz paramdmz)
  {
    this.bbE.put(paramdmz.getId(), paramdmz);
    int i = 0; for (int j = paramdmz.size(); i < j; i++)
      this.bbF.put(paramdmz.AK(i), paramdmz);
  }

  public dmz cM(int paramInt)
  {
    return (dmz)this.bbE.get(paramInt);
  }

  public dmz cN(int paramInt) {
    return (dmz)this.bbF.get(paramInt);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AchievementListManager");
    localStringBuilder.append("{m_listsById=").append(this.bbE);
    localStringBuilder.append(", m_listsByAchievementId=").append(this.bbF);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}