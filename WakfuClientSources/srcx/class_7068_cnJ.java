public class cnJ
  implements we
{
  private Object hUr = new Object();
  private final String m_url;
  private String bde;

  public cnJ(String paramString)
  {
    this.m_url = paramString;
  }

  public void a(String paramString, dqy paramdqy) {
    synchronized (this.hUr) {
      this.bde = paramString;

      bjY.d(new eJ(this, paramString, paramdqy));
    }
  }

  public void a(dqy paramdqy)
  {
    hx.aGS.pz();
  }

  public void clean()
  {
    aiw localaiw = new aiw();
    localaiw.setLocale(bU.fH().ajJ().cAZ());
    byv.bFN().aJK().d(localaiw);
  }

  public void initialize() {
  }

  public String getUrl() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.m_url);
    localStringBuilder.append('?');
    localStringBuilder.append("key=").append(this.bde);
    return localStringBuilder.toString();
  }

  public boolean a(String paramString, Object[] paramArrayOfObject) {
    return false;
  }
}