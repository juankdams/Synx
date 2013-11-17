public class bnC
  implements dBv
{
  public static final String URL = "url";
  public static final String cTv = "title";
  public static final String cTw = "link";
  private final Wq bev;

  public bnC(Wq paramWq)
  {
    this.bev = paramWq;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("url"))
      return this.bev.getUrl();
    if (paramString.equals("title"))
      return this.bev.getTitle();
    if (paramString.equals("link")) {
      return bZr.kM(this.bev.getLink());
    }
    return null;
  }

  public Wq BX() {
    return this.bev;
  }

  public String[] getFields() {
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }
}