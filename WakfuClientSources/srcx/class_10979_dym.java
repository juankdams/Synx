public class dym
{
  private long aTz;
  private String m_name;
  private byte cHs;

  dym()
  {
  }

  public dym(long paramLong, String paramString)
  {
    this.aTz = paramLong;
    this.m_name = paramString;
  }

  public long getId() {
    return this.aTz;
  }

  public String getName() {
    return this.m_name;
  }

  public boolean a(Ka paramKa) {
    return (this.cHs & paramKa.bWp) == paramKa.bWp;
  }

  public void b(Ka paramKa) {
    this.cHs = ((byte)(this.cHs | paramKa.bWp));
  }

  public void c(Ka paramKa) {
    this.cHs = ((byte)(this.cHs & (paramKa.bWp ^ 0xFFFFFFFF)));
  }

  public void a(aYL paramaYL) {
    paramaYL.bIa = this.aTz;
    paramaYL.userName = this.m_name;
    paramaYL.bHk = this.cHs;
  }

  public void b(aYL paramaYL) {
    this.aTz = paramaYL.bIa;
    this.m_name = paramaYL.userName;
    this.cHs = paramaYL.bHk;
  }
}