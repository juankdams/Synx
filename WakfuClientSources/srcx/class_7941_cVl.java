public class cVl
{
  protected int aw;
  protected short kHP;
  protected short kHQ;
  protected int kHR;

  public int getId()
  {
    return this.aw;
  }
  public short cJX() {
    return this.kHP;
  }
  public short cJY() {
    return this.kHQ;
  }
  public int cJZ() {
    return this.kHR;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.kHP = parambUT.getShort();
    this.kHQ = parambUT.getShort();
    this.kHR = parambUT.getInt();
  }
}