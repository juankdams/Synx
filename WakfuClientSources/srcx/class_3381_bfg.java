public class bfg
{
  protected int aw;
  protected int aGs;
  protected int aSf;
  protected boolean bTE;

  public int getId()
  {
    return this.aw;
  }
  public int getType() {
    return this.aGs;
  }
  public int uN() {
    return this.aSf;
  }
  public boolean bsE() {
    return this.bTE;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aGs = parambUT.getInt();
    this.aSf = parambUT.getInt();
    this.bTE = parambUT.readBoolean();
  }
}