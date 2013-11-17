public class dTx extends dzz
{
  private cLq mqx;
  private byte[] mqy;

  public boolean a(byte[] paramArrayOfByte)
  {
    this.mqy = paramArrayOfByte;
    return true;
  }

  public cLq dty() {
    if (this.mqx == null) {
      lP locallP = new lP(new aca());
      locallP.q(this.mqy);
      this.mqx = locallP.to();
    }
    return this.mqx;
  }

  public int getId() {
    return 562;
  }
}