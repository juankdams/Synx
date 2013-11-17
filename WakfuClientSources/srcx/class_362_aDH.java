public class aDH
{
  protected dPx dYI;
  protected int aJA;
  protected float aSv;
  protected float aSw;
  protected float aSx;
  protected float aSy;
  protected float aSz;
  protected float aSA;
  protected float aSB;
  protected float aSC;
  protected boolean dYJ;

  public dPx aPP()
  {
    return this.dYI;
  }
  public int qW() {
    return this.aJA;
  }
  public float vb() {
    return this.aSv;
  }
  public float vc() {
    return this.aSw;
  }
  public float vd() {
    return this.aSx;
  }
  public float ve() {
    return this.aSy;
  }
  public float vf() {
    return this.aSz;
  }
  public float vg() {
    return this.aSA;
  }
  public float vh() {
    return this.aSB;
  }
  public float vi() {
    return this.aSC;
  }
  public boolean aCt() {
    return this.dYJ;
  }

  public void a(bUT parambUT) {
    int i = parambUT.getInt();
    this.dYI = new dPx(i);

    for (int j = 0; j < i; j++) {
      byte b = parambUT.get();
      dsu localdsu = new dsu();
      localdsu.a(parambUT);

      this.dYI.c(b, localdsu);
    }

    this.aJA = parambUT.getInt();
    this.aSv = parambUT.getFloat();
    this.aSw = parambUT.getFloat();
    this.aSx = parambUT.getFloat();
    this.aSy = parambUT.getFloat();
    this.aSz = parambUT.getFloat();
    this.aSA = parambUT.getFloat();
    this.aSB = parambUT.getFloat();
    this.aSC = parambUT.getFloat();
    this.dYJ = parambUT.readBoolean();
  }
}