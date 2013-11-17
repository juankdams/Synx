public class boZ extends aba
{
  private boZ(crZ paramcrZ)
  {
    super(paramcrZ);
  }

  public final String getValue()
  {
    return this.gCm[0].stringValue();
  }

  public final float floatValue()
  {
    throw new UnsupportedOperationException();
  }

  public final int intValue()
  {
    throw new UnsupportedOperationException();
  }

  public final String stringValue()
  {
    return getValue();
  }
}