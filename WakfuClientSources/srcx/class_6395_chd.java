public class chd extends cGj
{
  public static final String hFp = "isRefItem";
  public static final String hFq = "backgroundStyle";
  private static final String[] bF = { "isRefItem", "backgroundStyle" };
  private gA hFr;

  public chd(gA paramgA)
  {
    this.hFr = paramgA;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("isRefItem"))
      return Boolean.valueOf(true);
    if (paramString.equals("backgroundStyle")) {
      gA localgA = (gA)dLE.doY().br("itemDetail", "equipmentDialog");
      if ((localgA != null) && (this.hFr.ok() == localgA.ok())) {
        return clo.hNa.getStyle();
      }
      return clo.hNc.getStyle();
    }
    return this.hFr.getFieldValue(paramString);
  }

  public gA cjm() {
    return this.hFr;
  }
}