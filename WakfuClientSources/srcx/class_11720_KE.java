public class KE
{
  protected int aw;
  protected String Sj;
  protected int aGs;

  public int getId()
  {
    return this.aw;
  }
  public String gB() {
    return this.Sj;
  }
  public int getType() {
    return this.aGs;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.Sj = parambUT.caP();
    this.aGs = parambUT.getInt();
  }
}