public class dTV
{
  protected int aRQ;
  protected int hAa;
  protected boolean mre;
  protected boolean cTI;
  protected boolean cTJ;
  protected boolean cTL;
  protected String aRT;
  protected String[] hAb;
  protected String[] mrf;

  public int eo()
  {
    return this.aRQ;
  }
  public int chY() {
    return this.hAa;
  }
  public boolean dtY() {
    return this.mre;
  }
  public boolean apw() {
    return this.cTI;
  }
  public boolean apx() {
    return this.cTJ;
  }
  public boolean dtZ() {
    return this.cTL;
  }
  public String uL() {
    return this.aRT;
  }
  public String[] chZ() {
    return this.hAb;
  }
  public String[] dua() {
    return this.mrf;
  }

  public void a(bUT parambUT) {
    this.aRQ = parambUT.getInt();
    this.hAa = parambUT.getInt();
    this.mre = parambUT.readBoolean();
    this.cTI = parambUT.readBoolean();
    this.cTJ = parambUT.readBoolean();
    this.cTL = parambUT.readBoolean();
    this.aRT = parambUT.caP();
    this.hAb = parambUT.caU();

    this.mrf = parambUT.caU();
  }
}