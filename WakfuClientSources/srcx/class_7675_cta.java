public class cta
{
  protected int aRQ;
  protected int hAa;
  protected String aRT;
  protected String[] hAb;

  public int eo()
  {
    return this.aRQ;
  }
  public int chY() {
    return this.hAa;
  }
  public String uL() {
    return this.aRT;
  }
  public String[] chZ() {
    return this.hAb;
  }

  public void a(bUT parambUT) {
    this.aRQ = parambUT.getInt();
    this.hAa = parambUT.getInt();
    this.aRT = parambUT.caP();
    this.hAb = parambUT.caU();
  }
}