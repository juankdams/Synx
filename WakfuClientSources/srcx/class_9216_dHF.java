public class dHF
  implements aZf
{
  private int lSy = 0;
  private int lSz = 0;

  public boolean g(byte paramByte, int paramInt) {
    this.lSy += paramByte * paramInt;
    this.lSz += paramInt;
    return true;
  }

  public void clear() {
    this.lSy = 0;
    this.lSz = 0;
  }

  public float dhW() {
    return this.lSz == 0 ? 0.0F : this.lSy / this.lSz;
  }

  public int dhX() {
    return this.lSz;
  }
}