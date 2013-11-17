final class agV
  implements aGD
{
  private final bFH daU;

  agV(bFH parambFH)
  {
    this.daU = parambFH;
  }

  public final boolean a(long paramLong, float paramFloat) {
    int i = this.daU.L(paramLong);
    if ((i >= 0) && (v(paramFloat, this.daU.gA(paramLong)))) {
      return true;
    }
    return false;
  }

  private final boolean v(float paramFloat1, float paramFloat2)
  {
    return paramFloat1 == paramFloat2;
  }
}