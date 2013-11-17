public abstract class bNs extends cGj
{
  public static final String cXa = "content";
  public static final String gSj = "kama";
  public static final String bC = "name";
  public static final String gSk = "locked";
  public static final String cLc = "valid";
  public static final String gSl = "freeBagSlotsSize";
  public static final String gSm = "freeBagSlotsSize";
  private static final String[] bF = { "content", "kama", "name", "locked", "valid", "freeBagSlotsSize" };
  protected cUQ gSn;
  protected cZZ gSo;

  public bNs(cUQ paramcUQ)
  {
    this.gSn = paramcUQ;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.gSn.bPj().getName();
    if (paramString.equals("locked"))
      return Boolean.valueOf(this.gSn.bPi().isLocked());
    if (paramString.equals("valid")) {
      return Boolean.valueOf(isValid());
    }
    return null;
  }

  public cUQ bVc() {
    return this.gSn;
  }

  protected abstract boolean isValid();

  public abstract void Qs();

  public abstract int Qt();
}