public class cZg extends cQd
{
  public static final byte aDG = 1;
  private int dWq;
  private int beh;

  public int getMin()
  {
    return this.dWq;
  }

  public void setMin(int paramInt)
  {
    this.dWq = paramInt;
  }

  public int getMax() {
    return this.beh;
  }

  public void setMax(int paramInt) {
    this.beh = paramInt;
  }

  public void eG(int paramInt1, int paramInt2) {
    this.dWq = paramInt1;
    this.beh = paramInt2;
  }

  public boolean aOX() {
    float f = axg.aIP().aIQ();
    return (this.dWq <= f) && (f <= this.beh);
  }

  public byte nq() {
    return 1;
  }

  public void k(aYQ paramaYQ) {
    this.dWq = paramaYQ.readInt();
    this.beh = paramaYQ.readInt();
  }

  public void e(dSw paramdSw) {
    paramdSw.writeInt(this.dWq);
    paramdSw.writeInt(this.beh);
  }

  public String aOY() {
    return "Température (Min : " + this.dWq + ", Max : " + this.beh + ")";
  }

  public XF ajE()
  {
    cZg localcZg = new cZg();
    localcZg.setMin(this.dWq);
    localcZg.setMax(this.beh);
    localcZg.iF(ajF());
    return localcZg;
  }
}