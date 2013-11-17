public class IG
{
  protected int bRG;
  protected int RZ;
  protected int bRH;
  protected byte bRI;

  public int Sa()
  {
    return this.bRG;
  }
  public int gw() {
    return this.RZ;
  }
  public int Sb() {
    return this.bRH;
  }
  public byte Sc() {
    return this.bRI;
  }

  public void a(bUT parambUT) {
    this.bRG = parambUT.getInt();
    this.RZ = parambUT.getInt();
    this.bRH = parambUT.getInt();
    this.bRI = parambUT.get();
  }
}