public class bGW
  implements bMG
{
  protected long aT;
  private long dUK;
  private short cZu;
  private String m_name;

  public aCl ay(long paramLong)
  {
    throw new UnsupportedOperationException("On n'est pas censé récupérer des membres de guilde d'un remote");
  }

  public aUJ az(long paramLong) {
    throw new UnsupportedOperationException("On n'est pas censé récupérer des rangs de guilde d'un remote");
  }

  public long CE() {
    throw new UnsupportedOperationException("On n'est pas censé récupérer le best rank d'un remote");
  }

  public int CF() {
    throw new UnsupportedOperationException("On n'est pas censé récupérer l'id de HM d'un remote");
  }

  public long CD() {
    return this.aT;
  }

  public void eC(long paramLong) {
    this.aT = paramLong;
  }

  public long CH() {
    return this.dUK;
  }

  public void dI(long paramLong) {
    this.dUK = paramLong;
  }

  public String getName() {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public void aQ(short paramShort) {
    this.cZu = paramShort;
  }

  public short nU() {
    return this.cZu;
  }

  public adz xf() {
    throw new UnsupportedOperationException("On n'est pas censé récupérer les bonus d'un remote");
  }

  public void clear() {
    this.aT = 0L;
    this.dUK = 0L;
    this.cZu = 0;
    this.m_name = "";
  }

  public String toString()
  {
    return "GuildRemoteInformationHandler{m_guildId=" + this.aT + ", m_blazon=" + this.dUK + ", m_level=" + this.cZu + ", m_name='" + this.m_name + '\'' + '}';
  }
}