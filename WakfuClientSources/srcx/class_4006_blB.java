public class blB extends akk
{
  private final Rx fCG;

  public blB(double paramDouble, Rx paramRx)
  {
    super(paramDouble);
    this.fCG = paramRx;
  }

  protected int getValue() {
    return this.fCG.value();
  }

  protected void iW(int paramInt) {
    super.iW(paramInt);
    this.fCG.gv(paramInt);
  }

  protected void iV(int paramInt) {
    this.fCG.set(paramInt);
  }
}