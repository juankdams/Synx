public class dyT
  implements crE
{
  private final String lFt;
  private final String cer;
  private final aZH lFu;
  private String m_url;

  public dyT(String paramString1, String paramString2, String paramString3, aZH paramaZH)
  {
    this.m_url = paramString1;
    this.lFt = paramString2;
    this.cer = paramString3;
    this.lFu = paramaZH;
  }

  public dyT(String paramString) {
    this.m_url = paramString;
    this.lFt = null;
    this.cer = null;
    this.lFu = null;
  }

  public void b(bTp parambTp) {
    if (parambTp.bZP() == awB.dLM) {
      this.m_url = this.lFt;
      this.lFu.x(this.cer, parambTp.bQH());
    }
  }

  public String getUrl() {
    return this.m_url;
  }
}