public class cgv
  implements dBv
{
  public static final String bC = "name";
  public static final String hEk = "pipeInternalName";
  public static final String hEl = "descSentence";
  public static final String hEm = "displayable";
  public static final String hEn = "colorString";
  public static final String hEo = "command";
  public static final String[] bF = { "name", "pipeInternalName", "descSentence", "displayable", "colorString", "command" };
  private final dab hEp;
  private String hEq;
  private afz hEr;
  private boolean hEs = true;
  private String esb;

  public cgv(dab paramdab, String paramString, afz paramafz, coM paramcoM)
  {
    this.hEp = paramdab;
    this.hEq = paramString;
    if (paramcoM != null) {
      if (paramcoM.anJ() != null)
        this.hEq = (this.hEq + " " + paramcoM.anJ());
      this.esb = paramcoM.anI();
    }
    this.hEr = paramafz;
  }

  public dab ciz()
  {
    return this.hEp;
  }

  public String ciA()
  {
    return this.hEq;
  }

  public afz ciB() {
    return this.hEr;
  }

  public void a(afz paramafz) {
    this.hEr = paramafz;
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("name")) {
      return this.hEq;
    }
    if (paramString.equals("pipeInternalName")) {
      return ciz().getInternalName();
    }
    if (paramString.equals("descSentence")) {
      return this.hEq;
    }
    if (paramString.equals("displayable")) {
      return Boolean.valueOf(true);
    }
    if (paramString.equals("colorString")) {
      float[] arrayOfFloat = this.hEp.ckE();
      return arrayOfFloat[0] + "," + arrayOfFloat[1] + "," + arrayOfFloat[2];
    }
    if (paramString.equals("command")) {
      return this.esb;
    }
    return null;
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString)
  {
    return false;
  }

  public boolean ciC() {
    return this.hEs;
  }

  public cgv gU(boolean paramBoolean) {
    this.hEs = paramBoolean;
    dWe.dvA().a(this, bF);
    return this;
  }

  public void setCommand(String paramString) {
    this.esb = paramString;
  }

  public String getCommand() {
    return this.esb;
  }

  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof cgv))
      return false;
    cgv localcgv = (cgv)paramObject;
    return (this.hEr == localcgv.ciB()) && ((this.esb == null) || (this.esb.equals(localcgv.getCommand())));
  }
}