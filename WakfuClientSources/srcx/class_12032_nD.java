public class nD
{
  protected int aRQ;
  protected int aRR;
  protected String[] aRS;
  protected String aRT;

  public int eo()
  {
    return this.aRQ;
  }
  public int uK() {
    return this.aRR;
  }
  public String[] getParams() {
    return this.aRS;
  }
  public String uL() {
    return this.aRT;
  }

  public void a(bUT parambUT) {
    this.aRQ = parambUT.getInt();
    this.aRR = parambUT.getInt();
    this.aRS = parambUT.caU();

    this.aRT = parambUT.caP();
  }
}