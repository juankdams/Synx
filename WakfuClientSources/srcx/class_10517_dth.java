public class dth
  implements Comparable
{
  private short aEd;
  private short aEe;
  float lvB;
  float lvC;
  float lvD;
  float lvE;
  float lvF;
  float lvG;
  float lvH;
  float lvI;
  private dth lvJ;
  private dth lvK;
  private dth lvL;
  private dth lvM;

  public dth(short paramShort1, short paramShort2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    this.aEd = paramShort1;
    this.aEe = paramShort2;
    this.lvB = paramFloat1;
    this.lvC = paramFloat2;
    this.lvD = paramFloat3;
    this.lvE = paramFloat4;
    this.lvF = paramFloat5;
    this.lvG = paramFloat6;
    this.lvH = paramFloat7;
    this.lvI = paramFloat8;
  }

  public short nx() {
    return this.aEd;
  }

  public short ny() {
    return this.aEe;
  }

  public float getX1() {
    return this.lvB;
  }

  public void setX1(float paramFloat) {
    this.lvB = paramFloat;
  }

  public float getY1() {
    return this.lvC;
  }

  public void setY1(float paramFloat) {
    this.lvC = paramFloat;
  }

  public float getX2() {
    return this.lvD;
  }

  public void setX2(float paramFloat) {
    this.lvD = paramFloat;
  }

  public float getY2() {
    return this.lvE;
  }

  public void setY2(float paramFloat) {
    this.lvE = paramFloat;
  }

  public float cZq() {
    return this.lvF;
  }

  public void dm(float paramFloat) {
    this.lvF = paramFloat;
  }

  public float cZr() {
    return this.lvG;
  }

  public void dn(float paramFloat) {
    this.lvG = paramFloat;
  }

  public float cZs() {
    return this.lvH;
  }

  public void jdMethod_do(float paramFloat) {
    this.lvH = paramFloat;
  }

  public float cZt() {
    return this.lvI;
  }

  public void dp(float paramFloat) {
    this.lvI = paramFloat;
  }

  public int a(dth paramdth) {
    if (paramdth.aEe != this.aEe) {
      return this.aEe - paramdth.aEe;
    }

    return this.aEd - paramdth.aEd;
  }

  public dth cZu() {
    return this.lvJ;
  }

  public void b(dth paramdth) {
    this.lvJ = paramdth;
  }

  public dth cZv() {
    return this.lvK;
  }

  public void c(dth paramdth) {
    this.lvK = paramdth;
  }

  public dth cZw() {
    return this.lvL;
  }

  public void d(dth paramdth) {
    this.lvL = paramdth;
  }

  public dth cZx() {
    return this.lvM;
  }

  public void e(dth paramdth) {
    this.lvM = paramdth;
  }

  public float[] cZy() {
    return new float[] { this.lvB, this.lvC, this.lvD, this.lvE, this.lvF, this.lvG, this.lvH, this.lvI };
  }
}