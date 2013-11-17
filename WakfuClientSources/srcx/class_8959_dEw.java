import java.util.ArrayList;

public class dEw extends cGj
{
  public static final String bMU = "categories";
  public static final String bMV = "selectedCategory";
  private final ArrayList hkI = new ArrayList();

  private boolean lNl = true;

  public dEw(aid paramaid) {
    this.hkI.add(new aNf(paramaid, true));
    this.hkI.add(new aNf(paramaid, false));
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("categories"))
      return this.hkI;
    if (paramString.equals("selectedCategory")) {
      return this.lNl ? (aNf)this.hkI.get(0) : (aNf)this.hkI.get(1);
    }

    return null;
  }

  public void setSelected(boolean paramBoolean) {
    this.lNl = paramBoolean;
    dLE.doY().a(this, new String[] { "selectedCategory" });
  }

  public btY I(int paramInt, boolean paramBoolean)
  {
    return ((aNf)this.hkI.get(paramBoolean ? 0 : 1)).nj(paramInt);
  }
}