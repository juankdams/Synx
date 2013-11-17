public class baR
{
  private final cVE fiT;
  private float dmV;

  public baR(cVE paramcVE)
  {
    this.fiT = paramcVE;
    this.dmV = paramcVE.kIb;
  }

  public baR(cVE paramcVE, float paramFloat) {
    this(paramcVE);

    this.dmV = paramFloat;
  }

  public int oF(int paramInt) {
    return Math.round(paramInt * this.dmV);
  }

  public float getValue() {
    return this.dmV;
  }

  public void setValue(float paramFloat) {
    this.dmV = Math.max(Math.min(paramFloat, this.fiT.kId), this.fiT.kIc);
  }

  public cVE bpn() {
    return this.fiT;
  }
}