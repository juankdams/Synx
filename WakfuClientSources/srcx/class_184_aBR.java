public class aBR
{
  protected byte aHn;
  protected byte dVZ;
  protected byte dWa;
  protected byte dWb;
  protected byte dWc;
  protected byte dWd;
  protected GH[] dWe;
  protected GH[] dWf;
  protected GH[] dWg;

  public byte xK()
  {
    return this.aHn;
  }
  public byte aNS() {
    return this.dVZ;
  }
  public byte aNT() {
    return this.dWa;
  }
  public byte aNU() {
    return this.dWb;
  }
  public byte aNV() {
    return this.dWc;
  }
  public byte aNW() {
    return this.dWd;
  }
  public GH[] aNX() {
    return this.dWe;
  }
  public GH[] aNY() {
    return this.dWf;
  }
  public GH[] aNZ() {
    return this.dWg;
  }

  public void a(bUT parambUT) {
    this.aHn = parambUT.get();
    this.dVZ = parambUT.get();
    this.dWa = parambUT.get();
    this.dWb = parambUT.get();
    this.dWc = parambUT.get();
    this.dWd = parambUT.get();

    int i = parambUT.getInt();
    this.dWe = new GH[i];
    for (int j = 0; j < i; j++) {
      this.dWe[j] = new GH();
      this.dWe[j].a(parambUT);
    }

    j = parambUT.getInt();
    this.dWf = new GH[j];
    for (int k = 0; k < j; k++) {
      this.dWf[k] = new GH();
      this.dWf[k].a(parambUT);
    }

    k = parambUT.getInt();
    this.dWg = new GH[k];
    for (int m = 0; m < k; m++) {
      this.dWg[m] = new GH();
      this.dWg[m].a(parambUT);
    }
  }
}