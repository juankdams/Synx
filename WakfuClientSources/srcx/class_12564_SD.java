public class SD
{
  protected int aWH;
  protected short aDI;
  protected short aDJ;

  public int xj()
  {
    return this.aWH;
  }
  public short no() {
    return this.aDI;
  }
  public short np() {
    return this.aDJ;
  }

  public void a(bUT parambUT) {
    this.aWH = parambUT.getInt();
    this.aDI = parambUT.getShort();
    this.aDJ = parambUT.getShort();
  }
}