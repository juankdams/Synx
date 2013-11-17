public class Qq
{
  protected int aw;
  protected short aOg;
  protected String Sj;
  protected dJH[] cpp;

  public int getId()
  {
    return this.aw;
  }
  public short si() {
    return this.aOg;
  }
  public String gB() {
    return this.Sj;
  }
  public dJH[] ace() {
    return this.cpp;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aOg = parambUT.getShort();
    this.Sj = parambUT.caP();

    int i = parambUT.getInt();
    this.cpp = new dJH[i];
    for (int j = 0; j < i; j++) {
      this.cpp[j] = new dJH();
      this.cpp[j].a(parambUT);
    }
  }
}