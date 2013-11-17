public class Wq
{
  private String m_url;
  private String hh;
  private String beu;

  public Wq(String paramString1, String paramString2, String paramString3)
  {
    this.m_url = paramString1;
    this.hh = paramString2;
    this.beu = paramString3;
  }

  public String getUrl() {
    return this.m_url;
  }

  public void setUrl(String paramString) {
    this.m_url = paramString;
  }

  public String getTitle() {
    return this.hh;
  }

  public void setTitle(String paramString) {
    this.hh = paramString;
  }

  public String getLink() {
    return this.beu;
  }

  public void setLink(String paramString) {
    this.beu = paramString;
  }
}