public class aBu
  implements dBv
{
  private final baR dVf;
  public static final String dVg = "contextName";
  public static final String dVh = "taxValue";
  public static final String dVi = "taxPercentage";
  public static final String dVj = "taxPercentageLongDesc";
  public static final String[] bF = { "contextName", "taxValue", "taxPercentage", "taxPercentageLongDesc" };

  public aBu(baR parambaR) {
    this.dVf = parambaR;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("contextName"))
      return aNG();
    if (paramString.equals("taxValue"))
      return Float.valueOf(this.dVf.getValue() * 100.0F / 5.0F);
    if (paramString.equals("taxPercentage"))
      return aNF();
    if (paramString.equals("taxPercentageLongDesc")) {
      return bU.fH().getString("protector.tax.longDesc", new Object[] { new lZ().tI().bx(14).a(aNF()).tJ().tP() });
    }
    return null;
  }

  private String aNF() {
    return a(this.dVf);
  }

  private String aNG() {
    return b(this.dVf);
  }

  public String getDescription() {
    return c(this.dVf);
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public baR aNH() {
    return this.dVf;
  }

  public static String a(baR parambaR) {
    return String.format("%d%%", new Object[] { Integer.valueOf((int)(parambaR.getValue() * 100.0F)) });
  }

  public static String b(baR parambaR) {
    return bU.fH().b(55, parambaR.bpn().ewr, new Object[0]);
  }

  public static String c(baR parambaR) {
    return b(parambaR) + " : " + a(parambaR);
  }
}