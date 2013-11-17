public class bgs extends cQd
{
  public static final byte aDG = 7;
  private int fuk;
  private int ful;

  public int btb()
  {
    return this.fuk;
  }

  public void pv(int paramInt) {
    this.fuk = paramInt;
  }

  public int btc() {
    return this.ful;
  }

  public void pw(int paramInt) {
    this.ful = paramInt;
  }

  public boolean aOX() {
    int i = axg.aIP().aIU();
    return (this.fuk <= i) && (this.ful >= i);
  }

  public byte nq() {
    return 7;
  }

  public void k(aYQ paramaYQ) {
    this.fuk = paramaYQ.readInt();
    this.ful = paramaYQ.readInt();
  }

  public void e(dSw paramdSw) {
    paramdSw.writeInt(this.fuk);
    paramdSw.writeInt(this.ful);
  }

  public String aOY() {
    return "Nombre de joueurs alentours - [" + this.fuk + " - " + this.ful + "]";
  }

  public XF ajE()
  {
    bgs localbgs = new bgs();
    localbgs.pv(this.fuk);
    localbgs.pw(this.ful);
    localbgs.iF(ajF());
    return localbgs;
  }
}