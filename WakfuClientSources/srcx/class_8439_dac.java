public class dac
{
  protected int boL;
  protected int RZ;
  protected int kOd;

  public int getUid()
  {
    return this.boL;
  }
  public int gw() {
    return this.RZ;
  }
  public int cMD() {
    return this.kOd;
  }

  public void a(bUT parambUT) {
    this.boL = parambUT.getInt();
    this.RZ = parambUT.getInt();
    this.kOd = parambUT.getInt();
  }
}