import java.util.ArrayList;

final class djP
  implements aCl
{
  private final ArrayList aBf = new ArrayList();
  private final long aTz;
  private long lgV;
  private int cHZ;
  private String m_name;
  private long gCz;
  private boolean euK;
  private byte lgW;
  private int ie;
  private byte aHn;
  private short aSi;

  djP(long paramLong)
  {
    this.aTz = paramLong;
  }

  public long getId() {
    return this.aTz;
  }

  public int ajD() {
    return this.cHZ;
  }

  public long aOC() {
    return this.lgV;
  }

  public long ayX() {
    return this.gCz;
  }

  public String getName() {
    return this.m_name;
  }

  public boolean isConnected() {
    return this.euK;
  }

  public byte aOD() {
    return this.lgW;
  }

  public byte xK() {
    return this.aHn;
  }

  public short uO() {
    return this.aSi;
  }

  public int bP() {
    return this.ie;
  }

  void hm(int paramInt)
  {
    this.cHZ = paramInt;
    cSB();
  }

  void jJ(long paramLong) {
    this.lgV = paramLong;
    cSB();
  }

  void setName(String paramString) {
    this.m_name = paramString;
    cSB();
  }

  void aM(long paramLong) {
    this.gCz = paramLong;
    cSB();
  }

  void dK(boolean paramBoolean) {
    this.euK = paramBoolean;
    cSB();
  }

  void fb(byte paramByte) {
    this.lgW = paramByte;
    cSB();
  }

  void cO(byte paramByte) {
    this.aHn = paramByte;
    cSB();
  }

  void F(short paramShort) {
    this.aSi = paramShort;
    cSB();
  }

  void dc(int paramInt) {
    this.ie = paramInt;
    cSB();
  }

  private void cSB()
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((bZF)this.aBf.get(i)).c(this);
  }

  public boolean a(bZF parambZF) {
    return (!this.aBf.contains(parambZF)) && (this.aBf.add(parambZF));
  }

  public boolean b(bZF parambZF) {
    return this.aBf.remove(parambZF);
  }

  public String toString()
  {
    return "GuildMemberModel{m_listeners=" + this.aBf + ", m_id=" + this.aTz + ", m_rank=" + this.lgV + ", m_guildPoints=" + this.cHZ + ", m_name='" + this.m_name + '\'' + ", m_xp=" + this.gCz + ", m_connected=" + this.euK + ", m_smiley=" + this.lgW + ", m_nationId=" + this.ie + ", m_sex=" + this.aHn + ", m_breedId=" + this.aSi + '}';
  }
}