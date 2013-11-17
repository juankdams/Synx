public final class cbM
{
  private final String brS;
  private final bXf boY;
  private final bFB[] bpa;

  public cbM(String paramString, bXf parambXf, bFB[] paramArrayOfbFB)
  {
    if ((!bB) && (parambXf == null)) throw new AssertionError("BubbleClosedListener avec un script null");
    if ((!bB) && (paramString == null)) throw new AssertionError("BubbleClosedListener avec une fonction nulle");
    this.brS = paramString;
    this.bpa = paramArrayOfbFB;
    this.boY = parambXf;
  }

  public void pA() {
    this.boY.a(this.brS, this.bpa, new cIG[0]);
  }
}