import java.util.ArrayList;

public class czV
{
  private String hh;
  private String beu;
  private String aLm;
  private Wq bev;
  private final ArrayList cm = new ArrayList();

  public czV(String paramString1, String paramString2, String paramString3) {
    this.hh = paramString1;
    this.beu = paramString2;
    this.aLm = paramString3;
  }

  public void setTitle(String paramString) {
    this.hh = paramString;
  }

  public void setLink(String paramString) {
    this.beu = paramString;
  }

  public void setDescription(String paramString) {
    this.aLm = paramString;
  }

  public String getTitle() {
    return this.hh;
  }

  public String getLink() {
    return this.beu;
  }

  public String getDescription() {
    return this.aLm;
  }

  public void a(tI paramtI) {
    this.cm.add(paramtI);
  }

  public ArrayList getItems() {
    return this.cm;
  }

  public Wq BX() {
    return this.bev;
  }

  public void a(Wq paramWq) {
    this.bev = paramWq;
  }
}