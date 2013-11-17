public class daY extends cQd
{
  public static final byte aDG = 2;
  private float bvL;
  private float bvM;

  public float cMU()
  {
    return this.bvL;
  }

  public void ct(float paramFloat) {
    this.bvL = paramFloat;
  }

  public float cvi() {
    return this.bvM;
  }

  public void cu(float paramFloat) {
    this.bvM = paramFloat;
  }

  public boolean aOX() {
    float f = axg.aIP().aIR();
    return (this.bvL <= f) && (this.bvM > f);
  }

  public byte nq() {
    return 2;
  }

  public void k(aYQ paramaYQ) {
    this.bvL = paramaYQ.readFloat();
    this.bvM = paramaYQ.readFloat();
  }

  public void e(dSw paramdSw) {
    paramdSw.writeFloat(this.bvL);
    paramdSw.writeFloat(this.bvM);
  }

  public String aOY() {
    return "Moment de la journée - Début : " + (int)(this.bvL * 100.0F) + " - Fin : " + (int)(this.bvM * 100.0F);
  }

  public XF ajE()
  {
    daY localdaY = new daY();
    localdaY.ct(this.bvL);
    localdaY.cu(this.bvM);
    localdaY.iF(ajF());
    return localdaY;
  }
}