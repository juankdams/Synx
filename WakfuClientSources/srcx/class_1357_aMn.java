public class aMn extends XP
{
  private int eru;

  public aMn(String paramString, long paramLong, int paramInt)
  {
    super(paramString, paramLong);
    this.eru = paramInt;
  }

  public int bdA() {
    return this.eru;
  }

  public String toString()
  {
    return "GuildStorageHistoryMoneyEntry{m_memberName='" + this.cIk + '\'' + ", m_date=" + this.bwF + ", m_amount=" + this.eru + '}';
  }
}