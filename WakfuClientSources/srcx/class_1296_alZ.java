public class alZ
{
  protected int aw;
  protected int Sk;
  protected int dnO;
  protected int dnP;
  protected boolean dnQ;
  protected int cxK;
  protected xf[] dnR;

  public int getId()
  {
    return this.aw;
  }
  public int gC() {
    return this.Sk;
  }
  public int ayN() {
    return this.dnO;
  }
  public int ayO() {
    return this.dnP;
  }
  public boolean ayP() {
    return this.dnQ;
  }
  public int ahA() {
    return this.cxK;
  }
  public xf[] ayQ() {
    return this.dnR;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.Sk = parambUT.getInt();
    this.dnO = parambUT.getInt();
    this.dnP = parambUT.getInt();
    this.dnQ = parambUT.readBoolean();
    this.cxK = parambUT.getInt();

    int i = parambUT.getInt();
    this.dnR = new xf[i];
    for (int j = 0; j < i; j++) {
      this.dnR[j] = new xf();
      this.dnR[j].a(parambUT);
    }
  }
}