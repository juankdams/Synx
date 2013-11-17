public class dSR extends bzj
  implements dBv
{
  public static final String bC = "name";
  public static final String RI = "description";
  public static final String cKD = "smallIconUrl";
  public static final String dwS = "bigIconUrl";
  public static final String mpn = "isSelected";
  public static final String[] bF = { "name", "description", "smallIconUrl", "bigIconUrl", "isSelected" };
  private final int aSf;
  private final boolean aSM;
  private final boolean aSN;
  private final int aSg;
  private final boolean mpo;

  public dSR(doH paramdoH)
  {
    super(paramdoH);

    this.aSf = paramdoH.uN();
    this.aSM = paramdoH.cWg();
    this.aSN = paramdoH.vt();
    this.aSg = paramdoH.oc();
    this.mpo = paramdoH.cWj();
  }

  public int uN()
  {
    return this.aSf;
  }

  public String getName()
  {
    return bU.fH().b(3, getId(), new Object[0]);
  }

  public String dte()
  {
    return bU.fH().b(4, getId(), new Object[0]);
  }

  public boolean vs()
  {
    return this.aSM;
  }

  public boolean cdl()
  {
    return this.aSN;
  }

  public boolean cWj() {
    return this.mpo;
  }

  public int oc() {
    return this.aSg;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("description"))
      return dte();
    if (paramString.equals("smallIconUrl"))
      return ay.bd().w(this.aSg);
    if (paramString.equals("bigIconUrl"))
      return ay.bd().x(this.aSg);
    if (paramString.equals("isSelected")) {
      return Boolean.valueOf(isSelected());
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

  public boolean equals(Object paramObject) {
    return (super.equals(paramObject)) || (((paramObject instanceof apX)) && (equals(((apX)paramObject).bsL())));
  }

  public boolean isSelected() {
    Object localObject = dLE.doY().br("describedSpell", "spellsDialog");
    return (localObject != null) && (equals(((apX)localObject).bsL()));
  }
}