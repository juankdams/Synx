public class ctw
{
  protected int boL;
  protected int bxi;
  protected byte boO;
  protected byte boP;
  protected byte boQ;

  public int getUid()
  {
    return this.boL;
  }
  public int apa() {
    return this.bxi;
  }
  public byte FX() {
    return this.boO;
  }
  public byte FY() {
    return this.boP;
  }
  public byte FZ() {
    return this.boQ;
  }

  public void a(bUT parambUT) {
    this.boL = parambUT.getInt();
    this.bxi = parambUT.getInt();
    this.boO = parambUT.get();
    this.boP = parambUT.get();
    this.boQ = parambUT.get();
  }
}