public class dnj
{
  protected int aw;
  protected int aGs;
  protected int[] lmx;

  public int getId()
  {
    return this.aw;
  }

  public int getType() {
    return this.aGs;
  }

  public int[] cUE() {
    return this.lmx;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aGs = parambUT.getInt();
    this.lmx = parambUT.caR();
  }
}