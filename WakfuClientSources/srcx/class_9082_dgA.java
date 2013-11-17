import java.util.ArrayList;

public class dgA
  implements dBv
{
  public static final String cTv = "title";
  public static final String aLh = "description";
  public static final String cTw = "link";
  public static final String cTx = "image";
  public static final String etc = "items";
  private czV lbB;
  private bnC dKB;
  private final ArrayList cm = new ArrayList();

  public dgA(czV paramczV) {
    this.lbB = paramczV;
    if (this.lbB.BX() != null) {
      this.dKB = new bnC(this.lbB.BX());
    }
    ArrayList localArrayList = this.lbB.getItems();
    int i = 0; for (int j = localArrayList.size(); i < j; i++)
      this.cm.add(new avJ((tI)localArrayList.get(i)));
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("title"))
      return bZr.as(this.lbB.getLink(), this.lbB.getTitle());
    if (paramString.equals("description"))
      return bZr.kL(this.lbB.getDescription());
    if (paramString.equals("link"))
      return bZr.kM(this.lbB.getLink());
    if (paramString.equals("image"))
      return this.dKB;
    if (paramString.equals("items")) {
      return this.cm;
    }
    return null;
  }

  public czV cPU() {
    return this.lbB;
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