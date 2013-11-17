public abstract class dPl
{
  protected final long aTz;
  protected final String m_name;
  protected final short aSi;
  protected final byte aHn;
  protected long aT;
  protected String aQZ;
  protected final cvN mgL;

  protected dPl(long paramLong1, String paramString1, short paramShort, byte paramByte, long paramLong2, String paramString2, cvN paramcvN)
  {
    this.aTz = paramLong1;
    this.m_name = paramString1;
    this.aSi = paramShort;
    this.aHn = paramByte;
    this.aT = paramLong2;
    this.aQZ = paramString2;
    this.mgL = paramcvN;
  }

  public long getId() {
    return this.aTz;
  }

  public String getName() {
    return this.m_name;
  }

  public short uO() {
    return this.aSi;
  }

  public byte xK() {
    return this.aHn;
  }

  public long CD() {
    return this.aT;
  }

  public String uo() {
    return this.aQZ;
  }

  public cvN dqu() {
    return this.mgL;
  }
}