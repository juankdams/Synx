public class Ax extends aCe
{
  public static final String aGo = "title";
  public static final String bwc = "nbMandates";
  static final String[] bwd;
  static final String[] bwe = { "title", "nbMandates" };
  private int bwf;
  private ase bwg;

  public Ax(dpE paramdpE)
  {
    super(paramdpE);
    fU localfU = (fU)paramdpE.cXe();
    this.bwf = localfU.mV();
    this.bwg = bPE.bWu().cO(localfU.mU());
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("title"))
      return this.bwg == null ? null : this.bwg;
    if (paramString.equals("isGovernor"))
      return Boolean.valueOf(true);
    if (paramString.equals("nbMandates")) {
      return Integer.valueOf(this.bwf);
    }
    return super.getFieldValue(paramString);
  }

  public void a(ase paramase) {
    this.bwg = paramase;
  }

  public ase JA() {
    return this.bwg;
  }

  public String[] getFields() {
    return bwd;
  }

  static
  {
    bwd = new String[bwe.length + aCe.bwd.length];
    System.arraycopy(bwe, 0, bwd, 0, bwe.length);
    System.arraycopy(aCe.bwd, 0, bwd, bwe.length, aCe.bwd.length);
  }
}