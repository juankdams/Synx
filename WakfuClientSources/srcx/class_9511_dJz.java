public class dJz extends XP
{
  private int aPq;
  private short aFe;
  private dnm lVh;

  public dJz(String paramString, long paramLong, int paramInt, short paramShort, dnm paramdnm)
  {
    super(paramString, paramLong);
    this.aPq = paramInt;
    this.aFe = paramShort;
    this.lVh = paramdnm;
  }

  public dJz() {
  }

  public int tc() {
    return this.aPq;
  }

  public short nP() {
    return this.aFe;
  }

  public dnm diS() {
    return this.lVh;
  }

  public String toString()
  {
    return "GuildStorageHistoryItemEntry{m_memberName='" + this.cIk + '\'' + ", m_date=" + this.bwF + ", m_refId=" + this.aPq + ", m_quantity=" + this.aFe + '}';
  }
}