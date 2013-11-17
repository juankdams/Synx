public class abn
{
  protected int cPJ;
  protected int hY;
  protected int hZ;
  protected int bpL;
  protected int bQo;
  protected byte boN;
  protected int cPK;
  protected String aRT;
  protected String cPL;
  protected int cPM;
  protected int cPN;
  protected int cPO;

  public int anL()
  {
    return this.cPJ;
  }
  public int getX() {
    return this.hY;
  }
  public int getY() {
    return this.hZ;
  }
  public int Go() {
    return this.bpL;
  }
  public int anM() {
    return this.bQo;
  }
  public byte FW() {
    return this.boN;
  }
  public int anN() {
    return this.cPK;
  }
  public String uL() {
    return this.aRT;
  }
  public String anO() {
    return this.cPL;
  }
  public int anP() {
    return this.cPM;
  }
  public int anQ() {
    return this.cPN;
  }
  public int anR() {
    return this.cPO;
  }

  public void a(bUT parambUT) {
    this.cPJ = parambUT.getInt();
    this.hY = parambUT.getInt();
    this.hZ = parambUT.getInt();
    this.bpL = parambUT.getInt();
    this.bQo = parambUT.getInt();
    this.boN = parambUT.get();
    this.cPK = parambUT.getInt();
    this.aRT = parambUT.caP();
    this.cPL = parambUT.caP();
    this.cPM = parambUT.getInt();
    this.cPN = parambUT.getInt();
    this.cPO = parambUT.getInt();
  }
}