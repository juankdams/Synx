public class dJr
{
  protected int RZ;
  protected boolean aYZ;

  public int gw()
  {
    return this.RZ;
  }
  public boolean isVisible() {
    return this.aYZ;
  }

  public void a(bUT parambUT) {
    this.RZ = parambUT.getInt();
    this.aYZ = parambUT.readBoolean();
  }
}