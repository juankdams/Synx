public class dPT extends cGj
  implements Comparable
{
  public static final String ciu = "iconUrl";
  private int aSg;

  public dPT(int paramInt)
  {
    this.aSg = paramInt;
  }

  public int oc() {
    return this.aSg;
  }

  public String fJ() {
    return ay.bd().a("pointsOfInterestIconPath", "defaultIconPath", new Object[] { Integer.valueOf(this.aSg) });
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("iconUrl")) {
      return fJ();
    }
    return null;
  }

  public int a(dPT paramdPT) {
    return paramdPT.aSg - this.aSg;
  }
}