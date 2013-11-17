import java.util.ArrayList;

public enum bha
  implements dBv
{
  public static final String cXf = "index";
  public static final String bC = "name";
  public static final String fuW = "list";
  public static final String[] bF = { "index", "name", "list" };
  private final String dtk;
  private final int fuX;

  private bha(String arg3, int arg4)
  {
    Object localObject;
    this.dtk = localObject;
    int i;
    this.fuX = i;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("index"))
      return Integer.valueOf(ordinal());
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("list")) {
      ArrayList localArrayList = new ArrayList();
      for (bha localbha : values()) {
        localArrayList.add(localbha.getName());
      }
      return localArrayList;
    }
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

  public int btu() {
    return this.fuX;
  }

  public String getName() {
    return bU.fH().getString(this.dtk);
  }

  public static bha im(String paramString) {
    for (bha localbha : values()) {
      if (localbha.getName().equals(paramString))
        return localbha;
    }
    return null;
  }
}