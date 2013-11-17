public final class Ap extends zO
{
  public short bvN;

  public float floatValue()
  {
    return this.bvN;
  }

  public String stringValue()
  {
    throw new UnsupportedOperationException();
  }

  public void reset()
  {
    this.bvN = 0;
  }

  public void N(float paramFloat)
  {
    this.bvN = ((short)(int)paramFloat);
  }

  public void a(aYH paramaYH)
  {
    this.bvN = ((short)(int)paramaYH.floatValue());
  }
}