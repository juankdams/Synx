public class fU extends bkr
  implements bnD
{
  private String aDn;
  private short aDo;
  private int aDp;

  fU()
  {
    this.aDn = "";
    this.aDo = -1;
    this.aDp = 0;
  }

  public String mT()
  {
    return this.aDn;
  }

  public void P(String paramString) {
    this.aDn = paramString;
  }

  public short mU() {
    return this.aDo;
  }

  public void i(short paramShort) {
    this.aDo = paramShort;
  }

  public int mV() {
    return this.aDp;
  }

  public void mW() {
    this.aDp += 1;
  }

  public void a(abv paramabv)
  {
    paramabv.cPW = this.aDn;
    paramabv.cPX = new Yw();
    paramabv.cPX.cJl = this.aDo;
    paramabv.cPX.cJm = this.aDp;
  }

  public void b(abv paramabv)
  {
    this.aDn = paramabv.cPW;
    this.aDo = paramabv.cPX.cJl;
    this.aDp = paramabv.cPX.cJm;
  }
}