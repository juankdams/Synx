public abstract class diJ extends aba
{
  protected diJ(crZ paramcrZ)
  {
    super(paramcrZ);
  }

  public float floatValue() {
    return ((Float)get()).floatValue();
  }

  public int intValue() {
    return ((Float)get()).intValue();
  }

  public String stringValue() {
    throw new UnsupportedOperationException();
  }
}