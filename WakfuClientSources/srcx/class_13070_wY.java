public class wY
{
  protected int boL;
  protected int aSg;
  protected boolean boM;
  protected boolean ip;
  protected byte io;
  protected String UV;
  protected byte boN;
  protected byte boO;
  protected byte boP;
  protected byte boQ;

  public int getUid()
  {
    return this.boL;
  }
  public int oc() {
    return this.aSg;
  }
  public boolean FV() {
    return this.boM;
  }
  public boolean bZ() {
    return this.ip;
  }
  public byte bY() {
    return this.io;
  }
  public String getAnimName() {
    return this.UV;
  }
  public byte FW() {
    return this.boN;
  }
  public byte FX() {
    return this.boO;
  }
  public byte FY() {
    return this.boP;
  }
  public byte FZ() {
    return this.boQ;
  }

  public void a(bUT parambUT) {
    this.boL = parambUT.getInt();
    this.aSg = parambUT.getInt();
    this.boM = parambUT.readBoolean();
    this.ip = parambUT.readBoolean();
    this.io = parambUT.get();
    this.UV = parambUT.caP();
    this.boN = parambUT.get();
    this.boO = parambUT.get();
    this.boP = parambUT.get();
    this.boQ = parambUT.get();
  }
}