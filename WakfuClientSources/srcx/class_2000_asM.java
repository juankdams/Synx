public abstract class asM extends cGj
{
  public static final String bC = "name";
  public static final String dCD = "hasBook";
  public static final String dCE = "bookIconUrl";
  public static final String dCF = "buttonIconUrl";
  public static final String dCG = "isInnate";
  public static final String dCH = "isConceptual";
  public static final String dCI = "isUnknown";
  public static final String dCJ = "idString";
  protected int buP;
  private bVw dCK;

  protected asM(int paramInt)
  {
    this.buP = paramInt;
    this.dCK = ((bVw)Hh.QM().dh(DA.bIr.eD(this.buP).cPh()));
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("hasBook"))
      return Boolean.valueOf(this.dCK != null);
    if (paramString.equals("bookIconUrl"))
      return this.dCK != null ? this.dCK.getFieldValue("iconUrl") : null;
    if (paramString.equals("buttonIconUrl"))
      return ay.bd().A(this.buP);
    if (paramString.equals("isUnknown"))
      return Boolean.valueOf(isUnknown());
    if (paramString.equals("isInnate"))
      return Boolean.valueOf(Wk());
    if (paramString.equals("isConceptual"))
      return Boolean.valueOf(aEP());
    if (paramString.equals("idString")) {
      return String.valueOf(this.buP);
    }
    return null;
  }

  public String[] getFields() {
    return null;
  }

  public String getName() {
    return bU.fH().b(43, this.buP, new Object[0]);
  }

  private boolean Wk() {
    return DA.bIr.eD(this.buP).Wk();
  }

  private boolean aEP() {
    return DA.bIr.eD(this.buP).cMu();
  }

  public void aEQ() {
    if (this.dCK != null)
      ((dDX)this.dCK.bKr()).display();
  }

  public int aER()
  {
    return this.buP;
  }

  public abstract short nU();

  public abstract boolean isUnknown();

  public abstract boolean aES();

  public abstract boolean aET();
}