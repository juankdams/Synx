final class buw
  implements sQ
{
  private final bKB gdT;

  buw(bKB parambKB)
  {
    this.gdT = parambKB;
  }

  public final boolean a(Object paramObject, float paramFloat) {
    int i = this.gdT.index(paramObject);
    if ((i >= 0) && (v(paramFloat, this.gdT.aM(paramObject)))) {
      return true;
    }
    return false;
  }

  private final boolean v(float paramFloat1, float paramFloat2)
  {
    return paramFloat1 == paramFloat2;
  }
}