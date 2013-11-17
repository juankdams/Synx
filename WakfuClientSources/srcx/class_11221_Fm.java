public class Fm
{
  protected int hY;
  protected int hZ;
  protected short aOl;

  public int getX()
  {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public short IB() {
    return this.aOl;
  }

  public void a(bUT parambUT) {
    this.hY = parambUT.getInt();
    this.hZ = parambUT.getInt();
    this.aOl = parambUT.getShort();
  }
}