import java.net.URL;

public class drA extends ig
{
  private final String hi;
  private URL edk = null;
  private dQx hmh = null;

  drA(dQx paramdQx, String paramString) {
    super(dnt.lnw, paramdQx);
    if (paramString != null)
      this.hi = paramString;
    else
      this.hi = "";
  }

  public String getText() {
    return this.hi;
  }

  public URL aSr() {
    return this.edk;
  }

  public boolean cYo() {
    return this.hmh != null;
  }

  public dQx cYp() {
    return new dQx(this.hmh);
  }

  void c(URL paramURL) {
    this.edk = paramURL;
  }

  void c(dQx paramdQx) {
    this.hmh = paramdQx;
  }
}