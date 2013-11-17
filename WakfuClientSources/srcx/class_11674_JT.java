public class JT
{
  protected int aw;
  protected int bVc;
  protected int bVd;
  protected int bVe;
  protected int bVf;
  protected int bVg;
  protected int aKS;
  protected int bVh;
  protected int aSg;
  protected String aRT;
  protected int bVi;
  protected int bVj;
  protected int[] bVk;
  protected int bVl;
  protected boolean bVm;

  public int getId()
  {
    return this.aw;
  }
  public int Uq() {
    return this.bVc;
  }
  public int Ur() {
    return this.bVd;
  }
  public int Us() {
    return this.bVe;
  }
  public int Ut() {
    return this.bVf;
  }
  public int Uu() {
    return this.bVg;
  }
  public int getDuration() {
    return this.aKS;
  }
  public int Uv() {
    return this.bVh;
  }
  public int oc() {
    return this.aSg;
  }
  public String uL() {
    return this.aRT;
  }
  public int Uw() {
    return this.bVi;
  }
  public int Ux() {
    return this.bVj;
  }
  public int[] Uy() {
    return this.bVk;
  }
  public int Uz() {
    return this.bVl;
  }
  public boolean UA() {
    return this.bVm;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.bVc = parambUT.getInt();
    this.bVd = parambUT.getInt();
    this.bVe = parambUT.getInt();
    this.bVf = parambUT.getInt();
    this.bVg = parambUT.getInt();
    this.aKS = parambUT.getInt();
    this.bVh = parambUT.getInt();
    this.aSg = parambUT.getInt();
    this.aRT = parambUT.caP();
    this.bVi = parambUT.getInt();
    this.bVj = parambUT.getInt();
    this.bVk = parambUT.caR();

    this.bVl = parambUT.getInt();
    this.bVm = parambUT.readBoolean();
  }
}