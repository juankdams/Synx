public class tI
{
  private String hh;
  private String beu;
  private String aLm;
  private Wq bev;

  public tI(String paramString1, String paramString2, String paramString3)
  {
    this.hh = paramString1;
    this.beu = paramString2;
    this.aLm = paramString3;
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

  public Wq BX() {
    return this.bev;
  }

  public void a(Wq paramWq) {
    this.bev = paramWq;
  }

  public String getDescription() {
    return this.aLm;
  }

  public void setDescription(String paramString) {
    this.aLm = paramString;
  }
}