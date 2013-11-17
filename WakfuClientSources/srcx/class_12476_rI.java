public class rI extends bGL
{
  float aZL;
  float aZM;
  boolean aZN;
  boolean aZO;
  float x;
  float y;

  public rI(bSl parambSl, float paramFloat1, float paramFloat2)
  {
    super(parambSl);
    this.aZL = paramFloat1;
    this.aZM = paramFloat2;

    this.x = parambSl.fa();
    this.y = parambSl.fb();
  }

  public void update(int paramInt) {
    super.update(paramInt);
    bSl localbSl = Gu();
    localbSl.x(localbSl.getWorldX() + this.aZL, localbSl.getWorldY() + this.aZM);
    int i = 12;
    if (localbSl.fa() > this.x + i)
      this.aZL = (-this.aZL);
    if (localbSl.fa() < this.x - i) {
      this.aZL = (-this.aZL);
    }
    if (localbSl.fb() > this.y + i)
      this.aZM = (-this.aZM);
    if (localbSl.fb() < this.y - i)
      this.aZM = (-this.aZM);
  }
}