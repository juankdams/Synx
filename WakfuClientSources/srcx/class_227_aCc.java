public class aCc
{
  private int dWq;
  private int beh;

  public aCc(int paramInt1, int paramInt2)
  {
    this.dWq = paramInt1;
    this.beh = paramInt2;
  }

  public int getMin() {
    return this.dWq;
  }

  public void setMin(int paramInt) {
    this.dWq = paramInt;
  }

  public int getMax() {
    return this.beh;
  }

  public void setMax(int paramInt) {
    this.beh = paramInt;
  }

  public boolean lN(int paramInt) {
    return (paramInt >= this.dWq) && (paramInt <= this.beh);
  }

  public boolean lO(int paramInt) {
    return paramInt > this.beh;
  }

  public boolean lP(int paramInt) {
    return paramInt < this.dWq;
  }

  public int aOl() {
    return this.dWq + (this.beh - this.dWq) / 2;
  }
}