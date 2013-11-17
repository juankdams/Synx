public class dJH
{
  protected int aw;
  protected int aGs;
  protected String[] aRS;

  public int getId()
  {
    return this.aw;
  }
  public int getType() {
    return this.aGs;
  }
  public String[] getParams() {
    return this.aRS;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aGs = parambUT.getInt();
    this.aRS = parambUT.caU();
  }
}