public abstract class Zx extends cGj
  implements cZZ
{
  public static final String cKW = "maxQuantity";
  public static final String bsS = "quantity";
  public static final String cKX = "quantityRatio";
  public static final String cKY = "currentPlayerQuantity";
  public static final String cKZ = "maxPlayerQuantity";
  public static final String cLa = "totalPlayerQuantity";
  public static final String cLb = "canMax";
  public static final String cLc = "valid";
  public static final String cLd = "editable";
  public static final String cLe = "citizenPoints";
  public static final String cLf = "citizenPointsText";
  private final String[] bF = { "maxQuantity", "quantity", "quantityRatio", "currentPlayerQuantity", "maxPlayerQuantity", "totalPlayerQuantity", "canMax", "valid", "editable", "citizenPoints", "citizenPointsText" };

  private int cLg = 0;

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("currentPlayerQuantity"))
      return Integer.valueOf(akG());
    if (paramString.equals("quantity"))
      return Integer.valueOf(sA());
    if (paramString.equals("maxQuantity"))
      return Integer.valueOf(getMaxQuantity());
    if (paramString.equals("maxPlayerQuantity"))
      return Integer.valueOf(sz());
    if (paramString.equals("quantityRatio"))
      return Float.valueOf(sA() / getMaxQuantity());
    if (paramString.equals("totalPlayerQuantity"))
      return Integer.valueOf(sz());
    if (paramString.equals("canMax"))
      return Boolean.valueOf(akH());
    if (paramString.equals("valid"))
      return Boolean.valueOf(isValid());
    if (paramString.equals("citizenPoints"))
      return Integer.valueOf(0);
    if (paramString.equals("citizenPointsText"))
      return bU.fH().getString("chaos.citizenPointsNeeded", new Object[] { Integer.valueOf(1), Integer.valueOf(50) });
    if (paramString.equals("editable")) {
      return akE();
    }
    return null;
  }

  private Boolean akE() {
    return Boolean.valueOf((tb() > 0) && (akF() > 0));
  }

  private boolean isValid() {
    return (akG() > 0) && (akF() > 0);
  }

  public int tb() {
    return Math.min(akF(), sz());
  }

  public abstract int sz();

  public int akF() {
    return getMaxQuantity() - sA();
  }

  public abstract int getMaxQuantity();

  public abstract int sA();

  public int akG() {
    return this.cLg;
  }

  public void ht(int paramInt) {
    this.cLg = paramInt;
  }

  public boolean akH() {
    return (akG() != getMaxQuantity()) && ((isValid()) || ((akG() == 0) && (akF() > 0) && (tb() > 0)));
  }
}