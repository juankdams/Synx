public class avJ
  implements dBv
{
  public static final String cTv = "title";
  public static final String aLh = "description";
  public static final String cTw = "link";
  public static final String cTx = "image";
  private final tI dKA;
  private bnC dKB = null;

  public avJ(tI paramtI) {
    this.dKA = paramtI;
    if (paramtI.BX() != null)
      this.dKB = new bnC(paramtI.BX());
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("title"))
      return this.dKA.getTitle();
    if (paramString.equals("description"))
      return bZr.kL(this.dKA.getDescription());
    if (paramString.equals("link"))
      return bZr.kM(this.dKA.getLink());
    if (paramString.equals("image")) {
      return this.dKB;
    }
    return null;
  }

  public tI aHA() {
    return this.dKA;
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