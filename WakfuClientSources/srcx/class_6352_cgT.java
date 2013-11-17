public class cgT extends crI
{
  private final float[] hEO = new float[eu.lE() + 1];
  private final int gEg;

  public cgT(int paramInt)
  {
    this.gEg = paramInt;
  }

  public float l(eu parameu) {
    return this.hEO[parameu.bJ()];
  }

  public int c(eu parameu, int paramInt) {
    int i = paramInt - this.gEg;
    return (int)(h(parameu) + i * this.hEO[parameu.bJ()]);
  }

  public void a(eu parameu, int paramInt, float paramFloat) {
    this.hEO[parameu.bJ()] = paramFloat;
    a(parameu, paramInt);
  }
}