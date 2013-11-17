import java.util.LinkedList;

public abstract class aym extends cGF
  implements bXd
{
  public final bJS dOd = new bCh(this, this);

  protected LinkedList dOe = new LinkedList();
  protected long dOf;
  protected long iI;
  protected String bSn;
  protected String bax;
  public static final byte[] dOg = new byte[0];

  private final cCH[] dOh = { this.dOd };

  public String ov()
  {
    return "player=" + eq();
  }

  public void a(bxV parambxV) {
    this.dOe.add(parambxV);
  }

  public abstract int a(byte paramByte, aym paramaym);

  public boolean b(bxV parambxV)
  {
    return this.dOe.remove(parambxV);
  }

  public void reset() {
    this.iI = 0L;
    this.bSn = null;
    this.bax = null;
    this.dOf = 0L;
  }

  public byte[] j()
  {
    return a(tn());
  }

  public cCH[] tn() {
    return this.dOh;
  }

  public long eq() {
    return this.iI;
  }

  public void g(long paramLong) {
    this.iI = paramLong;
  }

  public String getName() {
    return this.bSn;
  }

  public void cf(String paramString) {
    this.bSn = paramString;
  }

  public long adv() {
    return this.dOf;
  }

  public void dy(long paramLong) {
    this.dOf = paramLong;
  }

  public String getNickname() {
    return this.bax;
  }

  public void fO(String paramString) {
    this.bax = paramString;
  }

  public String toString() {
    return "CharacterGlobalData{m_clientId=" + this.dOf + ", m_characterId=" + this.iI + ", m_characterName='" + this.bSn + '\'' + ", m_nickname='" + this.bax + '\'' + '}';
  }
}