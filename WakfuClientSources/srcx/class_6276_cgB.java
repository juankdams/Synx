public class cgB extends cGj
{
  public static final String NAME = "name";
  public static final String hEy = "amount";
  public static final String hEz = "amountValue";
  private bmt hEA;
  private bxH dzq;

  public cgB(bmt parambmt, bxH parambxH)
  {
    this.hEA = parambmt;
    this.dzq = parambxH;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return bU.fH().getString("protector.wallet.context.name." + this.hEA.bUy);
    if (paramString.equals("amount"))
      return this.dzq.c(this.hEA) + "§";
    if (paramString.equals("amountValue")) {
      return Integer.valueOf(this.dzq.c(this.hEA));
    }
    return null;
  }

  public bmt ciD() {
    return this.hEA;
  }

  public bxH ciE() {
    return this.dzq;
  }

  void bot() {
    dLE.doY().a(this, new String[] { "amount", "amountValue" });
  }
}