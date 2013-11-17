public class BI
{
  protected int bDQ;
  protected int bDR;
  protected int bDS;
  protected int bDT;
  protected short bDU;

  public int KL()
  {
    return this.bDQ;
  }
  public int KM() {
    return this.bDR;
  }
  public int KN() {
    return this.bDS;
  }
  public int KO() {
    return this.bDT;
  }
  public short KP() {
    return this.bDU;
  }

  public void a(bUT parambUT) {
    this.bDQ = parambUT.getInt();
    this.bDR = parambUT.getInt();
    this.bDS = parambUT.getInt();
    this.bDT = parambUT.getInt();
    this.bDU = parambUT.getShort();
  }
}