public class Qd
{
  protected int aw;
  protected int coX;
  protected int coY;
  protected int coZ;

  public int getId()
  {
    return this.aw;
  }
  public int abU() {
    return this.coX;
  }
  public int abV() {
    return this.coY;
  }
  public int abW() {
    return this.coZ;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.coX = parambUT.getInt();
    this.coY = parambUT.getInt();
    this.coZ = parambUT.getInt();
  }
}