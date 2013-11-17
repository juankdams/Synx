public class bPJ extends cQd
{
  public static final byte aDG = 8;
  private int gXV;
  private int gXW;

  public int bXj()
  {
    return this.gXV;
  }

  public void tM(int paramInt) {
    this.gXV = paramInt;
  }

  public int bXk() {
    return this.gXW;
  }

  public void tN(int paramInt) {
    this.gXW = paramInt;
  }

  public boolean aOX() {
    int i = axg.aIP().aIV();
    return (this.gXV <= i) && (this.gXW >= i);
  }

  public byte nq() {
    return 8;
  }

  public void k(aYQ paramaYQ) {
    this.gXV = paramaYQ.readInt();
    this.gXW = paramaYQ.readInt();
  }

  public void e(dSw paramdSw) {
    paramdSw.writeInt(this.gXV);
    paramdSw.writeInt(this.gXW);
  }

  public String aOY() {
    return "Altitude - [" + this.gXV + " - " + this.gXW + "]";
  }

  public XF ajE()
  {
    bPJ localbPJ = new bPJ();
    localbPJ.tM(this.gXV);
    localbPJ.tN(this.gXW);
    localbPJ.iF(ajF());
    return localbPJ;
  }
}