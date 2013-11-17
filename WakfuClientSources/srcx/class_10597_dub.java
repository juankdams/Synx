import org.apache.log4j.Logger;

public class dub
{
  protected static Logger K = Logger.getLogger(dub.class);
  private int bmM;
  private float buM;
  private float imo;
  private float cMs;
  private float cMt;
  private float lxF;
  private float lxG;
  private float lxH;
  private float lxI;
  private aoH lxJ = new bZO(100, 50);
  private ahi lxK;

  public dub()
  {
    this.lxK = aZs.fgf;
  }

  public void b(aZs paramaZs) {
    this.lxK = paramaZs;
  }

  public void cs(float paramFloat) {
    this.imo = paramFloat;
  }

  protected float cZX() {
    return this.imo;
  }

  public void setSpeed(float paramFloat) {
    this.buM = paramFloat;
  }

  public void ae(float paramFloat1, float paramFloat2) {
    this.cMs = (this.lxF = this.lxH = paramFloat1);
    this.cMt = (this.lxG = this.lxI = paramFloat2);
  }

  public void setX(int paramInt) {
    this.cMs = (this.lxF = this.lxH = paramInt);
  }

  public void setY(int paramInt) {
    this.cMt = (this.lxG = this.lxI = paramInt);
  }

  public void as(float paramFloat1, float paramFloat2) {
    this.cMs = paramFloat1;
    this.cMt = paramFloat2;
    this.bmM = 0;
  }

  public void at(float paramFloat1, float paramFloat2) {
    this.lxF = paramFloat1;
    this.lxG = paramFloat2;

    this.bmM = 0;
  }

  public float cZY() {
    return this.lxF;
  }

  public float cZZ() {
    return this.lxG;
  }

  public float daa() {
    return this.lxH;
  }

  public float dab() {
    return this.lxI;
  }

  public boolean q(int paramInt, float paramFloat) {
    this.lxJ.setScale(paramFloat);
    return BK(paramInt);
  }

  protected boolean BK(int paramInt) {
    float f1 = this.lxF - this.lxH;
    float f2 = this.lxG - this.lxI;

    cYm localcYm = this.lxJ.z(f1, f2);
    if (localcYm == null) {
      this.cMs = this.lxH;
      this.cMt = this.lxI;
      return false;
    }

    float f3 = this.lxH;
    float f4 = this.lxI;
    this.bmM += paramInt;
    float f5 = this.bmM * this.buM / 1000.0F;
    if (f5 > 1.0F) {
      this.lxH = this.lxF;
      this.lxI = this.lxG;
    } else {
      float f6 = this.lxF - localcYm.getX();
      float f7 = this.lxG - localcYm.getY();

      A(f6, f7, f5);
    }

    return (!bCO.u(f3, this.lxH, 1.0E-004F)) || (!bCO.u(f4, this.lxI, 1.0E-004F));
  }

  private void A(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.lxH = this.lxK.f(this.cMs, this.lxH, paramFloat1, paramFloat3);
    this.lxI = this.lxK.f(this.cMt, this.lxI, paramFloat2, paramFloat3);
  }
}