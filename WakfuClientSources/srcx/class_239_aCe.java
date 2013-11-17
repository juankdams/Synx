public class aCe extends cLP
{
  public static final String dWu = "speech";
  static final String[] bwd;
  static final String[] bwe = { "speech" };
  private String dWv;

  public aCe(dpE paramdpE)
  {
    super(paramdpE);
    bnD localbnD = (bnD)paramdpE.cXe();
    this.dWv = localbnD.mT();
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("speech")) {
      String str = bPE.bWu().bXa();
      return this.dWv.length() > 0 ? this.dWv : str != null ? str : null;
    }
    return super.getFieldValue(paramString);
  }

  public String[] getFields() {
    return bwd;
  }

  public void gb(String paramString) {
    this.dWv = paramString;
  }

  static
  {
    bwd = new String[bwe.length + cLP.hpV.length];
    System.arraycopy(bwe, 0, bwd, 0, bwe.length);
    System.arraycopy(cLP.hpV, 0, bwd, bwe.length, cLP.hpV.length);
  }
}