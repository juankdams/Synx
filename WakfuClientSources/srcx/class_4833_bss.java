public class bss
{
  protected int aw;
  protected int bVc;
  protected int bVe;
  protected int bVg;
  protected String aRT;
  protected float frL;
  protected int bVi;
  protected int aKS;
  protected int bVj;
  protected int[] fZm;
  protected boolean bVm;

  public int getId()
  {
    return this.aw;
  }
  public int Uq() {
    return this.bVc;
  }
  public int Us() {
    return this.bVe;
  }
  public int Uu() {
    return this.bVg;
  }
  public String uL() {
    return this.aRT;
  }
  public float bAz() {
    return this.frL;
  }
  public int Uw() {
    return this.bVi;
  }
  public int getDuration() {
    return this.aKS;
  }
  public int Ux() {
    return this.bVj;
  }
  public int[] bAA() {
    return this.fZm;
  }
  public boolean UA() {
    return this.bVm;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.bVc = parambUT.getInt();
    this.bVe = parambUT.getInt();
    this.bVg = parambUT.getInt();
    this.aRT = parambUT.caP();
    this.frL = parambUT.getFloat();
    this.bVi = parambUT.getInt();
    this.aKS = parambUT.getInt();
    this.bVj = parambUT.getInt();
    this.fZm = parambUT.caR();

    this.bVm = parambUT.readBoolean();
  }
}