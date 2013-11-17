public class bvh
{
  protected int aw;
  protected byte bkM;
  protected String aRT;
  protected boolean geW;
  protected boolean geX;
  protected int aKS;
  protected boolean geY;
  protected int Sk;
  protected int aSf;

  public int getId()
  {
    return this.aw;
  }
  public byte getType() {
    return this.bkM;
  }
  public String uL() {
    return this.aRT;
  }
  public boolean bCN() {
    return this.geW;
  }
  public boolean bCO() {
    return this.geX;
  }
  public int getDuration() {
    return this.aKS;
  }
  public boolean bCP() {
    return this.geY;
  }
  public int gC() {
    return this.Sk;
  }
  public int uN() {
    return this.aSf;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.bkM = parambUT.get();
    this.aRT = parambUT.caP();
    this.geW = parambUT.readBoolean();
    this.geX = parambUT.readBoolean();
    this.aKS = parambUT.getInt();
    this.geY = parambUT.readBoolean();
    this.Sk = parambUT.getInt();
    this.aSf = parambUT.getInt();
  }
}