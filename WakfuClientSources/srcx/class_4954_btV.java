public class btV
{
  protected int gdb;
  protected int bDR;
  protected int bDS;
  protected int bDT;
  protected short bDU;

  public int bCe()
  {
    return this.gdb;
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
    this.gdb = parambUT.getInt();
    this.bDR = parambUT.getInt();
    this.bDS = parambUT.getInt();
    this.bDT = parambUT.getInt();
    this.bDU = parambUT.getShort();
  }
}