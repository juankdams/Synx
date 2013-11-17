public class aRj extends cLP
{
  public static final String eNX = "rank";
  static final String[] bwd;
  static final String[] bwe = { "rank" };
  private dNp eNY;

  public aRj(dpE paramdpE, dNp paramdNp)
  {
    super(paramdpE);
    this.eNY = paramdNp;
  }

  public String[] getFields() {
    return bwd;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("rank")) {
      return this.eNY;
    }
    return super.getFieldValue(paramString);
  }

  static
  {
    bwd = new String[bwe.length + cLP.hpV.length];
    System.arraycopy(bwe, 0, bwd, 0, bwe.length);
    System.arraycopy(cLP.hpV, 0, bwd, bwe.length, cLP.hpV.length);
  }
}