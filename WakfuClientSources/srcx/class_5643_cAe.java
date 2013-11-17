class cAe
{
  private final short aDx;
  private boolean drG;
  private final String m_name;
  private final byte iqb;

  cAe(short paramShort, String paramString, boolean paramBoolean, byte paramByte)
  {
    this.aDx = paramShort;
    this.drG = paramBoolean;
    this.m_name = paramString;
    this.iqb = paramByte;
  }

  public short nc() {
    return this.aDx;
  }

  public String getName() {
    return this.m_name;
  }

  public boolean apR() {
    return this.drG;
  }

  public void cz(boolean paramBoolean) {
    this.drG = paramBoolean;
  }

  public byte cxa() {
    return this.iqb;
  }

  public String toString()
  {
    return "TutorialPart{m_id=" + this.aDx + ", m_activated=" + this.drG + ", m_name='" + this.m_name + '\'' + ", m_eventId=" + this.iqb + '}';
  }
}