import java.util.ArrayList;

public class aPU
  implements dBv
{
  public static final String bsS = "quantity";
  public static final String eMS = "enabled";
  public static final String eMT = "selected";
  private final bCe bsX;
  public static final String[] bF = { "quantity" };
  private boolean bur;
  private boolean dBi;

  public aPU(bCe parambCe, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.bsX = parambCe;
    this.bur = paramBoolean1;
    this.dBi = paramBoolean2;
  }

  public static Object[] toArray() {
    ArrayList localArrayList = new ArrayList();
    for (bCe localbCe : bCe.values()) {
      localArrayList.add(c(localbCe));
    }
    return localArrayList.toArray();
  }

  public static String c(bCe parambCe) {
    return "x" + parambCe.goO;
  }

  public bCe Hy() {
    return this.bsX;
  }

  public short nP() {
    return this.bsX.goO;
  }

  public void setSelected(boolean paramBoolean) {
    this.dBi = paramBoolean;
  }

  public String toString() {
    return "x" + nP();
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("quantity"))
      return Short.valueOf(this.bsX.goO);
    if (paramString.equals("enabled"))
      return Boolean.valueOf(this.bur);
    if (paramString.equals("selected")) {
      return Boolean.valueOf(this.dBi);
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
}